package notasjava;
import java.util.Scanner;
public class Switch {
    static int ProductId;
    static String productName;
    static double cost;
    static float profit;
    static double price;
    static Scanner  sc = new Scanner(System.in);
    public static void main(String[] args) {
    menu();
    }
    public static void createProduct(){
        String[] product = new String[5];

        System.out.println("Id");
        ProductId = sc.nextInt();
        product[0] = ProductId + "";
        System.out.println("productName");
        productName = sc.nextLine();
        product [1] = productName;
        System.out.println("cost");
        cost = sc.nextDouble();
        sc.nextLine();
        product[2] = Double.toString(cost);
        System.out.println("profit");
        profit = sc.nextFloat();
        product [3] = profit + "";
        System.out.println("price");
        price = calculatePrice(profit,cost);
        product[4] = Double.toString(price);

    }
    public static double calculatePrice (float profit, double  cost){

        double price = cost/(-1-(profit/100));

        return price;
    }
    public static void printProduct(){
        System.out.println("id"+ProductId + "\n"+
                "nombre producto"+ productName+"\n"+
                "precio"+ price);
    }
    public static void menu (){
        System.out.println("Seleccione 1. Crear producto"+
                "2. Ver producto");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Crear producto");
                createProduct();
                break;
            case 2:
                System.out.println("Ver product");
                printProduct();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}
