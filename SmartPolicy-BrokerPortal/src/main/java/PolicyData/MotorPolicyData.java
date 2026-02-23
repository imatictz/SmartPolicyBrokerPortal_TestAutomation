
package PolicyData;

public class MotorPolicyData extends BasePolicyData {

    private String motorType;
    private String insuranceType;
    private String insuranceClass;
    private String ownerCategory;
    private String motorUsage;
    private String registrationNumber;
    private String chasisNumber;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleType;

    private String modelNumber;     // NEW
    private String engineNumber;    // NEW
    private String fuelType;        // NEW
    private String manufactureYear; // NEW
    private String seat;            // NEW
    private String cc;              // NEW
    private String color;           // NEW
    private String grossWeight;     // NEW
    private String tareWeight;      // NEW
    private String numberOfAxel;    // NEW
    private String axelDistance;    // NEW
    private String sumInsured;      // NEW
    private String validation;



    // ================== GETTERS & SETTERS ==================

    public String getMotorType() { return motorType; }
    public void setMotorType(String motorType) { this.motorType = motorType; }

    public String getInsuranceType() { return insuranceType; }
    public void setInsuranceType(String insuranceType) { this.insuranceType = insuranceType; }

    public String getInsuranceClass() { return insuranceClass; }
    public void setInsuranceClass(String insuranceClass) { this.insuranceClass = insuranceClass; }

    public String getOwnerCategory() { return ownerCategory; }
    public void setOwnerCategory(String ownerCategory) { this.ownerCategory = ownerCategory; }

    public String getMotorUsage() { return motorUsage; }
    public void setMotorUsage(String motorUsage) { this.motorUsage = motorUsage; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public String getChasisNumber() { return chasisNumber; }
    public void setChasisNumber(String chasisNumber) { this.chasisNumber = chasisNumber; }

    public String getVehicleMake() { return vehicleMake; }
    public void setVehicleMake(String vehicleMake) { this.vehicleMake = vehicleMake; }

    public String getVehicleModel() { return vehicleModel; }
    public void setVehicleModel(String vehicleModel) { this.vehicleModel = vehicleModel; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }


    // ========= NEW GETTERS & SETTERS =========

    public String getModelNumber() { return modelNumber; }
    public void setModelNumber(String modelNumber) { this.modelNumber = modelNumber; }

    public String getEngineNumber() { return engineNumber; }
    public void setEngineNumber(String engineNumber) { this.engineNumber = engineNumber; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getManufactureYear() { return manufactureYear; }
    public void setManufactureYear(String manufactureYear) { this.manufactureYear = manufactureYear; }

    public String getSeat() { return seat; }
    public void setSeat(String seat) { this.seat = seat; }

    public String getCc() { return cc; }
    public void setCc(String cc) { this.cc = cc; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getGrossWeight() { return grossWeight; }
    public void setGrossWeight(String grossWeight) { this.grossWeight = grossWeight; }

    public String getTareWeight() { return tareWeight; }
    public void setTareWeight(String tareWeight) { this.tareWeight = tareWeight; }

    public String getNumberOfAxel() { return numberOfAxel; }
    public void setNumberOfAxel(String numberOfAxel) { this.numberOfAxel = numberOfAxel; }

    public String getAxelDistance() { return axelDistance; }
    public void setAxelDistance(String axelDistance) { this.axelDistance = axelDistance; }

    public String getSumInsured() { return sumInsured; }
    public void setSumInsured(String sumInsured) { this.sumInsured = sumInsured; }
    
    public String getValidation() { return validation; }
    public void setValidation(String validation) { this.validation = validation; }

    @Override
    public String toString() {
        return "MotorPolicyData{" +
                "motorType='" + motorType + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", insuranceClass='" + insuranceClass + '\'' +
                ", ownerCategory='" + ownerCategory + '\'' +
                ", motorUsage='" + motorUsage + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", chasisNumber='" + chasisNumber + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleType='" + vehicleType + '\'' +

                // newly requested fields
                ", modelNumber='" + modelNumber + '\'' +
                ", engineNumber='" + engineNumber + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", seat='" + seat + '\'' +
                ", cc='" + cc + '\'' +
                ", color='" + color + '\'' +
                ", grossWeight='" + grossWeight + '\'' +
                ", tareWeight='" + tareWeight + '\'' +
                ", numberOfAxel='" + numberOfAxel + '\'' +
                ", axelDistance='" + axelDistance + '\'' +
                ", sumInsured='" + sumInsured + '\'' +
                ", validation='" + validation + '\'' +

                '}';
    }

    }

