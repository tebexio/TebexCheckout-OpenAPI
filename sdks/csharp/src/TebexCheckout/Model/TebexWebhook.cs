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
    /// TebexWebhook
    /// </summary>
    [DataContract(Name = "TebexWebhook")]
    public partial class TebexWebhook : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TebexWebhook" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="type">type.</param>
        /// <param name="date">date.</param>
        /// <param name="subject">Depending on the webhook &#x60;type&#x60;, the &#x60;subject&#x60; will contain as &#x60;PaymentSubject&#x60; or &#x60;RecurringPaymentSubject&#x60;..</param>
        public TebexWebhook(string id = default(string), string type = default(string), string date = default(string), Object subject = default(Object))
        {
            this.Id = id;
            this.Type = type;
            this.Date = date;
            this.Subject = subject;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /// <example>fcf9cfc9-3708-4942-88f2-78d7e5cd8e72</example>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        /// <example>validation.webhook</example>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        /// <example>2024-07-02T19:52:07+00:00</example>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// Depending on the webhook &#x60;type&#x60;, the &#x60;subject&#x60; will contain as &#x60;PaymentSubject&#x60; or &#x60;RecurringPaymentSubject&#x60;.
        /// </summary>
        /// <value>Depending on the webhook &#x60;type&#x60;, the &#x60;subject&#x60; will contain as &#x60;PaymentSubject&#x60; or &#x60;RecurringPaymentSubject&#x60;.</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public Object Subject { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TebexWebhook {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
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
