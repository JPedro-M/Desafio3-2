package desafio3.pkg2;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio32 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("DIgite o número 1:");
        num1 = ler.nextInt();
        System.out.println("DIgite o número 2:");
        num2 = ler.nextInt();
        System.out.println("DIgite o número 3:");
        num3 = ler.nextInt();
        
        if (num1 > num2 && num1 > num3) {
                System.out.println("O número "+num1+" é maior.");
        }else if(num1 < num2 && num2 > num3){
                System.out.println("O número "+num2+" é maior.");
        }else{
            System.out.println("O número "+num3+" é maior.");
        }
    }
}
