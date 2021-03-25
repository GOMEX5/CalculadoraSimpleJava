import java.util.Scanner;
public class funMenu{
    public double numero1(){
        System.out.println("Ingrese primer numero");
        Scanner entrada = new Scanner(System.in);
        double n1 = entrada.nextDouble();
        return n1;
    }
    public double numero2(){
        System.out.println("Ingrese segundo numero");
        Scanner entrada = new Scanner(System.in);
        double n2 = entrada.nextDouble();
        return n2;
    }
    public int op(){
        System.out.println("Ingrese la opcion nesesaria \n1)Suma \n2)Resta \n3)Multiplicacion \n4)Divicion \n5)Fin");
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        return op;
    }
}