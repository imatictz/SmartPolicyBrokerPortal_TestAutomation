package utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import PolicyData.*;

public class TestDataLoader {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static BasePolicyData getPolicyData(String policyType) {
        try {
            JsonNode root = mapper.readTree(
                    TestDataLoader.class.getResourceAsStream("/testdata/policies.json")
                    
            );

            JsonNode node = root.get(policyType);

            if (node == null) {
                throw new RuntimeException("No test data found for: " + policyType);
            }

            switch (policyType) {
                case "Motor":
                    return mapper.treeToValue(node, MotorPolicyData.class);

                case "Fire":
                    return mapper.treeToValue(node, FirePolicyData.class);

                case "Health":
                    return mapper.treeToValue(node, HealthPolicyData.class);
                    

                default:
                    throw new RuntimeException("Unknown policy type: " + policyType);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Error parsing policy test data", e);
        }
    }
}
