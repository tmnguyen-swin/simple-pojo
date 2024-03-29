
/*
 * 
 */

package au.net.transtech.tuan.pojo.eplan;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.3
 * Fri Aug 29 17:07:46 EST 2014
 * Generated source version: 2.2.3
 * 
 */


@WebServiceClient(name = "ePlanWebService", 
                  wsdlLocation = "http://blackwood:8091/ePlanWebService.asmx?WSDL",
                  targetNamespace = "http://www.transtech.net.au/") 
public class EPlanWebService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.transtech.net.au/", "ePlanWebService");
    public final static QName EPlanWebServiceSoap12 = new QName("http://www.transtech.net.au/", "ePlanWebServiceSoap12");
    public final static QName EPlanWebServiceSoap = new QName("http://www.transtech.net.au/", "ePlanWebServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://blackwood:8091/ePlanWebService.asmx?WSDL");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://blackwood:8091/ePlanWebService.asmx?WSDL");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public EPlanWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EPlanWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EPlanWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns EPlanWebServiceSoap
     */
    @WebEndpoint(name = "ePlanWebServiceSoap12")
    public EPlanWebServiceSoap getEPlanWebServiceSoap12() {
        return super.getPort(EPlanWebServiceSoap12, EPlanWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EPlanWebServiceSoap
     */
    @WebEndpoint(name = "ePlanWebServiceSoap12")
    public EPlanWebServiceSoap getEPlanWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(EPlanWebServiceSoap12, EPlanWebServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns EPlanWebServiceSoap
     */
    @WebEndpoint(name = "ePlanWebServiceSoap")
    public EPlanWebServiceSoap getEPlanWebServiceSoap() {
        return super.getPort(EPlanWebServiceSoap, EPlanWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EPlanWebServiceSoap
     */
    @WebEndpoint(name = "ePlanWebServiceSoap")
    public EPlanWebServiceSoap getEPlanWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(EPlanWebServiceSoap, EPlanWebServiceSoap.class, features);
    }

}
