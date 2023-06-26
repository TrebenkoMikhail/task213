package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fish1 {
    @Autowired
    private Duck2 duck2;

    public Duck2 getDuck2() {
        return duck2;
    }

    public void setDuck2(Duck2 duck2) {
        this.duck2 = duck2;
    }

    public String getFish() {
        return "Fish1";
    }
    @Override
    public String toString() {
        return "of a rabbit inside of a duck, " + duck2.toString();
    }
}
