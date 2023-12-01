package mediator;

//Colleague

public abstract class User {
  protected FacebookGroupMediator mediator; //referencia ao mediator
  protected String name;
  
  public User(FacebookGroupMediator mediator, String name){
      this.mediator = mediator;
      this.name = name;
  }
  
  public abstract void Send(String message);
  public abstract void Receive(String message);
}