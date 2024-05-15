/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package TebexCheckout;

import TebexCheckout.ApiCallback;
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.ApiResponse;
import TebexCheckout.Configuration;
import TebexCheckout.Pair;
import TebexCheckout.ProgressRequestBody;
import TebexCheckout.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Payment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPaymentById
     * @param txnId The payment reference to fetch. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentByIdCall(String txnId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments/{txnId}?type=txn_id"
            .replace("{" + "txnId" + "}", localVarApiClient.escapeString(txnId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentByIdValidateBeforeCall(String txnId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'txnId' is set
        if (txnId == null) {
            throw new ApiException("Missing the required parameter 'txnId' when calling getPaymentById(Async)");
        }

        return getPaymentByIdCall(txnId, _callback);

    }

    /**
     * Fetch a payment by its transaction ID
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;
     * @param txnId The payment reference to fetch. (required)
     * @return Payment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found. </td><td>  -  </td></tr>
     </table>
     */
    public Payment getPaymentById(String txnId) throws ApiException {
        ApiResponse<Payment> localVarResp = getPaymentByIdWithHttpInfo(txnId);
        return localVarResp.getData();
    }

    /**
     * Fetch a payment by its transaction ID
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;
     * @param txnId The payment reference to fetch. (required)
     * @return ApiResponse&lt;Payment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payment> getPaymentByIdWithHttpInfo(String txnId) throws ApiException {
        okhttp3.Call localVarCall = getPaymentByIdValidateBeforeCall(txnId, null);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch a payment by its transaction ID (asynchronously)
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;
     * @param txnId The payment reference to fetch. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment fetched successfully. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentByIdAsync(String txnId, final ApiCallback<Payment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentByIdValidateBeforeCall(txnId, _callback);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for refundPaymentById
     * @param txnId The payment reference to refund. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment refunded successfully. The payment details are returned. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Payment not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call refundPaymentByIdCall(String txnId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments/{txnId}/refund?type=txn_id"
            .replace("{" + "txnId" + "}", localVarApiClient.escapeString(txnId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call refundPaymentByIdValidateBeforeCall(String txnId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'txnId' is set
        if (txnId == null) {
            throw new ApiException("Missing the required parameter 'txnId' when calling refundPaymentById(Async)");
        }

        return refundPaymentByIdCall(txnId, _callback);

    }

    /**
     * Refund a payment by its transaction ID
     * This will refund the given payment associated with this transaction id.
     * @param txnId The payment reference to refund. (required)
     * @return Payment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment refunded successfully. The payment details are returned. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Payment not found. </td><td>  -  </td></tr>
     </table>
     */
    public Payment refundPaymentById(String txnId) throws ApiException {
        ApiResponse<Payment> localVarResp = refundPaymentByIdWithHttpInfo(txnId);
        return localVarResp.getData();
    }

    /**
     * Refund a payment by its transaction ID
     * This will refund the given payment associated with this transaction id.
     * @param txnId The payment reference to refund. (required)
     * @return ApiResponse&lt;Payment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment refunded successfully. The payment details are returned. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Payment not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payment> refundPaymentByIdWithHttpInfo(String txnId) throws ApiException {
        okhttp3.Call localVarCall = refundPaymentByIdValidateBeforeCall(txnId, null);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Refund a payment by its transaction ID (asynchronously)
     * This will refund the given payment associated with this transaction id.
     * @param txnId The payment reference to refund. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Payment refunded successfully. The payment details are returned. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Payment not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call refundPaymentByIdAsync(String txnId, final ApiCallback<Payment> _callback) throws ApiException {

        okhttp3.Call localVarCall = refundPaymentByIdValidateBeforeCall(txnId, _callback);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
