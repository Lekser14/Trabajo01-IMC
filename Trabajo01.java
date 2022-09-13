import java.text.DecimalFormat;

public class Trabajo01{
    public static void main(String[] args){

        
        
        /*
         * - 1 - Leer la nota
         * - 2 - Armar un programa sobre dicha nota.
         *       a - Determinar cuales son los datos de entrada para el imc.
         *       b - Calcular el IMC.
         *       c - Calcular estado (Delgadez - Normal - Obesidad etc)
         *       d - Informar IMC y Estado.
         */

         System.out.println("-- Calculo de IMC --");
         System.out.println("Ingrese su peso: ");
        int peso=new java.util.Scanner(System.in).nextInt();
        System.out.println("Ingrese su altura: ");
        float altura=new java.util.Scanner(System.in).nextFloat();

        DecimalFormat df=new DecimalFormat(".##");
        double IMC=(peso/((altura*altura)));
       
        
        //System.out.println("Su IMC es = "+IMC); 
        System.out.println("Su IMC es = "+(df.format(IMC)));
        
        /*
         * Por ejemplo, el indicador que diagnostica el peso correcto oscila entre 18,5 y 24,9. 
         * Por debajo de esas cifras hay problemas con la delgadez y por encima puede reflejar inconvenientes de sobrepeso o de obesidad.
         * Por ejemplo, si el resultado da 15 o menos, se está ante un cuadro de delgadez muy severa
         *  de 15 a 15.9 es delgadez severa
         *  16 a 18.4 es delgadez. 
         * de 25 y 29.9 se habla de sobrepeso
         * de 30 a 34.9 de obesidad moderada; 
         * de 35 a 39.9 de un cuadro de obesidad severa 
         * de 40 o más ya es obesidad mórbida.
         */

        
        if(IMC<=15) {

            System.out.println("Delgadez MUY severa!");

        }

        if(IMC >15 && IMC<16) {

            System.out.println("Delgadez severa!");
        }

        if(IMC >=16 && IMC<=18.4) {

            System.out.println("Delgadez");
        }

        if(IMC >=18.5 && IMC<=24.9) {

            System.out.println("Estás en buena forma!");
        }

        if(IMC >=25 && IMC<=29.9) {

            System.out.println("Tienes algo de sobrepeso");
        }

        if(IMC >=30 && IMC<=34.9) {

            System.out.println("Obesidad moderada");
        }

        if(IMC >=35 && IMC<=39.9) {

            System.out.println("Obesidad Severa!");
        }

        if(IMC >=40) {

            System.out.println("Obesidad Morbida!");
        }
        
    }



}

