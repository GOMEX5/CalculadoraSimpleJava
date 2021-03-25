import java.util.Scanner;
public class CalDora{
    public static void main(String arg[]){
        funciones fn = new funciones();
        funMenu fm = new funMenu();
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        double n1, n2;
        while (op != 5){
            System.out.println("CalDora");
            n1 = fm.numero1();
            n2 = fm.numero2();
            op = fm.op();
            switch(op){
                case 1:
                    fn.suma(n1,n2);
                    op = fn.aux();
                break;
                case 2:
                    fn.resta(n1,n2);
                    op = fn.aux();
                break;
                case 3:
                    fn.multi(n1,n2);
                    op = fn.aux();
                break;
                case 4:
                    fn.divicion(n1,n2);
                    op = fn.aux();
                break;
                case 5:
                    System.out.println("Fin");
                    System.out.println("");
                break;
                default:
                    System.out.println("Esa opcion no existe");
                    op = fn.aux();
            }
        }
    }
}