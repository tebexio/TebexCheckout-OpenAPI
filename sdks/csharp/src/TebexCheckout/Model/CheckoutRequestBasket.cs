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
    /// An object containing the customer&#39;s information, relevant links, and any custom tracking data.
    /// </summary>
    [DataContract(Name = "checkout_request_basket")]
    public partial class CheckoutRequestBasket : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CheckoutRequestBasket" /> class.
        /// </summary>
        /// <param name="firstName">firstName.</param>
        /// <param name="lastName">lastName.</param>
        /// <param name="email">email.</param>
        /// <param name="returnUrl">returnUrl.</param>
        /// <param name="completeUrl">completeUrl.</param>
        /// <param name="custom">custom.</param>
        public CheckoutRequestBasket(string firstName = default(string), string lastName = default(string), string email = default(string), string returnUrl = default(string), string completeUrl = default(string), Object custom = default(Object))
        {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.Email = email;
            this.ReturnUrl = returnUrl;
            this.CompleteUrl = completeUrl;
            this.Custom = custom;
        }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "first_name", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name = "last_name", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets ReturnUrl
        /// </summary>
        [DataMember(Name = "return_url", EmitDefaultValue = false)]
        public string ReturnUrl { get; set; }

        /// <summary>
        /// Gets or Sets CompleteUrl
        /// </summary>
        [DataMember(Name = "complete_url", EmitDefaultValue = false)]
        public string CompleteUrl { get; set; }

        /// <summary>
        /// Gets or Sets Custom
        /// </summary>
        [DataMember(Name = "custom", EmitDefaultValue = false)]
        public Object Custom { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CheckoutRequestBasket {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  ReturnUrl: ").Append(ReturnUrl).Append("\n");
            sb.Append("  CompleteUrl: ").Append(CompleteUrl).Append("\n");
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
