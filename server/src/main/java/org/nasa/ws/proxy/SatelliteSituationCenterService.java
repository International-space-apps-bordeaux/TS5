
package org.nasa.ws.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "SatelliteSituationCenterService", targetNamespace = "http://ssc.spdf.gsfc.nasa.gov/", wsdlLocation = "file:/Users/Aurore/Documents/workspace/TddMonkey/FollowSat/server/src/main/resources/wsdl/nasa.wsdl")
public class SatelliteSituationCenterService
    extends Service
{

    private final static URL SATELLITESITUATIONCENTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SATELLITESITUATIONCENTERSERVICE_EXCEPTION;
    private final static QName SATELLITESITUATIONCENTERSERVICE_QNAME = new QName("http://ssc.spdf.gsfc.nasa.gov/", "SatelliteSituationCenterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/Aurore/Documents/workspace/TddMonkey/FollowSat/server/src/main/resources/wsdl/nasa.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SATELLITESITUATIONCENTERSERVICE_WSDL_LOCATION = url;
        SATELLITESITUATIONCENTERSERVICE_EXCEPTION = e;
    }

    public SatelliteSituationCenterService() {
        super(__getWsdlLocation(), SATELLITESITUATIONCENTERSERVICE_QNAME);
    }

    public SatelliteSituationCenterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns SatelliteSituationCenterInterface
     */
    @WebEndpoint(name = "SatelliteSituationCenterPort")
    public SatelliteSituationCenterInterface getSatelliteSituationCenterPort() {
        return super.getPort(new QName("http://ssc.spdf.gsfc.nasa.gov/", "SatelliteSituationCenterPort"), SatelliteSituationCenterInterface.class);
    }

    private static URL __getWsdlLocation() {
        if (SATELLITESITUATIONCENTERSERVICE_EXCEPTION!= null) {
            throw SATELLITESITUATIONCENTERSERVICE_EXCEPTION;
        }
        return SATELLITESITUATIONCENTERSERVICE_WSDL_LOCATION;
    }

}
