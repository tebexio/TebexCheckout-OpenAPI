/**
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PaymentCustomer from './PaymentCustomer';
import PaymentFees from './PaymentFees';
import PaymentPaymentMethod from './PaymentPaymentMethod';
import PaymentPrice from './PaymentPrice';
import PaymentProductsInner from './PaymentProductsInner';
import PaymentStatus from './PaymentStatus';
import RevenueShare from './RevenueShare';

/**
 * The Payment model module.
 * @module TebexCheckout/model/Payment
 * @version 1.1.2
 */
class Payment {
    /**
     * Constructs a new <code>Payment</code>.
     * @alias module:TebexCheckout/model/Payment
     */
    constructor() { 
        
        Payment.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Payment</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/Payment} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/Payment} The populated <code>Payment</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Payment();

            if (data.hasOwnProperty('transaction_id')) {
                obj['transaction_id'] = ApiClient.convertToType(data['transaction_id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = PaymentStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('payment_sequence')) {
                obj['payment_sequence'] = ApiClient.convertToType(data['payment_sequence'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Date');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = PaymentPrice.constructFromObject(data['price']);
            }
            if (data.hasOwnProperty('price_paid')) {
                obj['price_paid'] = PaymentPrice.constructFromObject(data['price_paid']);
            }
            if (data.hasOwnProperty('payment_method')) {
                obj['payment_method'] = PaymentPaymentMethod.constructFromObject(data['payment_method']);
            }
            if (data.hasOwnProperty('revenue_share')) {
                obj['revenue_share'] = ApiClient.convertToType(data['revenue_share'], [RevenueShare]);
            }
            if (data.hasOwnProperty('decline_reason')) {
                obj['decline_reason'] = ApiClient.convertToType(data['decline_reason'], 'String');
            }
            if (data.hasOwnProperty('fees')) {
                obj['fees'] = PaymentFees.constructFromObject(data['fees']);
            }
            if (data.hasOwnProperty('customer')) {
                obj['customer'] = PaymentCustomer.constructFromObject(data['customer']);
            }
            if (data.hasOwnProperty('products')) {
                obj['products'] = ApiClient.convertToType(data['products'], [PaymentProductsInner]);
            }
            if (data.hasOwnProperty('coupons')) {
                obj['coupons'] = ApiClient.convertToType(data['coupons'], [Object]);
            }
            if (data.hasOwnProperty('gift_cards')) {
                obj['gift_cards'] = ApiClient.convertToType(data['gift_cards'], [Object]);
            }
            if (data.hasOwnProperty('recurring_payment_reference')) {
                obj['recurring_payment_reference'] = ApiClient.convertToType(data['recurring_payment_reference'], 'String');
            }
            if (data.hasOwnProperty('custom')) {
                obj['custom'] = ApiClient.convertToType(data['custom'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Payment</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Payment</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['transaction_id'] && !(typeof data['transaction_id'] === 'string' || data['transaction_id'] instanceof String)) {
            throw new Error("Expected the field `transaction_id` to be a primitive type in the JSON string but got " + data['transaction_id']);
        }
        // validate the optional field `status`
        if (data['status']) { // data not null
          PaymentStatus.validateJSON(data['status']);
        }
        // ensure the json data is a string
        if (data['payment_sequence'] && !(typeof data['payment_sequence'] === 'string' || data['payment_sequence'] instanceof String)) {
            throw new Error("Expected the field `payment_sequence` to be a primitive type in the JSON string but got " + data['payment_sequence']);
        }
        // validate the optional field `price`
        if (data['price']) { // data not null
          PaymentPrice.validateJSON(data['price']);
        }
        // validate the optional field `price_paid`
        if (data['price_paid']) { // data not null
          PaymentPrice.validateJSON(data['price_paid']);
        }
        // validate the optional field `payment_method`
        if (data['payment_method']) { // data not null
          PaymentPaymentMethod.validateJSON(data['payment_method']);
        }
        if (data['revenue_share']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['revenue_share'])) {
                throw new Error("Expected the field `revenue_share` to be an array in the JSON data but got " + data['revenue_share']);
            }
            // validate the optional field `revenue_share` (array)
            for (const item of data['revenue_share']) {
                RevenueShare.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['decline_reason'] && !(typeof data['decline_reason'] === 'string' || data['decline_reason'] instanceof String)) {
            throw new Error("Expected the field `decline_reason` to be a primitive type in the JSON string but got " + data['decline_reason']);
        }
        // validate the optional field `fees`
        if (data['fees']) { // data not null
          PaymentFees.validateJSON(data['fees']);
        }
        // validate the optional field `customer`
        if (data['customer']) { // data not null
          PaymentCustomer.validateJSON(data['customer']);
        }
        if (data['products']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['products'])) {
                throw new Error("Expected the field `products` to be an array in the JSON data but got " + data['products']);
            }
            // validate the optional field `products` (array)
            for (const item of data['products']) {
                PaymentProductsInner.validateJSON(item);
            };
        }
        // ensure the json data is an array
        if (!Array.isArray(data['coupons'])) {
            throw new Error("Expected the field `coupons` to be an array in the JSON data but got " + data['coupons']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['gift_cards'])) {
            throw new Error("Expected the field `gift_cards` to be an array in the JSON data but got " + data['gift_cards']);
        }
        // ensure the json data is a string
        if (data['recurring_payment_reference'] && !(typeof data['recurring_payment_reference'] === 'string' || data['recurring_payment_reference'] instanceof String)) {
            throw new Error("Expected the field `recurring_payment_reference` to be a primitive type in the JSON string but got " + data['recurring_payment_reference']);
        }

        return true;
    }


}



/**
 * @member {String} transaction_id
 */
Payment.prototype['transaction_id'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentStatus} status
 */
Payment.prototype['status'] = undefined;

/**
 * @member {String} payment_sequence
 */
Payment.prototype['payment_sequence'] = undefined;

/**
 * @member {Date} created_at
 */
Payment.prototype['created_at'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentPrice} price
 */
Payment.prototype['price'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentPrice} price_paid
 */
Payment.prototype['price_paid'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentPaymentMethod} payment_method
 */
Payment.prototype['payment_method'] = undefined;

/**
 * @member {Array.<module:TebexCheckout/model/RevenueShare>} revenue_share
 */
Payment.prototype['revenue_share'] = undefined;

/**
 * @member {String} decline_reason
 */
Payment.prototype['decline_reason'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentFees} fees
 */
Payment.prototype['fees'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentCustomer} customer
 */
Payment.prototype['customer'] = undefined;

/**
 * @member {Array.<module:TebexCheckout/model/PaymentProductsInner>} products
 */
Payment.prototype['products'] = undefined;

/**
 * @member {Array.<Object>} coupons
 */
Payment.prototype['coupons'] = undefined;

/**
 * @member {Array.<Object>} gift_cards
 */
Payment.prototype['gift_cards'] = undefined;

/**
 * @member {String} recurring_payment_reference
 */
Payment.prototype['recurring_payment_reference'] = undefined;

/**
 * @member {Object} custom
 */
Payment.prototype['custom'] = undefined;






export default Payment;

