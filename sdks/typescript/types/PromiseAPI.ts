import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { AddPackageRequest } from '../models/AddPackageRequest';
import { Address } from '../models/Address';
import { Basket } from '../models/Basket';
import { BasketItem } from '../models/BasketItem';
import { BasketLinks } from '../models/BasketLinks';
import { CheckoutItem } from '../models/CheckoutItem';
import { CheckoutRequest } from '../models/CheckoutRequest';
import { CheckoutRequestBasket } from '../models/CheckoutRequestBasket';
import { CreateBasketRequest } from '../models/CreateBasketRequest';
import { ErrorResponse } from '../models/ErrorResponse';
import { Package } from '../models/Package';
import { PackageMetaData } from '../models/PackageMetaData';
import { Payment } from '../models/Payment';
import { PaymentCustom } from '../models/PaymentCustom';
import { PaymentCustomer } from '../models/PaymentCustomer';
import { PaymentFees } from '../models/PaymentFees';
import { PaymentFeesGateway } from '../models/PaymentFeesGateway';
import { PaymentFeesTax } from '../models/PaymentFeesTax';
import { PaymentPrice } from '../models/PaymentPrice';
import { PaymentProductsInner } from '../models/PaymentProductsInner';
import { PaymentProductsInnerBasePrice } from '../models/PaymentProductsInnerBasePrice';
import { PaymentStatus } from '../models/PaymentStatus';
import { PriceDetails } from '../models/PriceDetails';
import { RecurringPayment } from '../models/RecurringPayment';
import { RecurringPaymentAmount } from '../models/RecurringPaymentAmount';
import { RecurringPaymentLinks } from '../models/RecurringPaymentLinks';
import { RecurringPaymentStatus } from '../models/RecurringPaymentStatus';
import { RevenueShare } from '../models/RevenueShare';
import { Sale } from '../models/Sale';
import { UpdateRecurringPaymentRequest } from '../models/UpdateRecurringPaymentRequest';
import { UpdateSubscriptionRequest } from '../models/UpdateSubscriptionRequest';
import { ObservableBasketsApi } from './ObservableAPI';

import { BasketsApiRequestFactory, BasketsApiResponseProcessor} from "../apis/BasketsApi";
export class PromiseBasketsApi {
    private api: ObservableBasketsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BasketsApiRequestFactory,
        responseProcessor?: BasketsApiResponseProcessor
    ) {
        this.api = new ObservableBasketsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * Add a package to the basket
     * @param ident The basket identifier.
     * @param addPackageRequest 
     */
    public addPackageWithHttpInfo(ident: string, addPackageRequest?: AddPackageRequest, _options?: Configuration): Promise<HttpInfo<Basket>> {
        const result = this.api.addPackageWithHttpInfo(ident, addPackageRequest, _options);
        return result.toPromise();
    }

    /**
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * Add a package to the basket
     * @param ident The basket identifier.
     * @param addPackageRequest 
     */
    public addPackage(ident: string, addPackageRequest?: AddPackageRequest, _options?: Configuration): Promise<Basket> {
        const result = this.api.addPackage(ident, addPackageRequest, _options);
        return result.toPromise();
    }

    /**
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * Add a sale to the basket
     * @param ident The basket identifier.
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
     */
    public addSaleToBasketWithHttpInfo(ident: string, sale?: Sale, _options?: Configuration): Promise<HttpInfo<Basket>> {
        const result = this.api.addSaleToBasketWithHttpInfo(ident, sale, _options);
        return result.toPromise();
    }

    /**
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * Add a sale to the basket
     * @param ident The basket identifier.
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
     */
    public addSaleToBasket(ident: string, sale?: Sale, _options?: Configuration): Promise<Basket> {
        const result = this.api.addSaleToBasket(ident, sale, _options);
        return result.toPromise();
    }

    /**
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * Create a basket that can be used to pay for items
     * @param createBasketRequest Create a basket, returning the full basket object and payment link.
     */
    public createBasketWithHttpInfo(createBasketRequest?: CreateBasketRequest, _options?: Configuration): Promise<HttpInfo<Basket>> {
        const result = this.api.createBasketWithHttpInfo(createBasketRequest, _options);
        return result.toPromise();
    }

    /**
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * Create a basket that can be used to pay for items
     * @param createBasketRequest Create a basket, returning the full basket object and payment link.
     */
    public createBasket(createBasketRequest?: CreateBasketRequest, _options?: Configuration): Promise<Basket> {
        const result = this.api.createBasket(createBasketRequest, _options);
        return result.toPromise();
    }

    /**
     * Gets the basket associated with the provided identifier.
     * Fetch a basket by its identifier
     * @param ident The basket identifier.
     */
    public getBasketByIdWithHttpInfo(ident: string, _options?: Configuration): Promise<HttpInfo<Basket>> {
        const result = this.api.getBasketByIdWithHttpInfo(ident, _options);
        return result.toPromise();
    }

    /**
     * Gets the basket associated with the provided identifier.
     * Fetch a basket by its identifier
     * @param ident The basket identifier.
     */
    public getBasketById(ident: string, _options?: Configuration): Promise<Basket> {
        const result = this.api.getBasketById(ident, _options);
        return result.toPromise();
    }

    /**
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * Remove a row from the basket
     * @param ident The basket identifier.
     * @param rowId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
     */
    public removeRowFromBasketWithHttpInfo(ident: string, rowId: number, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.removeRowFromBasketWithHttpInfo(ident, rowId, _options);
        return result.toPromise();
    }

    /**
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * Remove a row from the basket
     * @param ident The basket identifier.
     * @param rowId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
     */
    public removeRowFromBasket(ident: string, rowId: number, _options?: Configuration): Promise<void> {
        const result = this.api.removeRowFromBasket(ident, rowId, _options);
        return result.toPromise();
    }


}



import { ObservableCheckoutApi } from './ObservableAPI';

import { CheckoutApiRequestFactory, CheckoutApiResponseProcessor} from "../apis/CheckoutApi";
export class PromiseCheckoutApi {
    private api: ObservableCheckoutApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CheckoutApiRequestFactory,
        responseProcessor?: CheckoutApiResponseProcessor
    ) {
        this.api = new ObservableCheckoutApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * Create a checkout request
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
     */
    public checkoutWithHttpInfo(checkoutRequest?: CheckoutRequest, _options?: Configuration): Promise<HttpInfo<Basket>> {
        const result = this.api.checkoutWithHttpInfo(checkoutRequest, _options);
        return result.toPromise();
    }

    /**
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * Create a checkout request
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
     */
    public checkout(checkoutRequest?: CheckoutRequest, _options?: Configuration): Promise<Basket> {
        const result = this.api.checkout(checkoutRequest, _options);
        return result.toPromise();
    }


}



import { ObservablePaymentsApi } from './ObservableAPI';

import { PaymentsApiRequestFactory, PaymentsApiResponseProcessor} from "../apis/PaymentsApi";
export class PromisePaymentsApi {
    private api: ObservablePaymentsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PaymentsApiRequestFactory,
        responseProcessor?: PaymentsApiResponseProcessor
    ) {
        this.api = new ObservablePaymentsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`
     * Fetch a payment by its transaction ID
     * @param txnId The payment reference to fetch.
     */
    public getPaymentByIdWithHttpInfo(txnId: string, _options?: Configuration): Promise<HttpInfo<Payment>> {
        const result = this.api.getPaymentByIdWithHttpInfo(txnId, _options);
        return result.toPromise();
    }

    /**
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`
     * Fetch a payment by its transaction ID
     * @param txnId The payment reference to fetch.
     */
    public getPaymentById(txnId: string, _options?: Configuration): Promise<Payment> {
        const result = this.api.getPaymentById(txnId, _options);
        return result.toPromise();
    }

    /**
     * This will refund the given payment associated with this transaction id.
     * Refund a payment by its transaction ID
     * @param txnId The payment reference to refund.
     */
    public refundPaymentByIdWithHttpInfo(txnId: string, _options?: Configuration): Promise<HttpInfo<Payment>> {
        const result = this.api.refundPaymentByIdWithHttpInfo(txnId, _options);
        return result.toPromise();
    }

    /**
     * This will refund the given payment associated with this transaction id.
     * Refund a payment by its transaction ID
     * @param txnId The payment reference to refund.
     */
    public refundPaymentById(txnId: string, _options?: Configuration): Promise<Payment> {
        const result = this.api.refundPaymentById(txnId, _options);
        return result.toPromise();
    }


}



import { ObservableRecurringPaymentsApi } from './ObservableAPI';

import { RecurringPaymentsApiRequestFactory, RecurringPaymentsApiResponseProcessor} from "../apis/RecurringPaymentsApi";
export class PromiseRecurringPaymentsApi {
    private api: ObservableRecurringPaymentsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RecurringPaymentsApiRequestFactory,
        responseProcessor?: RecurringPaymentsApiResponseProcessor
    ) {
        this.api = new ObservableRecurringPaymentsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param reference The recurring payment reference to cancel.
     */
    public cancelRecurringPaymentWithHttpInfo(reference: string, _options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        const result = this.api.cancelRecurringPaymentWithHttpInfo(reference, _options);
        return result.toPromise();
    }

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param reference The recurring payment reference to cancel.
     */
    public cancelRecurringPayment(reference: string, _options?: Configuration): Promise<RecurringPayment> {
        const result = this.api.cancelRecurringPayment(reference, _options);
        return result.toPromise();
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param reference The recurring payment reference to fetch.
     */
    public getRecurringPaymentWithHttpInfo(reference: string, _options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        const result = this.api.getRecurringPaymentWithHttpInfo(reference, _options);
        return result.toPromise();
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param reference The recurring payment reference to fetch.
     */
    public getRecurringPayment(reference: string, _options?: Configuration): Promise<RecurringPayment> {
        const result = this.api.getRecurringPayment(reference, _options);
        return result.toPromise();
    }

    /**
     * Pause or reactivate a recurring payment
     * @param reference The recurring payment reference to update.
     * @param updateRecurringPaymentRequest 
     */
    public updateRecurringPaymentWithHttpInfo(reference: string, updateRecurringPaymentRequest?: UpdateRecurringPaymentRequest, _options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        const result = this.api.updateRecurringPaymentWithHttpInfo(reference, updateRecurringPaymentRequest, _options);
        return result.toPromise();
    }

    /**
     * Pause or reactivate a recurring payment
     * @param reference The recurring payment reference to update.
     * @param updateRecurringPaymentRequest 
     */
    public updateRecurringPayment(reference: string, updateRecurringPaymentRequest?: UpdateRecurringPaymentRequest, _options?: Configuration): Promise<RecurringPayment> {
        const result = this.api.updateRecurringPayment(reference, updateRecurringPaymentRequest, _options);
        return result.toPromise();
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param reference The recurring payment reference to fetch.
     * @param updateSubscriptionRequest 
     */
    public updateSubscriptionWithHttpInfo(reference: string, updateSubscriptionRequest?: UpdateSubscriptionRequest, _options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        const result = this.api.updateSubscriptionWithHttpInfo(reference, updateSubscriptionRequest, _options);
        return result.toPromise();
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param reference The recurring payment reference to fetch.
     * @param updateSubscriptionRequest 
     */
    public updateSubscription(reference: string, updateSubscriptionRequest?: UpdateSubscriptionRequest, _options?: Configuration): Promise<RecurringPayment> {
        const result = this.api.updateSubscription(reference, updateSubscriptionRequest, _options);
        return result.toPromise();
    }


}



