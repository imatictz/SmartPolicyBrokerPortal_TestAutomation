package utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import PolicyData.PaymentData;

public class PaymentDataLoader {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static PaymentData getPaymentData(String paymentType) {
        try {
            JsonNode root = mapper.readTree(
                    PaymentDataLoader.class.getResourceAsStream("/testdata/policies.json")
            );

            JsonNode payNode = root.get("payments").get(paymentType);

            if (payNode == null) {
                throw new RuntimeException("No payment data found for: " + paymentType);
            }

            return mapper.treeToValue(payNode, PaymentData.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Error loading payment data!", e);
        }
    }
}
