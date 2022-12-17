package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class readJson {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplication1PU");
    public static String getJSONFromURL(String strUrl) {
        String jsonText = "";

        try {
            URL url = new URL(strUrl);
            InputStream is = url.openStream();

            BufferedReader bufferedReader = 
                            new BufferedReader(new InputStreamReader(is));
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }

            is.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        return jsonText;
    }
    
    public static void main(String[] args) {
        String strJson = getJSONFromURL(
            "https://covid19.ddc.moph.go.th/api/Cases/today-cases-all"
        );
        
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);        
            JSONArray jsonArrayPhoneNumbers = (JSONArray) object;
            
            for (int i = 0; i < jsonArrayPhoneNumbers.size(); i++) {
                JSONObject mainJsonObject = (JSONObject) jsonArrayPhoneNumbers.get(i);
                
                Long yearnum = (Long) mainJsonObject.get("year");
                System.out.println("year number : " + yearnum);

                Long weeknum = (Long) mainJsonObject.get("weeknum");
                System.out.println("week number : " + weeknum);

                Long new_case = (Long) mainJsonObject.get("new_case");
                System.out.println("new case : " + new_case);

                Long total_case = (Long) mainJsonObject.get("total_case");
                System.out.println("total case : " + total_case);

                Long new_case_excludeabroad = (Long) mainJsonObject.get("new_case_excludeabroad");
                System.out.println("new case excludeabroad : " + new_case_excludeabroad);

                Long total_case_excludeabroad = (Long) mainJsonObject.get("total_case_excludeabroad");
                System.out.println("total case excludeabroad : " + total_case_excludeabroad);

                Long new_recovered = (Long) mainJsonObject.get("new_recovered");
                System.out.println("new recovered : " + new_recovered);

                Long total_recovered = (Long) mainJsonObject.get("total_recovered");
                System.out.println("total recovered : " + total_recovered);

                Long new_death = (Long) mainJsonObject.get("new_death");
                System.out.println("new death : " + new_death);

                Long total_death = (Long) mainJsonObject.get("total_death");
                System.out.println("total death : " + total_death);

                Long case_foreign = (Long) mainJsonObject.get("case_foreign");
                System.out.println("case foreign : " + case_foreign);

                Long case_prison = (Long) mainJsonObject.get("case_prison");
                System.out.println("case prison : " + case_prison);

                Long case_walkin = (Long) mainJsonObject.get("case_walkin");
                System.out.println("case walkin : " + case_walkin);

                Long case_new_prev = (Long) mainJsonObject.get("case_new_prev");
                System.out.println("case new prev : " + case_new_prev);

                Long case_new_diff = (Long) mainJsonObject.get("case_new_diff");
                System.out.println("case new diff : " + case_new_diff);

                Long death_new_prev = (Long) mainJsonObject.get("death_new_prev");
                System.out.println("death new prev : " + death_new_prev);

                Long death_new_diff = (Long) mainJsonObject.get("death_new_diff");
                System.out.println("death new diff : " + death_new_diff);

                String update_date = (String) mainJsonObject.get("update_date");
                System.out.println("update_date : " + update_date);
                
                Covidcases casesObj;
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplication1PU");
                EntityManager em = emf.createEntityManager();
                casesObj = em.find(Covidcases.class, 1);
                if (casesObj != null) {
                     casesObj.setYearnum(yearnum.intValue());
                     casesObj.setWeeknum(weeknum.intValue());
                     casesObj.setNewCase(new_case.intValue());
                     casesObj.setTotalCase(total_case.intValue());
                     casesObj.setNewCaseExcludeabroad(new_case_excludeabroad.intValue());
                     casesObj.setTotalCaseExcludeabroad(total_case_excludeabroad .intValue());
                     casesObj.setNewRecovered(new_recovered.intValue());
                     casesObj.setTotalRecovered(total_recovered.intValue());
                     casesObj.setNewDeath(new_death.intValue());
                     casesObj.setTotalDeath(total_death.intValue());
                     casesObj.setCaseForeign(case_foreign.intValue());
                     casesObj.setCasePrison(case_prison.intValue());
                     casesObj.setCaseWalkin(case_walkin.intValue());
                     casesObj.setCaseNewPrev(case_new_prev.intValue());
                     casesObj.setCaseNewDiff(case_new_diff.intValue());
                     casesObj.setDeathNewPrev(death_new_prev.intValue());
                     casesObj.setDeathNewDiff(death_new_diff.intValue());
                     casesObj.setUpdateDate(update_date);
      
                     updateStudent(casesObj);

                }
                em.close();
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        

    }

    
    public static void updateStudent(Covidcases std) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplication1PU");
        EntityManager em = emf.createEntityManager();
        Covidcases fromDb = em.find(Covidcases.class, std.getRow());
        fromDb.setYearnum(std.getYearnum());
        fromDb.setWeeknum(std.getWeeknum());
        fromDb.setNewCase(std.getNewCase());
        fromDb.setTotalCase(std.getTotalCase());
        fromDb.setNewCaseExcludeabroad(std.getNewCaseExcludeabroad());
        fromDb.setTotalCaseExcludeabroad(std.getTotalCaseExcludeabroad());
        fromDb.setNewRecovered(std.getNewRecovered());
        fromDb.setTotalRecovered(std.getTotalRecovered());
        fromDb.setNewDeath(std.getNewDeath());
        fromDb.setTotalDeath(std.getTotalDeath());
        fromDb.setCaseForeign(std.getCaseForeign());
        fromDb.setCasePrison(std.getCasePrison());
        fromDb.setCaseWalkin(std.getCaseWalkin());
        fromDb.setCaseNewPrev(std.getCaseNewPrev());
        fromDb.setCaseNewDiff(std.getCaseNewDiff());
        fromDb.setDeathNewPrev(std.getDeathNewPrev());
        fromDb.setDeathNewDiff(std.getDeathNewDiff());
        fromDb.setUpdateDate(std.getUpdateDate());
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
  
    public void persist(Object object) {
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
