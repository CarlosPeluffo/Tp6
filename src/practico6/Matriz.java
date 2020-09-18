package practico6;

public class Matriz {
    public void armar(){
        int matriz[][]={{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
        int a=1;
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
}
