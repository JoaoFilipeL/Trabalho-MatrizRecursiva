import java.util.Random;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner dimensao = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = dimensao.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = dimensao.nextInt();

        int[][] matriz = preencherMatriz(linhas, colunas);

        System.out.println("Matriz:");
        matrizRecursiva(matriz, 0, 0);
    }
    private static int[][] preencherMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random num = new Random();
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                matriz[i][j] = num.nextInt(100);
            }
        }
        return matriz;
    }
    public static void matrizRecursiva(int[][] matriz, int linha, int coluna) {
        if(linha < matriz.length) {
            if(coluna < matriz[linha].length) {
                System.out.print(matriz[linha][coluna] + " ");
                matrizRecursiva(matriz, linha, coluna + 1);
            }else {
                System.out.println();

                if(linha + 1 < matriz.length) {
                    matrizRecursiva(matriz, linha + 1, 0);
                }
            }
        }
    }
}

