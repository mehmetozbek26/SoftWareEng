
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kuladi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sifre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kilo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="boy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kalori" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kosu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="calismasaati" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kuladi",
    "sifre",
    "tarih",
    "kilo",
    "boy",
    "kalori",
    "kosu",
    "calismasaati"
})
@XmlRootElement(name = "KisiselBilgiEkle")
public class KisiselBilgiEkle {

    @XmlElementRef(name = "kuladi", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kuladi;
    @XmlElementRef(name = "sifre", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sifre;
    @XmlElementRef(name = "tarih", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tarih;
    protected Integer kilo;
    protected Integer boy;
    protected Integer kalori;
    protected Integer kosu;
    protected Integer calismasaati;

    /**
     * Gets the value of the kuladi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKuladi() {
        return kuladi;
    }

    /**
     * Sets the value of the kuladi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKuladi(JAXBElement<String> value) {
        this.kuladi = value;
    }

    /**
     * Gets the value of the sifre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSifre() {
        return sifre;
    }

    /**
     * Sets the value of the sifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSifre(JAXBElement<String> value) {
        this.sifre = value;
    }

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTarih(JAXBElement<String> value) {
        this.tarih = value;
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
     * Gets the value of the calismasaati property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalismasaati() {
        return calismasaati;
    }

    /**
     * Sets the value of the calismasaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalismasaati(Integer value) {
        this.calismasaati = value;
    }

}
