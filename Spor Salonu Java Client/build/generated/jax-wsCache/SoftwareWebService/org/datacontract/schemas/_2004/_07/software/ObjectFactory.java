
package org.datacontract.schemas._2004._07.software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.software package. 
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

    private final static QName _ProgramDersDB_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "ProgramDersDB");
    private final static QName _KisiBilgileriDB_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "KisiBilgileriDB");
    private final static QName _ArrayOfKisiBilgileriDB_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "ArrayOfKisiBilgileriDB");
    private final static QName _KisiBilgileriDBHata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Hata");
    private final static QName _KisiBilgileriDBTC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "TC");
    private final static QName _ProgramDersDBDers1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Ders1");
    private final static QName _ProgramDersDBDers4_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Ders4");
    private final static QName _ProgramDersDBDers5_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Ders5");
    private final static QName _ProgramDersDBDers2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Ders2");
    private final static QName _ProgramDersDBDers3_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Ders3");
    private final static QName _ProgramDersDBDers6_QNAME = new QName("http://schemas.datacontract.org/2004/07/Software", "Ders6");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.software
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramDersDB }
     * 
     */
    public ProgramDersDB createProgramDersDB() {
        return new ProgramDersDB();
    }

    /**
     * Create an instance of {@link ArrayOfKisiBilgileriDB }
     * 
     */
    public ArrayOfKisiBilgileriDB createArrayOfKisiBilgileriDB() {
        return new ArrayOfKisiBilgileriDB();
    }

    /**
     * Create an instance of {@link KisiBilgileriDB }
     * 
     */
    public KisiBilgileriDB createKisiBilgileriDB() {
        return new KisiBilgileriDB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramDersDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "ProgramDersDB")
    public JAXBElement<ProgramDersDB> createProgramDersDB(ProgramDersDB value) {
        return new JAXBElement<ProgramDersDB>(_ProgramDersDB_QNAME, ProgramDersDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiBilgileriDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "KisiBilgileriDB")
    public JAXBElement<KisiBilgileriDB> createKisiBilgileriDB(KisiBilgileriDB value) {
        return new JAXBElement<KisiBilgileriDB>(_KisiBilgileriDB_QNAME, KisiBilgileriDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKisiBilgileriDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "ArrayOfKisiBilgileriDB")
    public JAXBElement<ArrayOfKisiBilgileriDB> createArrayOfKisiBilgileriDB(ArrayOfKisiBilgileriDB value) {
        return new JAXBElement<ArrayOfKisiBilgileriDB>(_ArrayOfKisiBilgileriDB_QNAME, ArrayOfKisiBilgileriDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Hata", scope = KisiBilgileriDB.class)
    public JAXBElement<String> createKisiBilgileriDBHata(String value) {
        return new JAXBElement<String>(_KisiBilgileriDBHata_QNAME, String.class, KisiBilgileriDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "TC", scope = KisiBilgileriDB.class)
    public JAXBElement<String> createKisiBilgileriDBTC(String value) {
        return new JAXBElement<String>(_KisiBilgileriDBTC_QNAME, String.class, KisiBilgileriDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Ders1", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBDers1(String value) {
        return new JAXBElement<String>(_ProgramDersDBDers1_QNAME, String.class, ProgramDersDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Hata", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBHata(String value) {
        return new JAXBElement<String>(_KisiBilgileriDBHata_QNAME, String.class, ProgramDersDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Ders4", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBDers4(String value) {
        return new JAXBElement<String>(_ProgramDersDBDers4_QNAME, String.class, ProgramDersDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Ders5", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBDers5(String value) {
        return new JAXBElement<String>(_ProgramDersDBDers5_QNAME, String.class, ProgramDersDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Ders2", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBDers2(String value) {
        return new JAXBElement<String>(_ProgramDersDBDers2_QNAME, String.class, ProgramDersDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Ders3", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBDers3(String value) {
        return new JAXBElement<String>(_ProgramDersDBDers3_QNAME, String.class, ProgramDersDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Software", name = "Ders6", scope = ProgramDersDB.class)
    public JAXBElement<String> createProgramDersDBDers6(String value) {
        return new JAXBElement<String>(_ProgramDersDBDers6_QNAME, String.class, ProgramDersDB.class, value);
    }

}
