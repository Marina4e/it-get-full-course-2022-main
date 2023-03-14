package org.prog;

import java.util.Arrays;

public class Car {
  public int speed;
  public String licencePlate;
  private String color;
  public String currentTrafficLights;
  public Car(String c,String plateNumber) {
    color = c;
    speed = 0;
    currentTrafficLights = "yellow";
    licencePlate = plateNumber;
  }
  public void crossTheCrossRoad(Car[] otherCars){
    for (int i = 0;i <otherCars.length;i++){
      if (!licencePlate.equals(otherCars[i].licencePlate)){
      if (speed != 0 && otherCars[i].speed != 0){
        System.out.println("Car accident between: "+ licencePlate+ " and " +
                otherCars[i].licencePlate);
      } else {
        System.out.println("We pass by");}
    }
  }}
  public void setCurrentTrafficLights(String newTrafficColor) {
    switch (newTrafficColor){
      case ("red"):
        speed = 0;
        currentTrafficLights = newTrafficColor;
        break;
      case ("yellow"):
        currentTrafficLights = newTrafficColor;
        break;
      case ("green"):
        speed = 60;
        currentTrafficLights = newTrafficColor;
        break;
      default:
        System.out.println("do nothing");
    }
  }

  public String getCurrentTrafficLight(){
    return currentTrafficLights;
  }

  public void paintCar(String c) {
    color = c;
  }

  public String getCarColor() {
    return color;
  }
}
