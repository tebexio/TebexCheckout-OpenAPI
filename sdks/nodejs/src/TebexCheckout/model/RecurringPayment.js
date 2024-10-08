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
import RecurringPaymentAmount from './RecurringPaymentAmount';
import RecurringPaymentLinks from './RecurringPaymentLinks';
import RecurringPaymentStatus from './RecurringPaymentStatus';

/**
 * The RecurringPayment model module.
 * @module TebexCheckout/model/RecurringPayment
 * @version 1.1.2
 */
class RecurringPayment {
    /**
     * Constructs a new <code>RecurringPayment</code>.
     * @alias module:TebexCheckout/model/RecurringPayment
     */
    constructor() { 
        
        RecurringPayment.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecurringPayment</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/RecurringPayment} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/RecurringPayment} The populated <code>RecurringPayment</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecurringPayment();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Date');
            }
            if (data.hasOwnProperty('updated_at')) {
                obj['updated_at'] = ApiClient.convertToType(data['updated_at'], 'Date');
            }
            if (data.hasOwnProperty('paused_at')) {
                obj['paused_at'] = ApiClient.convertToType(data['paused_at'], 'Date');
            }
            if (data.hasOwnProperty('paused_until')) {
                obj['paused_until'] = ApiClient.convertToType(data['paused_until'], 'Date');
            }
            if (data.hasOwnProperty('next_payment_date')) {
                obj['next_payment_date'] = ApiClient.convertToType(data['next_payment_date'], 'String');
            }
            if (data.hasOwnProperty('reference')) {
                obj['reference'] = ApiClient.convertToType(data['reference'], 'String');
            }
            if (data.hasOwnProperty('account_id')) {
                obj['account_id'] = ApiClient.convertToType(data['account_id'], 'Number');
            }
            if (data.hasOwnProperty('interval')) {
                obj['interval'] = ApiClient.convertToType(data['interval'], 'String');
            }
            if (data.hasOwnProperty('cancelled_at')) {
                obj['cancelled_at'] = ApiClient.convertToType(data['cancelled_at'], 'Date');
            }
            if (data.hasOwnProperty('cancellation_requested_at')) {
                obj['cancellation_requested_at'] = ApiClient.convertToType(data['cancellation_requested_at'], 'Date');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = RecurringPaymentStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = RecurringPaymentAmount.constructFromObject(data['amount']);
            }
            if (data.hasOwnProperty('cancel_reason')) {
                obj['cancel_reason'] = ApiClient.convertToType(data['cancel_reason'], 'String');
            }
            if (data.hasOwnProperty('links')) {
                obj['links'] = RecurringPaymentLinks.constructFromObject(data['links']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecurringPayment</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecurringPayment</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['next_payment_date'] && !(typeof data['next_payment_date'] === 'string' || data['next_payment_date'] instanceof String)) {
            throw new Error("Expected the field `next_payment_date` to be a primitive type in the JSON string but got " + data['next_payment_date']);
        }
        // ensure the json data is a string
        if (data['reference'] && !(typeof data['reference'] === 'string' || data['reference'] instanceof String)) {
            throw new Error("Expected the field `reference` to be a primitive type in the JSON string but got " + data['reference']);
        }
        // ensure the json data is a string
        if (data['interval'] && !(typeof data['interval'] === 'string' || data['interval'] instanceof String)) {
            throw new Error("Expected the field `interval` to be a primitive type in the JSON string but got " + data['interval']);
        }
        // validate the optional field `status`
        if (data['status']) { // data not null
          RecurringPaymentStatus.validateJSON(data['status']);
        }
        // validate the optional field `amount`
        if (data['amount']) { // data not null
          RecurringPaymentAmount.validateJSON(data['amount']);
        }
        // ensure the json data is a string
        if (data['cancel_reason'] && !(typeof data['cancel_reason'] === 'string' || data['cancel_reason'] instanceof String)) {
            throw new Error("Expected the field `cancel_reason` to be a primitive type in the JSON string but got " + data['cancel_reason']);
        }
        // validate the optional field `links`
        if (data['links']) { // data not null
          RecurringPaymentLinks.validateJSON(data['links']);
        }

        return true;
    }


}



/**
 * @member {Number} id
 */
RecurringPayment.prototype['id'] = undefined;

/**
 * @member {Date} created_at
 */
RecurringPayment.prototype['created_at'] = undefined;

/**
 * @member {Date} updated_at
 */
RecurringPayment.prototype['updated_at'] = undefined;

/**
 * @member {Date} paused_at
 */
RecurringPayment.prototype['paused_at'] = undefined;

/**
 * @member {Date} paused_until
 */
RecurringPayment.prototype['paused_until'] = undefined;

/**
 * @member {String} next_payment_date
 */
RecurringPayment.prototype['next_payment_date'] = undefined;

/**
 * @member {String} reference
 */
RecurringPayment.prototype['reference'] = undefined;

/**
 * @member {Number} account_id
 */
RecurringPayment.prototype['account_id'] = undefined;

/**
 * @member {String} interval
 */
RecurringPayment.prototype['interval'] = undefined;

/**
 * @member {Date} cancelled_at
 */
RecurringPayment.prototype['cancelled_at'] = undefined;

/**
 * @member {Date} cancellation_requested_at
 */
RecurringPayment.prototype['cancellation_requested_at'] = undefined;

/**
 * @member {module:TebexCheckout/model/RecurringPaymentStatus} status
 */
RecurringPayment.prototype['status'] = undefined;

/**
 * @member {module:TebexCheckout/model/RecurringPaymentAmount} amount
 */
RecurringPayment.prototype['amount'] = undefined;

/**
 * @member {String} cancel_reason
 */
RecurringPayment.prototype['cancel_reason'] = undefined;

/**
 * @member {module:TebexCheckout/model/RecurringPaymentLinks} links
 */
RecurringPayment.prototype['links'] = undefined;






export default RecurringPayment;

