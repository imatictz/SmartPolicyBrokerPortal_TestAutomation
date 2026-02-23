package PolicyData;

public class PaymentData {

    private String paymentType;
    private String mode;
    private String issuerBank;
    private String collectingBank;
    private String referenceNo;
    private String validation;

    // ===== GETTERS & SETTERS =====

    public String getPaymentType() { return paymentType; }
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    public String getIssuerBank() { return issuerBank; }
    public void setIssuerBank(String issuerBank) { this.issuerBank = issuerBank; }

    public String getCollectingBank() { return collectingBank; }
    public void setCollectingBank(String collectingBank) { this.collectingBank = collectingBank; }

    public String getReferenceNo() { return referenceNo; }
    public void setReferenceNo(String referenceNo) { this.referenceNo = referenceNo; }
    
    public String getValidation() { return validation; }
    public void setValidation(String validation) { this.validation = validation; }

}
