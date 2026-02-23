package PolicyData;

public class FirePolicyData extends BasePolicyData {

    private String coverNoteNumber;
    private String insuranceClass;
    private String sumInsured;
    private String description;
    private String validation;

    public String getCoverNoteNumber() {
        return coverNoteNumber;
    }

    public void setCoverNoteNumber(String coverNoteNumber) {
        this.coverNoteNumber = coverNoteNumber;
    }

    public String getInsuranceClass() {
        return insuranceClass;
    }

    public void setInsuranceClass(String insuranceClass) {
        this.insuranceClass = insuranceClass;
    }

    public String getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(String sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    @Override
    public String toString() {
        return "FirePolicyData{" +
                "clientName='" + getClientName() + '\'' +
                ", insurer='" + getInsurer() + '\'' +
                ", coverNoteNumber='" + coverNoteNumber + '\'' +
                ", insuranceClass='" + insuranceClass + '\'' +
                ", sumInsured='" + sumInsured + '\'' +
                ", description='" + description + '\'' +
                ", validation='" + validation + '\'' +
                '}';
    }
}
