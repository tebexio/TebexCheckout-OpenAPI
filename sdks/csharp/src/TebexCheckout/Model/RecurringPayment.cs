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
    /// RecurringPayment
    /// </summary>
    [DataContract(Name = "RecurringPayment")]
    public partial class RecurringPayment : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecurringPayment" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="updatedAt">updatedAt.</param>
        /// <param name="pausedAt">pausedAt.</param>
        /// <param name="pausedUntil">pausedUntil.</param>
        /// <param name="nextPaymentDate">nextPaymentDate.</param>
        /// <param name="reference">reference.</param>
        /// <param name="accountId">accountId.</param>
        /// <param name="interval">interval.</param>
        /// <param name="cancelledAt">cancelledAt.</param>
        /// <param name="cancellationRequestedAt">cancellationRequestedAt.</param>
        /// <param name="status">status.</param>
        /// <param name="amount">amount.</param>
        /// <param name="cancelReason">cancelReason.</param>
        /// <param name="links">links.</param>
        public RecurringPayment(int id = default(int), DateTime createdAt = default(DateTime), DateTime updatedAt = default(DateTime), DateTime? pausedAt = default(DateTime?), DateTime? pausedUntil = default(DateTime?), string nextPaymentDate = default(string), string reference = default(string), int accountId = default(int), string interval = default(string), DateTime? cancelledAt = default(DateTime?), DateTime? cancellationRequestedAt = default(DateTime?), RecurringPaymentStatus status = default(RecurringPaymentStatus), RecurringPaymentAmount amount = default(RecurringPaymentAmount), string cancelReason = default(string), RecurringPaymentLinks links = default(RecurringPaymentLinks))
        {
            this.Id = id;
            this.CreatedAt = createdAt;
            this.UpdatedAt = updatedAt;
            this.PausedAt = pausedAt;
            this.PausedUntil = pausedUntil;
            this.NextPaymentDate = nextPaymentDate;
            this.Reference = reference;
            this.AccountId = accountId;
            this.Interval = interval;
            this.CancelledAt = cancelledAt;
            this.CancellationRequestedAt = cancellationRequestedAt;
            this.Status = status;
            this.Amount = amount;
            this.CancelReason = cancelReason;
            this.Links = links;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /// <example>5000</example>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        /// <example>2022-12-16T16:43:06Z</example>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        /// <example>2022-12-16T16:43:06Z</example>
        [DataMember(Name = "updated_at", EmitDefaultValue = false)]
        public DateTime UpdatedAt { get; set; }

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
        /// Gets or Sets NextPaymentDate
        /// </summary>
        /// <example>2022-12-30T16:43:06</example>
        [DataMember(Name = "next_payment_date", EmitDefaultValue = false)]
        public string NextPaymentDate { get; set; }

        /// <summary>
        /// Gets or Sets Reference
        /// </summary>
        /// <example>88</example>
        [DataMember(Name = "reference", EmitDefaultValue = false)]
        public string Reference { get; set; }

        /// <summary>
        /// Gets or Sets AccountId
        /// </summary>
        /// <example>1</example>
        [DataMember(Name = "account_id", EmitDefaultValue = false)]
        public int AccountId { get; set; }

        /// <summary>
        /// Gets or Sets Interval
        /// </summary>
        /// <example>P2W</example>
        [DataMember(Name = "interval", EmitDefaultValue = false)]
        public string Interval { get; set; }

        /// <summary>
        /// Gets or Sets CancelledAt
        /// </summary>
        [DataMember(Name = "cancelled_at", EmitDefaultValue = true)]
        public DateTime? CancelledAt { get; set; }

        /// <summary>
        /// Gets or Sets CancellationRequestedAt
        /// </summary>
        [DataMember(Name = "cancellation_requested_at", EmitDefaultValue = true)]
        public DateTime? CancellationRequestedAt { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public RecurringPaymentStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public RecurringPaymentAmount Amount { get; set; }

        /// <summary>
        /// Gets or Sets CancelReason
        /// </summary>
        [DataMember(Name = "cancel_reason", EmitDefaultValue = true)]
        public string CancelReason { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name = "links", EmitDefaultValue = false)]
        public RecurringPaymentLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RecurringPayment {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  PausedAt: ").Append(PausedAt).Append("\n");
            sb.Append("  PausedUntil: ").Append(PausedUntil).Append("\n");
            sb.Append("  NextPaymentDate: ").Append(NextPaymentDate).Append("\n");
            sb.Append("  Reference: ").Append(Reference).Append("\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  Interval: ").Append(Interval).Append("\n");
            sb.Append("  CancelledAt: ").Append(CancelledAt).Append("\n");
            sb.Append("  CancellationRequestedAt: ").Append(CancellationRequestedAt).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  CancelReason: ").Append(CancelReason).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
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
