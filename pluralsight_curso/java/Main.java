package pluralsight_curso.java;

import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    
    
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("insere o 1º valor: ");
        double val1 = sc.nextDouble();
        char op;
        
        do {
            System.out.println("que tipo de operaçao queres: +,-,/,*");
            op = sc.next().charAt(0);
        } while (invaliop(op));
        
         System.out.println("insere o 2º valor: ");
        double val2 = sc.nextDouble();
        
        while (op == '/' && val2 ==0){
        System.out.println("nao é possivel dividir por zero, coloque outro valor");
                val2 = sc.nextDouble();
                }
        
        double result = 0;
        switch (op){
            case '+':
                result = val1 + val2;
                break;
            case '-':
                result = val1 - val2;
                break;
            case '*':
                result = val1*val2;
                break;
            case '/':
                result = val1/val2;
                break;
            default:
                System.out.print("operaçao incorreta. operaçoes validas sao: + - / *");
                exit(1);
                  
        }
      
        
        System.out.println(val1+ " " +operçao(op) +" " + val2 + " = "+ result);
        
    }

    public static String operçao(char op) {
        String frase;
        switch (op){
            case '+':
                frase = "a soma com";
                break;
            case '-':
                frase = " menos";
                break;
            case '*':
                frase = "multipoca por";
                break;
            case '/':
            frase = "divide por";
            break;
            default:
                frase= "";     
        }
        return frase;
      
    }

    
    private static boolean invaliop(char op) {
        return op != '+' && op != '-' && op != '*' && op != '/';
    }
    
   
    
}


