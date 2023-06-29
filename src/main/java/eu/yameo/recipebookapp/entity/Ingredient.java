package eu.yameo.recipebookapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Ingredient {

    @Column(name = "ingredient_name")
    private String name;

    @Column(name = "ingrident_amount")
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
