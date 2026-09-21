import java.util.Arrays;

public class ATM {
    public static void  main(String[] args){
        int[] notes = {2000, 100, 500, 200};
        int[] amounts = {3700,4000,100};

        Arrays.sort(notes);

        for(int amount:amounts) {
            int count = 0;

            for (int i = notes.length - 1; i >= 0; i--) {
                count = count + amount / notes[i];
                amount = amount % notes[i];

                if (amount == 0) {
                    break;
                }
            }

            System.out.println("Minimum notes: " + count);
        }
    }
}
