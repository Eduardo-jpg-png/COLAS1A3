package colasypilas;

import java.util.*;

public class ColasyPilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaramos una variable tipo char para los caracteres y dos de tipo int una para la pila y otra para la opcion
        char tam = 'z', hp;
        int opt = 0, opcion, mn, or = 26, tp = 0, tm = 0;
        Queue cola = new LinkedList();
        LinkedList colan2 = new LinkedList();
        LinkedList colaA = new LinkedList();
        LinkedList colaB = new LinkedList();
        LinkedList colaC = new LinkedList();
        char colaordenar[] = new char[tam];

        //iniciamos un doo
        do {
            System.out.println("--------------------------COLAS--------------------------");
            System.out.println("1-Pila 1 convertida a Cola (es un orden normal de la a-z)");
            System.out.println("2-Pila 2 convertida a Cola (orden aleatorio y reordenar)");
            System.out.println("3-Pila 3 convertida a Cola (numeros)");
            System.out.println("4-Salir");
            switch (mn = sc.nextInt()) {
                case 1:
                    do {
                        //imprimimos el menu
                        System.out.println("----------ABECEDARIO COLAS----------");
                        System.out.println("1-Llenar cola\n" + "2-Mostrar cola\n" + "3-Eliminar caracter de la cola\n" + "4-Agregar caracter a la cola\n" + "5-Salir\n " + "Opcion :  \n");
                        switch (opcion = sc.nextInt()) {
                            //el caso numero uno realiza lo que es llenar la cola
                            case 1:
                                System.out.println("----------ABECEDARIO----------");
                                for (char x = 'a'; x < tam + 1; x++) {
                                    cola.offer(x);
                                }
                                System.out.println("Cola llena");
                                break;
                            //el caso numero dos permite visualisar la pila iniciando desde la z hasta la a
                            case 2:
                                System.out.println("----------ABECEDARIO----------");
                                System.out.println("Elementos de la cola");
                                System.out.println(cola);
                                break;
                            //el caso numero tres realiza lo que es eliminar las letras una por una
                            case 3:

                                System.out.println("----------ABECEDARIO----------");
                                System.out.println("Eliminando la letra");
                                cola.remove();
                                break;
                            //el caso numero cuatro agrega las letras que el usuario decida 
                            case 4:
                                System.out.println("----------ABECEDARIO----------");
                                System.out.println("Agregar letra, por favor introduce la nueva letra para la cola ");
                                cola.offer(sc.next().charAt(0));
                        }
                    } while (opt != 5);
                    break;
                case 2:
                    do {
                        System.out.println("----------ABECEDARIO COLAS RANDOM----------");
                        System.out.println("1-Llenar Aleatoriamente\n" + "2-Mostrar\n" + "3-Eliminar\n" + "4-Agregar\n" + "5-Ordenar\n" + "6-Salir\n" + "Opcion :");
                        switch (opcion = sc.nextInt()) {
                            case 1:
                                System.out.println("----------ABECEDARIO COLAS RANDOM----------");
                                for (int i = 0; i < or; i++) {
                                    colaordenar[i] = (char) (Math.random() * or + 'a');
                                    tp++;
                                    for (int j = 0; j < i; j++) {
                                        if (colaordenar[i] == colaordenar[j]) {
                                            i--;
                                        }
                                    }
                                }
                                for (int i = 0; i < or; i++) {
                                    cola.offer(colaordenar[i]);
                                }
                                System.out.println("Cola llena");
                                break;
                            case 2:
                                System.out.println("----------ABECEDARIO COLAS RANDOM----------");
                                System.out.println(cola);
                                break;
                            case 3:
                                System.out.println("----------ABECEDARIO COLAS RANDOM----------");
                                System.out.println("Eliminando la letra");
                                cola.remove();
                                break;
                            case 4:
                                System.out.println("----------ABECEDARIO COLAS RANDOM----------");
                                cola.offer(sc.next().charAt(0));
                                break;
                            case 5:
                                System.out.println("----------ABECEDARIO COLAS RANDOM----------");
                                for (int i = 0; i < or; i++) {
                                    for (int j = 0; j < (or - 1); j++) {
                                        if (colaordenar[j] > colaordenar[j + 1]) {
                                            hp = colaordenar[j];
                                            colaordenar[j] = colaordenar[j + 1];
                                            colaordenar[j + 1] = hp;
                                        }

                                    }
                                }
                                cola.clear();
                                for (int j = 0; j < or; j++) {
                                    cola.offer(colaordenar[j]);
                                }
                                System.out.println("Cola ordenada");
                                break;
                        }
                    } while (opt != 6);
                    break;
                case 3:
                    System.out.println("----------COLAS NUMEROS----------");
                    System.out.println("Introduce el tamaño de la cola ");
                    tm = sc.nextInt();
                    int A[] = new int[tm];
                    int B[] = new int[tm];
                    int C[] = new int[tm];
                    do {
                        System.out.println("1-Llenar colas A,B\n" + "2-Mostrar colas A,B\n" + "3-Vaciar colas A,B\n" + "4-Unir colas\n" + "5-Mostrar colas C\n" + "6-Salir\n");
                        switch (opcion = sc.nextInt()) {
                            case 1:
                                System.out.println("----------COLAS NUMEROS----------");
                                for (int i = 0; i < tm; i++) {
                                    A[i] = (int) (Math.random() * 100 + 1);
                                    B[i] = (int) (Math.random() * (200 - 100) + 100);
                                }
                                for (int i = 0; i < tm; i++) {
                                    colaA.offer(A[i]);
                                    colaB.offer(B[i]);
                                }
                                System.out.println("Cola A,B llenas");
                                break;
                            case 2:
                                System.out.println("----------COLAS NUMEROS----------");
                                System.out.println(colaA + " ");
                                System.out.println(colaB + " ");
                                break;
                            case 3:
                                System.out.println("----------COLAS NUMEROS----------");
                                for (int i = 0; i < tm; i++) {
                                    colaA.clear();
                                    colaB.clear();
                                }
                                System.out.println("Colas vacias");
                                break;
                            case 4:
                                System.out.println("----------COLAS NUMEROS----------");
                                for (int i = 0; i < tm; i++) {
                                    C[i] = A[i] + B[i];
                                    colaC.offer(C[i]);
                                }
                                System.out.println("Cola C creada");
                                break;
                            case 5:
                                System.out.println("----------COLAS NUMEROS----------");
                                System.out.println(colaC + " ");
                                break;
                        }
                    } while (opt != 6);
            }
        } while (opt != 4);
    }
}
