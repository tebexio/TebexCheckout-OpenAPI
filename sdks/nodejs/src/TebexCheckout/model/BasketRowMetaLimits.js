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
import BasketRowMetaLimitsUser from './BasketRowMetaLimitsUser';

/**
 * The BasketRowMetaLimits model module.
 * @module TebexCheckout/model/BasketRowMetaLimits
 * @version 1.1.2
 */
class BasketRowMetaLimits {
    /**
     * Constructs a new <code>BasketRowMetaLimits</code>.
     * @alias module:TebexCheckout/model/BasketRowMetaLimits
     */
    constructor() { 
        
        BasketRowMetaLimits.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasketRowMetaLimits</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/BasketRowMetaLimits} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/BasketRowMetaLimits} The populated <code>BasketRowMetaLimits</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasketRowMetaLimits();

            if (data.hasOwnProperty('user')) {
                obj['user'] = BasketRowMetaLimitsUser.constructFromObject(data['user']);
            }
            if (data.hasOwnProperty('global')) {
                obj['global'] = BasketRowMetaLimitsUser.constructFromObject(data['global']);
            }
            if (data.hasOwnProperty('packageExpiryTime')) {
                obj['packageExpiryTime'] = ApiClient.convertToType(data['packageExpiryTime'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BasketRowMetaLimits</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BasketRowMetaLimits</code>.
     */
    static validateJSON(data) {
        // validate the optional field `user`
        if (data['user']) { // data not null
          BasketRowMetaLimitsUser.validateJSON(data['user']);
        }
        // validate the optional field `global`
        if (data['global']) { // data not null
          BasketRowMetaLimitsUser.validateJSON(data['global']);
        }

        return true;
    }


}



/**
 * @member {module:TebexCheckout/model/BasketRowMetaLimitsUser} user
 */
BasketRowMetaLimits.prototype['user'] = undefined;

/**
 * @member {module:TebexCheckout/model/BasketRowMetaLimitsUser} global
 */
BasketRowMetaLimits.prototype['global'] = undefined;

/**
 * @member {Number} packageExpiryTime
 */
BasketRowMetaLimits.prototype['packageExpiryTime'] = undefined;






export default BasketRowMetaLimits;

