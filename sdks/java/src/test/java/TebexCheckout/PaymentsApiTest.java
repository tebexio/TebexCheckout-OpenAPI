/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package TebexCheckout;

import TebexCheckout.ApiException;
import org.openapitools.client.model.Payment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Disabled
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    /**
     * Fetch a payment by its transaction ID
     *
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaymentByIdTest() throws ApiException {
        String txnId = null;
        Payment response = api.getPaymentById(txnId);
        // TODO: test validations
    }

    /**
     * Refund a payment by its transaction ID
     *
     * This will refund the given payment associated with this transaction id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refundPaymentByIdTest() throws ApiException {
        String txnId = null;
        Payment response = api.refundPaymentById(txnId);
        // TODO: test validations
    }

}
