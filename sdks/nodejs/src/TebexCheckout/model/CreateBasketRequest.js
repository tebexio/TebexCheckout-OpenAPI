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
 * The CreateBasketRequest model module.
 * @module TebexCheckout/model/CreateBasketRequest
 * @version 1.1.2
 */
class CreateBasketRequest {
    /**
     * Constructs a new <code>CreateBasketRequest</code>.
     * @alias module:TebexCheckout/model/CreateBasketRequest
     */
    constructor() { 
        
        CreateBasketRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateBasketRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:TebexCheckout/model/CreateBasketRequest} obj Optional instance to populate.
     * @return {module:TebexCheckout/model/CreateBasketRequest} The populated <code>CreateBasketRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateBasketRequest();

            if (data.hasOwnProperty('return_url')) {
                obj['return_url'] = ApiClient.convertToType(data['return_url'], 'String');
            }
            if (data.hasOwnProperty('complete_url')) {
                obj['complete_url'] = ApiClient.convertToType(data['complete_url'], 'String');
            }
            if (data.hasOwnProperty('custom')) {
                obj['custom'] = ApiClient.convertToType(data['custom'], Object);
            }
            if (data.hasOwnProperty('first_name')) {
                obj['first_name'] = ApiClient.convertToType(data['first_name'], 'String');
            }
            if (data.hasOwnProperty('last_name')) {
                obj['last_name'] = ApiClient.convertToType(data['last_name'], 'String');
            }
            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], 'String');
            }
            if (data.hasOwnProperty('expires_at')) {
                obj['expires_at'] = ApiClient.convertToType(data['expires_at'], 'String');
            }
            if (data.hasOwnProperty('complete_auto_redirect')) {
                obj['complete_auto_redirect'] = ApiClient.convertToType(data['complete_auto_redirect'], 'Boolean');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('creator_code')) {
                obj['creator_code'] = ApiClient.convertToType(data['creator_code'], 'String');
            }
            if (data.hasOwnProperty('ip')) {
                obj['ip'] = ApiClient.convertToType(data['ip'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateBasketRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateBasketRequest</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['return_url'] && !(typeof data['return_url'] === 'string' || data['return_url'] instanceof String)) {
            throw new Error("Expected the field `return_url` to be a primitive type in the JSON string but got " + data['return_url']);
        }
        // ensure the json data is a string
        if (data['complete_url'] && !(typeof data['complete_url'] === 'string' || data['complete_url'] instanceof String)) {
            throw new Error("Expected the field `complete_url` to be a primitive type in the JSON string but got " + data['complete_url']);
        }
        // ensure the json data is a string
        if (data['first_name'] && !(typeof data['first_name'] === 'string' || data['first_name'] instanceof String)) {
            throw new Error("Expected the field `first_name` to be a primitive type in the JSON string but got " + data['first_name']);
        }
        // ensure the json data is a string
        if (data['last_name'] && !(typeof data['last_name'] === 'string' || data['last_name'] instanceof String)) {
            throw new Error("Expected the field `last_name` to be a primitive type in the JSON string but got " + data['last_name']);
        }
        // ensure the json data is a string
        if (data['email'] && !(typeof data['email'] === 'string' || data['email'] instanceof String)) {
            throw new Error("Expected the field `email` to be a primitive type in the JSON string but got " + data['email']);
        }
        // ensure the json data is a string
        if (data['expires_at'] && !(typeof data['expires_at'] === 'string' || data['expires_at'] instanceof String)) {
            throw new Error("Expected the field `expires_at` to be a primitive type in the JSON string but got " + data['expires_at']);
        }
        // ensure the json data is a string
        if (data['country'] && !(typeof data['country'] === 'string' || data['country'] instanceof String)) {
            throw new Error("Expected the field `country` to be a primitive type in the JSON string but got " + data['country']);
        }
        // ensure the json data is a string
        if (data['creator_code'] && !(typeof data['creator_code'] === 'string' || data['creator_code'] instanceof String)) {
            throw new Error("Expected the field `creator_code` to be a primitive type in the JSON string but got " + data['creator_code']);
        }
        // ensure the json data is a string
        if (data['ip'] && !(typeof data['ip'] === 'string' || data['ip'] instanceof String)) {
            throw new Error("Expected the field `ip` to be a primitive type in the JSON string but got " + data['ip']);
        }

        return true;
    }


}



/**
 * The URL a customer can return to without completing checkout
 * @member {String} return_url
 */
CreateBasketRequest.prototype['return_url'] = undefined;

/**
 * URL the customer can return to after completing payment
 * @member {String} complete_url
 */
CreateBasketRequest.prototype['complete_url'] = undefined;

/**
 * Any custom data to be passed through the request. This will be returned in a post-completion webhook.
 * @member {Object} custom
 */
CreateBasketRequest.prototype['custom'] = undefined;

/**
 * The first name of the customer
 * @member {String} first_name
 */
CreateBasketRequest.prototype['first_name'] = undefined;

/**
 * The last name of the customer
 * @member {String} last_name
 */
CreateBasketRequest.prototype['last_name'] = undefined;

/**
 * The email address of the customer
 * @member {String} email
 */
CreateBasketRequest.prototype['email'] = undefined;

/**
 * An ISO8601 formatted date. After this date the basket cannot be used to checkout.
 * @member {String} expires_at
 */
CreateBasketRequest.prototype['expires_at'] = undefined;

/**
 * Automatically redirect to the complete_url provided
 * @member {Boolean} complete_auto_redirect
 */
CreateBasketRequest.prototype['complete_auto_redirect'] = undefined;

/**
 * An ISO 3166-1 alpha-2 character code representing the customer's country.
 * @member {String} country
 */
CreateBasketRequest.prototype['country'] = undefined;

/**
 * The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes
 * @member {String} creator_code
 */
CreateBasketRequest.prototype['creator_code'] = undefined;

/**
 * The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend.
 * @member {String} ip
 */
CreateBasketRequest.prototype['ip'] = undefined;






export default CreateBasketRequest;

