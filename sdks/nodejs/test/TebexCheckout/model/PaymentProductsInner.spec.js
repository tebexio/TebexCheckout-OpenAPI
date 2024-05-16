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
    instance = new TebexCheckoutApi.PaymentProductsInner();
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

  describe('PaymentProductsInner', function() {
    it('should create an instance of PaymentProductsInner', function() {
      // uncomment below and update the code to test PaymentProductsInner
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be.a(TebexCheckoutApi.PaymentProductsInner);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property quantity (base name: "quantity")', function() {
      // uncomment below and update the code to test the property quantity
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property basePrice (base name: "base_price")', function() {
      // uncomment below and update the code to test the property basePrice
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property paidPrice (base name: "paid_price")', function() {
      // uncomment below and update the code to test the property paidPrice
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property variables (base name: "variables")', function() {
      // uncomment below and update the code to test the property variables
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property expiresAt (base name: "expires_at")', function() {
      // uncomment below and update the code to test the property expiresAt
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property custom (base name: "custom")', function() {
      // uncomment below and update the code to test the property custom
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

    it('should have the property username (base name: "username")', function() {
      // uncomment below and update the code to test the property username
      //var instance = new TebexCheckoutApi.PaymentProductsInner();
      //expect(instance).to.be();
    });

  });

}));