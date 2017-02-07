
package br.inf.portalfiscal.nfe.wsdl.nfestatusservico3;

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
@WebServiceClient(name = "NfeStatusServico3", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico3", wsdlLocation = "https://nfe.fazenda.pr.gov.br/nfe/NFeStatusServico3?wsdl")
public class NfeStatusServico3
    extends Service
{

    private final static URL NFESTATUSSERVICO3_WSDL_LOCATION;
    private final static WebServiceException NFESTATUSSERVICO3_EXCEPTION;
    private final static QName NFESTATUSSERVICO3_QNAME = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico3", "NfeStatusServico3");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://nfe.fazenda.pr.gov.br/nfe/NFeStatusServico3?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NFESTATUSSERVICO3_WSDL_LOCATION = url;
        NFESTATUSSERVICO3_EXCEPTION = e;
    }

    public NfeStatusServico3() {
        super(__getWsdlLocation(), NFESTATUSSERVICO3_QNAME);
    }

    public NfeStatusServico3(WebServiceFeature... features) {
        super(__getWsdlLocation(), NFESTATUSSERVICO3_QNAME, features);
    }

    public NfeStatusServico3(URL wsdlLocation) {
        super(wsdlLocation, NFESTATUSSERVICO3_QNAME);
    }

    public NfeStatusServico3(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NFESTATUSSERVICO3_QNAME, features);
    }

    public NfeStatusServico3(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NfeStatusServico3(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NfeStatusServicoSoap12
     */
    @WebEndpoint(name = "NfeStatusServicoServicePort")
    public NfeStatusServicoSoap12 getNfeStatusServicoServicePort() {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico3", "NfeStatusServicoServicePort"), NfeStatusServicoSoap12.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NfeStatusServicoSoap12
     */
    @WebEndpoint(name = "NfeStatusServicoServicePort")
    public NfeStatusServicoSoap12 getNfeStatusServicoServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico3", "NfeStatusServicoServicePort"), NfeStatusServicoSoap12.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NFESTATUSSERVICO3_EXCEPTION!= null) {
            throw NFESTATUSSERVICO3_EXCEPTION;
        }
        return NFESTATUSSERVICO3_WSDL_LOCATION;
    }

}