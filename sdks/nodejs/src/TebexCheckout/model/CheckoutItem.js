/**
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Package from './Package';

/**
 * The CheckoutItem model module.
 * @module TebexCheckout/model/CheckoutItem
 * @version 1.0.0
 */
class CheckoutItem {
    /**
     * Constructs a new <code>CheckoutItem</code>.
     * An item added to a basket as part of the &#x60;/checkout&#x60; request.
     * @alias module:TebexCheckout/model/CheckoutItem
     */
    constructor() { 
        
        CheckoutItem.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CheckoutItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/CheckoutItem} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/CheckoutItem} The populated <code>CheckoutItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CheckoutItem();

            if (data.hasOwnProperty('package')) {
                obj['package'] = Package.constructFromObject(data['package']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CheckoutItem</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CheckoutItem</code>.
     */
    static validateJSON(data) {
        // validate the optional field `package`
        if (data['package']) { // data not null
          Package.validateJSON(data['package']);
        }

        return true;
    }


}



/**
 * @member {module:TebexCheckout/model/Package} package
 */
CheckoutItem.prototype['package'] = undefined;






export default CheckoutItem;

