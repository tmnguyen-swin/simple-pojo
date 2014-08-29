package au.net.transtech.tuan.pojo.stockquote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.3
 * Fri Aug 29 17:07:45 EST 2014
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "StockQuoteHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StockQuoteHttpPost {

    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    @WebMethod(operationName = "GetQuote")
    public java.lang.String getQuote(
        @WebParam(partName = "symbol", name = "symbol", targetNamespace = "")
        java.lang.String symbol
    );
}
