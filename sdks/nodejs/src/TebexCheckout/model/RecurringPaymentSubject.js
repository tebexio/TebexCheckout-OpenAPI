/**
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PaymentSubject from './PaymentSubject';
import RecurringPaymentSubjectPrice from './RecurringPaymentSubjectPrice';
import RecurringPaymentSubjectStatus from './RecurringPaymentSubjectStatus';

/**
 * The RecurringPaymentSubject model module.
 * @module TebexCheckout/model/RecurringPaymentSubject
 * @version 1.1.0
 */
class RecurringPaymentSubject {
    /**
     * Constructs a new <code>RecurringPaymentSubject</code>.
     * @alias module:TebexCheckout/model/RecurringPaymentSubject
     */
    constructor() { 
        
        RecurringPaymentSubject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecurringPaymentSubject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/RecurringPaymentSubject} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/RecurringPaymentSubject} The populated <code>RecurringPaymentSubject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecurringPaymentSubject();

            if (data.hasOwnProperty('reference')) {
                obj['reference'] = ApiClient.convertToType(data['reference'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Date');
            }
            if (data.hasOwnProperty('paused_at')) {
                obj['paused_at'] = ApiClient.convertToType(data['paused_at'], 'Date');
            }
            if (data.hasOwnProperty('paused_until')) {
                obj['paused_until'] = ApiClient.convertToType(data['paused_until'], 'Date');
            }
            if (data.hasOwnProperty('next_payment_at')) {
                obj['next_payment_at'] = ApiClient.convertToType(data['next_payment_at'], 'Date');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = RecurringPaymentSubjectStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('initial_payment')) {
                obj['initial_payment'] = PaymentSubject.constructFromObject(data['initial_payment']);
            }
            if (data.hasOwnProperty('last_payment')) {
                obj['last_payment'] = PaymentSubject.constructFromObject(data['last_payment']);
            }
            if (data.hasOwnProperty('fail_count')) {
                obj['fail_count'] = ApiClient.convertToType(data['fail_count'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = RecurringPaymentSubjectPrice.constructFromObject(data['price']);
            }
            if (data.hasOwnProperty('cancelled_at')) {
                obj['cancelled_at'] = ApiClient.convertToType(data['cancelled_at'], 'Date');
            }
            if (data.hasOwnProperty('cancel_reason')) {
                obj['cancel_reason'] = ApiClient.convertToType(data['cancel_reason'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecurringPaymentSubject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecurringPaymentSubject</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['reference'] && !(typeof data['reference'] === 'string' || data['reference'] instanceof String)) {
            throw new Error("Expected the field `reference` to be a primitive type in the JSON string but got " + data['reference']);
        }
        // validate the optional field `status`
        if (data['status']) { // data not null
          RecurringPaymentSubjectStatus.validateJSON(data['status']);
        }
        // validate the optional field `initial_payment`
        if (data['initial_payment']) { // data not null
          PaymentSubject.validateJSON(data['initial_payment']);
        }
        // validate the optional field `last_payment`
        if (data['last_payment']) { // data not null
          PaymentSubject.validateJSON(data['last_payment']);
        }
        // validate the optional field `price`
        if (data['price']) { // data not null
          RecurringPaymentSubjectPrice.validateJSON(data['price']);
        }
        // ensure the json data is a string
        if (data['cancel_reason'] && !(typeof data['cancel_reason'] === 'string' || data['cancel_reason'] instanceof String)) {
            throw new Error("Expected the field `cancel_reason` to be a primitive type in the JSON string but got " + data['cancel_reason']);
        }

        return true;
    }


}



/**
 * @member {String} reference
 */
RecurringPaymentSubject.prototype['reference'] = undefined;

/**
 * @member {Date} created_at
 */
RecurringPaymentSubject.prototype['created_at'] = undefined;

/**
 * @member {Date} paused_at
 */
RecurringPaymentSubject.prototype['paused_at'] = undefined;

/**
 * @member {Date} paused_until
 */
RecurringPaymentSubject.prototype['paused_until'] = undefined;

/**
 * @member {Date} next_payment_at
 */
RecurringPaymentSubject.prototype['next_payment_at'] = undefined;

/**
 * @member {module:TebexCheckout/model/RecurringPaymentSubjectStatus} status
 */
RecurringPaymentSubject.prototype['status'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentSubject} initial_payment
 */
RecurringPaymentSubject.prototype['initial_payment'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentSubject} last_payment
 */
RecurringPaymentSubject.prototype['last_payment'] = undefined;

/**
 * @member {Number} fail_count
 */
RecurringPaymentSubject.prototype['fail_count'] = undefined;

/**
 * @member {module:TebexCheckout/model/RecurringPaymentSubjectPrice} price
 */
RecurringPaymentSubject.prototype['price'] = undefined;

/**
 * @member {Date} cancelled_at
 */
RecurringPaymentSubject.prototype['cancelled_at'] = undefined;

/**
 * @member {String} cancel_reason
 */
RecurringPaymentSubject.prototype['cancel_reason'] = undefined;






export default RecurringPaymentSubject;

