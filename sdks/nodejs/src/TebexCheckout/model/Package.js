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

/**
 * The Package model module.
 * @module TebexCheckout/model/Package
 * @version 1.1.0
 */
class Package {
    /**
     * Constructs a new <code>Package</code>.
     * @alias module:TebexCheckout/model/Package
     */
    constructor() { 
        
        Package.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Package</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/Package} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/Package} The populated <code>Package</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Package();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('qty')) {
                obj['qty'] = ApiClient.convertToType(data['qty'], 'Number');
            }
            if (data.hasOwnProperty('expiry_period')) {
                obj['expiry_period'] = ApiClient.convertToType(data['expiry_period'], 'String');
            }
            if (data.hasOwnProperty('expiry_length')) {
                obj['expiry_length'] = ApiClient.convertToType(data['expiry_length'], 'Number');
            }
            if (data.hasOwnProperty('custom')) {
                obj['custom'] = ApiClient.convertToType(data['custom'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Package</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Package</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // ensure the json data is a string
        if (data['expiry_period'] && !(typeof data['expiry_period'] === 'string' || data['expiry_period'] instanceof String)) {
            throw new Error("Expected the field `expiry_period` to be a primitive type in the JSON string but got " + data['expiry_period']);
        }

        return true;
    }


}



/**
 * The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts.
 * @member {String} name
 */
Package.prototype['name'] = undefined;

/**
 * A float (decimal describing the price of the package in your account currency)
 * @member {Number} price
 */
Package.prototype['price'] = undefined;

/**
 * @member {module:TebexCheckout/model/Package.TypeEnum} type
 */
Package.prototype['type'] = undefined;

/**
 * @member {Number} qty
 */
Package.prototype['qty'] = undefined;

/**
 * The renewal period of this item
 * @member {module:TebexCheckout/model/Package.ExpiryPeriodEnum} expiry_period
 */
Package.prototype['expiry_period'] = undefined;

/**
 * An integer representing the number of `expiry_periods` that make up the renewal period.
 * @member {Number} expiry_length
 */
Package.prototype['expiry_length'] = undefined;

/**
 * A map of data that is passed back to you via the webhook (for example, a tracking ID)
 * @member {Object} custom
 */
Package.prototype['custom'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
Package['TypeEnum'] = {

    /**
     * value: "single"
     * @const
     */
    "single": "single",

    /**
     * value: "subscription"
     * @const
     */
    "subscription": "subscription"
};


/**
 * Allowed values for the <code>expiry_period</code> property.
 * @enum {String}
 * @readonly
 */
Package['ExpiryPeriodEnum'] = {

    /**
     * value: "day"
     * @const
     */
    "day": "day",

    /**
     * value: "month"
     * @const
     */
    "month": "month",

    /**
     * value: "year"
     * @const
     */
    "year": "year"
};



export default Package;

