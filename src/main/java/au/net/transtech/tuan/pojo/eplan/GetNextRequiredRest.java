
package au.net.transtech.tuan.pojo.eplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DriverId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastCheckpoint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "driverId",
    "lastCheckpoint"
})
@XmlRootElement(name = "getNextRequiredRest")
public class GetNextRequiredRest {

    @XmlElement(name = "DriverId")
    protected int driverId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCheckpoint;

    /**
     * Gets the value of the driverId property.
     * 
     */
    public int getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     */
    public void setDriverId(int value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the lastCheckpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCheckpoint() {
        return lastCheckpoint;
    }

    /**
     * Sets the value of the lastCheckpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCheckpoint(XMLGregorianCalendar value) {
        this.lastCheckpoint = value;
    }

}
