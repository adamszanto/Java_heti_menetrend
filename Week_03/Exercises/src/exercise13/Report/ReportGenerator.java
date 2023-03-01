package exercise13.Report;

import exercise13.Engine.Warehouse;

public class ReportGenerator {
    public static void reportGenerator(Warehouse warehouse1) {
        warehouse1.reportProducts();
        warehouse1.printUsableEntertainmentProducts();
    }
}
