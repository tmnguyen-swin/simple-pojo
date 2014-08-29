
package au.net.transtech.tuan.pojo.postcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="txtSuburb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txtState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txtPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "txtSuburb",
    "txtState",
    "txtPostCode"
})
@XmlRootElement(name = "GetPostcodeAndSuburbForAustralia")
public class GetPostcodeAndSuburbForAustralia {

    protected String txtSuburb;
    protected String txtState;
    protected String txtPostCode;

    /**
     * Gets the value of the txtSuburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtSuburb() {
        return txtSuburb;
    }

    /**
     * Sets the value of the txtSuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtSuburb(String value) {
        this.txtSuburb = value;
    }

    /**
     * Gets the value of the txtState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtState() {
        return txtState;
    }

    /**
     * Sets the value of the txtState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtState(String value) {
        this.txtState = value;
    }

    /**
     * Gets the value of the txtPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtPostCode() {
        return txtPostCode;
    }

    /**
     * Sets the value of the txtPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtPostCode(String value) {
        this.txtPostCode = value;
    }

}
