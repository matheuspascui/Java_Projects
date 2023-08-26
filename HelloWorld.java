//There is only one class, the HelloWorld. It's public.
//The filename MUST be THE SAME as the Folder that contains the code. The FOLDER, CLASS NAME and FILE NAME MUST BE THE SAME!

public class HelloWorld {
    //Ponto de partida do programa, o módulo principal, o MAIN. É uma função.
    //o main é public, pq tem que ser visto pela JVM. Tb só existe 1 ÚNICO MAIN por aplicativo java, então ele é static.
    //Tem o VOID pq o método não retorna nada.
    //Main pode receber como parâmetros um conjunto [] de nome ARGS onde cada elemento é STRING.
    public static void main(String args[]) {
        //instruções do programa
        System.out.println("Olá, Mundo!!");
    }
}