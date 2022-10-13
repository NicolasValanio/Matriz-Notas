import java.util.Scanner;
public class Matris {
    public static void main(String[] args) {
        
        //Declarar variables
        
        Scanner leer = new Scanner(System.in);
        byte colum= 4, fila = 3;
        float[][] matNotas = new float [fila][colum];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matNotas[i][j] + "\t\t\t");
            }
            System.out.println();
        }

        System.out.println("Llenar notas");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum -1; j++) {
                System.out.println("Digite la nota "+(j+1)+" Del estudiante" +(i+1));
                matNotas[i][j] = leer.nextFloat();                
            }
        }

        //matriz con notas ingresadas 
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println(matNotas[i][j] + "\t\t\t");
            }
            System.out.println();
        }
       
        //Nota definitiva

        for (int i = 0; i < fila; i++) {
           // float suma;
            for (int j = 0; j < colum-1; j++) {
               // suma=0;
                System.out.println("Digite la nota "+(j+1)+" Del estudiante" +(i+1));
               // suma=suma+matNotas[i][j];
             matNotas[i][colum-1]= matNotas[i][colum-1] + matNotas[i][j];
 
            }
            matNotas[i][colum-1]= matNotas[i][colum-1] / (colum-1);
            //matNotas[i][colum-1] = suma / (colum-1);
        }
        
             //matriz con notas ingresadas 
             for (int i = 0; i < fila; i++) {
                for (int j = 0; j < colum; j++) {
                    System.out.print(matNotas[i][j] + "\t\t\t");
                }
                System.out.println();
            }
           

    }
}
