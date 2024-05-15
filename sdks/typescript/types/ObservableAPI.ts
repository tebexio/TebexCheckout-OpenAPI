import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { BasketsApiRequestFactory, BasketsApiResponseProcessor} from "../apis/BasketsApi";
export class ObservableBasketsApi {
    private requestFactory: BasketsApiRequestFactory;
    private responseProcessor: BasketsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BasketsApiRequestFactory,
        responseProcessor?: BasketsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BasketsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BasketsApiResponseProcessor();
    }

    /**
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * Add a package to the basket
     * @param ident The basket identifier.
     * @param addPackageRequest 
     */
    public addPackageWithHttpInfo(ident: string, addPackageRequest?: AddPackageRequest, _options?: Configuration): Observable<HttpInfo<Basket>> {
        const requestContextPromise = this.requestFactory.addPackage(ident, addPackageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.addPackageWithHttpInfo(rsp)));
            }));
    }

    /**
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * Add a package to the basket
     * @param ident The basket identifier.
     * @param addPackageRequest 
     */
    public addPackage(ident: string, addPackageRequest?: AddPackageRequest, _options?: Configuration): Observable<Basket> {
        return this.addPackageWithHttpInfo(ident, addPackageRequest, _options).pipe(map((apiResponse: HttpInfo<Basket>) => apiResponse.data));
    }

    /**
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * Add a sale to the basket
     * @param ident The basket identifier.
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
     */
    public addSaleToBasketWithHttpInfo(ident: string, sale?: Sale, _options?: Configuration): Observable<HttpInfo<Basket>> {
        const requestContextPromise = this.requestFactory.addSaleToBasket(ident, sale, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.addSaleToBasketWithHttpInfo(rsp)));
            }));
    }

    /**
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * Add a sale to the basket
     * @param ident The basket identifier.
     * @param sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
     */
    public addSaleToBasket(ident: string, sale?: Sale, _options?: Configuration): Observable<Basket> {
        return this.addSaleToBasketWithHttpInfo(ident, sale, _options).pipe(map((apiResponse: HttpInfo<Basket>) => apiResponse.data));
    }

    /**
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * Create a basket that can be used to pay for items
     * @param createBasketRequest Create a basket, returning the full basket object and payment link.
     */
    public createBasketWithHttpInfo(createBasketRequest?: CreateBasketRequest, _options?: Configuration): Observable<HttpInfo<Basket>> {
        const requestContextPromise = this.requestFactory.createBasket(createBasketRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createBasketWithHttpInfo(rsp)));
            }));
    }

    /**
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * Create a basket that can be used to pay for items
     * @param createBasketRequest Create a basket, returning the full basket object and payment link.
     */
    public createBasket(createBasketRequest?: CreateBasketRequest, _options?: Configuration): Observable<Basket> {
        return this.createBasketWithHttpInfo(createBasketRequest, _options).pipe(map((apiResponse: HttpInfo<Basket>) => apiResponse.data));
    }

    /**
     * Gets the basket associated with the provided identifier.
     * Fetch a basket by its identifier
     * @param ident The basket identifier.
     */
    public getBasketByIdWithHttpInfo(ident: string, _options?: Configuration): Observable<HttpInfo<Basket>> {
        const requestContextPromise = this.requestFactory.getBasketById(ident, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getBasketByIdWithHttpInfo(rsp)));
            }));
    }

    /**
     * Gets the basket associated with the provided identifier.
     * Fetch a basket by its identifier
     * @param ident The basket identifier.
     */
    public getBasketById(ident: string, _options?: Configuration): Observable<Basket> {
        return this.getBasketByIdWithHttpInfo(ident, _options).pipe(map((apiResponse: HttpInfo<Basket>) => apiResponse.data));
    }

    /**
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * Remove a row from the basket
     * @param ident The basket identifier.
     * @param rowId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
     */
    public removeRowFromBasketWithHttpInfo(ident: string, rowId: number, _options?: Configuration): Observable<HttpInfo<void>> {
        const requestContextPromise = this.requestFactory.removeRowFromBasket(ident, rowId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.removeRowFromBasketWithHttpInfo(rsp)));
            }));
    }

    /**
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * Remove a row from the basket
     * @param ident The basket identifier.
     * @param rowId The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
     */
    public removeRowFromBasket(ident: string, rowId: number, _options?: Configuration): Observable<void> {
        return this.removeRowFromBasketWithHttpInfo(ident, rowId, _options).pipe(map((apiResponse: HttpInfo<void>) => apiResponse.data));
    }

}

import { CheckoutApiRequestFactory, CheckoutApiResponseProcessor} from "../apis/CheckoutApi";
export class ObservableCheckoutApi {
    private requestFactory: CheckoutApiRequestFactory;
    private responseProcessor: CheckoutApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CheckoutApiRequestFactory,
        responseProcessor?: CheckoutApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CheckoutApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CheckoutApiResponseProcessor();
    }

    /**
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * Create a checkout request
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
     */
    public checkoutWithHttpInfo(checkoutRequest?: CheckoutRequest, _options?: Configuration): Observable<HttpInfo<Basket>> {
        const requestContextPromise = this.requestFactory.checkout(checkoutRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.checkoutWithHttpInfo(rsp)));
            }));
    }

    /**
     * This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**
     * Create a checkout request
     * @param checkoutRequest Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
     */
    public checkout(checkoutRequest?: CheckoutRequest, _options?: Configuration): Observable<Basket> {
        return this.checkoutWithHttpInfo(checkoutRequest, _options).pipe(map((apiResponse: HttpInfo<Basket>) => apiResponse.data));
    }

}

import { PaymentsApiRequestFactory, PaymentsApiResponseProcessor} from "../apis/PaymentsApi";
export class ObservablePaymentsApi {
    private requestFactory: PaymentsApiRequestFactory;
    private responseProcessor: PaymentsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PaymentsApiRequestFactory,
        responseProcessor?: PaymentsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PaymentsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PaymentsApiResponseProcessor();
    }

    /**
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`
     * Fetch a payment by its transaction ID
     * @param txnId The payment reference to fetch.
     */
    public getPaymentByIdWithHttpInfo(txnId: string, _options?: Configuration): Observable<HttpInfo<Payment>> {
        const requestContextPromise = this.requestFactory.getPaymentById(txnId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getPaymentByIdWithHttpInfo(rsp)));
            }));
    }

    /**
     * This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`
     * Fetch a payment by its transaction ID
     * @param txnId The payment reference to fetch.
     */
    public getPaymentById(txnId: string, _options?: Configuration): Observable<Payment> {
        return this.getPaymentByIdWithHttpInfo(txnId, _options).pipe(map((apiResponse: HttpInfo<Payment>) => apiResponse.data));
    }

    /**
     * This will refund the given payment associated with this transaction id.
     * Refund a payment by its transaction ID
     * @param txnId The payment reference to refund.
     */
    public refundPaymentByIdWithHttpInfo(txnId: string, _options?: Configuration): Observable<HttpInfo<Payment>> {
        const requestContextPromise = this.requestFactory.refundPaymentById(txnId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.refundPaymentByIdWithHttpInfo(rsp)));
            }));
    }

    /**
     * This will refund the given payment associated with this transaction id.
     * Refund a payment by its transaction ID
     * @param txnId The payment reference to refund.
     */
    public refundPaymentById(txnId: string, _options?: Configuration): Observable<Payment> {
        return this.refundPaymentByIdWithHttpInfo(txnId, _options).pipe(map((apiResponse: HttpInfo<Payment>) => apiResponse.data));
    }

}

import { RecurringPaymentsApiRequestFactory, RecurringPaymentsApiResponseProcessor} from "../apis/RecurringPaymentsApi";
export class ObservableRecurringPaymentsApi {
    private requestFactory: RecurringPaymentsApiRequestFactory;
    private responseProcessor: RecurringPaymentsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: RecurringPaymentsApiRequestFactory,
        responseProcessor?: RecurringPaymentsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new RecurringPaymentsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new RecurringPaymentsApiResponseProcessor();
    }

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param reference The recurring payment reference to cancel.
     */
    public cancelRecurringPaymentWithHttpInfo(reference: string, _options?: Configuration): Observable<HttpInfo<RecurringPayment>> {
        const requestContextPromise = this.requestFactory.cancelRecurringPayment(reference, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelRecurringPaymentWithHttpInfo(rsp)));
            }));
    }

    /**
     * This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
     * Cancel a recurring payment
     * @param reference The recurring payment reference to cancel.
     */
    public cancelRecurringPayment(reference: string, _options?: Configuration): Observable<RecurringPayment> {
        return this.cancelRecurringPaymentWithHttpInfo(reference, _options).pipe(map((apiResponse: HttpInfo<RecurringPayment>) => apiResponse.data));
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param reference The recurring payment reference to fetch.
     */
    public getRecurringPaymentWithHttpInfo(reference: string, _options?: Configuration): Observable<HttpInfo<RecurringPayment>> {
        const requestContextPromise = this.requestFactory.getRecurringPayment(reference, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRecurringPaymentWithHttpInfo(rsp)));
            }));
    }

    /**
     * Fetch a recurring payment (subscription) by its reference
     * @param reference The recurring payment reference to fetch.
     */
    public getRecurringPayment(reference: string, _options?: Configuration): Observable<RecurringPayment> {
        return this.getRecurringPaymentWithHttpInfo(reference, _options).pipe(map((apiResponse: HttpInfo<RecurringPayment>) => apiResponse.data));
    }

    /**
     * Pause or reactivate a recurring payment
     * @param reference The recurring payment reference to update.
     * @param updateRecurringPaymentRequest 
     */
    public updateRecurringPaymentWithHttpInfo(reference: string, updateRecurringPaymentRequest?: UpdateRecurringPaymentRequest, _options?: Configuration): Observable<HttpInfo<RecurringPayment>> {
        const requestContextPromise = this.requestFactory.updateRecurringPayment(reference, updateRecurringPaymentRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateRecurringPaymentWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pause or reactivate a recurring payment
     * @param reference The recurring payment reference to update.
     * @param updateRecurringPaymentRequest 
     */
    public updateRecurringPayment(reference: string, updateRecurringPaymentRequest?: UpdateRecurringPaymentRequest, _options?: Configuration): Observable<RecurringPayment> {
        return this.updateRecurringPaymentWithHttpInfo(reference, updateRecurringPaymentRequest, _options).pipe(map((apiResponse: HttpInfo<RecurringPayment>) => apiResponse.data));
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param reference The recurring payment reference to fetch.
     * @param updateSubscriptionRequest 
     */
    public updateSubscriptionWithHttpInfo(reference: string, updateSubscriptionRequest?: UpdateSubscriptionRequest, _options?: Configuration): Observable<HttpInfo<RecurringPayment>> {
        const requestContextPromise = this.requestFactory.updateSubscription(reference, updateSubscriptionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateSubscriptionWithHttpInfo(rsp)));
            }));
    }

    /**
     * If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
     * Update a subscription with a new product / amount to pay - replacing the existing product
     * @param reference The recurring payment reference to fetch.
     * @param updateSubscriptionRequest 
     */
    public updateSubscription(reference: string, updateSubscriptionRequest?: UpdateSubscriptionRequest, _options?: Configuration): Observable<RecurringPayment> {
        return this.updateSubscriptionWithHttpInfo(reference, updateSubscriptionRequest, _options).pipe(map((apiResponse: HttpInfo<RecurringPayment>) => apiResponse.data));
    }

}
