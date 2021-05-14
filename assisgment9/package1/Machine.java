// Author : Achille Tanwouo

package package1;

abstract class Machine {

    protected String Brand;
    protected String Model;
    protected String Version;

    abstract String getBrand();

    abstract void setBrand(String brand);

    abstract String getModel();

    abstract void setModel(String model);

    abstract String getVersion();

    abstract void setVersion(String version);

    public String toString(){
        return "Brand= "+this.getBrand()+", Model="+this.getModel()+", Version="+this.getVersion();
    }

}