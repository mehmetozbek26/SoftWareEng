
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.software.ProgramDersDB;


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
 *         &lt;element name="BirSonrakiProgramiBulResult" type="{http://schemas.datacontract.org/2004/07/Software}ProgramDersDB" minOccurs="0"/>
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
    "birSonrakiProgramiBulResult"
})
@XmlRootElement(name = "BirSonrakiProgramiBulResponse")
public class BirSonrakiProgramiBulResponse {

    @XmlElementRef(name = "BirSonrakiProgramiBulResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramDersDB> birSonrakiProgramiBulResult;

    /**
     * Gets the value of the birSonrakiProgramiBulResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramDersDB }{@code >}
     *     
     */
    public JAXBElement<ProgramDersDB> getBirSonrakiProgramiBulResult() {
        return birSonrakiProgramiBulResult;
    }

    /**
     * Sets the value of the birSonrakiProgramiBulResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramDersDB }{@code >}
     *     
     */
    public void setBirSonrakiProgramiBulResult(JAXBElement<ProgramDersDB> value) {
        this.birSonrakiProgramiBulResult = value;
    }

}
