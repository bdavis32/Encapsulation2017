package lab3;

/**
 *
 * @author Benjamin
 */
public class EmployeeReportService {
    private String report = "";
    
    //Add some data to the "report"
    public void addData(String data){
        report += data;
    }
    
    //Display the "report" to the console
    public void outputReport(){
        System.out.println(report);
    }
    
    //Clear the report
    public void clearReport(){
        report = "";
    }
}
