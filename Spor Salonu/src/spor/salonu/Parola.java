/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spor.salonu;

/**
 *
 * @author MERKAN
 */
public class Parola {
    private static Parola instance=null;
    protected Parola()
    {
        
    }
    public static Parola getInstance()
    {
        if(instance==null)
            instance=new Parola();
        return instance;
    }
    public String KullaniciAdi;

    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getKullaniciSifre() {
        return KullaniciSifre;
    }

    public void setKullaniciSifre(String KullaniciSifre) {
        this.KullaniciSifre = KullaniciSifre;
    }
    public String KullaniciSifre;

    
}
