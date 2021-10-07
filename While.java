
public class While {
    public static void main (String[] args){
        int i = 0;
        int k = 0;
        //for (int j = 0; j < 10; j++){
        //    System.out.println("j: " + j);
        //}
        while (i > 0){
            System.out.println("i: " + i);
            i = i - 1;

        }

        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 10);
    }
}