/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = TebexCheckout.Client.OpenAPIDateConverter;

namespace TebexCheckout.Model
{
    /// <summary>
    /// Payment
    /// </summary>
    [DataContract(Name = "Payment")]
    public partial class Payment : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Payment" /> class.
        /// </summary>
        /// <param name="transactionId">transactionId.</param>
        /// <param name="status">status.</param>
        /// <param name="paymentSequence">paymentSequence.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="price">price.</param>
        /// <param name="fees">fees.</param>
        /// <param name="customer">customer.</param>
        /// <param name="products">products.</param>
        /// <param name="coupons">coupons.</param>
        /// <param name="giftCards">giftCards.</param>
        /// <param name="recurringPaymentReference">recurringPaymentReference.</param>
        /// <param name="custom">custom.</param>
        public Payment(string transactionId = default(string), PaymentStatus status = default(PaymentStatus), string paymentSequence = default(string), DateTime createdAt = default(DateTime), PaymentPrice price = default(PaymentPrice), PaymentFees fees = default(PaymentFees), PaymentCustomer customer = default(PaymentCustomer), List<PaymentProductsInner> products = default(List<PaymentProductsInner>), List<string> coupons = default(List<string>), List<string> giftCards = default(List<string>), string recurringPaymentReference = default(string), PaymentCustom custom = default(PaymentCustom))
        {
            this.TransactionId = transactionId;
            this.Status = status;
            this.PaymentSequence = paymentSequence;
            this.CreatedAt = createdAt;
            this.Price = price;
            this.Fees = fees;
            this.Customer = customer;
            this.Products = products;
            this.Coupons = coupons;
            this.GiftCards = giftCards;
            this.RecurringPaymentReference = recurringPaymentReference;
            this.Custom = custom;
        }

        /// <summary>
        /// Gets or Sets TransactionId
        /// </summary>
        /// <example>tbx-26929122a56954-0e15be</example>
        [DataMember(Name = "transaction_id", EmitDefaultValue = false)]
        public string TransactionId { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public PaymentStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets PaymentSequence
        /// </summary>
        /// <example>oneoff</example>
        [DataMember(Name = "payment_sequence", EmitDefaultValue = false)]
        public string PaymentSequence { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        /// <example>2022-10-19T15:49:15Z</example>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public PaymentPrice Price { get; set; }

        /// <summary>
        /// Gets or Sets Fees
        /// </summary>
        [DataMember(Name = "fees", EmitDefaultValue = false)]
        public PaymentFees Fees { get; set; }

        /// <summary>
        /// Gets or Sets Customer
        /// </summary>
        [DataMember(Name = "customer", EmitDefaultValue = false)]
        public PaymentCustomer Customer { get; set; }

        /// <summary>
        /// Gets or Sets Products
        /// </summary>
        [DataMember(Name = "products", EmitDefaultValue = false)]
        public List<PaymentProductsInner> Products { get; set; }

        /// <summary>
        /// Gets or Sets Coupons
        /// </summary>
        [DataMember(Name = "coupons", EmitDefaultValue = false)]
        public List<string> Coupons { get; set; }

        /// <summary>
        /// Gets or Sets GiftCards
        /// </summary>
        [DataMember(Name = "gift_cards", EmitDefaultValue = false)]
        public List<string> GiftCards { get; set; }

        /// <summary>
        /// Gets or Sets RecurringPaymentReference
        /// </summary>
        [DataMember(Name = "recurring_payment_reference", EmitDefaultValue = true)]
        public string RecurringPaymentReference { get; set; }

        /// <summary>
        /// Gets or Sets Custom
        /// </summary>
        [DataMember(Name = "custom", EmitDefaultValue = false)]
        public PaymentCustom Custom { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Payment {\n");
            sb.Append("  TransactionId: ").Append(TransactionId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  PaymentSequence: ").Append(PaymentSequence).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Fees: ").Append(Fees).Append("\n");
            sb.Append("  Customer: ").Append(Customer).Append("\n");
            sb.Append("  Products: ").Append(Products).Append("\n");
            sb.Append("  Coupons: ").Append(Coupons).Append("\n");
            sb.Append("  GiftCards: ").Append(GiftCards).Append("\n");
            sb.Append("  RecurringPaymentReference: ").Append(RecurringPaymentReference).Append("\n");
            sb.Append("  Custom: ").Append(Custom).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
