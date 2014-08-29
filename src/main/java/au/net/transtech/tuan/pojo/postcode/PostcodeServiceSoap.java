package au.net.transtech.tuan.pojo.postcode;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Fri Aug 29 11:52:08 EST 2014
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://www.ssw.com.au/PostcodeWebservice", name = "PostcodeServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface PostcodeServiceSoap {

    @WebResult(name = "GetPostcodeAndSuburbForAustraliaResult", targetNamespace = "http://www.ssw.com.au/PostcodeWebservice")
    @RequestWrapper(localName = "GetPostcodeAndSuburbForAustralia", targetNamespace = "http://www.ssw.com.au/PostcodeWebservice", className = "au.net.transtech.tuan.pojo.postcode.GetPostcodeAndSuburbForAustralia")
    @ResponseWrapper(localName = "GetPostcodeAndSuburbForAustraliaResponse", targetNamespace = "http://www.ssw.com.au/PostcodeWebservice", className = "au.net.transtech.tuan.pojo.postcode.GetPostcodeAndSuburbForAustraliaResponse")
    @WebMethod(operationName = "GetPostcodeAndSuburbForAustralia", action = "http://www.ssw.com.au/PostcodeWebservice/GetPostcodeAndSuburbForAustralia")
    public au.net.transtech.tuan.pojo.postcode.GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult getPostcodeAndSuburbForAustralia(
        @WebParam(name = "txtSuburb", targetNamespace = "http://www.ssw.com.au/PostcodeWebservice")
        java.lang.String txtSuburb,
        @WebParam(name = "txtState", targetNamespace = "http://www.ssw.com.au/PostcodeWebservice")
        java.lang.String txtState,
        @WebParam(name = "txtPostCode", targetNamespace = "http://www.ssw.com.au/PostcodeWebservice")
        java.lang.String txtPostCode
    );
}
