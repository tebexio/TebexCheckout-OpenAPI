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
import Package from './Package';
import RevenueShare from './RevenueShare';

/**
 * The AddPackageRequest model module.
 * @module TebexCheckout/model/AddPackageRequest
 * @version 1.1.0
 */
class AddPackageRequest {
    /**
     * Constructs a new <code>AddPackageRequest</code>.
     * @alias module:TebexCheckout/model/AddPackageRequest
     */
    constructor() { 
        
        AddPackageRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AddPackageRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/AddPackageRequest} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/AddPackageRequest} The populated <code>AddPackageRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AddPackageRequest();

            if (data.hasOwnProperty('package')) {
                obj['package'] = Package.constructFromObject(data['package']);
            }
            if (data.hasOwnProperty('qty')) {
                obj['qty'] = ApiClient.convertToType(data['qty'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('revenue_share')) {
                obj['revenue_share'] = ApiClient.convertToType(data['revenue_share'], [RevenueShare]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AddPackageRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AddPackageRequest</code>.
     */
    static validateJSON(data) {
        // validate the optional field `package`
        if (data['package']) { // data not null
          Package.validateJSON(data['package']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        if (data['revenue_share']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['revenue_share'])) {
                throw new Error("Expected the field `revenue_share` to be an array in the JSON data but got " + data['revenue_share']);
            }
            // validate the optional field `revenue_share` (array)
            for (const item of data['revenue_share']) {
                RevenueShare.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * @member {module:TebexCheckout/model/Package} package
 */
AddPackageRequest.prototype['package'] = undefined;

/**
 * The quantity of `package` in this basket. This is not the total quantity of overall items in the basket.
 * @member {Number} qty
 */
AddPackageRequest.prototype['qty'] = undefined;

/**
 * The type of payment, either `single` for one-time payments or `subscription`.
 * @member {module:TebexCheckout/model/AddPackageRequest.TypeEnum} type
 */
AddPackageRequest.prototype['type'] = undefined;

/**
 * An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.**
 * @member {Array.<module:TebexCheckout/model/RevenueShare>} revenue_share
 */
AddPackageRequest.prototype['revenue_share'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
AddPackageRequest['TypeEnum'] = {

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



export default AddPackageRequest;

