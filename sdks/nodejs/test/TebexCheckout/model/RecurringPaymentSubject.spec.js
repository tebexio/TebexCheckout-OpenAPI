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
    instance = new TebexCheckoutApi.RecurringPaymentSubject();
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

  describe('RecurringPaymentSubject', function() {
    it('should create an instance of RecurringPaymentSubject', function() {
      // uncomment below and update the code to test RecurringPaymentSubject
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be.a(TebexCheckoutApi.RecurringPaymentSubject);
    });

    it('should have the property reference (base name: "reference")', function() {
      // uncomment below and update the code to test the property reference
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property createdAt (base name: "created_at")', function() {
      // uncomment below and update the code to test the property createdAt
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property pausedAt (base name: "paused_at")', function() {
      // uncomment below and update the code to test the property pausedAt
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property pausedUntil (base name: "paused_until")', function() {
      // uncomment below and update the code to test the property pausedUntil
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property nextPaymentAt (base name: "next_payment_at")', function() {
      // uncomment below and update the code to test the property nextPaymentAt
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property initialPayment (base name: "initial_payment")', function() {
      // uncomment below and update the code to test the property initialPayment
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property lastPayment (base name: "last_payment")', function() {
      // uncomment below and update the code to test the property lastPayment
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property failCount (base name: "fail_count")', function() {
      // uncomment below and update the code to test the property failCount
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property cancelledAt (base name: "cancelled_at")', function() {
      // uncomment below and update the code to test the property cancelledAt
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

    it('should have the property cancelReason (base name: "cancel_reason")', function() {
      // uncomment below and update the code to test the property cancelReason
      //var instance = new TebexCheckoutApi.RecurringPaymentSubject();
      //expect(instance).to.be();
    });

  });

}));
