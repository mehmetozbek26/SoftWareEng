
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.software.ArrayOfKisiBilgileriDB;
import org.datacontract.schemas._2004._07.software.ProgramDersDB;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISoftwareWebService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.software.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface ISoftwareWebService {


    /**
     * 
     * @param username
     * @param userpass
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "UserControl", action = "http://tempuri.org/ISoftwareWebService/UserControl")
    @WebResult(name = "UserControlResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UserControl", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UserControl")
    @ResponseWrapper(localName = "UserControlResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UserControlResponse")
    public Boolean userControl(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "userpass", targetNamespace = "http://tempuri.org/")
        String userpass);

    /**
     * 
     * @param username
     * @param tarih
     * @param userpass
     * @param rezTarihi
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "RezervasyonYap", action = "http://tempuri.org/ISoftwareWebService/RezervasyonYap")
    @WebResult(name = "RezervasyonYapResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RezervasyonYap", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RezervasyonYap")
    @ResponseWrapper(localName = "RezervasyonYapResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RezervasyonYapResponse")
    public Boolean rezervasyonYap(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "userpass", targetNamespace = "http://tempuri.org/")
        String userpass,
        @WebParam(name = "tarih", targetNamespace = "http://tempuri.org/")
        String tarih,
        @WebParam(name = "rezTarihi", targetNamespace = "http://tempuri.org/")
        String rezTarihi);

    /**
     * 
     * @param username
     * @param tarih
     * @param userpass
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "BugunRezervasyonYapilmismi", action = "http://tempuri.org/ISoftwareWebService/BugunRezervasyonYapilmismi")
    @WebResult(name = "BugunRezervasyonYapilmismiResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BugunRezervasyonYapilmismi", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BugunRezervasyonYapilmismi")
    @ResponseWrapper(localName = "BugunRezervasyonYapilmismiResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BugunRezervasyonYapilmismiResponse")
    public Boolean bugunRezervasyonYapilmismi(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "userpass", targetNamespace = "http://tempuri.org/")
        String userpass,
        @WebParam(name = "tarih", targetNamespace = "http://tempuri.org/")
        String tarih);

    /**
     * 
     * @param username
     * @param tarih
     * @param userpass
     * @return
     *     returns org.datacontract.schemas._2004._07.software.ProgramDersDB
     */
    @WebMethod(operationName = "BirSonrakiProgramiBul", action = "http://tempuri.org/ISoftwareWebService/BirSonrakiProgramiBul")
    @WebResult(name = "BirSonrakiProgramiBulResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BirSonrakiProgramiBul", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BirSonrakiProgramiBul")
    @ResponseWrapper(localName = "BirSonrakiProgramiBulResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BirSonrakiProgramiBulResponse")
    public ProgramDersDB birSonrakiProgramiBul(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "userpass", targetNamespace = "http://tempuri.org/")
        String userpass,
        @WebParam(name = "tarih", targetNamespace = "http://tempuri.org/")
        String tarih);

    /**
     * 
     * @param tarih
     * @param sifre
     * @param kuladi
     * @return
     *     returns org.datacontract.schemas._2004._07.software.ProgramDersDB
     */
    @WebMethod(operationName = "ProgramGetById", action = "http://tempuri.org/ISoftwareWebService/ProgramGetById")
    @WebResult(name = "ProgramGetByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ProgramGetById", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProgramGetById")
    @ResponseWrapper(localName = "ProgramGetByIdResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ProgramGetByIdResponse")
    public ProgramDersDB programGetById(
        @WebParam(name = "kuladi", targetNamespace = "http://tempuri.org/")
        String kuladi,
        @WebParam(name = "sifre", targetNamespace = "http://tempuri.org/")
        String sifre,
        @WebParam(name = "tarih", targetNamespace = "http://tempuri.org/")
        String tarih);

    /**
     * 
     * @param sifre
     * @param kuladi
     * @return
     *     returns org.datacontract.schemas._2004._07.software.ArrayOfKisiBilgileriDB
     */
    @WebMethod(operationName = "KisiselBilgiler", action = "http://tempuri.org/ISoftwareWebService/KisiselBilgiler")
    @WebResult(name = "KisiselBilgilerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "KisiselBilgiler", targetNamespace = "http://tempuri.org/", className = "org.tempuri.KisiselBilgiler")
    @ResponseWrapper(localName = "KisiselBilgilerResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.KisiselBilgilerResponse")
    public ArrayOfKisiBilgileriDB kisiselBilgiler(
        @WebParam(name = "kuladi", targetNamespace = "http://tempuri.org/")
        String kuladi,
        @WebParam(name = "sifre", targetNamespace = "http://tempuri.org/")
        String sifre);

    /**
     * 
     * @param kilo
     * @param kalori
     * @param tarih
     * @param sifre
     * @param calismasaati
     * @param kosu
     * @param boy
     * @param kuladi
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "KisiselBilgiEkle", action = "http://tempuri.org/ISoftwareWebService/KisiselBilgiEkle")
    @WebResult(name = "KisiselBilgiEkleResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "KisiselBilgiEkle", targetNamespace = "http://tempuri.org/", className = "org.tempuri.KisiselBilgiEkle")
    @ResponseWrapper(localName = "KisiselBilgiEkleResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.KisiselBilgiEkleResponse")
    public String kisiselBilgiEkle(
        @WebParam(name = "kuladi", targetNamespace = "http://tempuri.org/")
        String kuladi,
        @WebParam(name = "sifre", targetNamespace = "http://tempuri.org/")
        String sifre,
        @WebParam(name = "tarih", targetNamespace = "http://tempuri.org/")
        String tarih,
        @WebParam(name = "kilo", targetNamespace = "http://tempuri.org/")
        Integer kilo,
        @WebParam(name = "boy", targetNamespace = "http://tempuri.org/")
        Integer boy,
        @WebParam(name = "kalori", targetNamespace = "http://tempuri.org/")
        Integer kalori,
        @WebParam(name = "kosu", targetNamespace = "http://tempuri.org/")
        Integer kosu,
        @WebParam(name = "calismasaati", targetNamespace = "http://tempuri.org/")
        Integer calismasaati);

}
