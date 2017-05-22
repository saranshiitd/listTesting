package saransh.menutesting;

/**
 * Created by Saransh Verma on 22-05-2017.
 */

public class menuItem {
    private String name;
    private int price;

    public menuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

