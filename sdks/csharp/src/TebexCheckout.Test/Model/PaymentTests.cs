/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using TebexCheckout.Model;
using TebexCheckout.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace TebexCheckout.Test.Model
{
    /// <summary>
    ///  Class for testing Payment
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class PaymentTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for Payment
        //private Payment instance;

        public PaymentTests()
        {
            // TODO uncomment below to create an instance of Payment
            //instance = new Payment();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of Payment
        /// </summary>
        [Fact]
        public void PaymentInstanceTest()
        {
            // TODO uncomment below to test "IsType" Payment
            //Assert.IsType<Payment>(instance);
        }

        /// <summary>
        /// Test the property 'TransactionId'
        /// </summary>
        [Fact]
        public void TransactionIdTest()
        {
            // TODO unit test for the property 'TransactionId'
        }

        /// <summary>
        /// Test the property 'Status'
        /// </summary>
        [Fact]
        public void StatusTest()
        {
            // TODO unit test for the property 'Status'
        }

        /// <summary>
        /// Test the property 'PaymentSequence'
        /// </summary>
        [Fact]
        public void PaymentSequenceTest()
        {
            // TODO unit test for the property 'PaymentSequence'
        }

        /// <summary>
        /// Test the property 'CreatedAt'
        /// </summary>
        [Fact]
        public void CreatedAtTest()
        {
            // TODO unit test for the property 'CreatedAt'
        }

        /// <summary>
        /// Test the property 'Price'
        /// </summary>
        [Fact]
        public void PriceTest()
        {
            // TODO unit test for the property 'Price'
        }

        /// <summary>
        /// Test the property 'Fees'
        /// </summary>
        [Fact]
        public void FeesTest()
        {
            // TODO unit test for the property 'Fees'
        }

        /// <summary>
        /// Test the property 'Customer'
        /// </summary>
        [Fact]
        public void CustomerTest()
        {
            // TODO unit test for the property 'Customer'
        }

        /// <summary>
        /// Test the property 'Products'
        /// </summary>
        [Fact]
        public void ProductsTest()
        {
            // TODO unit test for the property 'Products'
        }

        /// <summary>
        /// Test the property 'Coupons'
        /// </summary>
        [Fact]
        public void CouponsTest()
        {
            // TODO unit test for the property 'Coupons'
        }

        /// <summary>
        /// Test the property 'GiftCards'
        /// </summary>
        [Fact]
        public void GiftCardsTest()
        {
            // TODO unit test for the property 'GiftCards'
        }

        /// <summary>
        /// Test the property 'RecurringPaymentReference'
        /// </summary>
        [Fact]
        public void RecurringPaymentReferenceTest()
        {
            // TODO unit test for the property 'RecurringPaymentReference'
        }

        /// <summary>
        /// Test the property 'Custom'
        /// </summary>
        [Fact]
        public void CustomTest()
        {
            // TODO unit test for the property 'Custom'
        }
    }
}