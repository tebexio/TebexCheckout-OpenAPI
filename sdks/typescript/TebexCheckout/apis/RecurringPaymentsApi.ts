// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RecurringPayment } from '../models/RecurringPayment';
import { UpdateRecurringPaymentRequest } from '../models/UpdateRecurringPaymentRequest';
import { UpdateSubscriptionRequest } from '../models/UpdateSubscriptionRequest';

/**
 * no description
 */
export class RecurringPaymentsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param reference The recurring payment reference to cancel.
     */
    public async cancelRecurringPayment(reference: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reference' is not null or undefined
        if (reference === null || reference === undefined) {
            throw new RequiredError("RecurringPaymentsApi", "cancelRecurringPayment", "reference");
        }


        // Path Params
        const localVarPath = '/recurring-payments/{reference}'
            .replace('{' + 'reference' + '}', encodeURIComponent(String(reference)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param reference The recurring payment reference to fetch.
     */
    public async getRecurringPayment(reference: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reference' is not null or undefined
        if (reference === null || reference === undefined) {
            throw new RequiredError("RecurringPaymentsApi", "getRecurringPayment", "reference");
        }


        // Path Params
        const localVarPath = '/recurring-payments/{reference}'
            .replace('{' + 'reference' + '}', encodeURIComponent(String(reference)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Pause or reactivate a recurring payment
     * @param reference The recurring payment reference to update.
     * @param updateRecurringPaymentRequest 
     */
    public async updateRecurringPayment(reference: string, updateRecurringPaymentRequest?: UpdateRecurringPaymentRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reference' is not null or undefined
        if (reference === null || reference === undefined) {
            throw new RequiredError("RecurringPaymentsApi", "updateRecurringPayment", "reference");
        }



        // Path Params
        const localVarPath = '/recurring-payments/{reference}/status'
            .replace('{' + 'reference' + '}', encodeURIComponent(String(reference)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateRecurringPaymentRequest, "UpdateRecurringPaymentRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param reference The recurring payment reference to fetch.
     * @param updateSubscriptionRequest 
     */
    public async updateSubscription(reference: string, updateSubscriptionRequest?: UpdateSubscriptionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reference' is not null or undefined
        if (reference === null || reference === undefined) {
            throw new RequiredError("RecurringPaymentsApi", "updateSubscription", "reference");
        }



        // Path Params
        const localVarPath = '/recurring-payments/{reference}'
            .replace('{' + 'reference' + '}', encodeURIComponent(String(reference)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateSubscriptionRequest, "UpdateSubscriptionRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class RecurringPaymentsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to cancelRecurringPayment
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async cancelRecurringPaymentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RecurringPayment >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Recurring payment not found.", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getRecurringPayment
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getRecurringPaymentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RecurringPayment >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Recurring payment not found.", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateRecurringPayment
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateRecurringPaymentWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RecurringPayment >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Bad Request. See ErrorResponse.", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Recurring payment not found.", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateSubscription
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateSubscriptionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<RecurringPayment >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Bad Request.", undefined, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            throw new ApiException<undefined>(response.httpStatusCode, "Recurring payment not found.", undefined, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: RecurringPayment = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RecurringPayment", ""
            ) as RecurringPayment;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
