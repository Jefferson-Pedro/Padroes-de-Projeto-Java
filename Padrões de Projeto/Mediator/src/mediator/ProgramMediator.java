package mediator;

public class ProgramMediator {
    public static void main (String[] args){
    	
        FacebookGroupMediator facebookMediator = new ConcreteFacebookGroupMediator();
        
        User ariane = new ConcreteUser(facebookMediator, "Ariane", "Ariane");
        User gerhard = new ConcreteUser(facebookMediator, "Gerhard", "Ariane");
        User leo = new ConcreteUser(facebookMediator, "Leo", "Ariane");
        User hulk = new ConcreteUser(facebookMediator, "Hulk", "Ariane");
        
        facebookMediator.RegisterUser(ariane);
        facebookMediator.RegisterUser(gerhard);
        facebookMediator.RegisterUser(leo);
        facebookMediator.RegisterUser(hulk);
        
        ariane.Send("Prof, por favor não passa mais trabalhos");
        
        gerhard.Send("Ok, não irei mais passar trabalhos");
        
        ariane.Send("Obrigada");
        
     }
}