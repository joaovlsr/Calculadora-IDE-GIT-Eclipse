/**
 * 
 */
package br.com.joaovlsr.git;
import java.util.Scanner;

/**
 * @author Joao_
 *
 */
public class CalculadoraGIT {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, soma, subtracao, multi, divi;

        System.out.println("Insira um n�mero: ");
        num1 = in.nextInt();

        System.out.println("Insira outro n�mero: ");
        num2 = in.nextInt();

        num2 = num1 + num2;
        System.out.println("O resultado da soma �: "+ num2);

        subtracao = num1 - num2;
        System.out.println("O resultado da subtra��o �: "+ subtracao);

        multi = num1 * num2;
        System.out.println("O resultado da multiplica��o �: "+ multi);

        divi = num1 / num2;
        System.out.println("O resultado da divis�o �: " + divi);


    }
}

	 


	    
	
