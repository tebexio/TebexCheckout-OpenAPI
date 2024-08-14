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
    /// RecurringPaymentSubject
    /// </summary>
    [DataContract(Name = "RecurringPaymentSubject")]
    public partial class RecurringPaymentSubject : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecurringPaymentSubject" /> class.
        /// </summary>
        /// <param name="reference">reference.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="pausedAt">pausedAt.</param>
        /// <param name="pausedUntil">pausedUntil.</param>
        /// <param name="nextPaymentAt">nextPaymentAt.</param>
        /// <param name="status">status.</param>
        /// <param name="initialPayment">initialPayment.</param>
        /// <param name="lastPayment">lastPayment.</param>
        /// <param name="failCount">failCount.</param>
        /// <param name="price">price.</param>
        /// <param name="cancelledAt">cancelledAt.</param>
        /// <param name="cancelReason">cancelReason.</param>
        public RecurringPaymentSubject(string reference = default(string), DateTime createdAt = default(DateTime), DateTime? pausedAt = default(DateTime?), DateTime? pausedUntil = default(DateTime?), DateTime nextPaymentAt = default(DateTime), RecurringPaymentSubjectStatus status = default(RecurringPaymentSubjectStatus), PaymentSubject initialPayment = default(PaymentSubject), PaymentSubject lastPayment = default(PaymentSubject), int failCount = default(int), RecurringPaymentSubjectPrice price = default(RecurringPaymentSubjectPrice), DateTime? cancelledAt = default(DateTime?), string cancelReason = default(string))
        {
            this.Reference = reference;
            this.CreatedAt = createdAt;
            this.PausedAt = pausedAt;
            this.PausedUntil = pausedUntil;
            this.NextPaymentAt = nextPaymentAt;
            this.Status = status;
            this.InitialPayment = initialPayment;
            this.LastPayment = lastPayment;
            this.FailCount = failCount;
            this.Price = price;
            this.CancelledAt = cancelledAt;
            this.CancelReason = cancelReason;
        }

        /// <summary>
        /// Gets or Sets Reference
        /// </summary>
        /// <example>tbx-r-714093927</example>
        [DataMember(Name = "reference", EmitDefaultValue = false)]
        public string Reference { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        /// <example>2023-12-11T19:15:22Z</example>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets PausedAt
        /// </summary>
        [DataMember(Name = "paused_at", EmitDefaultValue = true)]
        public DateTime? PausedAt { get; set; }

        /// <summary>
        /// Gets or Sets PausedUntil
        /// </summary>
        [DataMember(Name = "paused_until", EmitDefaultValue = true)]
        public DateTime? PausedUntil { get; set; }

        /// <summary>
        /// Gets or Sets NextPaymentAt
        /// </summary>
        /// <example>2024-01-11T19:15:22Z</example>
        [DataMember(Name = "next_payment_at", EmitDefaultValue = false)]
        public DateTime NextPaymentAt { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public RecurringPaymentSubjectStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets InitialPayment
        /// </summary>
        [DataMember(Name = "initial_payment", EmitDefaultValue = false)]
        public PaymentSubject InitialPayment { get; set; }

        /// <summary>
        /// Gets or Sets LastPayment
        /// </summary>
        [DataMember(Name = "last_payment", EmitDefaultValue = false)]
        public PaymentSubject LastPayment { get; set; }

        /// <summary>
        /// Gets or Sets FailCount
        /// </summary>
        /// <example>0</example>
        [DataMember(Name = "fail_count", EmitDefaultValue = false)]
        public int FailCount { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public RecurringPaymentSubjectPrice Price { get; set; }

        /// <summary>
        /// Gets or Sets CancelledAt
        /// </summary>
        [DataMember(Name = "cancelled_at", EmitDefaultValue = true)]
        public DateTime? CancelledAt { get; set; }

        /// <summary>
        /// Gets or Sets CancelReason
        /// </summary>
        [DataMember(Name = "cancel_reason", EmitDefaultValue = true)]
        public string CancelReason { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RecurringPaymentSubject {\n");
            sb.Append("  Reference: ").Append(Reference).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  PausedAt: ").Append(PausedAt).Append("\n");
            sb.Append("  PausedUntil: ").Append(PausedUntil).Append("\n");
            sb.Append("  NextPaymentAt: ").Append(NextPaymentAt).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  InitialPayment: ").Append(InitialPayment).Append("\n");
            sb.Append("  LastPayment: ").Append(LastPayment).Append("\n");
            sb.Append("  FailCount: ").Append(FailCount).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  CancelledAt: ").Append(CancelledAt).Append("\n");
            sb.Append("  CancelReason: ").Append(CancelReason).Append("\n");
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
