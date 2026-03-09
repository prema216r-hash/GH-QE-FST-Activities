interface BicycleParts {
public int tyres=2;
public int maxSpeed=40;
}
interface BicycleOperations{
public void applyBrake(int decrement);
public void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations
{
    int  gears ;
    int currentSpeed;
    Bicycle(int gear, int Speed)
    {
       this.gears=gear;
       this.currentSpeed=Speed;

    }
    public void applyBrake(int decrement)
    {
        currentSpeed-=decrement;
        System.out.println("Speed after decrement:"+currentSpeed);
    }
    public void speedUp(int increment)
    {
        currentSpeed+=increment;
        System.out.println("Speed after incement:"+currentSpeed);
    }
    public String bicycleDesc()
    {
        return("No. of gears:"+gears+"\n Speed of Bicycle:"+maxSpeed);
    }
}
    class MountainBike extends Bicycle{
        int seatHeight;
        MountainBike(int gears,int currentSpeed,int seatHeight)
        {
            super(gears,maxSpeed);
        }
        public void setHeight(int newValue) {
    seatHeight = newValue;
}
public String bicycleDesc() 
{
  return (super.bicycleDesc() + "\n seat height:"+seatHeight);
}
    }

public class activity7 {
    public static void main(String args[]) {
    MountainBike mb = new MountainBike(3, 0, 25);
    System.out.println(mb.bicycleDesc());
    mb.speedUp(20);
    mb.applyBrake(5);
}
}


