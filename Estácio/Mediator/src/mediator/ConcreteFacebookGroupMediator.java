package mediator;

import java.util.ArrayList;

//ConcreteMediator

public class ConcreteFacebookGroupMediator implements FacebookGroupMediator{
  
    private ArrayList<User> usersList = new ArrayList<User>();

    public void RegisterUser(User user){
        usersList.add(user);
    }
    
    public void SendMessage(String message, User user){
        //usersList.forEach
        for(int u = 0; u < usersList.size(); u++){ System.out.println(usersList.get(u)); 
    }
        //mensagem não será recebida por quem está enviando
            /*if(u != user)
            {
                u.Receive(message);
            }*/
        //}
    }
}