
package org.datacontract.schemas._2004._07.software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKisiBilgileriDB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKisiBilgileriDB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KisiBilgileriDB" type="{http://schemas.datacontract.org/2004/07/Software}KisiBilgileriDB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKisiBilgileriDB", propOrder = {
    "kisiBilgileriDB"
})
public class ArrayOfKisiBilgileriDB {

    @XmlElement(name = "KisiBilgileriDB", nillable = true)
    protected List<KisiBilgileriDB> kisiBilgileriDB;

    /**
     * Gets the value of the kisiBilgileriDB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kisiBilgileriDB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKisiBilgileriDB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KisiBilgileriDB }
     * 
     * 
     */
    public List<KisiBilgileriDB> getKisiBilgileriDB() {
        if (kisiBilgileriDB == null) {
            kisiBilgileriDB = new ArrayList<KisiBilgileriDB>();
        }
        return this.kisiBilgileriDB;
    }

}
