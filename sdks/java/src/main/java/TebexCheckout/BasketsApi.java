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


import org.openapitools.client.model.AddPackageRequest;
import org.openapitools.client.model.Basket;
import org.openapitools.client.model.CreateBasketRequest;
import org.openapitools.client.model.Sale;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BasketsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BasketsApi(ApiClient apiClient) {
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
     * Build call for addPackage
     * @param ident The basket identifier. (required)
     * @param addPackageRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Package is successfully added to the basket, and basket is returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted package. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPackageCall(String ident, AddPackageRequest addPackageRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = addPackageRequest;

        // create path and map variables
        String localVarPath = "/baskets/{ident}/packages"
            .replace("{" + "ident" + "}", localVarApiClient.escapeString(ident.toString()));

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

        String[] localVarAuthNames = new String[] { "tebex_checkout_auth_basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addPackageValidateBeforeCall(String ident, AddPackageRequest addPackageRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ident' is set
        if (ident == null) {
            throw new ApiException("Missing the required parameter 'ident' when calling addPackage(Async)");
        }

        return addPackageCall(ident, addPackageRequest, _callback);

    }

    /**
     * Add a package to the basket
     * This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * @param ident The basket identifier. (required)
     * @param addPackageRequest  (optional)
     * @return Basket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Package is successfully added to the basket, and basket is returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted package. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public Basket addPackage(String ident, AddPackageRequest addPackageRequest) throws ApiException {
        ApiResponse<Basket> localVarResp = addPackageWithHttpInfo(ident, addPackageRequest);
        return localVarResp.getData();
    }

    /**
     * Add a package to the basket
     * This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * @param ident The basket identifier. (required)
     * @param addPackageRequest  (optional)
     * @return ApiResponse&lt;Basket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Package is successfully added to the basket, and basket is returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted package. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Basket> addPackageWithHttpInfo(String ident, AddPackageRequest addPackageRequest) throws ApiException {
        okhttp3.Call localVarCall = addPackageValidateBeforeCall(ident, addPackageRequest, null);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add a package to the basket (asynchronously)
     * This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * @param ident The basket identifier. (required)
     * @param addPackageRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Package is successfully added to the basket, and basket is returned. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Improperly formatted package. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPackageAsync(String ident, AddPackageRequest addPackageRequest, final ApiCallback<Basket> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPackageValidateBeforeCall(ident, addPackageRequest, _callback);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addSaleToBasket
     * @param ident The basket identifier. (required)
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully adds sale to basket. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSaleToBasketCall(String ident, Sale sale, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = sale;

        // create path and map variables
        String localVarPath = "/baskets/{ident}/sales"
            .replace("{" + "ident" + "}", localVarApiClient.escapeString(ident.toString()));

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

        String[] localVarAuthNames = new String[] { "tebex_checkout_auth_basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addSaleToBasketValidateBeforeCall(String ident, Sale sale, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ident' is set
        if (ident == null) {
            throw new ApiException("Missing the required parameter 'ident' when calling addSaleToBasket(Async)");
        }

        return addSaleToBasketCall(ident, sale, _callback);

    }

    /**
     * Add a sale to the basket
     * Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**
     * @param ident The basket identifier. (required)
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket. (optional)
     * @return Basket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully adds sale to basket. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public Basket addSaleToBasket(String ident, Sale sale) throws ApiException {
        ApiResponse<Basket> localVarResp = addSaleToBasketWithHttpInfo(ident, sale);
        return localVarResp.getData();
    }

    /**
     * Add a sale to the basket
     * Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**
     * @param ident The basket identifier. (required)
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket. (optional)
     * @return ApiResponse&lt;Basket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully adds sale to basket. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Basket> addSaleToBasketWithHttpInfo(String ident, Sale sale) throws ApiException {
        okhttp3.Call localVarCall = addSaleToBasketValidateBeforeCall(ident, sale, null);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add a sale to the basket (asynchronously)
     * Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**
     * @param ident The basket identifier. (required)
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully adds sale to basket. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSaleToBasketAsync(String ident, Sale sale, final ApiCallback<Basket> _callback) throws ApiException {

        okhttp3.Call localVarCall = addSaleToBasketValidateBeforeCall(ident, sale, _callback);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createBasket
     * @param createBasketRequest Create a basket, returning the full basket object and payment link. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basket created successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBasketCall(CreateBasketRequest createBasketRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createBasketRequest;

        // create path and map variables
        String localVarPath = "/baskets";

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

        String[] localVarAuthNames = new String[] { "tebex_checkout_auth_basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createBasketValidateBeforeCall(CreateBasketRequest createBasketRequest, final ApiCallback _callback) throws ApiException {
        return createBasketCall(createBasketRequest, _callback);

    }

    /**
     * Create a basket that can be used to pay for items
     * This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;
     * @param createBasketRequest Create a basket, returning the full basket object and payment link. (optional)
     * @return Basket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basket created successfully </td><td>  -  </td></tr>
     </table>
     */
    public Basket createBasket(CreateBasketRequest createBasketRequest) throws ApiException {
        ApiResponse<Basket> localVarResp = createBasketWithHttpInfo(createBasketRequest);
        return localVarResp.getData();
    }

    /**
     * Create a basket that can be used to pay for items
     * This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;
     * @param createBasketRequest Create a basket, returning the full basket object and payment link. (optional)
     * @return ApiResponse&lt;Basket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basket created successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Basket> createBasketWithHttpInfo(CreateBasketRequest createBasketRequest) throws ApiException {
        okhttp3.Call localVarCall = createBasketValidateBeforeCall(createBasketRequest, null);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a basket that can be used to pay for items (asynchronously)
     * This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;
     * @param createBasketRequest Create a basket, returning the full basket object and payment link. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basket created successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBasketAsync(CreateBasketRequest createBasketRequest, final ApiCallback<Basket> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBasketValidateBeforeCall(createBasketRequest, _callback);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBasketById
     * @param ident The basket identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**_/_**refund**_/_**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBasketByIdCall(String ident, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/baskets/{ident}"
            .replace("{" + "ident" + "}", localVarApiClient.escapeString(ident.toString()));

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

        String[] localVarAuthNames = new String[] { "tebex_checkout_auth_basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBasketByIdValidateBeforeCall(String ident, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ident' is set
        if (ident == null) {
            throw new ApiException("Missing the required parameter 'ident' when calling getBasketById(Async)");
        }

        return getBasketByIdCall(ident, _callback);

    }

    /**
     * Fetch a basket by its identifier
     * Gets the basket associated with the provided identifier.
     * @param ident The basket identifier. (required)
     * @return Basket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**_/_**refund**_/_**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public Basket getBasketById(String ident) throws ApiException {
        ApiResponse<Basket> localVarResp = getBasketByIdWithHttpInfo(ident);
        return localVarResp.getData();
    }

    /**
     * Fetch a basket by its identifier
     * Gets the basket associated with the provided identifier.
     * @param ident The basket identifier. (required)
     * @return ApiResponse&lt;Basket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**_/_**refund**_/_**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Basket> getBasketByIdWithHttpInfo(String ident) throws ApiException {
        okhttp3.Call localVarCall = getBasketByIdValidateBeforeCall(ident, null);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch a basket by its identifier (asynchronously)
     * Gets the basket associated with the provided identifier.
     * @param ident The basket identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**_/_**refund**_/_**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBasketByIdAsync(String ident, final ApiCallback<Basket> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBasketByIdValidateBeforeCall(ident, _callback);
        Type localVarReturnType = new TypeToken<Basket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeRowFromBasket
     * @param ident The basket identifier. (required)
     * @param rowsId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted a row from the basket. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Row or basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeRowFromBasketCall(String ident, Integer rowsId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/baskets/{ident}/packages/{rows.id}"
            .replace("{" + "ident" + "}", localVarApiClient.escapeString(ident.toString()))
            .replace("{" + "rows.id" + "}", localVarApiClient.escapeString(rowsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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

        String[] localVarAuthNames = new String[] { "tebex_checkout_auth_basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeRowFromBasketValidateBeforeCall(String ident, Integer rowsId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ident' is set
        if (ident == null) {
            throw new ApiException("Missing the required parameter 'ident' when calling removeRowFromBasket(Async)");
        }

        // verify the required parameter 'rowsId' is set
        if (rowsId == null) {
            throw new ApiException("Missing the required parameter 'rowsId' when calling removeRowFromBasket(Async)");
        }

        return removeRowFromBasketCall(ident, rowsId, _callback);

    }

    /**
     * Remove a row from the basket
     * This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.
     * @param ident The basket identifier. (required)
     * @param rowsId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted a row from the basket. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Row or basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public void removeRowFromBasket(String ident, Integer rowsId) throws ApiException {
        removeRowFromBasketWithHttpInfo(ident, rowsId);
    }

    /**
     * Remove a row from the basket
     * This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.
     * @param ident The basket identifier. (required)
     * @param rowsId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted a row from the basket. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Row or basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> removeRowFromBasketWithHttpInfo(String ident, Integer rowsId) throws ApiException {
        okhttp3.Call localVarCall = removeRowFromBasketValidateBeforeCall(ident, rowsId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove a row from the basket (asynchronously)
     * This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.
     * @param ident The basket identifier. (required)
     * @param rowsId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully deleted a row from the basket. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Row or basket not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeRowFromBasketAsync(String ident, Integer rowsId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeRowFromBasketValidateBeforeCall(ident, rowsId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
