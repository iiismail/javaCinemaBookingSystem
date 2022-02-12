package sample;

import javafx.fxml.Initializable;

/**
 * Created by u1857977 on 07/03/2019.
 */
public class Consumables {
    private String name;
    private double price;
    private Integer quantity;


    public Consumables(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
