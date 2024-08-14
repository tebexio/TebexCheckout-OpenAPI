/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
 * Contact: tebex-integrations@overwolf.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using TebexCheckout.Client;
using TebexCheckout.TebexCheckout;
// uncomment below to import models
//using TebexCheckout.Model;

namespace TebexCheckout.Test.Api
{
    /// <summary>
    ///  Class for testing CheckoutApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class CheckoutApiTests : IDisposable
    {
        private CheckoutApi instance;

        public CheckoutApiTests()
        {
            instance = new CheckoutApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CheckoutApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' CheckoutApi
            //Assert.IsType<CheckoutApi>(instance);
        }

        /// <summary>
        /// Test Checkout
        /// </summary>
        [Fact]
        public void CheckoutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CheckoutRequest? checkoutRequest = null;
            //var response = instance.Checkout(checkoutRequest);
            //Assert.IsType<Basket>(response);
        }
    }
}
