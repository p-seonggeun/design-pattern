package ch4;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new GreekPizza();
        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
