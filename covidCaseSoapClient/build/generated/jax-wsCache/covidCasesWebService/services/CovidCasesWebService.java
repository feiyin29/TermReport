
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "covidCasesWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CovidCasesWebService {


    /**
     * 
     * @return
     *     returns java.util.List<services.Covidcases>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://service/", className = "services.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://service/", className = "services.FindAllResponse")
    @Action(input = "http://service/covidCasesWebService/findAllRequest", output = "http://service/covidCasesWebService/findAllResponse")
    public List<Covidcases> findAll();

}