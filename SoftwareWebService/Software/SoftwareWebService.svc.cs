using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Data.SqlClient;
namespace Software
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "SoftwareWebService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select SoftwareWebService.svc or SoftwareWebService.svc.cs at the Solution Explorer and start debugging.
    public class SoftwareWebService : ISoftwareWebService
    {

        public bool UserControl(string username, string userpass)
        {
            try
            {
                
                using (SqlConnection con = new SqlConnection("Data Source=MERKANPC;Initial Catalog=SoftwareSporSalonu;Integrated Security=True"))
                {
                    using (SqlCommand cmd = new SqlCommand("select * from Kullanici where TC=@tc and Sifre=@sifre ", con))
                    {
                        con.Open();
                        cmd.Parameters.Add("@tc", username);
                        cmd.Parameters.Add("@sifre", userpass);
                        SqlDataReader rd = cmd.ExecuteReader();
                        if (rd.Read())
                        {
                            rd.Close();
                            con.Close();
                            return true;
                        }
                        else
                        {
                            rd.Close();
                            con.Close();
                            return false;
                        }
                        con.Close();
                    }



                }

            }
            catch (Exception err)
            {

                return false;
            }
          
                
        }


        public KisiBilgileriDB[] KisiselBilgiler(string kuladi, string sifre)
        {
            try
            {
                if (UserControl(kuladi, sifre))
                {
                    using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                    {
                        var list = db.KisiBilgileri.Where(w => w.TC == kuladi).Select(s => new KisiBilgileriDB
                        {
                            Boy = s.Boy,
                            CalismaSaati = s.CalismaSaati,
                            Hata = null,
                            Kalori = s.Kalori,
                            Kilo = s.Kilo,
                            Kosu = s.Kosu,
                            Tarih = s.Tarih,
                            TC = s.TC

                        }).Take(10).ToArray();

                        return list;
                    }
                }
                else
                    throw new Exception("Kullanici Dogrulanmıyor");
            }
            catch (Exception err)
            {
                KisiBilgileriDB[] kisi=new KisiBilgileriDB[1];
                kisi[0] = new KisiBilgileriDB
                {
                    Hata = err.Message
                };
                return kisi;
            }
        }

        public string KisiselBilgiEkle(string kuladi, string sifre, string tarih, int kilo, int boy, int kalori, int kosu, int calismasaati)
        {
            String hata = "";
            try
            {
                if (UserControl(kuladi, sifre))
                {
                    using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                    {
                        var temptarih = Convert.ToDateTime(tarih);
                        var temp = db.KisiBilgileri.FirstOrDefault(f => f.Tarih.Year==temptarih.Year && f.Tarih.Month==temptarih.Month && f.Tarih.Day==temptarih.Day && f.TC==kuladi);
                        if (temp != null)
                            hata = "Daha Önceden Kayıt Yapılmış";
                        else
                        {
                            var item = new KisiBilgileri
                            {
                                TC = kuladi,
                                Tarih = Convert.ToDateTime(tarih),
                                Kosu = kosu,
                                Kilo = kilo,
                                Kalori = kalori,
                                CalismaSaati = calismasaati,
                                Boy = boy
                            };
                            db.KisiBilgileri.Add(item);
                            db.SaveChanges();

                            return "Kayıt Tamamlandı";
                        }
                    }
                }
                else
                    hata ="Kullanici Dogrulanmıyor";
                return hata;
            }
            catch (Exception err)
            {
                return null;
            }
        }


        public ProgramDersDB ProgramGetById(string kuladi, string sifre, string tarih)
        {
            try
            {
                if (UserControl(kuladi, sifre))
                {
                    using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                    {
                        var temptarih = Convert.ToDateTime(tarih);
                        var list = (from progmram in db.Program
                                    join
                                        ders1 in db.Kategori on progmram.Ders1 equals ders1.KategoriId
                                    join
                                        ders2 in db.Kategori on progmram.Ders2 equals ders2.KategoriId
                                    join
                                        ders3 in db.Kategori on progmram.Ders3 equals ders3.KategoriId
                                    join
                                        ders4 in db.Kategori on progmram.Ders4 equals ders4.KategoriId
                                    join
                                        ders5 in db.Kategori on progmram.Ders5 equals ders5.KategoriId
                                    join
                                        ders6 in db.Kategori on progmram.Ders6 equals ders6.KategoriId
                                    where
                                        progmram.Tarih.Year == temptarih.Year && progmram.Tarih.Month == temptarih.Month && progmram.Tarih.Day == temptarih.Day
                                    select new ProgramDersDB
                                    {
                                        Ders1 = ders1.KategoriAdi,
                                        Ders2 = ders2.KategoriAdi,
                                        Ders3 = ders3.KategoriAdi,
                                        Ders4 = ders4.KategoriAdi,
                                        Ders5 = ders5.KategoriAdi,
                                        Ders6 = ders6.KategoriAdi,
                                        Tarih = progmram.Tarih
                                    }).FirstOrDefault();


                        return list;
                    }
                }
                else
                    throw new Exception("Kullanici Dogrulanmıyor");
            }
            catch (Exception err)
            {
                ProgramDersDB[] temp = new ProgramDersDB[1];
                temp[0].Hata = err.Message;
                return null;
            }
        }





        public bool RezervasyonYap(string username, string userpass, string tarih, string rezTarihi)
        {
            try
            {
                if (UserControl(username, userpass))
                {
                    using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                    {

                        db.RezervasyonYap(Convert.ToDateTime(tarih), username, Convert.ToDateTime(rezTarihi));
                        return true;
                    }
                }
                else
                    throw new Exception("Kullanici Dogrulanmıyor");
            }
            catch (Exception err)
            {
                return false;
            }
        }


        public bool BugunRezervasyonYapilmismi(string username, string userpass, string tarih)
        {
            try
            {
                if (UserControl(username, userpass))
                {
                    using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                    {
                        var temptarih = Convert.ToDateTime(tarih);
                        var item = db.Rezervasyon.FirstOrDefault(f => f.Tarih.Year == temptarih.Year && f.Tarih.Month == temptarih.Month && f.Tarih.Day == temptarih.Day && f.TC==username);
                        if (item != null)
                            return true;
                        else
                            return false;
                    }
                }
                else
                    throw new Exception("Kullanici Dogrulanmıyor");
            }
            catch (Exception err)
            {
                return false;
            }
        }


        public ProgramDersDB BirSonrakiProgramiBul(string username, string userpass, string tarih)
        {
            try
            {
                if (UserControl(username, userpass))
                {
                    using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                    {
                        var temptarih = Convert.ToDateTime(tarih);
                        for (int i = 0; i < 7; i++)
                        {
                            var item = db.Rezervasyon.FirstOrDefault(f => f.TC == username && f.Tarih == temptarih);
                            temptarih= temptarih.AddDays(1);
                            if (item != null)
                            {
                                var list = (from progmram in db.Program
                                            join
                                                ders1 in db.Kategori on progmram.Ders1 equals ders1.KategoriId
                                            join
                                                ders2 in db.Kategori on progmram.Ders2 equals ders2.KategoriId
                                            join
                                                ders3 in db.Kategori on progmram.Ders3 equals ders3.KategoriId
                                            join
                                                ders4 in db.Kategori on progmram.Ders4 equals ders4.KategoriId
                                            join
                                                ders5 in db.Kategori on progmram.Ders5 equals ders5.KategoriId
                                            join
                                                ders6 in db.Kategori on progmram.Ders6 equals ders6.KategoriId
                                            where
                                                progmram.Tarih.Year == temptarih.Year && progmram.Tarih.Month == temptarih.Month && progmram.Tarih.Day == temptarih.Day
                                            select new ProgramDersDB
                                            {
                                                Ders1 = ders1.KategoriAdi,
                                                Ders2 = ders2.KategoriAdi,
                                                Ders3 = ders3.KategoriAdi,
                                                Ders4 = ders4.KategoriAdi,
                                                Ders5 = ders5.KategoriAdi,
                                                Ders6 = ders6.KategoriAdi,
                                                Tarih = progmram.Tarih
                                            }).FirstOrDefault();

                                return list;

                            }
                        }

                        return null;
                    }
                }
                else
                    throw new Exception("Kullanici Dogrulanmıyor");
            }
            catch (Exception err)
            {
                return null;
            }
        }

        public bool AdminKontrol(string kuladi, string sifre)
        {
            try
            {
                using (SoftwareSporSalonuEntities db = new SoftwareSporSalonuEntities())
                {
                    var item = db.Admin.FirstOrDefault(f => f.KullaniciAdi == kuladi && f.KullaniciSifre == sifre);
                    if (item == null)
                        return false;
                    else
                        return true;

                }
            }
            catch (Exception err)
            {
                return false;
            }
        }
    }
}
