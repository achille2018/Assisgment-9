// Author : Achille Tanwouo

package package1;

public class Flight extends Machine {

    @Override
    String getBrand() {
        return this.Brand;
    }

    @Override
    void setBrand(String brand) {
        this.Brand = brand;
    }

    @Override
    String getModel() {
        return this.Model;
    }

    @Override
    void setModel(String model) {
        this.Model = model;
    }

    @Override
    String getVersion() {
        return this.Version;
    }

    @Override
    void setVersion(String version) {
        this.Version = version;
    }
}
