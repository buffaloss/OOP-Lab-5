public class School extends Entity {

    private String name;
    private int surface; // in square meters
    private int annualFunds;
    private int reputation; // in percentage, the bigger the percentage the better the school
    
    //nested class inside another class;
    static class Location {
        private String city;
        private String address;

        public String getCity() {
            return this.city;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
    
        public String getAddress() {
            return this.address;
        }
    
        public void setAddress(String adress) {
            this.address = adress;
        }
    }

    public int getReputation() {
        return this.reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void modifyReputation(int reputation) {
        this.reputation = this.reputation+reputation;
    }

    public String exist() {
        String existence = "Exists";
        return existence;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSurface() {
        return this.surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getAnnualFunds() {
        return this.annualFunds;
    }

    public void setAnnualFunds(int annualFunds) {
        this.annualFunds = annualFunds;
    }

    //modify annual funds by adding or subtrracting from current annual funds
    public void modifyAnnualFunds(int annualFunds){
        this.annualFunds = this.annualFunds+annualFunds;
    }

}