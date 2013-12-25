
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.software.ArrayOfKisiBilgileriDB;


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
 *         &lt;element name="KisiselBilgilerResult" type="{http://schemas.datacontract.org/2004/07/Software}ArrayOfKisiBilgileriDB" minOccurs="0"/>
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
    "kisiselBilgilerResult"
})
@XmlRootElement(name = "KisiselBilgilerResponse")
public class KisiselBilgilerResponse {

    @XmlElementRef(name = "KisiselBilgilerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKisiBilgileriDB> kisiselBilgilerResult;

    /**
     * Gets the value of the kisiselBilgilerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKisiBilgileriDB }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKisiBilgileriDB> getKisiselBilgilerResult() {
        return kisiselBilgilerResult;
    }

    /**
     * Sets the value of the kisiselBilgilerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKisiBilgileriDB }{@code >}
     *     
     */
    public void setKisiselBilgilerResult(JAXBElement<ArrayOfKisiBilgileriDB> value) {
        this.kisiselBilgilerResult = value;
    }

}
