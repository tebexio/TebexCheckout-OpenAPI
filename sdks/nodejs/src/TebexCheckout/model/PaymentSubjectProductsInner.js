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
import PaymentFeesTax from './PaymentFeesTax';
import PaymentSubjectPrice from './PaymentSubjectPrice';

/**
 * The PaymentSubjectProductsInner model module.
 * @module TebexCheckout/model/PaymentSubjectProductsInner
 * @version 1.1.2
 */
class PaymentSubjectProductsInner {
    /**
     * Constructs a new <code>PaymentSubjectProductsInner</code>.
     * @alias module:TebexCheckout/model/PaymentSubjectProductsInner
     */
    constructor() { 
        
        PaymentSubjectProductsInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaymentSubjectProductsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/PaymentSubjectProductsInner} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/PaymentSubjectProductsInner} The populated <code>PaymentSubjectProductsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaymentSubjectProductsInner();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('quantity')) {
                obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
            }
            if (data.hasOwnProperty('base_price')) {
                obj['base_price'] = PaymentSubjectPrice.constructFromObject(data['base_price']);
            }
            if (data.hasOwnProperty('paid_price')) {
                obj['paid_price'] = PaymentFeesTax.constructFromObject(data['paid_price']);
            }
            if (data.hasOwnProperty('variables')) {
                obj['variables'] = ApiClient.convertToType(data['variables'], [Object]);
            }
            if (data.hasOwnProperty('expires_at')) {
                obj['expires_at'] = ApiClient.convertToType(data['expires_at'], 'Date');
            }
            if (data.hasOwnProperty('custom')) {
                obj['custom'] = ApiClient.convertToType(data['custom'], Object);
            }
            if (data.hasOwnProperty('username')) {
                obj['username'] = ApiClient.convertToType(data['username'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PaymentSubjectProductsInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PaymentSubjectProductsInner</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // validate the optional field `base_price`
        if (data['base_price']) { // data not null
          PaymentSubjectPrice.validateJSON(data['base_price']);
        }
        // validate the optional field `paid_price`
        if (data['paid_price']) { // data not null
          PaymentFeesTax.validateJSON(data['paid_price']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['variables'])) {
            throw new Error("Expected the field `variables` to be an array in the JSON data but got " + data['variables']);
        }
        // ensure the json data is a string
        if (data['username'] && !(typeof data['username'] === 'string' || data['username'] instanceof String)) {
            throw new Error("Expected the field `username` to be a primitive type in the JSON string but got " + data['username']);
        }

        return true;
    }


}



/**
 * @member {Number} id
 */
PaymentSubjectProductsInner.prototype['id'] = undefined;

/**
 * @member {String} name
 */
PaymentSubjectProductsInner.prototype['name'] = undefined;

/**
 * @member {Number} quantity
 */
PaymentSubjectProductsInner.prototype['quantity'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentSubjectPrice} base_price
 */
PaymentSubjectProductsInner.prototype['base_price'] = undefined;

/**
 * @member {module:TebexCheckout/model/PaymentFeesTax} paid_price
 */
PaymentSubjectProductsInner.prototype['paid_price'] = undefined;

/**
 * @member {Array.<Object>} variables
 */
PaymentSubjectProductsInner.prototype['variables'] = undefined;

/**
 * @member {Date} expires_at
 */
PaymentSubjectProductsInner.prototype['expires_at'] = undefined;

/**
 * @member {Object} custom
 */
PaymentSubjectProductsInner.prototype['custom'] = undefined;

/**
 * @member {String} username
 */
PaymentSubjectProductsInner.prototype['username'] = undefined;






export default PaymentSubjectProductsInner;

