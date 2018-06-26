
package cn.live.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.live.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReverseResponse_QNAME = new QName("http://service.ws.live.cn/", "reverseResponse");
    private final static QName _Reverse_QNAME = new QName("http://service.ws.live.cn/", "reverse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.live.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Reverse }
     * 
     */
    public Reverse createReverse() {
        return new Reverse();
    }

    /**
     * Create an instance of {@link ReverseResponse }
     * 
     */
    public ReverseResponse createReverseResponse() {
        return new ReverseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.live.cn/", name = "reverseResponse")
    public JAXBElement<ReverseResponse> createReverseResponse(ReverseResponse value) {
        return new JAXBElement<ReverseResponse>(_ReverseResponse_QNAME, ReverseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reverse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.live.cn/", name = "reverse")
    public JAXBElement<Reverse> createReverse(Reverse value) {
        return new JAXBElement<Reverse>(_Reverse_QNAME, Reverse.class, null, value);
    }

}
