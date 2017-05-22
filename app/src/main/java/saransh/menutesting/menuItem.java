package saransh.menutesting;

/**
 * Created by Saransh Verma on 22-05-2017.
 */

public class menuItem {
    private String name;
    private String price;

    public menuItem(String name,String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

