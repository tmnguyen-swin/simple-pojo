package au.net.transtech.tuan.pojo;

import au.net.transtech.tuan.pojo.eplan.EPlanMessage;
import au.net.transtech.tuan.pojo.eplan.EPlanMessageResponse;
import au.net.transtech.tuan.pojo.eplan.EPlanWebService;
import au.net.transtech.tuan.pojo.eplan.EPlanWebServiceSoap;
import au.net.transtech.tuan.pojo.mywebservice.SimpleWebServiceStub;
import au.net.transtech.tuan.pojo.postcode.GetPostcodeAndSuburbForAustraliaResponse;
import au.net.transtech.tuan.pojo.postcode.PostcodeService;
import au.net.transtech.tuan.pojo.postcode.PostcodeServiceSoap;
import au.net.transtech.tuan.pojo.stockquote.GetQuote;
import au.net.transtech.tuan.pojo.stockquote.GetQuoteResponse;
import au.net.transtech.tuan.pojo.stockquote.StockQuote;
import au.net.transtech.tuan.pojo.stockquote.StockQuoteSoap;
import org.apache.axis2.AxisFault;
import org.reficio.ws.client.core.SoapClient;

import javax.xml.ws.BindingProvider;
import java.rmi.RemoteException;

/**
 * Created by tuan on 29/08/14.
 */
public class Client {

    public Client()
    {
        invokeStockQuote();
//        invokePostCode();
//        invokeEPlan();
//        invokeMyWebService();
//        invokeMyWebService2();
    }

    public static void main(String[] args)
    {
        new Client();
    }

    public void invokeStockQuote()
    {
        StockQuote stockQuoteService = new StockQuote();
        StockQuoteSoap soapPort = stockQuoteService.getStockQuoteSoap();

//        Client client = ClientProxy.getClient(soapPort);
//        client.getRequestContext().put(Message.ENDPOINT_ADDRESS, "http://some-valid-endpoint") ;
        GetQuote request = new GetQuote();
        request.setSymbol("GOOG");
        GetQuoteResponse response = soapPort.getQuote(request);
        System.out.println(response.getGetQuoteResult());
    }

    public void invokePostCode()
    {
        PostcodeService postcodeService = new PostcodeService();
        PostcodeServiceSoap soapPort = postcodeService.getPostcodeServiceSoap();
        GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult response =
                soapPort.getPostcodeAndSuburbForAustralia("Hawthorn East", "VIC", "3123");
        System.out.println(response);
    }

    public void invokeEPlan()
    {
        EPlanWebService ePlanWebService = new EPlanWebService();
        EPlanWebServiceSoap soapPort = ePlanWebService.getEPlanWebServiceSoap();
        EPlanMessage ePlanMessage = new EPlanMessage();
        ePlanMessage.setMessage("0,290814,120100,-37.69861,145.15118,866,53.7,320,135792.466");
        EPlanMessageResponse response = soapPort.ePlanMessage(ePlanMessage);
        System.out.println(response.isEPlanMessageResult());
    }

    public void invokeMyWebService()
    {
        try {
            SimpleWebServiceStub stub = new SimpleWebServiceStub();
            SimpleWebServiceStub.Add request = new SimpleWebServiceStub.Add();
            request.setA(4);
            request.setB(5);
            SimpleWebServiceStub.AddResponse response = stub.add(request);
            System.out.println(response.get_return());
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
    }

    public void invokeMyWebService2()
    {

/*
        Wsdl wsdl = Wsdl.parse("http://www.webservicex.net/CurrencyConvertor.asmx?WSDL");

        SoapBuilder builder = wsdl.binding()
                .localPart("CurrencyConvertorSoap")
                .find();
        SoapOperation operation = builder.operation()
                .soapAction("http://www.webserviceX.NET/ConversionRate")
                .find();
        String request = builder.buildInputMessage(operation);
*/

        SoapClient client = SoapClient.builder()
                .endpointUri("http://www.webservicex.net/CurrencyConvertor.asmx")
                .build();
        String request =
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:q0=\"http://ws.tuan.transtech.net.au\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                        "<soapenv:Body>\n" +
                            "<q0:add>\n" +
                                "<q0:a>5</q0:a> \n" +
                                "<q0:b>7</q0:b> \n" +
                            "</q0:add>\n" +
                        "</soapenv:Body>\n" +
                "</soapenv:Envelope>";

        String response = client.post(request);

        System.out.println(response);
    }
}
