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
 * The PaymentPaymentMethod model module.
 * @module TebexCheckout/model/PaymentPaymentMethod
 * @version 1.1.2
 */
class PaymentPaymentMethod {
    /**
     * Constructs a new <code>PaymentPaymentMethod</code>.
     * @alias module:TebexCheckout/model/PaymentPaymentMethod
     */
    constructor() { 
        
        PaymentPaymentMethod.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaymentPaymentMethod</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/PaymentPaymentMethod} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/PaymentPaymentMethod} The populated <code>PaymentPaymentMethod</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaymentPaymentMethod();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], Object);
            }
            if (data.hasOwnProperty('refundable')) {
                obj['refundable'] = ApiClient.convertToType(data['refundable'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PaymentPaymentMethod</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PaymentPaymentMethod</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * @member {Object} name
 */
PaymentPaymentMethod.prototype['name'] = undefined;

/**
 * @member {Boolean} refundable
 */
PaymentPaymentMethod.prototype['refundable'] = undefined;






export default PaymentPaymentMethod;

