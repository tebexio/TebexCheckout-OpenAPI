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

/**
 * The RecurringPaymentLinks model module.
 * @module TebexCheckout/model/RecurringPaymentLinks
 * @version 1.1.2
 */
class RecurringPaymentLinks {
    /**
     * Constructs a new <code>RecurringPaymentLinks</code>.
     * @alias module:TebexCheckout/model/RecurringPaymentLinks
     */
    constructor() { 
        
        RecurringPaymentLinks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecurringPaymentLinks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/RecurringPaymentLinks} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/RecurringPaymentLinks} The populated <code>RecurringPaymentLinks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecurringPaymentLinks();

            if (data.hasOwnProperty('initial_payment')) {
                obj['initial_payment'] = ApiClient.convertToType(data['initial_payment'], 'String');
            }
            if (data.hasOwnProperty('payment_history')) {
                obj['payment_history'] = ApiClient.convertToType(data['payment_history'], ['String']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecurringPaymentLinks</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecurringPaymentLinks</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['initial_payment'] && !(typeof data['initial_payment'] === 'string' || data['initial_payment'] instanceof String)) {
            throw new Error("Expected the field `initial_payment` to be a primitive type in the JSON string but got " + data['initial_payment']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['payment_history'])) {
            throw new Error("Expected the field `payment_history` to be an array in the JSON data but got " + data['payment_history']);
        }

        return true;
    }


}



/**
 * @member {String} initial_payment
 */
RecurringPaymentLinks.prototype['initial_payment'] = undefined;

/**
 * @member {Array.<String>} payment_history
 */
RecurringPaymentLinks.prototype['payment_history'] = undefined;






export default RecurringPaymentLinks;

