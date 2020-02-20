package org.vehicle;

import org.bike.bike;
import org.car.car;
import org.lorry.lorry;

public class vehicle {
public void vehicleName() {
System.out.println("Car,Bike,Lorry");

}
public static void main(String[] args) {
vehicle v=new vehicle();
v.vehicleName();
car c=new car();
c.carName();
c.CarType();
c.carCost();
bike b=new bike();
b.bikeName();
b.bikeType();
b.bikeCost();
lorry l=new lorry();
l.lorryName();
l.lorryType();
l.lorryCost();
}

}
