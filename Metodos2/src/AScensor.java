import java.io.IOException;
import java.util.Scanner;

public class AScensor {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new Scanner(System.in);
        int opcion = 0;
        int planta = 0;
        int plantaSolicitada = 0;
        boolean exit = false;

        while(!exit){
            System.out.println("Hola al menu.");
            System.out.println("A.Subir de planta");
            System.out.println("B.Bajar de planta");
            System.out.println("C.Mostrar la planta");
            System.out.println("D.Ruta recorrida");
            System.out.println("E.Resetear la planta actual a 0");
            System.out.println("F.Salir del menu");
            opcion=(char)System.in.read();


            switch (opcion){
                case 'A':
                    boolean salirdesubirplanta=false;

                    while(!salirdesubirplanta){
                        System.out.println("A que planta quieres ir?");
                        plantaSolicitada = read.nextInt();

                        if(plantaSolicitada>planta){
                            salirdesubirplanta=true;
                            while (planta<plantaSolicitada){
                                planta++;
                                System.out.println(planta);
                                Thread.sleep(500);
                            }
                        }else {
                            System.out.println("cdsfds");
                        }
                    }
                    break;

                case 'B':
                    boolean salirdeBajarplanta=false;

                        System.out.println("A que planta quieres bajar ?");
                        plantaSolicitada = read.nextInt();

                        if(plantaSolicitada<planta){
                            salirdeBajarplanta=true;
                            while (planta>plantaSolicitada){
                                planta--;
                                System.out.println(planta);
                                Thread.sleep(100);
                            }

                        }else {
                            System.out.println("Salir");
                        }
                break;

                case 'C':
                    System.out.println(planta);
                break;

                case 'D':
                    System.out.println();

                    break;

                case 'E':
                    break;

                case 'F':
                    exit=true;
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Introduce una opcion valida.");
            }

        }

    }
}
