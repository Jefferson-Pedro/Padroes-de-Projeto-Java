package mediator;

//ConcreteColleague

public class ConcreteUser extends User
{
  private String user;
  
  public ConcreteUser (FacebookGroupMediator mediator, String name, String user){
        super(mediator, name);
        this.user = user;
  }
  
  public void Receive(String message)
  {
      System.out.println( this.user + " : recebida <= {message}");
  }
  
  public void Send(String message)
  {
      System.out.println( this.user + "{name : enviada => {message}\n");
      mediator.SendMessage(message, this);
  }
}