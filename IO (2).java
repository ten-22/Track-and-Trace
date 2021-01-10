import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IO {//Creating Class

    public IO()//Creating Constructor with no parameters 
    {

    }

    public static void main(String[] args) { //Main Method
        //Declare and initialize Variables
        String user, partynumber = "", establishment = "", Date = "";
        String ename = "", firstLineAddress = "", postcode = "";
        int maxOccupancy = 0;

        //Set DateFormat
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Initialize object as null
        LocalDate date = null;
        Event e = null;
        Establishment est = null;
        
        while (true) { //Loop run until program not exit

            //Show These Lines
            System.out.println("1. Record an Event: ");
            System.out.println("2. Add Establishment");
            System.out.println("3. Filters (Expanded upon in section 4), sub-menu ->");
            System.out.println("4. Print Events");
            System.out.println("5. Print Establishments");
            System.out.println("6. Exit the program");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Correct Choice: ");
            int num = scan.nextInt();//Get input a number From User
            switch (num) {//Using Switch Statement
                case 1://If user Choose 1
                    //Get input from user and call the Event Constructor to Store Values
                    scan.nextLine();
                    System.out.println("Enter User Name: ");
                    user = scan.nextLine();
                    System.out.println("Enter Party Number: ");
                    partynumber = scan.nextLine();
                    System.out.println("Enter Establishment: ");
                    establishment = scan.nextLine();
                    System.out.println("Enter Date: ");
                    Date = scan.nextLine();
                    date = LocalDate.parse(Date, dateFormat);
                    e = new Event(user, date, partynumber, establishment);
                    continue;
                case 2://If user Choose 2
                    //Get input from user and call the Event Establishment to Store Values
                    scan.nextLine();
                    System.out.println("Enter User Name: ");
                    ename = scan.nextLine();
                    System.out.println("Enter First Line Address: ");
                    firstLineAddress = scan.nextLine();
                    System.out.println("Enter Establishment: ");
                    postcode = scan.nextLine();
                    System.out.println("Enter Maximum Occupancy: ");
                    maxOccupancy = scan.nextInt();
                    est = new Establishment(ename, firstLineAddress, postcode, maxOccupancy);
                    continue;
                case 3:
                    //This is the Case for Part 4
                    System.out.println("1. Records by Establishment");
                    System.out.println("2. Records by Date");
                    System.out.println("3. Records by Name");
                    System.out.println("4. Go Back");
                    break;
                case 4://If user Choose 4
                    
                    if (e != null) {//If obect of event is not null
                        System.out.println(e.InstanceDetails());//Print its Values
                    } else {//othevise
                        System.out.println("No Data Found");//print this Satement
                    }
                    continue;
                case 5://If user Choose 5
                    if (est != null) {//If obect of Establishment is not null
                        System.out.println(est.nicePrint());//Print its Values
                    } else {//othervise
                        System.out.println("No Data Found");//print this Statement
                    }
                    continue;
                case 6://If user Choose 6
                    System.exit(0);//Close the Program
                default://If user Choose other then 1-6
                    System.out.println("Invalid Value");//print this Value
                    break;//exit from switch and loop executing again
            }
        }
    }
}
