package service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Covidcases;

/**
 *
 * @author feifei
 */
@WebService(serviceName = "covidCasesWebService")
public class covidCasesWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplication1PU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAll")
    public List<Covidcases> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Covidcases> caseList = (List<Covidcases>) em.createNamedQuery("Covidcases.findAll").getResultList();
        em.close();
        return caseList;
    }

    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
}
