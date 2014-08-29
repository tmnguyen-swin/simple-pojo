
package au.net.transtech.tuan.pojo.postcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetPostcodeAndSuburbForAustraliaResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "getPostcodeAndSuburbForAustraliaResult"
})
@XmlRootElement(name = "GetPostcodeAndSuburbForAustraliaResponse")
public class GetPostcodeAndSuburbForAustraliaResponse {

    @XmlElement(name = "GetPostcodeAndSuburbForAustraliaResult")
    protected GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult getPostcodeAndSuburbForAustraliaResult;

    /**
     * Gets the value of the getPostcodeAndSuburbForAustraliaResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult }
     *     
     */
    public GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult getGetPostcodeAndSuburbForAustraliaResult() {
        return getPostcodeAndSuburbForAustraliaResult;
    }

    /**
     * Sets the value of the getPostcodeAndSuburbForAustraliaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult }
     *     
     */
    public void setGetPostcodeAndSuburbForAustraliaResult(GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult value) {
        this.getPostcodeAndSuburbForAustraliaResult = value;
    }


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
     *         &lt;any/>
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
        "any"
    })
    public static class GetPostcodeAndSuburbForAustraliaResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}