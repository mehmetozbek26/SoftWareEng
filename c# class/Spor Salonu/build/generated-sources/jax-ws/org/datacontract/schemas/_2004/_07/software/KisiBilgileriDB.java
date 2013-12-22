
package org.datacontract.schemas._2004._07.software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KisiBilgileriDB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiBilgileriDB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Boy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CalismaSaati" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Hata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kalori" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Kilo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Kosu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tarih" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiBilgileriDB", propOrder = {
    "boy",
    "calismaSaati",
    "hata",
    "kalori",
    "kilo",
    "kosu",
    "tc",
    "tarih"
})
public class KisiBilgileriDB {

    @XmlElement(name = "Boy")
    protected Integer boy;
    @XmlElement(name = "CalismaSaati")
    protected Integer calismaSaati;
    @XmlElementRef(name = "Hata", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hata;
    @XmlElement(name = "Kalori")
    protected Integer kalori;
    @XmlElement(name = "Kilo")
    protected Integer kilo;
    @XmlElement(name = "Kosu")
    protected Integer kosu;
    @XmlElementRef(name = "TC", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tc;
    @XmlElement(name = "Tarih")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tarih;

    /**
     * Gets the value of the boy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoy() {
        return boy;
    }

    /**
     * Sets the value of the boy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoy(Integer value) {
        this.boy = value;
    }

    /**
     * Gets the value of the calismaSaati property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalismaSaati() {
        return calismaSaati;
    }

    /**
     * Sets the value of the calismaSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalismaSaati(Integer value) {
        this.calismaSaati = value;
    }

    /**
     * Gets the value of the hata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHata() {
        return hata;
    }

    /**
     * Sets the value of the hata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHata(JAXBElement<String> value) {
        this.hata = value;
    }

    /**
     * Gets the value of the kalori property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKalori() {
        return kalori;
    }

    /**
     * Sets the value of the kalori property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKalori(Integer value) {
        this.kalori = value;
    }

    /**
     * Gets the value of the kilo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilo() {
        return kilo;
    }

    /**
     * Sets the value of the kilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilo(Integer value) {
        this.kilo = value;
    }

    /**
     * Gets the value of the kosu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKosu() {
        return kosu;
    }

    /**
     * Sets the value of the kosu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKosu(Integer value) {
        this.kosu = value;
    }

    /**
     * Gets the value of the tc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTC() {
        return tc;
    }

    /**
     * Sets the value of the tc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTC(JAXBElement<String> value) {
        this.tc = value;
    }

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTarih(XMLGregorianCalendar value) {
        this.tarih = value;
    }

}
