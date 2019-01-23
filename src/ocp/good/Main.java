package ocp.good;

public class Main {
    public static void main(String[] args) {
        ReportingService rs = new ReportingService();

        // Generate CSV report
        Reporting csvReportingStrategy = new CSVReporting();
        rs.generateReportBasedOnStrategy(csvReportingStrategy);

        // Generate XML report
        Reporting xmlReportingStrategy = new XMLReporting();
        rs.generateReportBasedOnStrategy(xmlReportingStrategy);
    }
}
