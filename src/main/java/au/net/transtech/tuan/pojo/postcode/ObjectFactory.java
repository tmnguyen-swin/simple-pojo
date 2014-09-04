
package au.net.transtech.tuan.pojo.postcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.transtech.tuan.pojo.postcode package. 
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

    private final static QName _DataSet_QNAME = new QName("http://www.ssw.com.au/PostcodeWebservice", "DataSet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.transtech.tuan.pojo.postcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult }
     * 
     */
    public GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult createGetPostcodeAndSuburbForAustraliaResponseGetPostcodeAndSuburbForAustraliaResult() {
        return new GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult();
    }

    /**
     * Create an instance of {@link GetPostcodeAndSuburbForAustralia }
     * 
     */
    public GetPostcodeAndSuburbForAustralia createGetPostcodeAndSuburbForAustralia() {
        return new GetPostcodeAndSuburbForAustralia();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link GetPostcodeAndSuburbForAustraliaResponse }
     * 
     */
    public GetPostcodeAndSuburbForAustraliaResponse createGetPostcodeAndSuburbForAustraliaResponse() {
        return new GetPostcodeAndSuburbForAustraliaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ssw.com.au/PostcodeWebservice", name = "DataSet")
    public JAXBElement<DataSet> createDataSet(DataSet value) {
        return new JAXBElement<DataSet>(_DataSet_QNAME, DataSet.class, null, value);
    }

}
