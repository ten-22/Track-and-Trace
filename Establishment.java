public class Establishment {

    private String firstLineAdress;
    private String postCode;
    private int maxOccupancy;
    private String name;
    private String[] address;

    Establishment(String name, String firstLineAdress, String postCode, int maxOccupancy) {
        this.name = name;
        this.firstLineAdress = firstLineAdress;
        this.postCode = postCode;
        this.maxOccupancy = maxOccupancy;
    }

    Establishment(String name, String[] strings, int maxOccupancy) {
        String[] address = new String[]{"1 Fake Street", "FAKE1"};
//String firstLineAdress, String postCode, 

        this.name = name;
        this.firstLineAdress = address[0];
        this.postCode = address[1];
        this.maxOccupancy = maxOccupancy;
    }

    public static void main(String[] args) {

        // now we are creationg an establishment object
        Establishment e = new Establishment("Some Restaurant Place", "1 Queen Street", "FA2 3KE", 15);
        Establishment e1 = new Establishment("Fancy Cafe", new String[]{"1 Fake Street" + "FAKE1"}, 15);
        System.out.println(e1.nicePrint());
    }

    Establishment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFirstLineAdress() {
        return firstLineAdress;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public String getName() {
        return name;
    }

    public String[] getAddress() {
        return address;
    }

    public String nicePrint() {
        return String.format("Name: "+name+",Address:"+firstLineAdress);
    }

    @Override
    public String toString() {
        return "Establishment [firstLineAdress=" + firstLineAdress + ", postCode=" + postCode + ", maxOccupancy="
                + maxOccupancy;

    }
}
