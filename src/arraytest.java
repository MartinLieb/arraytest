public class arraytest {

    public static void main(String[] args) {

        int tal[] = {4, 5, 7, 10, 25};

        // sum skal defineres for at den kan virke i "for loopet"

        int sum = 0;

        // Her starter counteren på 0 og slutter inden den når længden af indexet og incrementer hver gang
        // Derefter printer den hele indexet og summen af talene

        for (int counter = 0; counter < tal.length ; counter++) {
            System.out.println(tal[counter]);
            sum = sum + tal[counter];

        }

        System.out.println("Summen af talene er " + sum);
        System.out.println("Det tredje tal i indexet er " + tal[2]);
        System.out.println("Gennemsnittet af talene er " + sum/5);
    }
}
