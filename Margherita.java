package pl.sda.Pizza;

import java.util.List;

public class Margherita implements Pizza, Ingredients {


    private List<String> ingredients;
    private PizzaDough pizzaDough;

    public Margherita(){}
    public Margherita(List<String> ingredients, PizzaDough pizzaDough){
        this.pizzaDough = pizzaDough;
        this.ingredients = ingredients;

    }

    public void preparePizza() {

    }

    @Override
    public List<String> getIngredients() {
        return null;
    }
}
