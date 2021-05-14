## AUTHOR : ACHILLE SAGANG TANWOUO

## Assisgment-9
In this project we make  the small implementation of  patterns Design .

## EXPLANATION:

## this project is no simple is juste show or print the model of flight that we have and then of the Truck for that we use the Pattens deisgn 


On the first time we create the package that we call ## package1
and then we create the instance that we can use to call to show model brand and version of flight .



package package1;

    public class Main {

       public static void main(String[] args) {
        Flight myFlight = new Flight();
        Truck myTruck = new Truck();

        myFlight.setModel("123");
        myFlight.setBrand("Boing");
        myFlight.setVersion("740");
        
        myFlight.setModel("40000");
        myFlight.setBrand("Boing");
        myFlight.setVersion("4555x");


        myTruck.setModel("pp");
        myTruck.setBrand("mercedes");
        myTruck.setVersion("2004");


        System.out.println("The flight model is " +  myFlight.getModel());
        System.out.println("The flight brand is " + myFlight.getBrand());
        System.out.println("The flight version is  " + myFlight.getVersion());
        System.out.println( myFlight.toString());

        System.out.println("The truck model is" + myTruck.getModel());
        System.out.println("The truck brand is  " + myTruck.getBrand());
        System.out.println("The truck version is  " +myTruck.getVersion());
        System.out.println( myFlight.toString());

    }

}

## Here we create the diferent inheritance classe that we need to call our object  you can see the code down there:

package package1;
## This one is the inheritance classe flight 
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

## This one is the Truck inheritance class :

package package1;

public class Truck extends package1.Machine {


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

## CLASSSE INSTANCE :

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


