/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.BasketItem;
import org.openapitools.client.model.BasketLinks;
import org.openapitools.client.model.PriceDetails;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import TebexCheckout.JSON;

/**
 * Basket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T10:59:54.383377-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class Basket {
  public static final String SERIALIZED_NAME_IDENT = "ident";
  @SerializedName(SERIALIZED_NAME_IDENT)
  private String ident;

  public static final String SERIALIZED_NAME_EXPIRE = "expire";
  @SerializedName(SERIALIZED_NAME_EXPIRE)
  private String expire;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_PRICE_DETAILS = "priceDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_DETAILS)
  private PriceDetails priceDetails;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_RECURRING_PERIOD = "recurringPeriod";
  @SerializedName(SERIALIZED_NAME_RECURRING_PERIOD)
  private Object recurringPeriod;

  public static final String SERIALIZED_NAME_RECURRING_NEXT_PAYMENT_DATE = "recurringNextPaymentDate";
  @SerializedName(SERIALIZED_NAME_RECURRING_NEXT_PAYMENT_DATE)
  private String recurringNextPaymentDate;

  public static final String SERIALIZED_NAME_IS_PAYMENT_METHOD_UPDATE = "isPaymentMethodUpdate";
  @SerializedName(SERIALIZED_NAME_IS_PAYMENT_METHOD_UPDATE)
  private Boolean isPaymentMethodUpdate;

  public static final String SERIALIZED_NAME_RETURN_URL = "returnUrl";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_COMPLETE = "complete";
  @SerializedName(SERIALIZED_NAME_COMPLETE)
  private Boolean complete;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Object tax;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<Object> discounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private List<Object> coupons = new ArrayList<>();

  public static final String SERIALIZED_NAME_GIFTCARDS = "giftcards";
  @SerializedName(SERIALIZED_NAME_GIFTCARDS)
  private List<Object> giftcards = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<BasketItem> rows = new ArrayList<>();

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_CREATOR_CODE = "creator_code";
  @SerializedName(SERIALIZED_NAME_CREATOR_CODE)
  private String creatorCode;

  public static final String SERIALIZED_NAME_ROUNDUP = "roundup";
  @SerializedName(SERIALIZED_NAME_ROUNDUP)
  private Boolean roundup;

  public static final String SERIALIZED_NAME_CANCEL_URL = "cancel_url";
  @SerializedName(SERIALIZED_NAME_CANCEL_URL)
  private String cancelUrl;

  public static final String SERIALIZED_NAME_COMPLETE_URL = "complete_url";
  @SerializedName(SERIALIZED_NAME_COMPLETE_URL)
  private String completeUrl;

  public static final String SERIALIZED_NAME_COMPLETE_AUTO_REDIRECT = "complete_auto_redirect";
  @SerializedName(SERIALIZED_NAME_COMPLETE_AUTO_REDIRECT)
  private Boolean completeAutoRedirect;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Object custom;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private BasketLinks links;

  public Basket() {
  }

  public Basket ident(String ident) {
    this.ident = ident;
    return this;
  }

   /**
   * Get ident
   * @return ident
  **/
  @javax.annotation.Nullable
  public String getIdent() {
    return ident;
  }

  public void setIdent(String ident) {
    this.ident = ident;
  }


  public Basket expire(String expire) {
    this.expire = expire;
    return this;
  }

   /**
   * Get expire
   * @return expire
  **/
  @javax.annotation.Nullable
  public String getExpire() {
    return expire;
  }

  public void setExpire(String expire) {
    this.expire = expire;
  }


  public Basket price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public Basket priceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/
  @javax.annotation.Nullable
  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }


  public Basket type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Basket recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @javax.annotation.Nullable
  public Boolean getRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public Basket recurringPeriod(Object recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
    return this;
  }

   /**
   * Get recurringPeriod
   * @return recurringPeriod
  **/
  @javax.annotation.Nullable
  public Object getRecurringPeriod() {
    return recurringPeriod;
  }

  public void setRecurringPeriod(Object recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
  }


  public Basket recurringNextPaymentDate(String recurringNextPaymentDate) {
    this.recurringNextPaymentDate = recurringNextPaymentDate;
    return this;
  }

   /**
   * Get recurringNextPaymentDate
   * @return recurringNextPaymentDate
  **/
  @javax.annotation.Nullable
  public String getRecurringNextPaymentDate() {
    return recurringNextPaymentDate;
  }

  public void setRecurringNextPaymentDate(String recurringNextPaymentDate) {
    this.recurringNextPaymentDate = recurringNextPaymentDate;
  }


  public Basket isPaymentMethodUpdate(Boolean isPaymentMethodUpdate) {
    this.isPaymentMethodUpdate = isPaymentMethodUpdate;
    return this;
  }

   /**
   * Get isPaymentMethodUpdate
   * @return isPaymentMethodUpdate
  **/
  @javax.annotation.Nullable
  public Boolean getIsPaymentMethodUpdate() {
    return isPaymentMethodUpdate;
  }

  public void setIsPaymentMethodUpdate(Boolean isPaymentMethodUpdate) {
    this.isPaymentMethodUpdate = isPaymentMethodUpdate;
  }


  public Basket returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Get returnUrl
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public Basket complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @javax.annotation.Nullable
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  public Basket tax(Object tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  public Object getTax() {
    return tax;
  }

  public void setTax(Object tax) {
    this.tax = tax;
  }


  public Basket username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public Basket discounts(List<Object> discounts) {
    this.discounts = discounts;
    return this;
  }

  public Basket addDiscountsItem(Object discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @javax.annotation.Nullable
  public List<Object> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<Object> discounts) {
    this.discounts = discounts;
  }


  public Basket coupons(List<Object> coupons) {
    this.coupons = coupons;
    return this;
  }

  public Basket addCouponsItem(Object couponsItem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * Get coupons
   * @return coupons
  **/
  @javax.annotation.Nullable
  public List<Object> getCoupons() {
    return coupons;
  }

  public void setCoupons(List<Object> coupons) {
    this.coupons = coupons;
  }


  public Basket giftcards(List<Object> giftcards) {
    this.giftcards = giftcards;
    return this;
  }

  public Basket addGiftcardsItem(Object giftcardsItem) {
    if (this.giftcards == null) {
      this.giftcards = new ArrayList<>();
    }
    this.giftcards.add(giftcardsItem);
    return this;
  }

   /**
   * Get giftcards
   * @return giftcards
  **/
  @javax.annotation.Nullable
  public List<Object> getGiftcards() {
    return giftcards;
  }

  public void setGiftcards(List<Object> giftcards) {
    this.giftcards = giftcards;
  }


  public Basket address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  public Basket rows(List<BasketItem> rows) {
    this.rows = rows;
    return this;
  }

  public Basket addRowsItem(BasketItem rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<BasketItem> getRows() {
    return rows;
  }

  public void setRows(List<BasketItem> rows) {
    this.rows = rows;
  }


  public Basket fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Browser fingerprint to identify the user
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public Basket creatorCode(String creatorCode) {
    this.creatorCode = creatorCode;
    return this;
  }

   /**
   * The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes
   * @return creatorCode
  **/
  @javax.annotation.Nullable
  public String getCreatorCode() {
    return creatorCode;
  }

  public void setCreatorCode(String creatorCode) {
    this.creatorCode = creatorCode;
  }


  public Basket roundup(Boolean roundup) {
    this.roundup = roundup;
    return this;
  }

   /**
   * Get roundup
   * @return roundup
  **/
  @javax.annotation.Nullable
  public Boolean getRoundup() {
    return roundup;
  }

  public void setRoundup(Boolean roundup) {
    this.roundup = roundup;
  }


  public Basket cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * Get cancelUrl
   * @return cancelUrl
  **/
  @javax.annotation.Nullable
  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }


  public Basket completeUrl(String completeUrl) {
    this.completeUrl = completeUrl;
    return this;
  }

   /**
   * Get completeUrl
   * @return completeUrl
  **/
  @javax.annotation.Nullable
  public String getCompleteUrl() {
    return completeUrl;
  }

  public void setCompleteUrl(String completeUrl) {
    this.completeUrl = completeUrl;
  }


  public Basket completeAutoRedirect(Boolean completeAutoRedirect) {
    this.completeAutoRedirect = completeAutoRedirect;
    return this;
  }

   /**
   * Get completeAutoRedirect
   * @return completeAutoRedirect
  **/
  @javax.annotation.Nullable
  public Boolean getCompleteAutoRedirect() {
    return completeAutoRedirect;
  }

  public void setCompleteAutoRedirect(Boolean completeAutoRedirect) {
    this.completeAutoRedirect = completeAutoRedirect;
  }


  public Basket custom(Object custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  public Object getCustom() {
    return custom;
  }

  public void setCustom(Object custom) {
    this.custom = custom;
  }


  public Basket links(BasketLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public BasketLinks getLinks() {
    return links;
  }

  public void setLinks(BasketLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Basket basket = (Basket) o;
    return Objects.equals(this.ident, basket.ident) &&
        Objects.equals(this.expire, basket.expire) &&
        Objects.equals(this.price, basket.price) &&
        Objects.equals(this.priceDetails, basket.priceDetails) &&
        Objects.equals(this.type, basket.type) &&
        Objects.equals(this.recurring, basket.recurring) &&
        Objects.equals(this.recurringPeriod, basket.recurringPeriod) &&
        Objects.equals(this.recurringNextPaymentDate, basket.recurringNextPaymentDate) &&
        Objects.equals(this.isPaymentMethodUpdate, basket.isPaymentMethodUpdate) &&
        Objects.equals(this.returnUrl, basket.returnUrl) &&
        Objects.equals(this.complete, basket.complete) &&
        Objects.equals(this.tax, basket.tax) &&
        Objects.equals(this.username, basket.username) &&
        Objects.equals(this.discounts, basket.discounts) &&
        Objects.equals(this.coupons, basket.coupons) &&
        Objects.equals(this.giftcards, basket.giftcards) &&
        Objects.equals(this.address, basket.address) &&
        Objects.equals(this.rows, basket.rows) &&
        Objects.equals(this.fingerprint, basket.fingerprint) &&
        Objects.equals(this.creatorCode, basket.creatorCode) &&
        Objects.equals(this.roundup, basket.roundup) &&
        Objects.equals(this.cancelUrl, basket.cancelUrl) &&
        Objects.equals(this.completeUrl, basket.completeUrl) &&
        Objects.equals(this.completeAutoRedirect, basket.completeAutoRedirect) &&
        Objects.equals(this.custom, basket.custom) &&
        Objects.equals(this.links, basket.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ident, expire, price, priceDetails, type, recurring, recurringPeriod, recurringNextPaymentDate, isPaymentMethodUpdate, returnUrl, complete, tax, username, discounts, coupons, giftcards, address, rows, fingerprint, creatorCode, roundup, cancelUrl, completeUrl, completeAutoRedirect, custom, links);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basket {\n");
    sb.append("    ident: ").append(toIndentedString(ident)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    recurringPeriod: ").append(toIndentedString(recurringPeriod)).append("\n");
    sb.append("    recurringNextPaymentDate: ").append(toIndentedString(recurringNextPaymentDate)).append("\n");
    sb.append("    isPaymentMethodUpdate: ").append(toIndentedString(isPaymentMethodUpdate)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    giftcards: ").append(toIndentedString(giftcards)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    creatorCode: ").append(toIndentedString(creatorCode)).append("\n");
    sb.append("    roundup: ").append(toIndentedString(roundup)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    completeUrl: ").append(toIndentedString(completeUrl)).append("\n");
    sb.append("    completeAutoRedirect: ").append(toIndentedString(completeAutoRedirect)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ident");
    openapiFields.add("expire");
    openapiFields.add("price");
    openapiFields.add("priceDetails");
    openapiFields.add("type");
    openapiFields.add("recurring");
    openapiFields.add("recurringPeriod");
    openapiFields.add("recurringNextPaymentDate");
    openapiFields.add("isPaymentMethodUpdate");
    openapiFields.add("returnUrl");
    openapiFields.add("complete");
    openapiFields.add("tax");
    openapiFields.add("username");
    openapiFields.add("discounts");
    openapiFields.add("coupons");
    openapiFields.add("giftcards");
    openapiFields.add("address");
    openapiFields.add("rows");
    openapiFields.add("fingerprint");
    openapiFields.add("creator_code");
    openapiFields.add("roundup");
    openapiFields.add("cancel_url");
    openapiFields.add("complete_url");
    openapiFields.add("complete_auto_redirect");
    openapiFields.add("custom");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Basket
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Basket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Basket is not found in the empty JSON string", Basket.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Basket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Basket` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ident") != null && !jsonObj.get("ident").isJsonNull()) && !jsonObj.get("ident").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ident` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ident").toString()));
      }
      if ((jsonObj.get("expire") != null && !jsonObj.get("expire").isJsonNull()) && !jsonObj.get("expire").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expire` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expire").toString()));
      }
      // validate the optional field `priceDetails`
      if (jsonObj.get("priceDetails") != null && !jsonObj.get("priceDetails").isJsonNull()) {
        PriceDetails.validateJsonElement(jsonObj.get("priceDetails"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("recurringNextPaymentDate") != null && !jsonObj.get("recurringNextPaymentDate").isJsonNull()) && !jsonObj.get("recurringNextPaymentDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringNextPaymentDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringNextPaymentDate").toString()));
      }
      if ((jsonObj.get("returnUrl") != null && !jsonObj.get("returnUrl").isJsonNull()) && !jsonObj.get("returnUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("discounts") != null && !jsonObj.get("discounts").isJsonNull() && !jsonObj.get("discounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("coupons") != null && !jsonObj.get("coupons").isJsonNull() && !jsonObj.get("coupons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupons` to be an array in the JSON string but got `%s`", jsonObj.get("coupons").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("giftcards") != null && !jsonObj.get("giftcards").isJsonNull() && !jsonObj.get("giftcards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `giftcards` to be an array in the JSON string but got `%s`", jsonObj.get("giftcards").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if (jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonNull()) {
        JsonArray jsonArrayrows = jsonObj.getAsJsonArray("rows");
        if (jsonArrayrows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
          }

          // validate the optional field `rows` (array)
          for (int i = 0; i < jsonArrayrows.size(); i++) {
            BasketItem.validateJsonElement(jsonArrayrows.get(i));
          };
        }
      }
      if ((jsonObj.get("fingerprint") != null && !jsonObj.get("fingerprint").isJsonNull()) && !jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
      }
      if ((jsonObj.get("creator_code") != null && !jsonObj.get("creator_code").isJsonNull()) && !jsonObj.get("creator_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_code").toString()));
      }
      if ((jsonObj.get("cancel_url") != null && !jsonObj.get("cancel_url").isJsonNull()) && !jsonObj.get("cancel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_url").toString()));
      }
      if ((jsonObj.get("complete_url") != null && !jsonObj.get("complete_url").isJsonNull()) && !jsonObj.get("complete_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complete_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complete_url").toString()));
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        BasketLinks.validateJsonElement(jsonObj.get("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Basket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Basket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Basket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Basket.class));

       return (TypeAdapter<T>) new TypeAdapter<Basket>() {
           @Override
           public void write(JsonWriter out, Basket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Basket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Basket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Basket
  * @throws IOException if the JSON string is invalid with respect to Basket
  */
  public static Basket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Basket.class);
  }

 /**
  * Convert an instance of Basket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
