package app.model;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat extends Animal {

    public Cat(String cat) {
        super(cat);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
