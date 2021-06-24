public class Main {

    public static void main(String[] args) {

        double miles, kilometres;
        int counter;

        counter = 0;
        for(kilometres = 1; kilometres <= 200; kilometres++){
            miles = kilometres * 1.609344;
            System.out.println(kilometres + " kilometres is " + miles + " miles ");

            counter++;
            if(counter ==10){
                System.out.println();
                counter = 0;
            }

        }


    }
}
