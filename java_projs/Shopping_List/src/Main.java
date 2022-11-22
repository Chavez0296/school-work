import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Product p1 = new Product("Milk", 2.99f, 0);

        Product p2 = new Product("milk", 19.99f, 21);

        Product p3 = new Product("Cigarettes", 19.99f, 18);

        int age = 0;
        boolean continueShop = true;
        Cart cart = new Cart();
        while (continueShop) {
            System.out.println("1- " + p1.printInfo());
            System.out.println("2- " + p2.printInfo());
            System.out.println("3- Cigarettes ");
            System.out.println("4- Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("You purchased milk.");
                    cart.addProduct();
                    cart.addTotal(p1.getPrice());
                    break;
                case 2:
                    if (age == 0) {
                        System.out.print("Enter your year of birth: ");
                        int yob = sc.nextInt();
                        age = 2021 - yob;
                    }
                    if (age < p2.getAgeLimit()) {
                        System.out.println("You cannot buy this product.");
                    } else {
                       System.out.println("You purchased alcohol.");
                       cart.addProduct();
                        cart.addTotal(p2.getPrice());
                        //add alcohol to cart
                    }

                    break;
                case 3:
                    if (age == 0) {
                        System.out.print("Enter your year of birth: ");
                        int yob = sc.nextInt();
                        age = 2021 - yob;
                    }
                    if (age < p3.getAgeLimit()) {
                        System.out.println("You cannot buy this product.");
                    } else {
                        System.out.println("You purchased cigarettes.");
                        cart.addProduct();
                        cart.addTotal(p3.getPrice());
                        //add alcohol to cart
                    }
                    break;
                case 4:
                    continueShop = false;
                    break;
                default:
                    //check age limit
            }

        }

        //Display cart info
        System.out.println("You purchased " + cart.getNumberOfProducts() + " items.");
        System.out.println("Your total is $" + cart.getTotal());
    }
}
