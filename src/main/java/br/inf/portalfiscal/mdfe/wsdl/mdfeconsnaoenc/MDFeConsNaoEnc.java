
package br.inf.portalfiscal.mdfe.wsdl.mdfeconsnaoenc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MDFeConsNaoEnc", targetNamespace = "http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsNaoEnc", wsdlLocation = "https://mdfe.svrs.rs.gov.br/ws/MDFeConsNaoEnc/MDFeConsNaoEnc.asmx?WSDL")
public class MDFeConsNaoEnc
    extends Service
{

    private final static URL MDFECONSNAOENC_WSDL_LOCATION;
    private final static WebServiceException MDFECONSNAOENC_EXCEPTION;
    private final static QName MDFECONSNAOENC_QNAME = new QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsNaoEnc", "MDFeConsNaoEnc");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://mdfe.svrs.rs.gov.br/ws/MDFeConsNaoEnc/MDFeConsNaoEnc.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MDFECONSNAOENC_WSDL_LOCATION = url;
        MDFECONSNAOENC_EXCEPTION = e;
    }

    public MDFeConsNaoEnc() {
        super(__getWsdlLocation(), MDFECONSNAOENC_QNAME);
    }

    public MDFeConsNaoEnc(WebServiceFeature... features) {
        super(__getWsdlLocation(), MDFECONSNAOENC_QNAME, features);
    }

    public MDFeConsNaoEnc(URL wsdlLocation) {
        super(wsdlLocation, MDFECONSNAOENC_QNAME);
    }

    public MDFeConsNaoEnc(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MDFECONSNAOENC_QNAME, features);
    }

    public MDFeConsNaoEnc(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MDFeConsNaoEnc(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MDFeConsNaoEncSoap12
     */
    @WebEndpoint(name = "MDFeConsNaoEncSoap12")
    public MDFeConsNaoEncSoap12 getMDFeConsNaoEncSoap12() {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsNaoEnc", "MDFeConsNaoEncSoap12"), MDFeConsNaoEncSoap12.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MDFeConsNaoEncSoap12
     */
    @WebEndpoint(name = "MDFeConsNaoEncSoap12")
    public MDFeConsNaoEncSoap12 getMDFeConsNaoEncSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsNaoEnc", "MDFeConsNaoEncSoap12"), MDFeConsNaoEncSoap12.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MDFECONSNAOENC_EXCEPTION!= null) {
            throw MDFECONSNAOENC_EXCEPTION;
        }
        return MDFECONSNAOENC_WSDL_LOCATION;
    }

}