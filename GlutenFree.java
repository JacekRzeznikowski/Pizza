package pl.sda.Pizza;

public class GlutenFree implements PizzaDough{

    @Override
    public void preparePizzaDough(){

        System.out.println("Przygotowanie ciasta: "+ getClass());
    }

}
