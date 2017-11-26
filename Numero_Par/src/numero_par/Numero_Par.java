/*
 CYCARRENOL
 26.11.2017
Esta es la primer version del programa que permite determinar si un numero es par o no
 */
package numero_par;

import java.util.Scanner;

/**
 *
 * @author gaapl
 */ 
public class Numero_Par {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        numero = entrada.nextInt();
        if (numero % 2 == 0) {

            System.out.println("el numero es par");
        } else {

            System.out.println("el numero es impar");
        }
    }

}
