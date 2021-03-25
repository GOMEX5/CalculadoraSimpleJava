import java.util.Scanner;
public class funciones{
    public void suma(double n1, double n2){
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
        System.out.println("");
    }
    public void resta(double n1, double n2){
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
        System.out.println("");
    }
    public void multi(double n1, double n2){
        System.out.println(n1+" * "+n2+" = "+(n1*n2));
        System.out.println("");
    }
    public void divicion(double n1, double n2){
        System.out.println(n1+" / "+n2+" = "+(n1/n2));
        System.out.println("");
    }
    public int aux(){
        System.out.println("1)seguir jugando \n2)Fin");
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        if(op == 1){
            return 1;
        }else if(op == 2){
            return 5;
        }else{
            System.out.println("Esa opcion no existe");
            aux();
        }
        return 5;
    }
}
