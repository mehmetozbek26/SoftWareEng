using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace Software
{
    [ServiceContract]
    public interface ISoftwareWebService
    {
        [OperationContract]
        bool AdminKontrol(string kuladi, string sifre);
        [OperationContract]
        [WebInvoke(Method = "POST", ResponseFormat = WebMessageFormat.Json, BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "UserKontrol/{username,userpass}")]
        bool UserControl(string username, string userpass);
        [OperationContract]
        bool RezervasyonYap(string username, string userpass, string tarih, string rezTarihi);
        [OperationContract]
        bool BugunRezervasyonYapilmismi(string username, string userpass, string tarih);
        [OperationContract]
        ProgramDersDB BirSonrakiProgramiBul(string username, string userpass, string tarih);
        [OperationContract]
        ProgramDersDB ProgramGetById(string kuladi, string sifre, string tarih);

        #region KİSİ BİLGİLERİ

        [OperationContract]
        KisiBilgileriDB[] KisiselBilgiler(string kuladi, string sifre);
        
        [OperationContract]
        String KisiselBilgiEkle(string kuladi, string sifre,string tarih,int kilo,int boy,int kalori,int kosu,int calismasaati);

        #endregion
    }


    [DataContract]
    public class KullaniciDB
    {
        [DataMember]
        public string TC;
        [DataMember]
        public string Sifre;
        [DataMember]
        public string Ad;
        [DataMember]
        public string Soyad;
        [DataMember]
        public DateTime Yas;
        [DataMember]
        public string Hata;
    }
    [DataContract]
    public class KisiBilgileriDB
    {
        [DataMember]
        public DateTime Tarih;
        [DataMember]
        public string TC;
        [DataMember]
        public int Kilo;
        [DataMember]
        public int Boy;
        [DataMember]
        public int Kalori;
        [DataMember]
        public int Kosu;
        [DataMember]
        public int CalismaSaati;
        [DataMember]
        public string Hata;
    }

    [DataContract]
    public class ProgramDersDB
    {
        [DataMember]
        public DateTime Tarih;
        [DataMember]
        public string Ders1;
        [DataMember]
        public string Ders2;
        [DataMember]
        public string Ders3;
        [DataMember]
        public string Ders4;
        [DataMember]
        public string Ders5;
        [DataMember]
        public string Ders6;
        [DataMember]
        public string Hata;
    }
  
        
}
