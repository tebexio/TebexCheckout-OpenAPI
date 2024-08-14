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
 * The RecurringPaymentStatus model module.
 * @module TebexCheckout/model/RecurringPaymentStatus
 * @version 1.1.2
 */
class RecurringPaymentStatus {
    /**
     * Constructs a new <code>RecurringPaymentStatus</code>.
     * @alias module:TebexCheckout/model/RecurringPaymentStatus
     */
    constructor() { 
        
        RecurringPaymentStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecurringPaymentStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/RecurringPaymentStatus} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/RecurringPaymentStatus} The populated <code>RecurringPaymentStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecurringPaymentStatus();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('class')) {
                obj['class'] = ApiClient.convertToType(data['class'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecurringPaymentStatus</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecurringPaymentStatus</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['class'] && !(typeof data['class'] === 'string' || data['class'] instanceof String)) {
            throw new Error("Expected the field `class` to be a primitive type in the JSON string but got " + data['class']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }

        return true;
    }


}



/**
 * @member {Number} id
 */
RecurringPaymentStatus.prototype['id'] = undefined;

/**
 * @member {String} class
 */
RecurringPaymentStatus.prototype['class'] = undefined;

/**
 * @member {String} description
 */
RecurringPaymentStatus.prototype['description'] = undefined;

/**
 * @member {Number} active
 */
RecurringPaymentStatus.prototype['active'] = undefined;






export default RecurringPaymentStatus;

