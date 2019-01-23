package ocp.bad;

public class ReportingService {
    public ReportingType typeReport;

    public ReportingService(ReportingType typeReport) {
        this.typeReport = typeReport;
    }

    public ReportingType getTypeReport() {
        return typeReport;
    }

    public void setTypeReport(ReportingType typeReport) {
        this.typeReport = typeReport;
    }

    public void generateReportBasedOnType(ReportingType reportingType)
    {
        System.out.println("===================================");
        System.out.println("Generating report based on Type");
        System.out.println("===================================");

        if("CSV".equalsIgnoreCase(reportingType.toString()))
        {
            generateCSVReport();
        }
        else if("XML".equalsIgnoreCase(reportingType.toString()))
        {
            generateXMLReport();
        }
    }

    private void generateCSVReport()
    {
        System.out.println("Generate CSV Report");
    }

    private void generateXMLReport()
    {
        System.out.println("Generate XML Report");
    }
}
