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
 * The BasketRowMetaLimitsUser model module.
 * @module TebexCheckout/model/BasketRowMetaLimitsUser
 * @version 1.1.2
 */
class BasketRowMetaLimitsUser {
    /**
     * Constructs a new <code>BasketRowMetaLimitsUser</code>.
     * @alias module:TebexCheckout/model/BasketRowMetaLimitsUser
     */
    constructor() { 
        
        BasketRowMetaLimitsUser.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasketRowMetaLimitsUser</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/BasketRowMetaLimitsUser} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/BasketRowMetaLimitsUser} The populated <code>BasketRowMetaLimitsUser</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasketRowMetaLimitsUser();

            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ApiClient.convertToType(data['enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Number');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BasketRowMetaLimitsUser</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BasketRowMetaLimitsUser</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * @member {Boolean} enabled
 */
BasketRowMetaLimitsUser.prototype['enabled'] = undefined;

/**
 * @member {Number} timestamp
 */
BasketRowMetaLimitsUser.prototype['timestamp'] = undefined;

/**
 * @member {Boolean} limit
 */
BasketRowMetaLimitsUser.prototype['limit'] = undefined;






export default BasketRowMetaLimitsUser;

