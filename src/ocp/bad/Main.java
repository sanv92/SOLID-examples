package ocp.bad;

public class Main {

    public static void main(String[] args) {
        ReportingService rs = new ReportingService(ReportingType.CSV);

        // Generate CSV file
        rs.generateReportBasedOnType(ReportingType.CSV);

        System.out.println();

        // Generate XML file
        rs.generateReportBasedOnType(ReportingType.XML);
    }

}
