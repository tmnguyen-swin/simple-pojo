package au.net.transtech.tuan.pojo.eplan;

import au.net.transtech.tuan.pojo.postcode.GetPostcodeAndSuburbForAustraliaResponse;
import au.net.transtech.tuan.pojo.postcode.PostcodeService;
import au.net.transtech.tuan.pojo.postcode.PostcodeServiceSoap;
import au.net.transtech.tuan.pojo.stockquote.GetQuote;
import au.net.transtech.tuan.pojo.stockquote.GetQuoteResponse;
import au.net.transtech.tuan.pojo.stockquote.StockQuote;
import au.net.transtech.tuan.pojo.stockquote.StockQuoteSoap;

/**
 * Created by tuan on 29/08/14.
 */
public class EPlanClient {

    public EPlanClient()
    {
//        invokeStockQuote();
        invokePostCode();
    }

    public static void main(String[] args)
    {
        new EPlanClient();
    }

    public void invokeStockQuote()
    {
        StockQuote stockQuoteService = new StockQuote();
        StockQuoteSoap soapPort = stockQuoteService.getStockQuoteSoap();
        GetQuote request = new GetQuote();
        String response = soapPort.getQuote("GOOG");
        System.out.println(response);
    }

    public void invokePostCode()
    {
        PostcodeService postcodeService = new PostcodeService();
        PostcodeServiceSoap soapPort = postcodeService.getPostcodeServiceSoap();
        GetPostcodeAndSuburbForAustraliaResponse.GetPostcodeAndSuburbForAustraliaResult response =
                soapPort.getPostcodeAndSuburbForAustralia("Hawthorn East", "VIC", "3123");
        System.out.println(response);
    }
}
