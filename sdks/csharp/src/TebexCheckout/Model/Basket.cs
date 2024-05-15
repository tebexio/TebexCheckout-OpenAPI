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
    /// Basket
    /// </summary>
    [DataContract(Name = "Basket")]
    public partial class Basket : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Basket" /> class.
        /// </summary>
        /// <param name="ident">ident.</param>
        /// <param name="expire">expire.</param>
        /// <param name="price">price.</param>
        /// <param name="priceDetails">priceDetails.</param>
        /// <param name="type">type.</param>
        /// <param name="recurring">recurring.</param>
        /// <param name="recurringPeriod">recurringPeriod.</param>
        /// <param name="recurringNextPaymentDate">recurringNextPaymentDate.</param>
        /// <param name="isPaymentMethodUpdate">isPaymentMethodUpdate.</param>
        /// <param name="returnUrl">returnUrl.</param>
        /// <param name="complete">complete.</param>
        /// <param name="tax">tax.</param>
        /// <param name="username">username.</param>
        /// <param name="discounts">discounts.</param>
        /// <param name="coupons">coupons.</param>
        /// <param name="giftcards">giftcards.</param>
        /// <param name="address">address.</param>
        /// <param name="rows">rows.</param>
        /// <param name="fingerprint">Browser fingerprint to identify the user.</param>
        /// <param name="creatorCode">The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes.</param>
        /// <param name="roundup">roundup.</param>
        /// <param name="cancelUrl">cancelUrl.</param>
        /// <param name="completeUrl">completeUrl.</param>
        /// <param name="completeAutoRedirect">completeAutoRedirect.</param>
        /// <param name="custom">custom.</param>
        /// <param name="links">links.</param>
        public Basket(string ident = default(string), string expire = default(string), decimal price = default(decimal), PriceDetails priceDetails = default(PriceDetails), string type = default(string), bool recurring = default(bool), Object recurringPeriod = default(Object), string recurringNextPaymentDate = default(string), bool isPaymentMethodUpdate = default(bool), string returnUrl = default(string), bool complete = default(bool), Object tax = default(Object), string username = default(string), List<Object> discounts = default(List<Object>), List<Object> coupons = default(List<Object>), List<Object> giftcards = default(List<Object>), Address address = default(Address), List<BasketItem> rows = default(List<BasketItem>), string fingerprint = default(string), string creatorCode = default(string), bool? roundup = default(bool?), string cancelUrl = default(string), string completeUrl = default(string), bool completeAutoRedirect = default(bool), Object custom = default(Object), BasketLinks links = default(BasketLinks))
        {
            this.Ident = ident;
            this.Expire = expire;
            this.Price = price;
            this.PriceDetails = priceDetails;
            this.Type = type;
            this.Recurring = recurring;
            this.RecurringPeriod = recurringPeriod;
            this.RecurringNextPaymentDate = recurringNextPaymentDate;
            this.IsPaymentMethodUpdate = isPaymentMethodUpdate;
            this.ReturnUrl = returnUrl;
            this.Complete = complete;
            this.Tax = tax;
            this.Username = username;
            this.Discounts = discounts;
            this.Coupons = coupons;
            this.Giftcards = giftcards;
            this.Address = address;
            this.Rows = rows;
            this.Fingerprint = fingerprint;
            this.CreatorCode = creatorCode;
            this.Roundup = roundup;
            this.CancelUrl = cancelUrl;
            this.CompleteUrl = completeUrl;
            this.CompleteAutoRedirect = completeAutoRedirect;
            this.Custom = custom;
            this.Links = links;
        }

        /// <summary>
        /// Gets or Sets Ident
        /// </summary>
        /// <example>1a-55fff4107740a1f40d844ff89607557f45bfafb3</example>
        [DataMember(Name = "ident", EmitDefaultValue = false)]
        public string Ident { get; set; }

        /// <summary>
        /// Gets or Sets Expire
        /// </summary>
        /// <example>2022-10-25 15:15:40</example>
        [DataMember(Name = "expire", EmitDefaultValue = false)]
        public string Expire { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        /// <example>1.27</example>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public decimal Price { get; set; }

        /// <summary>
        /// Gets or Sets PriceDetails
        /// </summary>
        [DataMember(Name = "priceDetails", EmitDefaultValue = false)]
        public PriceDetails PriceDetails { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        /// <example>single</example>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Recurring
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "recurring", EmitDefaultValue = true)]
        public bool Recurring { get; set; }

        /// <summary>
        /// Gets or Sets RecurringPeriod
        /// </summary>
        [DataMember(Name = "recurringPeriod", EmitDefaultValue = false)]
        public Object RecurringPeriod { get; set; }

        /// <summary>
        /// Gets or Sets RecurringNextPaymentDate
        /// </summary>
        [DataMember(Name = "recurringNextPaymentDate", EmitDefaultValue = true)]
        public string RecurringNextPaymentDate { get; set; }

        /// <summary>
        /// Gets or Sets IsPaymentMethodUpdate
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "isPaymentMethodUpdate", EmitDefaultValue = true)]
        public bool IsPaymentMethodUpdate { get; set; }

        /// <summary>
        /// Gets or Sets ReturnUrl
        /// </summary>
        [DataMember(Name = "returnUrl", EmitDefaultValue = true)]
        public string ReturnUrl { get; set; }

        /// <summary>
        /// Gets or Sets Complete
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "complete", EmitDefaultValue = true)]
        public bool Complete { get; set; }

        /// <summary>
        /// Gets or Sets Tax
        /// </summary>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public Object Tax { get; set; }

        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name = "username", EmitDefaultValue = true)]
        public string Username { get; set; }

        /// <summary>
        /// Gets or Sets Discounts
        /// </summary>
        [DataMember(Name = "discounts", EmitDefaultValue = false)]
        public List<Object> Discounts { get; set; }

        /// <summary>
        /// Gets or Sets Coupons
        /// </summary>
        [DataMember(Name = "coupons", EmitDefaultValue = false)]
        public List<Object> Coupons { get; set; }

        /// <summary>
        /// Gets or Sets Giftcards
        /// </summary>
        [DataMember(Name = "giftcards", EmitDefaultValue = false)]
        public List<Object> Giftcards { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public Address Address { get; set; }

        /// <summary>
        /// Gets or Sets Rows
        /// </summary>
        [DataMember(Name = "rows", EmitDefaultValue = false)]
        public List<BasketItem> Rows { get; set; }

        /// <summary>
        /// Browser fingerprint to identify the user
        /// </summary>
        /// <value>Browser fingerprint to identify the user</value>
        [DataMember(Name = "fingerprint", EmitDefaultValue = true)]
        public string Fingerprint { get; set; }

        /// <summary>
        /// The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes
        /// </summary>
        /// <value>The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes</value>
        [DataMember(Name = "creator_code", EmitDefaultValue = false)]
        public string CreatorCode { get; set; }

        /// <summary>
        /// Gets or Sets Roundup
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "roundup", EmitDefaultValue = true)]
        public bool? Roundup { get; set; }

        /// <summary>
        /// Gets or Sets CancelUrl
        /// </summary>
        /// <example>https://tebex.io</example>
        [DataMember(Name = "cancel_url", EmitDefaultValue = false)]
        public string CancelUrl { get; set; }

        /// <summary>
        /// Gets or Sets CompleteUrl
        /// </summary>
        [DataMember(Name = "complete_url", EmitDefaultValue = true)]
        public string CompleteUrl { get; set; }

        /// <summary>
        /// Gets or Sets CompleteAutoRedirect
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "complete_auto_redirect", EmitDefaultValue = true)]
        public bool CompleteAutoRedirect { get; set; }

        /// <summary>
        /// Gets or Sets Custom
        /// </summary>
        /// <example>{&quot;foo&quot;:&quot;bar&quot;,&quot;ref&quot;:1234}</example>
        [DataMember(Name = "custom", EmitDefaultValue = true)]
        public Object Custom { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name = "links", EmitDefaultValue = false)]
        public BasketLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Basket {\n");
            sb.Append("  Ident: ").Append(Ident).Append("\n");
            sb.Append("  Expire: ").Append(Expire).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  PriceDetails: ").Append(PriceDetails).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Recurring: ").Append(Recurring).Append("\n");
            sb.Append("  RecurringPeriod: ").Append(RecurringPeriod).Append("\n");
            sb.Append("  RecurringNextPaymentDate: ").Append(RecurringNextPaymentDate).Append("\n");
            sb.Append("  IsPaymentMethodUpdate: ").Append(IsPaymentMethodUpdate).Append("\n");
            sb.Append("  ReturnUrl: ").Append(ReturnUrl).Append("\n");
            sb.Append("  Complete: ").Append(Complete).Append("\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Discounts: ").Append(Discounts).Append("\n");
            sb.Append("  Coupons: ").Append(Coupons).Append("\n");
            sb.Append("  Giftcards: ").Append(Giftcards).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Rows: ").Append(Rows).Append("\n");
            sb.Append("  Fingerprint: ").Append(Fingerprint).Append("\n");
            sb.Append("  CreatorCode: ").Append(CreatorCode).Append("\n");
            sb.Append("  Roundup: ").Append(Roundup).Append("\n");
            sb.Append("  CancelUrl: ").Append(CancelUrl).Append("\n");
            sb.Append("  CompleteUrl: ").Append(CompleteUrl).Append("\n");
            sb.Append("  CompleteAutoRedirect: ").Append(CompleteAutoRedirect).Append("\n");
            sb.Append("  Custom: ").Append(Custom).Append("\n");
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
