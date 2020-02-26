package pl.sda.Pizza;

import java.util.List;

public class Veggie implements Pizza, Ingredients {

    private List<String> ingredients;
    private PizzaDough pizzaDough;

    public Veggie(){}
    public Veggie(List<String> ingredients, PizzaDough pizzaDough){
        this.ingredients = ingredients;
        this.pizzaDough = pizzaDough;

    }

    @Override
    public void preparePizza() {



    }

    @Override
    public List<String> getIngredients() {
        return null;
    }
}
