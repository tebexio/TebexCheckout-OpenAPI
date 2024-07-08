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
import BasketRowMetaLimits from './BasketRowMetaLimits';

/**
 * The BasketRowMeta model module.
 * @module TebexCheckout/model/BasketRowMeta
 * @version 1.1.0
 */
class BasketRowMeta {
    /**
     * Constructs a new <code>BasketRowMeta</code>.
     * @alias module:TebexCheckout/model/BasketRowMeta
     */
    constructor() { 
        
        BasketRowMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasketRowMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/BasketRowMeta} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/BasketRowMeta} The populated <code>BasketRowMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasketRowMeta();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('rowprice')) {
                obj['rowprice'] = ApiClient.convertToType(data['rowprice'], 'Number');
            }
            if (data.hasOwnProperty('initialprice')) {
                obj['initialprice'] = ApiClient.convertToType(data['initialprice'], 'Number');
            }
            if (data.hasOwnProperty('isCumulative')) {
                obj['isCumulative'] = ApiClient.convertToType(data['isCumulative'], 'Boolean');
            }
            if (data.hasOwnProperty('requiredPackages')) {
                obj['requiredPackages'] = ApiClient.convertToType(data['requiredPackages'], ['Number']);
            }
            if (data.hasOwnProperty('requiresAny')) {
                obj['requiresAny'] = ApiClient.convertToType(data['requiresAny'], 'Boolean');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'Boolean');
            }
            if (data.hasOwnProperty('producesGiftCard')) {
                obj['producesGiftCard'] = ApiClient.convertToType(data['producesGiftCard'], 'Boolean');
            }
            if (data.hasOwnProperty('allowsGiftCards')) {
                obj['allowsGiftCards'] = ApiClient.convertToType(data['allowsGiftCards'], 'Boolean');
            }
            if (data.hasOwnProperty('servers')) {
                obj['servers'] = ApiClient.convertToType(data['servers'], ['Number']);
            }
            if (data.hasOwnProperty('limits')) {
                obj['limits'] = BasketRowMetaLimits.constructFromObject(data['limits']);
            }
            if (data.hasOwnProperty('hasDeliverables')) {
                obj['hasDeliverables'] = ApiClient.convertToType(data['hasDeliverables'], 'Boolean');
            }
            if (data.hasOwnProperty('deliverableTypes')) {
                obj['deliverableTypes'] = ApiClient.convertToType(data['deliverableTypes'], ['String']);
            }
            if (data.hasOwnProperty('downloadLink')) {
                obj['downloadLink'] = ApiClient.convertToType(data['downloadLink'], 'String');
            }
            if (data.hasOwnProperty('hasSellerProtection')) {
                obj['hasSellerProtection'] = ApiClient.convertToType(data['hasSellerProtection'], 'Boolean');
            }
            if (data.hasOwnProperty('itemType')) {
                obj['itemType'] = ApiClient.convertToType(data['itemType'], 'String');
            }
            if (data.hasOwnProperty('revenue_share')) {
                obj['revenue_share'] = ApiClient.convertToType(data['revenue_share'], ['Number']);
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = ApiClient.convertToType(data['image'], 'String');
            }
            if (data.hasOwnProperty('realprice')) {
                obj['realprice'] = ApiClient.convertToType(data['realprice'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BasketRowMeta</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BasketRowMeta</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['requiredPackages'])) {
            throw new Error("Expected the field `requiredPackages` to be an array in the JSON data but got " + data['requiredPackages']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['servers'])) {
            throw new Error("Expected the field `servers` to be an array in the JSON data but got " + data['servers']);
        }
        // validate the optional field `limits`
        if (data['limits']) { // data not null
          BasketRowMetaLimits.validateJSON(data['limits']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['deliverableTypes'])) {
            throw new Error("Expected the field `deliverableTypes` to be an array in the JSON data but got " + data['deliverableTypes']);
        }
        // ensure the json data is a string
        if (data['downloadLink'] && !(typeof data['downloadLink'] === 'string' || data['downloadLink'] instanceof String)) {
            throw new Error("Expected the field `downloadLink` to be a primitive type in the JSON string but got " + data['downloadLink']);
        }
        // ensure the json data is a string
        if (data['itemType'] && !(typeof data['itemType'] === 'string' || data['itemType'] instanceof String)) {
            throw new Error("Expected the field `itemType` to be a primitive type in the JSON string but got " + data['itemType']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['revenue_share'])) {
            throw new Error("Expected the field `revenue_share` to be an array in the JSON data but got " + data['revenue_share']);
        }
        // ensure the json data is a string
        if (data['image'] && !(typeof data['image'] === 'string' || data['image'] instanceof String)) {
            throw new Error("Expected the field `image` to be a primitive type in the JSON string but got " + data['image']);
        }

        return true;
    }


}



/**
 * @member {String} name
 */
BasketRowMeta.prototype['name'] = undefined;

/**
 * @member {Number} rowprice
 */
BasketRowMeta.prototype['rowprice'] = undefined;

/**
 * @member {Number} initialprice
 */
BasketRowMeta.prototype['initialprice'] = undefined;

/**
 * @member {Boolean} isCumulative
 */
BasketRowMeta.prototype['isCumulative'] = undefined;

/**
 * @member {Array.<Number>} requiredPackages
 */
BasketRowMeta.prototype['requiredPackages'] = undefined;

/**
 * @member {Boolean} requiresAny
 */
BasketRowMeta.prototype['requiresAny'] = undefined;

/**
 * @member {Boolean} category
 */
BasketRowMeta.prototype['category'] = undefined;

/**
 * @member {Boolean} producesGiftCard
 */
BasketRowMeta.prototype['producesGiftCard'] = undefined;

/**
 * @member {Boolean} allowsGiftCards
 */
BasketRowMeta.prototype['allowsGiftCards'] = undefined;

/**
 * @member {Array.<Number>} servers
 */
BasketRowMeta.prototype['servers'] = undefined;

/**
 * @member {module:TebexCheckout/model/BasketRowMetaLimits} limits
 */
BasketRowMeta.prototype['limits'] = undefined;

/**
 * @member {Boolean} hasDeliverables
 */
BasketRowMeta.prototype['hasDeliverables'] = undefined;

/**
 * @member {Array.<String>} deliverableTypes
 */
BasketRowMeta.prototype['deliverableTypes'] = undefined;

/**
 * @member {String} downloadLink
 */
BasketRowMeta.prototype['downloadLink'] = undefined;

/**
 * @member {Boolean} hasSellerProtection
 */
BasketRowMeta.prototype['hasSellerProtection'] = undefined;

/**
 * @member {String} itemType
 */
BasketRowMeta.prototype['itemType'] = undefined;

/**
 * @member {Array.<Number>} revenue_share
 */
BasketRowMeta.prototype['revenue_share'] = undefined;

/**
 * @member {String} image
 */
BasketRowMeta.prototype['image'] = undefined;

/**
 * @member {Number} realprice
 */
BasketRowMeta.prototype['realprice'] = undefined;






export default BasketRowMeta;

