package au.net.transtech.tuan.pojo.abn;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.3
 * Fri Sep 05 00:13:56 EST 2014
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", name = "ABRXMLSearchHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ABRXMLSearchHttpGet {

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByABNv201205")
    public Payload searchByABNv201205(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByASICv200506")
    public Payload searchByASICv200506(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByCharity")
    public Payload searchByCharity(
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "state", name = "state", targetNamespace = "")
        java.lang.String state,
        @WebParam(partName = "charityTypeCode", name = "charityTypeCode", targetNamespace = "")
        java.lang.String charityTypeCode,
        @WebParam(partName = "concessionTypeCode", name = "concessionTypeCode", targetNamespace = "")
        java.lang.String concessionTypeCode,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "ABRSearchByNameAdvancedSimpleProtocol2012")
    public Payload abrSearchByNameAdvancedSimpleProtocol2012(
        @WebParam(partName = "name", name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "legalName", name = "legalName", targetNamespace = "")
        java.lang.String legalName,
        @WebParam(partName = "tradingName", name = "tradingName", targetNamespace = "")
        java.lang.String tradingName,
        @WebParam(partName = "businessName", name = "businessName", targetNamespace = "")
        java.lang.String businessName,
        @WebParam(partName = "NSW", name = "NSW", targetNamespace = "")
        java.lang.String nsw,
        @WebParam(partName = "SA", name = "SA", targetNamespace = "")
        java.lang.String sa,
        @WebParam(partName = "ACT", name = "ACT", targetNamespace = "")
        java.lang.String act,
        @WebParam(partName = "VIC", name = "VIC", targetNamespace = "")
        java.lang.String vic,
        @WebParam(partName = "WA", name = "WA", targetNamespace = "")
        java.lang.String wa,
        @WebParam(partName = "NT", name = "NT", targetNamespace = "")
        java.lang.String nt,
        @WebParam(partName = "QLD", name = "QLD", targetNamespace = "")
        java.lang.String qld,
        @WebParam(partName = "TAS", name = "TAS", targetNamespace = "")
        java.lang.String tas,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid,
        @WebParam(partName = "searchWidth", name = "searchWidth", targetNamespace = "")
        java.lang.String searchWidth,
        @WebParam(partName = "minimumScore", name = "minimumScore", targetNamespace = "")
        java.lang.String minimumScore,
        @WebParam(partName = "maxSearchResults", name = "maxSearchResults", targetNamespace = "")
        java.lang.String maxSearchResults
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "ABRSearchByASIC")
    public Payload abrSearchByASIC(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByABNv200709")
    public Payload searchByABNv200709(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByABNv200506")
    public Payload searchByABNv200506(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByASICv201205")
    public Payload searchByASICv201205(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByABNStatus")
    public Payload searchByABNStatus(
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "activeABNsOnly", name = "activeABNsOnly", targetNamespace = "")
        java.lang.String activeABNsOnly,
        @WebParam(partName = "currentGSTRegistrationOnly", name = "currentGSTRegistrationOnly", targetNamespace = "")
        java.lang.String currentGSTRegistrationOnly,
        @WebParam(partName = "entityTypeCode", name = "entityTypeCode", targetNamespace = "")
        java.lang.String entityTypeCode,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "ABRSearchByNameAdvancedSimpleProtocol2006")
    public Payload abrSearchByNameAdvancedSimpleProtocol2006(
        @WebParam(partName = "name", name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "legalName", name = "legalName", targetNamespace = "")
        java.lang.String legalName,
        @WebParam(partName = "tradingName", name = "tradingName", targetNamespace = "")
        java.lang.String tradingName,
        @WebParam(partName = "NSW", name = "NSW", targetNamespace = "")
        java.lang.String nsw,
        @WebParam(partName = "SA", name = "SA", targetNamespace = "")
        java.lang.String sa,
        @WebParam(partName = "ACT", name = "ACT", targetNamespace = "")
        java.lang.String act,
        @WebParam(partName = "VIC", name = "VIC", targetNamespace = "")
        java.lang.String vic,
        @WebParam(partName = "WA", name = "WA", targetNamespace = "")
        java.lang.String wa,
        @WebParam(partName = "NT", name = "NT", targetNamespace = "")
        java.lang.String nt,
        @WebParam(partName = "QLD", name = "QLD", targetNamespace = "")
        java.lang.String qld,
        @WebParam(partName = "TAS", name = "TAS", targetNamespace = "")
        java.lang.String tas,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid,
        @WebParam(partName = "searchWidth", name = "searchWidth", targetNamespace = "")
        java.lang.String searchWidth,
        @WebParam(partName = "minimumScore", name = "minimumScore", targetNamespace = "")
        java.lang.String minimumScore,
        @WebParam(partName = "maxSearchResults", name = "maxSearchResults", targetNamespace = "")
        java.lang.String maxSearchResults
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "ABRSearchByABN")
    public Payload abrSearchByABN(
        @WebParam(partName = "searchString", name = "searchString", targetNamespace = "")
        java.lang.String searchString,
        @WebParam(partName = "includeHistoricalDetails", name = "includeHistoricalDetails", targetNamespace = "")
        java.lang.String includeHistoricalDetails,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "ABRSearchByNameSimpleProtocol")
    public Payload abrSearchByNameSimpleProtocol(
        @WebParam(partName = "name", name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "legalName", name = "legalName", targetNamespace = "")
        java.lang.String legalName,
        @WebParam(partName = "tradingName", name = "tradingName", targetNamespace = "")
        java.lang.String tradingName,
        @WebParam(partName = "NSW", name = "NSW", targetNamespace = "")
        java.lang.String nsw,
        @WebParam(partName = "SA", name = "SA", targetNamespace = "")
        java.lang.String sa,
        @WebParam(partName = "ACT", name = "ACT", targetNamespace = "")
        java.lang.String act,
        @WebParam(partName = "VIC", name = "VIC", targetNamespace = "")
        java.lang.String vic,
        @WebParam(partName = "WA", name = "WA", targetNamespace = "")
        java.lang.String wa,
        @WebParam(partName = "NT", name = "NT", targetNamespace = "")
        java.lang.String nt,
        @WebParam(partName = "QLD", name = "QLD", targetNamespace = "")
        java.lang.String qld,
        @WebParam(partName = "TAS", name = "TAS", targetNamespace = "")
        java.lang.String tas,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByRegistrationEvent")
    public Payload searchByRegistrationEvent(
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "state", name = "state", targetNamespace = "")
        java.lang.String state,
        @WebParam(partName = "entityTypeCode", name = "entityTypeCode", targetNamespace = "")
        java.lang.String entityTypeCode,
        @WebParam(partName = "month", name = "month", targetNamespace = "")
        java.lang.String month,
        @WebParam(partName = "year", name = "year", targetNamespace = "")
        java.lang.String year,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByPostcode")
    public Payload searchByPostcode(
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "ABRSearchByNameAdvancedSimpleProtocol")
    public Payload abrSearchByNameAdvancedSimpleProtocol(
        @WebParam(partName = "name", name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "legalName", name = "legalName", targetNamespace = "")
        java.lang.String legalName,
        @WebParam(partName = "tradingName", name = "tradingName", targetNamespace = "")
        java.lang.String tradingName,
        @WebParam(partName = "NSW", name = "NSW", targetNamespace = "")
        java.lang.String nsw,
        @WebParam(partName = "SA", name = "SA", targetNamespace = "")
        java.lang.String sa,
        @WebParam(partName = "ACT", name = "ACT", targetNamespace = "")
        java.lang.String act,
        @WebParam(partName = "VIC", name = "VIC", targetNamespace = "")
        java.lang.String vic,
        @WebParam(partName = "WA", name = "WA", targetNamespace = "")
        java.lang.String wa,
        @WebParam(partName = "NT", name = "NT", targetNamespace = "")
        java.lang.String nt,
        @WebParam(partName = "QLD", name = "QLD", targetNamespace = "")
        java.lang.String qld,
        @WebParam(partName = "TAS", name = "TAS", targetNamespace = "")
        java.lang.String tas,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid,
        @WebParam(partName = "searchWidth", name = "searchWidth", targetNamespace = "")
        java.lang.String searchWidth,
        @WebParam(partName = "minimumScore", name = "minimumScore", targetNamespace = "")
        java.lang.String minimumScore
    );

    @WebResult(name = "ABRPayloadSearchResults", targetNamespace = "http://abr.business.gov.au/ABRXMLSearch/", partName = "Body")
    @WebMethod(operationName = "SearchByUpdateEvent")
    public Payload searchByUpdateEvent(
        @WebParam(partName = "postcode", name = "postcode", targetNamespace = "")
        java.lang.String postcode,
        @WebParam(partName = "state", name = "state", targetNamespace = "")
        java.lang.String state,
        @WebParam(partName = "entityTypeCode", name = "entityTypeCode", targetNamespace = "")
        java.lang.String entityTypeCode,
        @WebParam(partName = "updatedate", name = "updatedate", targetNamespace = "")
        java.lang.String updatedate,
        @WebParam(partName = "authenticationGuid", name = "authenticationGuid", targetNamespace = "")
        java.lang.String authenticationGuid
    );
}
