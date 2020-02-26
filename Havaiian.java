package pl.sda.Pizza;

import java.util.List;

public class Havaiian implements Pizza, Ingredients{

    private List<String> ingredients;
    private PizzaDough pizzaDough;

    public Havaiian(){}


    public Havaiian(List<String> ingredients, PizzaDough pizzaDough){
        this.ingredients = ingredients;
        this.pizzaDough = pizzaDough;

    }

    @Override
    public void preparePizza() {
    this.pizzaDough.preparePizzaDough();
        System.out.println("Robię hawajską");


    }

    @Override
    public List<String> getIngredients() {
        return null;
    }
}
