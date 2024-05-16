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


import ApiClient from "../ApiClient";
import AddPackageRequest from '../model/AddPackageRequest';
import Basket from '../model/Basket';
import CreateBasketRequest from '../model/CreateBasketRequest';
import ErrorResponse from '../model/ErrorResponse';
import Sale from '../model/Sale';

/**
* Baskets service.
* @module TebexCheckout/TebexCheckout/BasketsApi
* @version 1.0.0
*/
export default class BasketsApi {

    /**
    * Constructs a new BasketsApi. 
    * @alias module:TebexCheckout/TebexCheckout/BasketsApi
    * @class
    * @param {module:TebexCheckout/ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:TebexCheckout/ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the addPackage operation.
     * @callback module:TebexCheckout/TebexCheckout/BasketsApi~addPackageCallback
     * @param {String} error Error message, if any.
     * @param {module:TebexCheckout/model/Basket} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a package to the basket
     * This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
     * @param {String} ident The basket identifier.
     * @param {Object} opts Optional parameters
     * @param {module:TebexCheckout/model/AddPackageRequest} [addPackageRequest] 
     * @param {module:TebexCheckout/TebexCheckout/BasketsApi~addPackageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:TebexCheckout/model/Basket}
     */
    addPackage(ident, opts, callback) {
      opts = opts || {};
      let postBody = opts['addPackageRequest'];
      // verify the required parameter 'ident' is set
      if (ident === undefined || ident === null) {
        throw new Error("Missing the required parameter 'ident' when calling addPackage");
      }

      let pathParams = {
        'ident': ident
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Basket;
      return this.apiClient.callApi(
        '/baskets/{ident}/packages', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the addSaleToBasket operation.
     * @callback module:TebexCheckout/TebexCheckout/BasketsApi~addSaleToBasketCallback
     * @param {String} error Error message, if any.
     * @param {module:TebexCheckout/model/Basket} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a sale to the basket
     * Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
     * @param {String} ident The basket identifier.
     * @param {Object} opts Optional parameters
     * @param {module:TebexCheckout/model/Sale} [sale] Provide a `Sale` as an object to apply it to the basket.
     * @param {module:TebexCheckout/TebexCheckout/BasketsApi~addSaleToBasketCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:TebexCheckout/model/Basket}
     */
    addSaleToBasket(ident, opts, callback) {
      opts = opts || {};
      let postBody = opts['sale'];
      // verify the required parameter 'ident' is set
      if (ident === undefined || ident === null) {
        throw new Error("Missing the required parameter 'ident' when calling addSaleToBasket");
      }

      let pathParams = {
        'ident': ident
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Basket;
      return this.apiClient.callApi(
        '/baskets/{ident}/sales', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createBasket operation.
     * @callback module:TebexCheckout/TebexCheckout/BasketsApi~createBasketCallback
     * @param {String} error Error message, if any.
     * @param {module:TebexCheckout/model/Basket} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a basket that can be used to pay for items
     * This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
     * @param {Object} opts Optional parameters
     * @param {module:TebexCheckout/model/CreateBasketRequest} [createBasketRequest] Create a basket, returning the full basket object and payment link.
     * @param {module:TebexCheckout/TebexCheckout/BasketsApi~createBasketCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:TebexCheckout/model/Basket}
     */
    createBasket(opts, callback) {
      opts = opts || {};
      let postBody = opts['createBasketRequest'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Basket;
      return this.apiClient.callApi(
        '/baskets', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getBasketById operation.
     * @callback module:TebexCheckout/TebexCheckout/BasketsApi~getBasketByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:TebexCheckout/model/Basket} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch a basket by its identifier
     * Gets the basket associated with the provided identifier.
     * @param {String} ident The basket identifier.
     * @param {module:TebexCheckout/TebexCheckout/BasketsApi~getBasketByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:TebexCheckout/model/Basket}
     */
    getBasketById(ident, callback) {
      let postBody = null;
      // verify the required parameter 'ident' is set
      if (ident === undefined || ident === null) {
        throw new Error("Missing the required parameter 'ident' when calling getBasketById");
      }

      let pathParams = {
        'ident': ident
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Basket;
      return this.apiClient.callApi(
        '/baskets/{ident}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the removeRowFromBasket operation.
     * @callback module:TebexCheckout/TebexCheckout/BasketsApi~removeRowFromBasketCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Remove a row from the basket
     * This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
     * @param {String} ident The basket identifier.
     * @param {Number} rowId The `id` of the `basket.rows` row to remove.
     * @param {module:TebexCheckout/TebexCheckout/BasketsApi~removeRowFromBasketCallback} callback The callback function, accepting three arguments: error, data, response
     */
    removeRowFromBasket(ident, rowId, callback) {
      let postBody = null;
      // verify the required parameter 'ident' is set
      if (ident === undefined || ident === null) {
        throw new Error("Missing the required parameter 'ident' when calling removeRowFromBasket");
      }
      // verify the required parameter 'rowId' is set
      if (rowId === undefined || rowId === null) {
        throw new Error("Missing the required parameter 'rowId' when calling removeRowFromBasket");
      }

      let pathParams = {
        'ident': ident,
        'row.id': rowId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/baskets/{ident}/packages/{row.id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}