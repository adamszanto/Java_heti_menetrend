package exercise13.report;

import exercise13.engine.Warehouse;

public class ReportGenerator {
    private final Warehouse warehouse;

    public ReportGenerator(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void reportGenerator() {
        warehouse.reportProducts();
        warehouse.printUsableEntertainmentProducts();
    }
}
