/**
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import AddPackageRequest from './model/AddPackageRequest';
import Address from './model/Address';
import Basket from './model/Basket';
import BasketItem from './model/BasketItem';
import BasketLinks from './model/BasketLinks';
import BasketRow from './model/BasketRow';
import BasketRowMeta from './model/BasketRowMeta';
import BasketRowMetaLimits from './model/BasketRowMetaLimits';
import BasketRowMetaLimitsUser from './model/BasketRowMetaLimitsUser';
import CheckoutItem from './model/CheckoutItem';
import CheckoutRequest from './model/CheckoutRequest';
import CheckoutRequestBasket from './model/CheckoutRequestBasket';
import CreateBasketRequest from './model/CreateBasketRequest';
import ErrorResponse from './model/ErrorResponse';
import Package from './model/Package';
import PackageMetaData from './model/PackageMetaData';
import Payment from './model/Payment';
import PaymentCustom from './model/PaymentCustom';
import PaymentCustomer from './model/PaymentCustomer';
import PaymentFees from './model/PaymentFees';
import PaymentFeesGateway from './model/PaymentFeesGateway';
import PaymentFeesTax from './model/PaymentFeesTax';
import PaymentPrice from './model/PaymentPrice';
import PaymentProductsInner from './model/PaymentProductsInner';
import PaymentProductsInnerBasePrice from './model/PaymentProductsInnerBasePrice';
import PaymentStatus from './model/PaymentStatus';
import PriceDetails from './model/PriceDetails';
import RecurringPayment from './model/RecurringPayment';
import RecurringPaymentAmount from './model/RecurringPaymentAmount';
import RecurringPaymentLinks from './model/RecurringPaymentLinks';
import RecurringPaymentStatus from './model/RecurringPaymentStatus';
import RevenueShare from './model/RevenueShare';
import Sale from './model/Sale';
import UpdateRecurringPaymentRequest from './model/UpdateRecurringPaymentRequest';
import UpdateSubscriptionRequest from './model/UpdateSubscriptionRequest';
import UpdateSubscriptionRequestItemsInner from './model/UpdateSubscriptionRequestItemsInner';
import BasketsApi from './TebexCheckout/BasketsApi';
import CheckoutApi from './TebexCheckout/CheckoutApi';
import PaymentsApi from './TebexCheckout/PaymentsApi';
import RecurringPaymentsApi from './TebexCheckout/RecurringPaymentsApi';


/**
* The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration..<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var TebexCheckoutApi = require('TebexCheckout/index'); // See note below*.
* var xxxSvc = new TebexCheckoutApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new TebexCheckoutApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['TebexCheckout/index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new TebexCheckoutApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new TebexCheckoutApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module TebexCheckout/index
* @version 1.0.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:TebexCheckout/ApiClient}
     */
    ApiClient,

    /**
     * The AddPackageRequest model constructor.
     * @property {module:TebexCheckout/model/AddPackageRequest}
     */
    AddPackageRequest,

    /**
     * The Address model constructor.
     * @property {module:TebexCheckout/model/Address}
     */
    Address,

    /**
     * The Basket model constructor.
     * @property {module:TebexCheckout/model/Basket}
     */
    Basket,

    /**
     * The BasketItem model constructor.
     * @property {module:TebexCheckout/model/BasketItem}
     */
    BasketItem,

    /**
     * The BasketLinks model constructor.
     * @property {module:TebexCheckout/model/BasketLinks}
     */
    BasketLinks,

    /**
     * The BasketRow model constructor.
     * @property {module:TebexCheckout/model/BasketRow}
     */
    BasketRow,

    /**
     * The BasketRowMeta model constructor.
     * @property {module:TebexCheckout/model/BasketRowMeta}
     */
    BasketRowMeta,

    /**
     * The BasketRowMetaLimits model constructor.
     * @property {module:TebexCheckout/model/BasketRowMetaLimits}
     */
    BasketRowMetaLimits,

    /**
     * The BasketRowMetaLimitsUser model constructor.
     * @property {module:TebexCheckout/model/BasketRowMetaLimitsUser}
     */
    BasketRowMetaLimitsUser,

    /**
     * The CheckoutItem model constructor.
     * @property {module:TebexCheckout/model/CheckoutItem}
     */
    CheckoutItem,

    /**
     * The CheckoutRequest model constructor.
     * @property {module:TebexCheckout/model/CheckoutRequest}
     */
    CheckoutRequest,

    /**
     * The CheckoutRequestBasket model constructor.
     * @property {module:TebexCheckout/model/CheckoutRequestBasket}
     */
    CheckoutRequestBasket,

    /**
     * The CreateBasketRequest model constructor.
     * @property {module:TebexCheckout/model/CreateBasketRequest}
     */
    CreateBasketRequest,

    /**
     * The ErrorResponse model constructor.
     * @property {module:TebexCheckout/model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The Package model constructor.
     * @property {module:TebexCheckout/model/Package}
     */
    Package,

    /**
     * The PackageMetaData model constructor.
     * @property {module:TebexCheckout/model/PackageMetaData}
     */
    PackageMetaData,

    /**
     * The Payment model constructor.
     * @property {module:TebexCheckout/model/Payment}
     */
    Payment,

    /**
     * The PaymentCustom model constructor.
     * @property {module:TebexCheckout/model/PaymentCustom}
     */
    PaymentCustom,

    /**
     * The PaymentCustomer model constructor.
     * @property {module:TebexCheckout/model/PaymentCustomer}
     */
    PaymentCustomer,

    /**
     * The PaymentFees model constructor.
     * @property {module:TebexCheckout/model/PaymentFees}
     */
    PaymentFees,

    /**
     * The PaymentFeesGateway model constructor.
     * @property {module:TebexCheckout/model/PaymentFeesGateway}
     */
    PaymentFeesGateway,

    /**
     * The PaymentFeesTax model constructor.
     * @property {module:TebexCheckout/model/PaymentFeesTax}
     */
    PaymentFeesTax,

    /**
     * The PaymentPrice model constructor.
     * @property {module:TebexCheckout/model/PaymentPrice}
     */
    PaymentPrice,

    /**
     * The PaymentProductsInner model constructor.
     * @property {module:TebexCheckout/model/PaymentProductsInner}
     */
    PaymentProductsInner,

    /**
     * The PaymentProductsInnerBasePrice model constructor.
     * @property {module:TebexCheckout/model/PaymentProductsInnerBasePrice}
     */
    PaymentProductsInnerBasePrice,

    /**
     * The PaymentStatus model constructor.
     * @property {module:TebexCheckout/model/PaymentStatus}
     */
    PaymentStatus,

    /**
     * The PriceDetails model constructor.
     * @property {module:TebexCheckout/model/PriceDetails}
     */
    PriceDetails,

    /**
     * The RecurringPayment model constructor.
     * @property {module:TebexCheckout/model/RecurringPayment}
     */
    RecurringPayment,

    /**
     * The RecurringPaymentAmount model constructor.
     * @property {module:TebexCheckout/model/RecurringPaymentAmount}
     */
    RecurringPaymentAmount,

    /**
     * The RecurringPaymentLinks model constructor.
     * @property {module:TebexCheckout/model/RecurringPaymentLinks}
     */
    RecurringPaymentLinks,

    /**
     * The RecurringPaymentStatus model constructor.
     * @property {module:TebexCheckout/model/RecurringPaymentStatus}
     */
    RecurringPaymentStatus,

    /**
     * The RevenueShare model constructor.
     * @property {module:TebexCheckout/model/RevenueShare}
     */
    RevenueShare,

    /**
     * The Sale model constructor.
     * @property {module:TebexCheckout/model/Sale}
     */
    Sale,

    /**
     * The UpdateRecurringPaymentRequest model constructor.
     * @property {module:TebexCheckout/model/UpdateRecurringPaymentRequest}
     */
    UpdateRecurringPaymentRequest,

    /**
     * The UpdateSubscriptionRequest model constructor.
     * @property {module:TebexCheckout/model/UpdateSubscriptionRequest}
     */
    UpdateSubscriptionRequest,

    /**
     * The UpdateSubscriptionRequestItemsInner model constructor.
     * @property {module:TebexCheckout/model/UpdateSubscriptionRequestItemsInner}
     */
    UpdateSubscriptionRequestItemsInner,

    /**
    * The BasketsApi service constructor.
    * @property {module:TebexCheckout/TebexCheckout/BasketsApi}
    */
    BasketsApi,

    /**
    * The CheckoutApi service constructor.
    * @property {module:TebexCheckout/TebexCheckout/CheckoutApi}
    */
    CheckoutApi,

    /**
    * The PaymentsApi service constructor.
    * @property {module:TebexCheckout/TebexCheckout/PaymentsApi}
    */
    PaymentsApi,

    /**
    * The RecurringPaymentsApi service constructor.
    * @property {module:TebexCheckout/TebexCheckout/RecurringPaymentsApi}
    */
    RecurringPaymentsApi
};
