
public class DeluxePizza extends Pizza
{

    public DeluxePizza(boolean isVeg) {

        super(isVeg); // calling constructor of parent class

        //calling method ....
        // we can also use super.addExtracheese() and this.addExtraCheese()
        addExtraCheese();
        addExtraToppings();

    }
}
