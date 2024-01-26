import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        firstfacility();

        boolean isVeg;
        int option= sc.nextInt();
        if(option == 1)
            isVeg= true;
        else
            isVeg= false;

        secondfacility();

        boolean isRegular;
        int option2= sc.nextInt();
        if(option2 == 1)
            isRegular= true;
        else
            isRegular= false;

        Pizza p= new Pizza(isVeg);
        DeluxePizza dp = new DeluxePizza(isVeg);

        thirdfacility();

        int option3= sc.nextInt();
        if(option3 == 1)
            if(isRegular)
                p.addExtraCheese();
            else
                dp.addExtraCheese();

        fourthfacility();

        int option4= sc.nextInt();
        if(option4 == 1)
        {
            if(isRegular)
                p.addExtraToppings();
            else
                dp.addExtraToppings();
        }

        fifthfacility();

        int option5 = sc.nextInt();
        if(option5 == 1)
            if(isRegular)
                p.addTakeAway();
            else
                dp.addTakeAway();

        Menu();

        int choice =sc.nextInt();
        switch(choice)
        {

            case 1: {
                if(isRegular)
                    System.out.println(p.getBill());
                else
                    System.out.println(dp.getBill());
                break;
            }
            case 2: {
                firstfacility();
                break;
            }
            case 3:
            {
                secondfacility();
                break;
            }
            case 4: {
                thirdfacility();
                break;

            }
            case 5:
            {  fourthfacility();
                break;
            }
            case 6:
            {  fifthfacility();
                break;
            }
            case 7:
            {
                Menu();
                break;
            }
            default:
                System.out.println(" sorry wrong choice!");


        }

    }
    private static void firstfacility()
    {
        System.out.println("Here's The First facility:");
        System.out.println("1. veg");
        System.out.println("2. Non-veg");
        System.out.println("Your Choice Please: ");

    }
    private static void secondfacility()
    {
        System.out.println("Here's The Second facility:");
        System.out.println("1. Regular");
        System.out.println("2. Deluxe");
        System.out.println("Your Choice Please: ");
    }

    private static void thirdfacility() {
        System.out.println("Here's The Third facility: ");
        System.out.println("1. Extra Cheese");
        System.out.println("Your Choice Please! ");
        System.out.println("Enter any key except 1 if you dont want extra Cheese");

    }
    private static void fourthfacility()
    {
        System.out.println("1. Extra Toppings");
        System.out.println("Your Choice Please! ");
        System.out.println("Enter any key except 1 if you dont want extra Toppings");
    }
    private static void fifthfacility()
    {
        System.out.println("1. PaperBag");
        System.out.println("Your Choice Please! ");
        System.out.println("Enter any key except 1 if you dont want Paperbag");
    }
    private static void Menu()
    {
        System.out.println("1. bill");
        System.out.println("2. Show The First facility Again");
        System.out.println("3. Show The Second facility Again");
        System.out.println("4. Show The Third facility Again");
        System.out.println("5. Show The Fourth facility Again");
        System.out.println("6. Show The Fifth facility Again");
        System.out.println("7. Show The  Menu Again");

        System.out.println("Your Choice Please! ");
    }
}