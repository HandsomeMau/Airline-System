    import java.util.ArrayList;
    import java.util.Scanner;
    public class Main {



        public static Scanner sc = new Scanner(System.in);
        public static ArrayList<Token> l1 = new ArrayList();
        public static void main(String args[]) {
            System.out.println("Welcome to Airline Reservation System!");
            choiceTake();
        }
        public static void choiceTake() {
            System.out.println("Enter 1 to make new reservation");
            int choice = sc.nextInt();
            if(choice == 1) {
                accept();
            }
        }

        public static void accept() {
            System.out.println("Enter Airline");
            sc.nextLine();
            String airline = sc.nextLine();
            System.out.println("Enter Time in 24h (eg: 0510 for 5:10 am)");
            String time = sc.nextLine();
            String t1 = time.substring(0,2);
            String t2 = time.substring(2,4);
            int h = Integer.parseInt(t1);
            int m = Integer.parseInt(t2);
            if(h <= 23 && m <=59) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Enter Departure Airport");
            String departureA = sc.nextLine();
            System.out.println("Enter Arrival Airport");
            String arrivalA = sc.nextLine();
            Token temp = new Token(airline, time, departureA, arrivalA);
            l1.add(temp);
            System.out.println(l1.toString());
            accept();
        }


    }




