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
 * The Sale model module.
 * @module TebexCheckout/model/Sale
 * @version 1.1.0
 */
class Sale {
    /**
     * Constructs a new <code>Sale</code>.
     * @alias module:TebexCheckout/model/Sale
     */
    constructor() { 
        
        Sale.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Sale</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/Sale} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/Sale} The populated <code>Sale</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Sale();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('discount_type')) {
                obj['discount_type'] = ApiClient.convertToType(data['discount_type'], 'String');
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Sale</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Sale</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['discount_type'] && !(typeof data['discount_type'] === 'string' || data['discount_type'] instanceof String)) {
            throw new Error("Expected the field `discount_type` to be a primitive type in the JSON string but got " + data['discount_type']);
        }

        return true;
    }


}



/**
 * The name of the sale (displayed to the customer)
 * @member {String} name
 */
Sale.prototype['name'] = undefined;

/**
 * The type of discount, either `percentage` for deducting a percentage of each item, or `amount` to deduct a fixed amount from each item.
 * @member {module:TebexCheckout/model/Sale.DiscountTypeEnum} discount_type
 */
Sale.prototype['discount_type'] = undefined;

/**
 * The amount or percentage to deduct
 * @member {Number} amount
 */
Sale.prototype['amount'] = undefined;





/**
 * Allowed values for the <code>discount_type</code> property.
 * @enum {String}
 * @readonly
 */
Sale['DiscountTypeEnum'] = {

    /**
     * value: "percentage"
     * @const
     */
    "percentage": "percentage",

    /**
     * value: "amount"
     * @const
     */
    "amount": "amount"
};



export default Sale;

