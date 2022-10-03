

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

       double Fahrenheit;
       double Celsius;

       //Temperatura em graus Fahrenheit

       System.out.println("Digite a temperatura em graus Fahrenheit");
       Fahrenheit = sc.nextDouble();

        //Graus Celsius

        Celsius = (Fahrenheit - 32) / 1.8;

        //saida

        System.out.printf("A temperatura em graus Celsius é de: %.2f", Celsius);

       sc.close();

        
        }


    }