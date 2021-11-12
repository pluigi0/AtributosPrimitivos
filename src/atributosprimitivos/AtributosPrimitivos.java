package atributosprimitivos;

import java.util.Scanner;

public class AtributosPrimitivos {

    public static void main(String[] args) {
        byte entero1; // tamaño de 8 bits, guarda numeros del -128 a 127
        short entero2; // 16 bits
        int entero3; // 32 bits
        long entero4; //64 bits
        float decimal1 = 4.5f;
        double decimal2;
        boolean ciertoFalso;
        char letra;
        Scanner lee = new Scanner(System.in);

        System.out.println("\t\t\t\t Hola estos son Tipos de datos primitivos en JAVA \n\n");

        System.out.print(" Ingresa un numero que pueda guardarse en byte, desde -128 a 127: ");
        entero1 = lee.nextByte();

        System.out.println(" \nShort. Numero entre -32,768 a 32,767 a ver ingresa un numero:");
        entero2 = lee.nextShort();

        System.out.println(" \n Integer. Numero entre -2,147,483,648  hasta 2,147,483,647");
        entero3 = lee.nextInt();

        System.out.println(" \n Long. Numero desde -9,223,372,036, 854,775,808  hasta 9,223,372,854,775,807");
        entero4 = lee.nextLong();

        System.out.println(" Float. Guarda # decimales ");
        decimal1 = lee.nextFloat();

        System.out.println(" Double. Almacena valores decimales con 15-16 digitos de precision, mucho mas que el float");
        decimal2 = lee.nextDouble();
    
        
        System.out.println(" Char. solo almacenas letras. Escribe una sola letra: ");
        letra = lee.next().charAt(0);
        
        System.out.println(" Boolean: Valor verdadero y valor falso ");
        ciertoFalso = lee.hasNextBoolean();

    }
}
