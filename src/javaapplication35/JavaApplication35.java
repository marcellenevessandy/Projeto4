/*IF E ELSE*/
package javaapplication35;

import java.util.Scanner;

public class JavaApplication35 {

    public static void main(String[] args) {
        int idade;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        if (idade >=18){
            System.out.println("Maior de idade!");
        }
        
        else {
            System.out.println("Menor de idade!");
        }
    }

}
