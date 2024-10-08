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
    /// BasketRow
    /// </summary>
    [DataContract(Name = "BasketRow")]
    public partial class BasketRow : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BasketRow" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="basket">Numeric basket ID.</param>
        /// <param name="package">Package ID associated with this item.</param>
        /// <param name="varOverride">Package ID associated with this item.</param>
        /// <param name="quantity">quantity.</param>
        /// <param name="server">server.</param>
        /// <param name="price">price.</param>
        /// <param name="giftUsernameId">giftUsernameId.</param>
        /// <param name="options">options.</param>
        /// <param name="recurring">recurring.</param>
        /// <param name="recurringPeriod">recurringPeriod.</param>
        /// <param name="recurringNextPaymentDate">recurringNextPaymentDate.</param>
        /// <param name="meta">meta.</param>
        /// <param name="custom">custom.</param>
        /// <param name="imageUrl">imageUrl.</param>
        /// <param name="recurringPrice">recurringPrice.</param>
        public BasketRow(int id = default(int), int basket = default(int), int? package = default(int?), int varOverride = default(int), int quantity = default(int), int? server = default(int?), float price = default(float), int? giftUsernameId = default(int?), Object options = default(Object), bool recurring = default(bool), string recurringPeriod = default(string), DateTime? recurringNextPaymentDate = default(DateTime?), BasketRowMeta meta = default(BasketRowMeta), Object custom = default(Object), string imageUrl = default(string), float? recurringPrice = default(float?))
        {
            this.Id = id;
            this.Basket = basket;
            this.Package = package;
            this.Override = varOverride;
            this.Quantity = quantity;
            this.Server = server;
            this.Price = price;
            this.GiftUsernameId = giftUsernameId;
            this.Options = options;
            this.Recurring = recurring;
            this.RecurringPeriod = recurringPeriod;
            this.RecurringNextPaymentDate = recurringNextPaymentDate;
            this.Meta = meta;
            this.Custom = custom;
            this.ImageUrl = imageUrl;
            this.RecurringPrice = recurringPrice;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /// <example>173125385</example>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Numeric basket ID
        /// </summary>
        /// <value>Numeric basket ID</value>
        /// <example>725572301</example>
        [DataMember(Name = "basket", EmitDefaultValue = false)]
        public int Basket { get; set; }

        /// <summary>
        /// Package ID associated with this item
        /// </summary>
        /// <value>Package ID associated with this item</value>
        [DataMember(Name = "package", EmitDefaultValue = true)]
        public int? Package { get; set; }

        /// <summary>
        /// Package ID associated with this item
        /// </summary>
        /// <value>Package ID associated with this item</value>
        /// <example>0</example>
        [DataMember(Name = "override", EmitDefaultValue = false)]
        public int Override { get; set; }

        /// <summary>
        /// Gets or Sets Quantity
        /// </summary>
        /// <example>2</example>
        [DataMember(Name = "quantity", EmitDefaultValue = false)]
        public int Quantity { get; set; }

        /// <summary>
        /// Gets or Sets Server
        /// </summary>
        [DataMember(Name = "server", EmitDefaultValue = true)]
        public int? Server { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        /// <example>1.27</example>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public float Price { get; set; }

        /// <summary>
        /// Gets or Sets GiftUsernameId
        /// </summary>
        [DataMember(Name = "gift_username_id", EmitDefaultValue = true)]
        public int? GiftUsernameId { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = true)]
        public Object Options { get; set; }

        /// <summary>
        /// Gets or Sets Recurring
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "recurring", EmitDefaultValue = true)]
        public bool Recurring { get; set; }

        /// <summary>
        /// Gets or Sets RecurringPeriod
        /// </summary>
        [DataMember(Name = "recurring_period", EmitDefaultValue = true)]
        public string RecurringPeriod { get; set; }

        /// <summary>
        /// Gets or Sets RecurringNextPaymentDate
        /// </summary>
        [DataMember(Name = "recurring_next_payment_date", EmitDefaultValue = true)]
        public DateTime? RecurringNextPaymentDate { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public BasketRowMeta Meta { get; set; }

        /// <summary>
        /// Gets or Sets Custom
        /// </summary>
        [DataMember(Name = "custom", EmitDefaultValue = true)]
        public Object Custom { get; set; }

        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [DataMember(Name = "image_url", EmitDefaultValue = true)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// Gets or Sets RecurringPrice
        /// </summary>
        [DataMember(Name = "recurring_price", EmitDefaultValue = true)]
        public float? RecurringPrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BasketRow {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Basket: ").Append(Basket).Append("\n");
            sb.Append("  Package: ").Append(Package).Append("\n");
            sb.Append("  Override: ").Append(Override).Append("\n");
            sb.Append("  Quantity: ").Append(Quantity).Append("\n");
            sb.Append("  Server: ").Append(Server).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  GiftUsernameId: ").Append(GiftUsernameId).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  Recurring: ").Append(Recurring).Append("\n");
            sb.Append("  RecurringPeriod: ").Append(RecurringPeriod).Append("\n");
            sb.Append("  RecurringNextPaymentDate: ").Append(RecurringNextPaymentDate).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
            sb.Append("  Custom: ").Append(Custom).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  RecurringPrice: ").Append(RecurringPrice).Append("\n");
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
