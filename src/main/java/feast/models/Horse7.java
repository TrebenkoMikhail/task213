package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Horse7 {

    private Camel8 camel8;
    @Autowired
    public Horse7(Camel8 camel8) {
        this.camel8 = camel8;
    }

    public void setCamel8(Camel8 camel8) {
        this.camel8 = camel8;
    }

    public Camel8 getCamel8() {
        return camel8;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a camel, " + camel8.toString();
    }
}
