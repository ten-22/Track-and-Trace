import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class User {
    // Data members of fields

    private String name;
    private LocalDate dob;
    private String email;
    private String phonenumber;
    private static int age;

    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public User(String name, LocalDate dob, String email, String phonenumber, int age) {
        // Constructor
        this.name = name;

        this.dob = dob;

        this.email = email;

        this.phonenumber = phonenumber;

        this.age = calcAge(dob);
    }

// Method 
    public String name() {
        return name;

    }

    public LocalDate dob() {
        return dob;

    }

    public String email() {
        return email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public static int getAge() {
        return age;
    }

    public String phonenumber() {
        return phonenumber;
    }

    public int age() {
        return age;
    }

    public String InstanceDetails() {
        return String.format("Name %s\n\t" + "Date of birth %s\n\t" + "Email %s\n\t" + "Phonenumber %s\n\t" + "Age %d", name,
                dob.format(FORMATTER), email, phonenumber, age);

    }

// Method to calculate date of age from date of birth
    private int calcAge(LocalDate bday) {

        return Period.between(dob, LocalDate.now()).getYears();

        // LocalDate.now();
        // return Period(dob, LocalDate.now().getYear());
        // when calculating the age form the local date i was not a able to over come
        // the "the method between(localdate, localdate) in the type period is not
        // applicable for the arguments (localdate, int)"ERRo
        // however through creating method sub i was
        // }
    }

    private java.time.Period Period(LocalDate dob, int year) {
        // TODO Auto-generated method stub
        return Period.between(dob, LocalDate.now());
    }

    public String singleLinePrint() {
        return name + " | " + " Contact Number " + phonenumber;

    }

    public static void main(String[] args) {
        // the following intitalisation of the local date in oder to identfy the
        // difference with that bad the dob to outline the age.
        // on fist attempt the formating of the DOB was 1995-09-20.This is not the
        // intended format. format should follow 20-09-1995.
        // in order to fix the formating of the date used the Java Oricle where
        // identified a technique called Parsing by introducing the date time formater
        // After attempting the above method i was not able to show a correct date
        // formate of dd mm yyyy - in order to overcome this i used a formater through
        // the dot format method
        // This attempt was successful thus printing to the date as 20/09/1995

        LocalDate bday = LocalDate.of(1995, 9, 20);

        // LocalDate.parse ("20/09/1995",formatter);
        User u = new User("Jordan Barnes", bday, "Jordan.barns + @newcastle.ac.uk", "07482011076", age);

        String phonenumber = "07482011076";
        String email = "Jordan.barns + @newcastle.ac.uk";
        System.out.println(u.singleLinePrint());
    }
;
}
