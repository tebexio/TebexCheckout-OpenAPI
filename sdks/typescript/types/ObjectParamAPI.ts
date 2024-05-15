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

import { ObservableBasketsApi } from "./ObservableAPI";
import { BasketsApiRequestFactory, BasketsApiResponseProcessor} from "../apis/BasketsApi";

export interface BasketsApiAddPackageRequest {
    /**
     * The basket identifier.
     * @type string
     * @memberof BasketsApiaddPackage
     */
    ident: string
    /**
     * 
     * @type AddPackageRequest
     * @memberof BasketsApiaddPackage
     */
    addPackageRequest?: AddPackageRequest
}

export interface BasketsApiAddSaleToBasketRequest {
    /**
     * The basket identifier.
     * @type string
     * @memberof BasketsApiaddSaleToBasket
     */
    ident: string
    /**
     * Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
     * @type Sale
     * @memberof BasketsApiaddSaleToBasket
     */
    sale?: Sale
}

export interface BasketsApiCreateBasketRequest {
    /**
     * Create a basket, returning the full basket object and payment link.
     * @type CreateBasketRequest
     * @memberof BasketsApicreateBasket
     */
    createBasketRequest?: CreateBasketRequest
}

export interface BasketsApiGetBasketByIdRequest {
    /**
     * The basket identifier.
     * @type string
     * @memberof BasketsApigetBasketById
     */
    ident: string
}

export interface BasketsApiRemoveRowFromBasketRequest {
    /**
     * The basket identifier.
     * @type string
     * @memberof BasketsApiremoveRowFromBasket
     */
    ident: string
    /**
     * The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
     * @type number
     * @memberof BasketsApiremoveRowFromBasket
     */
    rowId: number
}

export class ObjectBasketsApi {
    private api: ObservableBasketsApi

    public constructor(configuration: Configuration, requestFactory?: BasketsApiRequestFactory, responseProcessor?: BasketsApiResponseProcessor) {
        this.api = new ObservableBasketsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * Add a package to the basket
     * @param param the request object
     */
    public addPackageWithHttpInfo(param: BasketsApiAddPackageRequest, options?: Configuration): Promise<HttpInfo<Basket>> {
        return this.api.addPackageWithHttpInfo(param.ident, param.addPackageRequest,  options).toPromise();
    }

    /**
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * Add a package to the basket
     * @param param the request object
     */
    public addPackage(param: BasketsApiAddPackageRequest, options?: Configuration): Promise<Basket> {
        return this.api.addPackage(param.ident, param.addPackageRequest,  options).toPromise();
    }

    /**
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * Add a sale to the basket
     * @param param the request object
     */
    public addSaleToBasketWithHttpInfo(param: BasketsApiAddSaleToBasketRequest, options?: Configuration): Promise<HttpInfo<Basket>> {
        return this.api.addSaleToBasketWithHttpInfo(param.ident, param.sale,  options).toPromise();
    }

    /**
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * Add a sale to the basket
     * @param param the request object
     */
    public addSaleToBasket(param: BasketsApiAddSaleToBasketRequest, options?: Configuration): Promise<Basket> {
        return this.api.addSaleToBasket(param.ident, param.sale,  options).toPromise();
    }

    /**
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * Create a basket that can be used to pay for items
     * @param param the request object
     */
    public createBasketWithHttpInfo(param: BasketsApiCreateBasketRequest = {}, options?: Configuration): Promise<HttpInfo<Basket>> {
        return this.api.createBasketWithHttpInfo(param.createBasketRequest,  options).toPromise();
    }

    /**
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * Create a basket that can be used to pay for items
     * @param param the request object
     */
    public createBasket(param: BasketsApiCreateBasketRequest = {}, options?: Configuration): Promise<Basket> {
        return this.api.createBasket(param.createBasketRequest,  options).toPromise();
    }

    /**
     * Gets the basket associated with the provided identifier.
     * Fetch a basket by its identifier
     * @param param the request object
     */
    public getBasketByIdWithHttpInfo(param: BasketsApiGetBasketByIdRequest, options?: Configuration): Promise<HttpInfo<Basket>> {
        return this.api.getBasketByIdWithHttpInfo(param.ident,  options).toPromise();
    }

    /**
     * Gets the basket associated with the provided identifier.
     * Fetch a basket by its identifier
     * @param param the request object
     */
    public getBasketById(param: BasketsApiGetBasketByIdRequest, options?: Configuration): Promise<Basket> {
        return this.api.getBasketById(param.ident,  options).toPromise();
    }

    /**
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * Remove a row from the basket
     * @param param the request object
     */
    public removeRowFromBasketWithHttpInfo(param: BasketsApiRemoveRowFromBasketRequest, options?: Configuration): Promise<HttpInfo<void>> {
        return this.api.removeRowFromBasketWithHttpInfo(param.ident, param.rowId,  options).toPromise();
    }

    /**
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * Remove a row from the basket
     * @param param the request object
     */
    public removeRowFromBasket(param: BasketsApiRemoveRowFromBasketRequest, options?: Configuration): Promise<void> {
        return this.api.removeRowFromBasket(param.ident, param.rowId,  options).toPromise();
    }

}

import { ObservableCheckoutApi } from "./ObservableAPI";
import { CheckoutApiRequestFactory, CheckoutApiResponseProcessor} from "../apis/CheckoutApi";

export interface CheckoutApiCheckoutRequest {
    /**
     * Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
     * @type CheckoutRequest
     * @memberof CheckoutApicheckout
     */
    checkoutRequest?: CheckoutRequest
}

export class ObjectCheckoutApi {
    private api: ObservableCheckoutApi

    public constructor(configuration: Configuration, requestFactory?: CheckoutApiRequestFactory, responseProcessor?: CheckoutApiResponseProcessor) {
        this.api = new ObservableCheckoutApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * Create a checkout request
     * @param param the request object
     */
    public checkoutWithHttpInfo(param: CheckoutApiCheckoutRequest = {}, options?: Configuration): Promise<HttpInfo<Basket>> {
        return this.api.checkoutWithHttpInfo(param.checkoutRequest,  options).toPromise();
    }

    /**
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * Create a checkout request
     * @param param the request object
     */
    public checkout(param: CheckoutApiCheckoutRequest = {}, options?: Configuration): Promise<Basket> {
        return this.api.checkout(param.checkoutRequest,  options).toPromise();
    }

}

import { ObservablePaymentsApi } from "./ObservableAPI";
import { PaymentsApiRequestFactory, PaymentsApiResponseProcessor} from "../apis/PaymentsApi";

export interface PaymentsApiGetPaymentByIdRequest {
    /**
     * The payment reference to fetch.
     * @type string
     * @memberof PaymentsApigetPaymentById
     */
    txnId: string
}

export interface PaymentsApiRefundPaymentByIdRequest {
    /**
     * The payment reference to refund.
     * @type string
     * @memberof PaymentsApirefundPaymentById
     */
    txnId: string
}

export class ObjectPaymentsApi {
    private api: ObservablePaymentsApi

    public constructor(configuration: Configuration, requestFactory?: PaymentsApiRequestFactory, responseProcessor?: PaymentsApiResponseProcessor) {
        this.api = new ObservablePaymentsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`
     * Fetch a payment by its transaction ID
     * @param param the request object
     */
    public getPaymentByIdWithHttpInfo(param: PaymentsApiGetPaymentByIdRequest, options?: Configuration): Promise<HttpInfo<Payment>> {
        return this.api.getPaymentByIdWithHttpInfo(param.txnId,  options).toPromise();
    }

    /**
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`
     * Fetch a payment by its transaction ID
     * @param param the request object
     */
    public getPaymentById(param: PaymentsApiGetPaymentByIdRequest, options?: Configuration): Promise<Payment> {
        return this.api.getPaymentById(param.txnId,  options).toPromise();
    }

    /**
     * This will refund the given payment associated with this transaction id.
     * Refund a payment by its transaction ID
     * @param param the request object
     */
    public refundPaymentByIdWithHttpInfo(param: PaymentsApiRefundPaymentByIdRequest, options?: Configuration): Promise<HttpInfo<Payment>> {
        return this.api.refundPaymentByIdWithHttpInfo(param.txnId,  options).toPromise();
    }

    /**
     * This will refund the given payment associated with this transaction id.
     * Refund a payment by its transaction ID
     * @param param the request object
     */
    public refundPaymentById(param: PaymentsApiRefundPaymentByIdRequest, options?: Configuration): Promise<Payment> {
        return this.api.refundPaymentById(param.txnId,  options).toPromise();
    }

}

import { ObservableRecurringPaymentsApi } from "./ObservableAPI";
import { RecurringPaymentsApiRequestFactory, RecurringPaymentsApiResponseProcessor} from "../apis/RecurringPaymentsApi";

export interface RecurringPaymentsApiCancelRecurringPaymentRequest {
    /**
     * The recurring payment reference to cancel.
     * @type string
     * @memberof RecurringPaymentsApicancelRecurringPayment
     */
    reference: string
}

export interface RecurringPaymentsApiGetRecurringPaymentRequest {
    /**
     * The recurring payment reference to fetch.
     * @type string
     * @memberof RecurringPaymentsApigetRecurringPayment
     */
    reference: string
}

export interface RecurringPaymentsApiUpdateRecurringPaymentRequest {
    /**
     * The recurring payment reference to update.
     * @type string
     * @memberof RecurringPaymentsApiupdateRecurringPayment
     */
    reference: string
    /**
     * 
     * @type UpdateRecurringPaymentRequest
     * @memberof RecurringPaymentsApiupdateRecurringPayment
     */
    updateRecurringPaymentRequest?: UpdateRecurringPaymentRequest
}

export interface RecurringPaymentsApiUpdateSubscriptionRequest {
    /**
     * The recurring payment reference to fetch.
     * @type string
     * @memberof RecurringPaymentsApiupdateSubscription
     */
    reference: string
    /**
     * 
     * @type UpdateSubscriptionRequest
     * @memberof RecurringPaymentsApiupdateSubscription
     */
    updateSubscriptionRequest?: UpdateSubscriptionRequest
}

export class ObjectRecurringPaymentsApi {
    private api: ObservableRecurringPaymentsApi

    public constructor(configuration: Configuration, requestFactory?: RecurringPaymentsApiRequestFactory, responseProcessor?: RecurringPaymentsApiResponseProcessor) {
        this.api = new ObservableRecurringPaymentsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param param the request object
     */
    public cancelRecurringPaymentWithHttpInfo(param: RecurringPaymentsApiCancelRecurringPaymentRequest, options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        return this.api.cancelRecurringPaymentWithHttpInfo(param.reference,  options).toPromise();
    }

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param param the request object
     */
    public cancelRecurringPayment(param: RecurringPaymentsApiCancelRecurringPaymentRequest, options?: Configuration): Promise<RecurringPayment> {
        return this.api.cancelRecurringPayment(param.reference,  options).toPromise();
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param param the request object
     */
    public getRecurringPaymentWithHttpInfo(param: RecurringPaymentsApiGetRecurringPaymentRequest, options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        return this.api.getRecurringPaymentWithHttpInfo(param.reference,  options).toPromise();
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param param the request object
     */
    public getRecurringPayment(param: RecurringPaymentsApiGetRecurringPaymentRequest, options?: Configuration): Promise<RecurringPayment> {
        return this.api.getRecurringPayment(param.reference,  options).toPromise();
    }

    /**
     * Pause or reactivate a recurring payment
     * @param param the request object
     */
    public updateRecurringPaymentWithHttpInfo(param: RecurringPaymentsApiUpdateRecurringPaymentRequest, options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        return this.api.updateRecurringPaymentWithHttpInfo(param.reference, param.updateRecurringPaymentRequest,  options).toPromise();
    }

    /**
     * Pause or reactivate a recurring payment
     * @param param the request object
     */
    public updateRecurringPayment(param: RecurringPaymentsApiUpdateRecurringPaymentRequest, options?: Configuration): Promise<RecurringPayment> {
        return this.api.updateRecurringPayment(param.reference, param.updateRecurringPaymentRequest,  options).toPromise();
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param param the request object
     */
    public updateSubscriptionWithHttpInfo(param: RecurringPaymentsApiUpdateSubscriptionRequest, options?: Configuration): Promise<HttpInfo<RecurringPayment>> {
        return this.api.updateSubscriptionWithHttpInfo(param.reference, param.updateSubscriptionRequest,  options).toPromise();
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param param the request object
     */
    public updateSubscription(param: RecurringPaymentsApiUpdateSubscriptionRequest, options?: Configuration): Promise<RecurringPayment> {
        return this.api.updateSubscription(param.reference, param.updateSubscriptionRequest,  options).toPromise();
    }

}
