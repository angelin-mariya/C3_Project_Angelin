//import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }


    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }


}
