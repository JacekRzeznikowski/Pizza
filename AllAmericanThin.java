package pl.sda.Pizza;

public class AllAmericanThin implements PizzaDough {
    @Override
    public void preparePizzaDough(){

        System.out.println("Przygotowanie ciasta: "+ getClass());
}
