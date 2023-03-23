
/**
 * Write a description of class address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class address
{
        
    private String street;
    private String barangay;
    private String citymun;
    
    public address(String street, String barangay, String citymun) {
        this.street = street;
        this.barangay = barangay;
        this.citymun = citymun;
    }
    
        public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getBarangay() {
        return barangay;
    }
    
    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }
    
    public String getCityMun() {
        return citymun;
    }
    
    public void setCityMun(String citymun) {
        this.citymun = citymun;
    }
}

