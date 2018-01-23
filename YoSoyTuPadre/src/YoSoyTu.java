import java.util.Scanner;

public class YoSoyTu {

    public static void main(String[] args){

        int casos;

        System.out.print("Introduzca el numero de casos: ");
        Scanner sc1 = new Scanner(System.in);
        casos = sc1.nextInt();
        sc1.nextLine();

        while (casos > 0) {
            System.out.print("Introduzca un personaje de la saga Star Wars: ");
            String OpcionA = sc1.nextLine();

            System.out.print("Introduzca un parentesco: ");
            String OpcionB = sc1.nextLine();

            if (OpcionA.equals("Luke") && OpcionB.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(OpcionA + ", yo soy tu " + OpcionB);
            }

            casos--;
        }
    }

}
