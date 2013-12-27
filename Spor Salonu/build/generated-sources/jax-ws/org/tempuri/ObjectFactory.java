
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.software.ArrayOfKisiBilgileriDB;
import org.datacontract.schemas._2004._07.software.ProgramDersDB;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BugunRezervasyonYapilmismiUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _BugunRezervasyonYapilmismiTarih_QNAME = new QName("http://tempuri.org/", "tarih");
    private final static QName _BugunRezervasyonYapilmismiUserpass_QNAME = new QName("http://tempuri.org/", "userpass");
    private final static QName _BirSonrakiProgramiBulResponseBirSonrakiProgramiBulResult_QNAME = new QName("http://tempuri.org/", "BirSonrakiProgramiBulResult");
    private final static QName _KisiselBilgilerResponseKisiselBilgilerResult_QNAME = new QName("http://tempuri.org/", "KisiselBilgilerResult");
    private final static QName _ProgramGetByIdKuladi_QNAME = new QName("http://tempuri.org/", "kuladi");
    private final static QName _ProgramGetByIdSifre_QNAME = new QName("http://tempuri.org/", "sifre");
    private final static QName _RezervasyonYapRezTarihi_QNAME = new QName("http://tempuri.org/", "rezTarihi");
    private final static QName _KisiselBilgiEkleResponseKisiselBilgiEkleResult_QNAME = new QName("http://tempuri.org/", "KisiselBilgiEkleResult");
    private final static QName _ProgramGetByIdResponseProgramGetByIdResult_QNAME = new QName("http://tempuri.org/", "ProgramGetByIdResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RezervasyonYapResponse }
     * 
     */
    public RezervasyonYapResponse createRezervasyonYapResponse() {
        return new RezervasyonYapResponse();
    }

    /**
     * Create an instance of {@link UserControlResponse }
     * 
     */
    public UserControlResponse createUserControlResponse() {
        return new UserControlResponse();
    }

    /**
     * Create an instance of {@link BirSonrakiProgramiBulResponse }
     * 
     */
    public BirSonrakiProgramiBulResponse createBirSonrakiProgramiBulResponse() {
        return new BirSonrakiProgramiBulResponse();
    }

    /**
     * Create an instance of {@link KisiselBilgiler }
     * 
     */
    public KisiselBilgiler createKisiselBilgiler() {
        return new KisiselBilgiler();
    }

    /**
     * Create an instance of {@link ProgramGetByIdResponse }
     * 
     */
    public ProgramGetByIdResponse createProgramGetByIdResponse() {
        return new ProgramGetByIdResponse();
    }

    /**
     * Create an instance of {@link KisiselBilgiEkle }
     * 
     */
    public KisiselBilgiEkle createKisiselBilgiEkle() {
        return new KisiselBilgiEkle();
    }

    /**
     * Create an instance of {@link RezervasyonYap }
     * 
     */
    public RezervasyonYap createRezervasyonYap() {
        return new RezervasyonYap();
    }

    /**
     * Create an instance of {@link UserControl }
     * 
     */
    public UserControl createUserControl() {
        return new UserControl();
    }

    /**
     * Create an instance of {@link KisiselBilgiEkleResponse }
     * 
     */
    public KisiselBilgiEkleResponse createKisiselBilgiEkleResponse() {
        return new KisiselBilgiEkleResponse();
    }

    /**
     * Create an instance of {@link BugunRezervasyonYapilmismiResponse }
     * 
     */
    public BugunRezervasyonYapilmismiResponse createBugunRezervasyonYapilmismiResponse() {
        return new BugunRezervasyonYapilmismiResponse();
    }

    /**
     * Create an instance of {@link BirSonrakiProgramiBul }
     * 
     */
    public BirSonrakiProgramiBul createBirSonrakiProgramiBul() {
        return new BirSonrakiProgramiBul();
    }

    /**
     * Create an instance of {@link BugunRezervasyonYapilmismi }
     * 
     */
    public BugunRezervasyonYapilmismi createBugunRezervasyonYapilmismi() {
        return new BugunRezervasyonYapilmismi();
    }

    /**
     * Create an instance of {@link KisiselBilgilerResponse }
     * 
     */
    public KisiselBilgilerResponse createKisiselBilgilerResponse() {
        return new KisiselBilgilerResponse();
    }

    /**
     * Create an instance of {@link ProgramGetById }
     * 
     */
    public ProgramGetById createProgramGetById() {
        return new ProgramGetById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = BugunRezervasyonYapilmismi.class)
    public JAXBElement<String> createBugunRezervasyonYapilmismiUsername(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUsername_QNAME, String.class, BugunRezervasyonYapilmismi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tarih", scope = BugunRezervasyonYapilmismi.class)
    public JAXBElement<String> createBugunRezervasyonYapilmismiTarih(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiTarih_QNAME, String.class, BugunRezervasyonYapilmismi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userpass", scope = BugunRezervasyonYapilmismi.class)
    public JAXBElement<String> createBugunRezervasyonYapilmismiUserpass(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUserpass_QNAME, String.class, BugunRezervasyonYapilmismi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramDersDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BirSonrakiProgramiBulResult", scope = BirSonrakiProgramiBulResponse.class)
    public JAXBElement<ProgramDersDB> createBirSonrakiProgramiBulResponseBirSonrakiProgramiBulResult(ProgramDersDB value) {
        return new JAXBElement<ProgramDersDB>(_BirSonrakiProgramiBulResponseBirSonrakiProgramiBulResult_QNAME, ProgramDersDB.class, BirSonrakiProgramiBulResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKisiBilgileriDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "KisiselBilgilerResult", scope = KisiselBilgilerResponse.class)
    public JAXBElement<ArrayOfKisiBilgileriDB> createKisiselBilgilerResponseKisiselBilgilerResult(ArrayOfKisiBilgileriDB value) {
        return new JAXBElement<ArrayOfKisiBilgileriDB>(_KisiselBilgilerResponseKisiselBilgilerResult_QNAME, ArrayOfKisiBilgileriDB.class, KisiselBilgilerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "kuladi", scope = ProgramGetById.class)
    public JAXBElement<String> createProgramGetByIdKuladi(String value) {
        return new JAXBElement<String>(_ProgramGetByIdKuladi_QNAME, String.class, ProgramGetById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sifre", scope = ProgramGetById.class)
    public JAXBElement<String> createProgramGetByIdSifre(String value) {
        return new JAXBElement<String>(_ProgramGetByIdSifre_QNAME, String.class, ProgramGetById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tarih", scope = ProgramGetById.class)
    public JAXBElement<String> createProgramGetByIdTarih(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiTarih_QNAME, String.class, ProgramGetById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "kuladi", scope = KisiselBilgiEkle.class)
    public JAXBElement<String> createKisiselBilgiEkleKuladi(String value) {
        return new JAXBElement<String>(_ProgramGetByIdKuladi_QNAME, String.class, KisiselBilgiEkle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sifre", scope = KisiselBilgiEkle.class)
    public JAXBElement<String> createKisiselBilgiEkleSifre(String value) {
        return new JAXBElement<String>(_ProgramGetByIdSifre_QNAME, String.class, KisiselBilgiEkle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tarih", scope = KisiselBilgiEkle.class)
    public JAXBElement<String> createKisiselBilgiEkleTarih(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiTarih_QNAME, String.class, KisiselBilgiEkle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = RezervasyonYap.class)
    public JAXBElement<String> createRezervasyonYapUsername(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUsername_QNAME, String.class, RezervasyonYap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rezTarihi", scope = RezervasyonYap.class)
    public JAXBElement<String> createRezervasyonYapRezTarihi(String value) {
        return new JAXBElement<String>(_RezervasyonYapRezTarihi_QNAME, String.class, RezervasyonYap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tarih", scope = RezervasyonYap.class)
    public JAXBElement<String> createRezervasyonYapTarih(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiTarih_QNAME, String.class, RezervasyonYap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userpass", scope = RezervasyonYap.class)
    public JAXBElement<String> createRezervasyonYapUserpass(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUserpass_QNAME, String.class, RezervasyonYap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "KisiselBilgiEkleResult", scope = KisiselBilgiEkleResponse.class)
    public JAXBElement<String> createKisiselBilgiEkleResponseKisiselBilgiEkleResult(String value) {
        return new JAXBElement<String>(_KisiselBilgiEkleResponseKisiselBilgiEkleResult_QNAME, String.class, KisiselBilgiEkleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = BirSonrakiProgramiBul.class)
    public JAXBElement<String> createBirSonrakiProgramiBulUsername(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUsername_QNAME, String.class, BirSonrakiProgramiBul.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tarih", scope = BirSonrakiProgramiBul.class)
    public JAXBElement<String> createBirSonrakiProgramiBulTarih(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiTarih_QNAME, String.class, BirSonrakiProgramiBul.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userpass", scope = BirSonrakiProgramiBul.class)
    public JAXBElement<String> createBirSonrakiProgramiBulUserpass(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUserpass_QNAME, String.class, BirSonrakiProgramiBul.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramDersDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProgramGetByIdResult", scope = ProgramGetByIdResponse.class)
    public JAXBElement<ProgramDersDB> createProgramGetByIdResponseProgramGetByIdResult(ProgramDersDB value) {
        return new JAXBElement<ProgramDersDB>(_ProgramGetByIdResponseProgramGetByIdResult_QNAME, ProgramDersDB.class, ProgramGetByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "kuladi", scope = KisiselBilgiler.class)
    public JAXBElement<String> createKisiselBilgilerKuladi(String value) {
        return new JAXBElement<String>(_ProgramGetByIdKuladi_QNAME, String.class, KisiselBilgiler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sifre", scope = KisiselBilgiler.class)
    public JAXBElement<String> createKisiselBilgilerSifre(String value) {
        return new JAXBElement<String>(_ProgramGetByIdSifre_QNAME, String.class, KisiselBilgiler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = UserControl.class)
    public JAXBElement<String> createUserControlUsername(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUsername_QNAME, String.class, UserControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userpass", scope = UserControl.class)
    public JAXBElement<String> createUserControlUserpass(String value) {
        return new JAXBElement<String>(_BugunRezervasyonYapilmismiUserpass_QNAME, String.class, UserControl.class, value);
    }

}
