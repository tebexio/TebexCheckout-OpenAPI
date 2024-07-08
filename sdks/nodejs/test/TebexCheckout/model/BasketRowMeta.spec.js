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
    instance = new TebexCheckoutApi.BasketRowMeta();
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

  describe('BasketRowMeta', function() {
    it('should create an instance of BasketRowMeta', function() {
      // uncomment below and update the code to test BasketRowMeta
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be.a(TebexCheckoutApi.BasketRowMeta);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property rowprice (base name: "rowprice")', function() {
      // uncomment below and update the code to test the property rowprice
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property initialprice (base name: "initialprice")', function() {
      // uncomment below and update the code to test the property initialprice
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property isCumulative (base name: "isCumulative")', function() {
      // uncomment below and update the code to test the property isCumulative
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property requiredPackages (base name: "requiredPackages")', function() {
      // uncomment below and update the code to test the property requiredPackages
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property requiresAny (base name: "requiresAny")', function() {
      // uncomment below and update the code to test the property requiresAny
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property category (base name: "category")', function() {
      // uncomment below and update the code to test the property category
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property producesGiftCard (base name: "producesGiftCard")', function() {
      // uncomment below and update the code to test the property producesGiftCard
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property allowsGiftCards (base name: "allowsGiftCards")', function() {
      // uncomment below and update the code to test the property allowsGiftCards
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property servers (base name: "servers")', function() {
      // uncomment below and update the code to test the property servers
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property limits (base name: "limits")', function() {
      // uncomment below and update the code to test the property limits
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property hasDeliverables (base name: "hasDeliverables")', function() {
      // uncomment below and update the code to test the property hasDeliverables
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property deliverableTypes (base name: "deliverableTypes")', function() {
      // uncomment below and update the code to test the property deliverableTypes
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property downloadLink (base name: "downloadLink")', function() {
      // uncomment below and update the code to test the property downloadLink
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property hasSellerProtection (base name: "hasSellerProtection")', function() {
      // uncomment below and update the code to test the property hasSellerProtection
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property itemType (base name: "itemType")', function() {
      // uncomment below and update the code to test the property itemType
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property revenueShare (base name: "revenue_share")', function() {
      // uncomment below and update the code to test the property revenueShare
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property image (base name: "image")', function() {
      // uncomment below and update the code to test the property image
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

    it('should have the property realprice (base name: "realprice")', function() {
      // uncomment below and update the code to test the property realprice
      //var instance = new TebexCheckoutApi.BasketRowMeta();
      //expect(instance).to.be();
    });

  });

}));
