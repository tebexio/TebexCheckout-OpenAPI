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
    instance = new TebexCheckoutApi.RecurringPayment();
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

  describe('RecurringPayment', function() {
    it('should create an instance of RecurringPayment', function() {
      // uncomment below and update the code to test RecurringPayment
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be.a(TebexCheckoutApi.RecurringPayment);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property createdAt (base name: "created_at")', function() {
      // uncomment below and update the code to test the property createdAt
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property updatedAt (base name: "updated_at")', function() {
      // uncomment below and update the code to test the property updatedAt
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property pausedAt (base name: "paused_at")', function() {
      // uncomment below and update the code to test the property pausedAt
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property pausedUntil (base name: "paused_until")', function() {
      // uncomment below and update the code to test the property pausedUntil
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property nextPaymentDate (base name: "next_payment_date")', function() {
      // uncomment below and update the code to test the property nextPaymentDate
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property reference (base name: "reference")', function() {
      // uncomment below and update the code to test the property reference
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property interval (base name: "interval")', function() {
      // uncomment below and update the code to test the property interval
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property cancelledAt (base name: "cancelled_at")', function() {
      // uncomment below and update the code to test the property cancelledAt
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property amount (base name: "amount")', function() {
      // uncomment below and update the code to test the property amount
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property cancelReason (base name: "cancel_reason")', function() {
      // uncomment below and update the code to test the property cancelReason
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

    it('should have the property links (base name: "links")', function() {
      // uncomment below and update the code to test the property links
      //var instance = new TebexCheckoutApi.RecurringPayment();
      //expect(instance).to.be();
    });

  });

}));
