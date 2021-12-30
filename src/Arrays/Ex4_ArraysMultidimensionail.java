package Arrays;

import java.util.Random;

public class Ex4_ArraysMultidimensionail {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4];

        for(int i = 0; i < M.length; i++);{
            for (int j = 0; j < M[0].length; j++);{
                M[0][0] = random.nextInt(9);
            }

        System.out.println("Matriz: ");
        for(int[] linha : M ) {
            for( int coluna : linha) {
                 System.out.println(coluna + " ");
                }
            System.out.println();
            }
        }
    }
}
