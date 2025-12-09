package PolicyData;


public class BasePolicyData {
    private String clientName;
    private String insurer;
    
    private String coverDetails;

    // Default constructor (required by Jackson)
    public BasePolicyData() {}

    // Getters & setters
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public String getInsurer() { return insurer; }
    public void setInsurer(String insurer) { this.insurer = insurer; }
    public String getCoverDetails() { return coverDetails; }
    public void setCoverDetails(String coverDetails) { this.coverDetails = coverDetails; }

    @Override
    public String toString() {
        return "CoverData{" +
               "clientName='" + clientName + '\'' +
               ", insurer='" + insurer + '\'' +
               ", coverDetails='" + coverDetails + '\'' +
               '}';
    }
}
