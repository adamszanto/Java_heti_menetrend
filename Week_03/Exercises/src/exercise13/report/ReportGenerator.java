package exercise13.report;

import exercise13.engine.Warehouse;

public class ReportGenerator {
    public static void reportGenerator(Warehouse warehouse1) {
        warehouse1.reportProducts();
        warehouse1.printUsableEntertainmentProducts();
    }
}
