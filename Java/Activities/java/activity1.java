class Car{
    String color;
    String transmission;
    int make;
     int tyres;
      int doors;
      Car(){
        tyres=4;
        doors=4;
      }
      public void displayCharacteristics()
      {
        System.out.println("color of the car:"+color);
        System.out.println("transmission of the car:"+transmission);
        System.out.println("make of the car:"+make);
        System.out.println("number of the tyres:"+tyres);
        System.out.println("number of  doors:"+doors);
      }
    public void accelarate()
    {
        System.out.println("Car is moving");
    }
    public void brake() {
        System.out.println("Car has stopped.");
    }
    }
public class activity1 {
    public static void main(String args[]){
        Car BMW=new Car();
        BMW.color="black";
        BMW.make=2014;
        BMW.transmission="Manual";
        BMW.displayCharacteristics();
        BMW.accelarate();
        BMW.brake();

    }

}
