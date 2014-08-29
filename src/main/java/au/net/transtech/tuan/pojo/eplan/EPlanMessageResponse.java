
package au.net.transtech.tuan.pojo.eplan;

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
 *         &lt;element name="ePlanMessageResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "ePlanMessageResult"
})
@XmlRootElement(name = "ePlanMessageResponse")
public class EPlanMessageResponse {

    protected boolean ePlanMessageResult;

    /**
     * Gets the value of the ePlanMessageResult property.
     * 
     */
    public boolean isEPlanMessageResult() {
        return ePlanMessageResult;
    }

    /**
     * Sets the value of the ePlanMessageResult property.
     * 
     */
    public void setEPlanMessageResult(boolean value) {
        this.ePlanMessageResult = value;
    }

}
