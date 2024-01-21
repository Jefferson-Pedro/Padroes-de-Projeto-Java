class Main {
  public static void main(String[] args) {
    Director director = new Director();

    //criando o carro
    CarBuilder builder = new CarBuilder();
    director.constructSedanCar(builder);

    Car car = builder.getResult();
    System.out.println(car.getCarType() + "produzido com sucesso!");
  }
}