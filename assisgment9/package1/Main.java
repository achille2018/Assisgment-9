// Author ; Achille Tanwouo


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
