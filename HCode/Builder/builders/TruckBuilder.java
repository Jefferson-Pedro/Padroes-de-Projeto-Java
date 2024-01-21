class TruckBuilder implements IBuilder{

  private CarType carType;
  private int seats;
  private Transmission transmission;
  private Engine engine;

  @Override
  public void setCarType(CarType carType){
    this.carType = carType;
  }

  @Override
  public void setSeats(int seats){
    this.seats = seats;
  }

  @Override
  public void setTransmission(Transmission transmission){
    this.transmission = transmission;
  }

  public Truck getResult(){
    return new Truck(carType, seats, transmission, engine);
  }
  
}