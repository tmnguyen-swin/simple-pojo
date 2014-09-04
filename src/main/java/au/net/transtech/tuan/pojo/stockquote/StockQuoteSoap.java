package au.net.transtech.tuan.pojo.stockquote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Sep 04 22:33:35 EST 2014
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "StockQuoteSoap")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StockQuoteSoap {

    @WebResult(name = "GetQuoteResponse", targetNamespace = "http://www.webserviceX.NET/", partName = "parameters")
    @WebMethod(operationName = "GetQuote", action = "http://www.webserviceX.NET/GetQuote")
    public GetQuoteResponse getQuote(
        @WebParam(partName = "parameters", name = "GetQuote", targetNamespace = "http://www.webserviceX.NET/")
        GetQuote parameters
    );
}
