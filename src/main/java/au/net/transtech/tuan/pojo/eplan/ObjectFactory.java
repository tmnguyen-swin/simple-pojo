
package au.net.transtech.tuan.pojo.eplan;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.transtech.tuan.pojo.eplan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.transtech.tuan.pojo.eplan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EPlanMessage }
     * 
     */
    public EPlanMessage createEPlanMessage() {
        return new EPlanMessage();
    }

    /**
     * Create an instance of {@link GetNextRequiredRest }
     * 
     */
    public GetNextRequiredRest createGetNextRequiredRest() {
        return new GetNextRequiredRest();
    }

    /**
     * Create an instance of {@link GetNextRequiredRestResponse }
     * 
     */
    public GetNextRequiredRestResponse createGetNextRequiredRestResponse() {
        return new GetNextRequiredRestResponse();
    }

    /**
     * Create an instance of {@link EPlanMessageResponse }
     * 
     */
    public EPlanMessageResponse createEPlanMessageResponse() {
        return new EPlanMessageResponse();
    }

}
