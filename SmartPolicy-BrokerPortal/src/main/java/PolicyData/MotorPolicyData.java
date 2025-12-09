package PolicyData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class MotorPolicyData extends BasePolicyData {
	private String motorType;
	private String insuranceType;
	private String insuranceClass;
	
	private String coverDetails;
	
	

    // Getters & setters
    
    public String getMotorType() { return motorType; }
    public void setMotorType(String motorType) { this.motorType = motorType; }
    
    public String getInsuranceType() { return insuranceType; }
    public void setInsuranceType(String insuranceType) { this.insuranceType = insuranceType; }
    
    public String getInsuranceClass() { return insuranceClass; }
    public void setInsuranceClass(String insuranceClass) { this.insuranceClass = insuranceClass; }
    

    @Override
    public String toString() {
        return "CoverData{" +
               ", motorType='" + motorType + '\'' +
               ", insuranceType='" + insuranceType + '\'' +
               ", insuranceClass='" + insuranceClass + '\'' +
               ", coverDetails='" + coverDetails + '\'' +
               '}';
    }
}
