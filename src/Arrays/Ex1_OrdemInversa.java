package Arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = { 5, 0, 7, 3, 2, 3};

        System.out.println("\nVetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;

        }


        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");

        }


    }
}
