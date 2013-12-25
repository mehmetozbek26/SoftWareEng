
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
 * <p>Java class for ProgramDersDB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramDersDB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ders1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ders2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ders3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ders4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ders5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ders6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProgramDersDB", propOrder = {
    "ders1",
    "ders2",
    "ders3",
    "ders4",
    "ders5",
    "ders6",
    "hata",
    "tarih"
})
public class ProgramDersDB {

    @XmlElementRef(name = "Ders1", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ders1;
    @XmlElementRef(name = "Ders2", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ders2;
    @XmlElementRef(name = "Ders3", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ders3;
    @XmlElementRef(name = "Ders4", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ders4;
    @XmlElementRef(name = "Ders5", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ders5;
    @XmlElementRef(name = "Ders6", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ders6;
    @XmlElementRef(name = "Hata", namespace = "http://schemas.datacontract.org/2004/07/Software", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hata;
    @XmlElement(name = "Tarih")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tarih;

    /**
     * Gets the value of the ders1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDers1() {
        return ders1;
    }

    /**
     * Sets the value of the ders1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDers1(JAXBElement<String> value) {
        this.ders1 = value;
    }

    /**
     * Gets the value of the ders2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDers2() {
        return ders2;
    }

    /**
     * Sets the value of the ders2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDers2(JAXBElement<String> value) {
        this.ders2 = value;
    }

    /**
     * Gets the value of the ders3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDers3() {
        return ders3;
    }

    /**
     * Sets the value of the ders3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDers3(JAXBElement<String> value) {
        this.ders3 = value;
    }

    /**
     * Gets the value of the ders4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDers4() {
        return ders4;
    }

    /**
     * Sets the value of the ders4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDers4(JAXBElement<String> value) {
        this.ders4 = value;
    }

    /**
     * Gets the value of the ders5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDers5() {
        return ders5;
    }

    /**
     * Sets the value of the ders5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDers5(JAXBElement<String> value) {
        this.ders5 = value;
    }

    /**
     * Gets the value of the ders6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDers6() {
        return ders6;
    }

    /**
     * Sets the value of the ders6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDers6(JAXBElement<String> value) {
        this.ders6 = value;
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
