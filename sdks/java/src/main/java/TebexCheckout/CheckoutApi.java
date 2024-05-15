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


import org.openapitools.client.model.Basket;
import org.openapitools.client.model.CheckoutRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CheckoutApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CheckoutApi(ApiClient apiClient) {
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
     * Build call for checkout
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. See ErrorResponse. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkoutCall(CheckoutRequest checkoutRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = checkoutRequest;

        // create path and map variables
        String localVarPath = "/checkout";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkoutValidateBeforeCall(CheckoutRequest checkoutRequest, final ApiCallback _callback) throws ApiException {
        return checkoutCall(checkoutRequest, _callback);

    }

    /**
     * Create a checkout request
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)
     * @return Basket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. See ErrorResponse. </td><td>  -  </td></tr>
     </table>
     */
    public Basket checkout(CheckoutRequest checkoutRequest) throws ApiException {
        ApiResponse<Basket> localVarResp = checkoutWithHttpInfo(checkoutRequest);
        return localVarResp.getData();
    }

    /**
     * Create a checkout request
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)
     * @return ApiResponse&lt;Basket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. See ErrorResponse. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Basket> checkoutWithHttpInfo(CheckoutRequest checkoutRequest) throws ApiException {
        okhttp3.Call localVarCall = checkoutValidateBeforeCall(checkoutRequest, null);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a checkout request (asynchronously)
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. See ErrorResponse. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkoutAsync(CheckoutRequest checkoutRequest, final ApiCallback<Basket> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkoutValidateBeforeCall(checkoutRequest, _callback);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
