import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
    private String User="",partyNumber="",Establishment="";
    LocalDate date;
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Event(String User,LocalDate date,String partyNumber,String Establishment)
    {
        this.User = User;
        this.date = date;
        this.partyNumber = partyNumber;
        this.Establishment = Establishment; 
    }
        public Event(String User,String partyNumber,String Establishment)
    {
        this.User = User;
        this.partyNumber = partyNumber;
        this.Establishment = Establishment;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public String getEstablishment() {
        return Establishment;
    }

    public void setEstablishment(String Establishment) {
        this.Establishment = Establishment;
    }
    public String InstanceDetails() {
    return String.format("User "+User+ " Date of Birth "+date.format(FORMATTER)+ " Party Number " +partyNumber +" Establishment ",Establishment);
    }
        
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1995, 9, 20);
        Event event = new Event("Farhan",date,"15","KPK");
        System.out.println(event.InstanceDetails());

    }
    
}
