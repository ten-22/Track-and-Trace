package myapp;
import java.io.*;  
import java.time.LocalDate;
import java.util.Scanner;  
import java.util.ArrayList;

public class Controller {
    
    ArrayList<Establishment> establishment = new ArrayList<Establishment>();
    ArrayList<Event> event = new ArrayList<Event>();
    private String CSVFileUrl="";
    Event e;
    public Controller()
    {
        
    }
 Controller(String establishmentCSVFileURI)
 {
     LocalDate date = LocalDate.of(1995, 9, 20);
     this.CSVFileUrl = establishmentCSVFileURI;
     e = new Event("Farhan",date,"15","KPK");
     event.add(e);
     
 }
 
 public void RetrieveEstablishmentData()
 {
     System.out.print("name,firstAddressLine,postcode,occupancy");
     for(int i=0;i<establishment.size();i++)
     {
         System.out.print(establishment.get(i).getName()+" , ");
         System.out.print(establishment.get(i).getFirstLineAdress()+" , ");
         System.out.print(establishment.get(i).getPostCode()+" , ");
         System.out.print(establishment.get(i).getMaxOccupancy());
     }
 }
 public void read_csv() throws FileNotFoundException, IOException
 {
     String line = "";
     int count=0;
     BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\establishments.csv"));  
    while ((line=br.readLine())!=null)  //returns a boolean value  
    {
        if(count>0)
        {
        String[] estab = line.split(",");
        int i=Integer.parseInt(estab[3]);  
            System.out.println(""+estab[0]);
        Establishment e = new Establishment(estab[0], estab[1], estab[2], i);
        establishment.add(e);
        }
        count++;
    }  
} 
 
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Controller controller = new Controller();
        controller.read_csv();
        controller.RetrieveEstablishmentData();
        System.out.println(controller.CSVFileUrl);
    }
}
