package notasjava;
import java.util.Scanner;
public class VoidFunction {
    static int costumerId;
    static String costumerName;

    static String email;

    static String password;

    static String status;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       // createCostumer();




    }

    /*
    public static void createCostumer(){
        System.out.println("Ingresa el id:");
        costumerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Name:");
        costumerName = sc.nextLine();
        System.out.println("email:");
        email = sc.nextLine();
        System.out.println("Ingrese el correo:");
        password = sc.nextLine();
        System.out.println("Seleccione un estado:");
        int select = sc.nextInt();
        status = selectStatus(Selection);
    }
    public static void printCostumerData (){
        System.out.println("id"+ costumerId +"\n"+
                "Nombre"+ costumerName + "\n"+
                "Correo"+ email + "\n"+
                "static"+ );
    }

    public static int selectStatus(int selection){
        if (selection == 1) {
            String active = String.valueOf(StaticCostumer.TRUE);

            return active;
        }else if (selection == 2){
            String inactive = String.valueOf(StaticCostumer.FALSE);
        }else{
            System.out.println("Seleccion no valida");
        }
        return
    }
    */

}
