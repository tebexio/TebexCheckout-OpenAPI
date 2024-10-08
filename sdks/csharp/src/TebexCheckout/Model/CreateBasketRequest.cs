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
    /// CreateBasketRequest
    /// </summary>
    [DataContract(Name = "createBasket_request")]
    public partial class CreateBasketRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateBasketRequest" /> class.
        /// </summary>
        /// <param name="returnUrl">The URL a customer can return to without completing checkout.</param>
        /// <param name="completeUrl">URL the customer can return to after completing payment.</param>
        /// <param name="custom">Any custom data to be passed through the request. This will be returned in a post-completion webhook..</param>
        /// <param name="firstName">The first name of the customer.</param>
        /// <param name="lastName">The last name of the customer.</param>
        /// <param name="email">The email address of the customer.</param>
        /// <param name="expiresAt">An ISO8601 formatted date. After this date the basket cannot be used to checkout..</param>
        /// <param name="completeAutoRedirect">Automatically redirect to the complete_url provided.</param>
        /// <param name="country">An ISO 3166-1 alpha-2 character code representing the customer&#39;s country..</param>
        /// <param name="creatorCode">The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes.</param>
        /// <param name="ip">The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend..</param>
        public CreateBasketRequest(string returnUrl = default(string), string completeUrl = default(string), Object custom = default(Object), string firstName = default(string), string lastName = default(string), string email = default(string), string expiresAt = default(string), bool completeAutoRedirect = default(bool), string country = default(string), string creatorCode = default(string), string ip = default(string))
        {
            this.ReturnUrl = returnUrl;
            this.CompleteUrl = completeUrl;
            this.Custom = custom;
            this.FirstName = firstName;
            this.LastName = lastName;
            this.Email = email;
            this.ExpiresAt = expiresAt;
            this.CompleteAutoRedirect = completeAutoRedirect;
            this.Country = country;
            this.CreatorCode = creatorCode;
            this.Ip = ip;
        }

        /// <summary>
        /// The URL a customer can return to without completing checkout
        /// </summary>
        /// <value>The URL a customer can return to without completing checkout</value>
        /// <example>https://example.tebex.io/</example>
        [DataMember(Name = "return_url", EmitDefaultValue = false)]
        public string ReturnUrl { get; set; }

        /// <summary>
        /// URL the customer can return to after completing payment
        /// </summary>
        /// <value>URL the customer can return to after completing payment</value>
        /// <example>https://example.tebex.io/complete</example>
        [DataMember(Name = "complete_url", EmitDefaultValue = false)]
        public string CompleteUrl { get; set; }

        /// <summary>
        /// Any custom data to be passed through the request. This will be returned in a post-completion webhook.
        /// </summary>
        /// <value>Any custom data to be passed through the request. This will be returned in a post-completion webhook.</value>
        /// <example>{&quot;foo&quot;:&quot;bar&quot;}</example>
        [DataMember(Name = "custom", EmitDefaultValue = false)]
        public Object Custom { get; set; }

        /// <summary>
        /// The first name of the customer
        /// </summary>
        /// <value>The first name of the customer</value>
        /// <example>Neil</example>
        [DataMember(Name = "first_name", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// The last name of the customer
        /// </summary>
        /// <value>The last name of the customer</value>
        /// <example>McNeil</example>
        [DataMember(Name = "last_name", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// The email address of the customer
        /// </summary>
        /// <value>The email address of the customer</value>
        /// <example>example@tebex.io</example>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// An ISO8601 formatted date. After this date the basket cannot be used to checkout.
        /// </summary>
        /// <value>An ISO8601 formatted date. After this date the basket cannot be used to checkout.</value>
        /// <example>2025-01-27T18:09:51Z</example>
        [DataMember(Name = "expires_at", EmitDefaultValue = false)]
        public string ExpiresAt { get; set; }

        /// <summary>
        /// Automatically redirect to the complete_url provided
        /// </summary>
        /// <value>Automatically redirect to the complete_url provided</value>
        /// <example>true</example>
        [DataMember(Name = "complete_auto_redirect", EmitDefaultValue = true)]
        public bool CompleteAutoRedirect { get; set; }

        /// <summary>
        /// An ISO 3166-1 alpha-2 character code representing the customer&#39;s country.
        /// </summary>
        /// <value>An ISO 3166-1 alpha-2 character code representing the customer&#39;s country.</value>
        /// <example>US</example>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes
        /// </summary>
        /// <value>The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes</value>
        [DataMember(Name = "creator_code", EmitDefaultValue = false)]
        public string CreatorCode { get; set; }

        /// <summary>
        /// The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend.
        /// </summary>
        /// <value>The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend.</value>
        /// <example>1.2.3.4</example>
        [DataMember(Name = "ip", EmitDefaultValue = false)]
        public string Ip { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateBasketRequest {\n");
            sb.Append("  ReturnUrl: ").Append(ReturnUrl).Append("\n");
            sb.Append("  CompleteUrl: ").Append(CompleteUrl).Append("\n");
            sb.Append("  Custom: ").Append(Custom).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  CompleteAutoRedirect: ").Append(CompleteAutoRedirect).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  CreatorCode: ").Append(CreatorCode).Append("\n");
            sb.Append("  Ip: ").Append(Ip).Append("\n");
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
