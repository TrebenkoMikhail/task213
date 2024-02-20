package app.model;

import app.model.Animal;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal {
   public Dog(){
       super("Dog");
   }
}
