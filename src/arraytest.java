public class arraytest {

    public static void main(String[] args) {

        int tal[] = {4, 5, 7, 10, 25};

        int sum = 0;

        for (int counter = 0; counter < tal.length ; counter++) {
            System.out.println(tal[counter]);
            sum = sum + tal[counter];

        }

        System.out.println("Summen af talene er " + sum);
        System.out.println("Det tredje tal i indexet er " + tal[2]);
        System.out.println("Gennemsnittet af talene er " + sum/5);
    }
}
