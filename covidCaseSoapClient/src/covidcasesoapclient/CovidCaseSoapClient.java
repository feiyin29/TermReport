package covidcasesoapclient;

import java.util.List;
import services.Covidcases;

/**
 *
 * @author feifei
 */
public class CovidCaseSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Covidcases> caseList = findAll();
        System.out.println("Year : "+caseList.get(0).getYearnum());
        System.out.println("Week : "+caseList.get(0).getWeeknum());
        System.out.println("Number of New Case : "+caseList.get(0).getNewCase());
    }

    private static java.util.List<services.Covidcases> findAll() {
        services.CovidCasesWebService_Service service = new services.CovidCasesWebService_Service();
        services.CovidCasesWebService port = service.getCovidCasesWebServicePort();
        return port.findAll();
    }
    
}
