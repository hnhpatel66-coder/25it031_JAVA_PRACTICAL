import java.util.Scanner;

public class practical_1_a2 {

    record Vehicle(String number, String type) { }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalToll = 0;
        int bikes = 0, cars = 0, trucks = 0;      

        System.out.println("Enter vehicles. Type 'done' for the number to stop.");

        while (true) {
            System.out.print("Vehicle number (or 'done'): ");
            String number = sc.next();
            if (number.equalsIgnoreCase("done")) break;

            System.out.print("Type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

            Vehicle v = new Vehicle(number, type);   // build the record

          
            switch (v.type()) {
                case "bike" : 
                                bikes++; 
                                totalToll +=20;  
                                break;

                case "car"  :   cars++;
                                totalToll +=50;  
                                break;
                                
                case "truck":   trucks++;
                                totalToll +=150;  
                                break;    
                                
                default :       System.out.println("Invalid Input, try again");
                                break;
            };

            System.out.println("  " + v.number() + " (" + v.type() + ") pays " + totalToll);
        }

        System.out.println("Total toll collected: " + totalToll);

        String mostFrequent; 

        if(bikes == cars &&  bikes== trucks && trucks == cars){
            mostFrequent = "All are Equal";
        }
        else if (bikes >= cars && bikes >= trucks) {
            mostFrequent = "bike";
        }
        else if (cars >= bikes && cars >= trucks) {
            mostFrequent = "car";
        }
        else {
            mostFrequent = "truck";
        }
        System.out.println("Most frequent: " + mostFrequent);
        sc.close();
    }
}
