/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
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
    ///  Class for testing RecurringPaymentSubject
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class RecurringPaymentSubjectTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for RecurringPaymentSubject
        //private RecurringPaymentSubject instance;

        public RecurringPaymentSubjectTests()
        {
            // TODO uncomment below to create an instance of RecurringPaymentSubject
            //instance = new RecurringPaymentSubject();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RecurringPaymentSubject
        /// </summary>
        [Fact]
        public void RecurringPaymentSubjectInstanceTest()
        {
            // TODO uncomment below to test "IsType" RecurringPaymentSubject
            //Assert.IsType<RecurringPaymentSubject>(instance);
        }

        /// <summary>
        /// Test the property 'Reference'
        /// </summary>
        [Fact]
        public void ReferenceTest()
        {
            // TODO unit test for the property 'Reference'
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
        /// Test the property 'PausedAt'
        /// </summary>
        [Fact]
        public void PausedAtTest()
        {
            // TODO unit test for the property 'PausedAt'
        }

        /// <summary>
        /// Test the property 'PausedUntil'
        /// </summary>
        [Fact]
        public void PausedUntilTest()
        {
            // TODO unit test for the property 'PausedUntil'
        }

        /// <summary>
        /// Test the property 'NextPaymentAt'
        /// </summary>
        [Fact]
        public void NextPaymentAtTest()
        {
            // TODO unit test for the property 'NextPaymentAt'
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
        /// Test the property 'InitialPayment'
        /// </summary>
        [Fact]
        public void InitialPaymentTest()
        {
            // TODO unit test for the property 'InitialPayment'
        }

        /// <summary>
        /// Test the property 'LastPayment'
        /// </summary>
        [Fact]
        public void LastPaymentTest()
        {
            // TODO unit test for the property 'LastPayment'
        }

        /// <summary>
        /// Test the property 'FailCount'
        /// </summary>
        [Fact]
        public void FailCountTest()
        {
            // TODO unit test for the property 'FailCount'
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
        /// Test the property 'CancelledAt'
        /// </summary>
        [Fact]
        public void CancelledAtTest()
        {
            // TODO unit test for the property 'CancelledAt'
        }

        /// <summary>
        /// Test the property 'CancelReason'
        /// </summary>
        [Fact]
        public void CancelReasonTest()
        {
            // TODO unit test for the property 'CancelReason'
        }
    }
}
