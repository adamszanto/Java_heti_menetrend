package exercise13.engine;

import exercise13.product.Product;
import exercise13.product.ProductFactory;
import exercise13.report.ReportGenerator;

public class CommandProcessor {

    private final Warehouse warehouse;
    private final ProductFactory prodFactory;
    private final ReportGenerator reportGenerator;

    public CommandProcessor(Warehouse warehouse, ProductFactory prodFactory, ReportGenerator reportGenerator) {
        this.prodFactory = prodFactory;
        this.warehouse = warehouse;
        this.reportGenerator = reportGenerator;
    }

    private Product newProduct(String barcode, String type, String manufacturer, String price, String category) {

        Product newProduct = prodFactory.create(barcode, type, manufacturer, Integer.parseInt(price), category);

        return newProduct;
    }

    private void addProduct(Product product) {
        warehouse.addProduct(product);
    }

    private void removeProduct(String barcode) {
        warehouse.removeProduct(barcode);
    }

    public void process(String[] command) {
        switch (command[0]) {
            case Ikeaconstant.ADD:
                addProduct(newProduct(command[1], command[2], command[3], command[4], command[5]));
                break;

            case Ikeaconstant.REMOVE:
                removeProduct(command[1]);
                break;
            case Ikeaconstant.REPORT:
                reportGenerator.reportGenerator();
                break;
        }
    }
}
