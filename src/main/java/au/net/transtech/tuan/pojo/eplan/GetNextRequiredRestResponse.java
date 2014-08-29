
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
 *         &lt;element name="getNextRequiredRestResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="upToDateAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="secondsRestRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ruleSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getNextRequiredRestResult",
    "upToDateAt",
    "secondsRestRequired",
    "ruleSummary"
})
@XmlRootElement(name = "getNextRequiredRestResponse")
public class GetNextRequiredRestResponse {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getNextRequiredRestResult;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upToDateAt;
    protected int secondsRestRequired;
    protected String ruleSummary;

    /**
     * Gets the value of the getNextRequiredRestResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetNextRequiredRestResult() {
        return getNextRequiredRestResult;
    }

    /**
     * Sets the value of the getNextRequiredRestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetNextRequiredRestResult(XMLGregorianCalendar value) {
        this.getNextRequiredRestResult = value;
    }

    /**
     * Gets the value of the upToDateAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpToDateAt() {
        return upToDateAt;
    }

    /**
     * Sets the value of the upToDateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpToDateAt(XMLGregorianCalendar value) {
        this.upToDateAt = value;
    }

    /**
     * Gets the value of the secondsRestRequired property.
     * 
     */
    public int getSecondsRestRequired() {
        return secondsRestRequired;
    }

    /**
     * Sets the value of the secondsRestRequired property.
     * 
     */
    public void setSecondsRestRequired(int value) {
        this.secondsRestRequired = value;
    }

    /**
     * Gets the value of the ruleSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleSummary() {
        return ruleSummary;
    }

    /**
     * Sets the value of the ruleSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleSummary(String value) {
        this.ruleSummary = value;
    }

}
