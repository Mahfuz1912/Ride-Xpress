public class BikeDriver {
    private int id;
    private String driverId;
    private String firstName;
    private String lastName;
    private String licenseIssue;
    private String licenseExpire;
    private String bikeModel;
    private double pricePerKm;
    private String signatureName;
    
    // Constructor
    public BikeDriver(int id, String driverId, String firstName, String lastName, 
                     String licenseIssue, String licenseExpire, String bikeModel, 
                     double pricePerKm, String signatureName) {
        this.id = id;
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseIssue = licenseIssue;
        this.licenseExpire = licenseExpire;
        this.bikeModel = bikeModel;
        this.pricePerKm = pricePerKm;
        this.signatureName = signatureName;
    }
    
    // Getters
    public int getId() { return id; }
    public String getDriverId() { return driverId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getLicenseIssue() { return licenseIssue; }
    public String getLicenseExpire() { return licenseExpire; }
    public String getBikeModel() { return bikeModel; }
    public double getPricePerKm() { return pricePerKm; }
    public String getSignatureName() { return signatureName; }
}