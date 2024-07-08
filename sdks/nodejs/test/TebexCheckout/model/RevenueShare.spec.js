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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/TebexCheckout/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/TebexCheckout/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.TebexCheckoutApi);
  }
}(this, function(expect, TebexCheckoutApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new TebexCheckoutApi.RevenueShare();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('RevenueShare', function() {
    it('should create an instance of RevenueShare', function() {
      // uncomment below and update the code to test RevenueShare
      //var instance = new TebexCheckoutApi.RevenueShare();
      //expect(instance).to.be.a(TebexCheckoutApi.RevenueShare);
    });

    it('should have the property walletRef (base name: "wallet_ref")', function() {
      // uncomment below and update the code to test the property walletRef
      //var instance = new TebexCheckoutApi.RevenueShare();
      //expect(instance).to.be();
    });

    it('should have the property amount (base name: "amount")', function() {
      // uncomment below and update the code to test the property amount
      //var instance = new TebexCheckoutApi.RevenueShare();
      //expect(instance).to.be();
    });

    it('should have the property gatewayFeePercent (base name: "gateway_fee_percent")', function() {
      // uncomment below and update the code to test the property gatewayFeePercent
      //var instance = new TebexCheckoutApi.RevenueShare();
      //expect(instance).to.be();
    });

  });

}));
