package practico6;

public class Matriz {
    public void armar(){
        int matriz[][]= new int[4][];
        matriz[0]= new int[4];
        matriz[1]= new int[3];
        matriz[2]= new int[5];
        matriz[3]= new int[2];
        int a=1;
        int num=3;
        System.out.println("Matriz generada: ");
        for(int f=0; f< matriz.length; f++){
            for(int c= 0; c < matriz[f].length; c ++){
                matriz[f][c]= num;
                num+=3;
                System.out.print("| " + matriz[f][c] + " " );
            }
            System.out.println("|");
        }
        System.out.println("Valores pares por fila: ");
        for (int f = 0; f < matriz.length; f++) {
            System.out.print("Fila "+ a++ +" ");
            for (int c = 0; c < matriz[f].length; c++) {
                if(matriz[f][c] %2 == 0){
                        System.out.print("| " + matriz[f][c] + " " );
                }
            }
            System.out.println("|");
        }
        
    }
    
    /*Otra forma para generar la matriz:
    public void armarDos(int num, int num2){
        int matriz[][]= new int[4][];
        matriz[0]= new int[4];
        matriz[1]= new int[3];
        matriz[2]= new int[5];
        matriz[3]= new int[2];
        int a=1;
        System.out.println("Matriz generada: ");
        for(int g=0; g< matriz.length; g++){
            for(int e= 0; e < matriz[g].length; e ++){
                matriz[g][e]= num;
                num+=num2;
            }
        }
        System.out.println("Valores pares por fila: ");
        for (int f = 0; f < matriz.length; f++) {
            System.out.print("Fila "+ a++ +" ");
            for (int c = 0; c < matriz[f].length; c++) {
                if(matriz[f][c] %2 == 0){
                        System.out.print("| " + matriz[f][c] + " " );
                }
            }
            System.out.println("|");
        }
        
    }*/
}
