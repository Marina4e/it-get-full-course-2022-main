package org.prog;

public class Main {

  public static void main(String... args) {
    TrafficLights trafficLights = new TrafficLights();
  Car myCar = new Car("purple","AA999AA");
  Car bobsCar = new Car("green","AA888AA");
  Car aliceCar = new Car ("black","AA777AA");
  Car policeCar = new Car ("white","AA555AA");

  Car[] crossingCars = {myCar,bobsCar,aliceCar,policeCar};

  trafficLights.sendSignal(myCar,"green");
  trafficLights.sendSignal(bobsCar,"yellow");
  trafficLights.sendSignal(aliceCar,"red");
  trafficLights.sendSignal(policeCar,"red");
  moveCars(crossingCars);
    trafficLights.sendSignal(myCar,"green");
    trafficLights.sendSignal(bobsCar,"yellow");
    trafficLights.sendSignal(aliceCar,"green");
    trafficLights.sendSignal(policeCar,"green");
    moveCars(crossingCars);
  }

  public static void moveCars(Car[]cars){
    for (int i = 0; i < cars.length; i++){
      cars[i].crossTheCrossRoad(cars);
    }
  }

}
