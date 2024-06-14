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
import org.openapitools.client.model.Sale;
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
 * PriceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-14T12:22:39.312899-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class PriceDetails {
  public static final String SERIALIZED_NAME_FULL_PRICE = "fullPrice";
  @SerializedName(SERIALIZED_NAME_FULL_PRICE)
  private Float fullPrice;

  public static final String SERIALIZED_NAME_SUB_TOTAL = "subTotal";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL)
  private Float subTotal;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<Object> discounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Float total;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Float tax;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Float balance;

  public static final String SERIALIZED_NAME_SALES = "sales";
  @SerializedName(SERIALIZED_NAME_SALES)
  private List<Sale> sales = new ArrayList<>();

  public static final String SERIALIZED_NAME_GIFTCARDS = "giftcards";
  @SerializedName(SERIALIZED_NAME_GIFTCARDS)
  private List<Object> giftcards = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_RECURRING_PERIOD = "recurringPeriod";
  @SerializedName(SERIALIZED_NAME_RECURRING_PERIOD)
  private Object recurringPeriod;

  public static final String SERIALIZED_NAME_RECURRING_NEXT_PAYMENT_DATE = "recurringNextPaymentDate";
  @SerializedName(SERIALIZED_NAME_RECURRING_NEXT_PAYMENT_DATE)
  private Object recurringNextPaymentDate;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_ROUND_UP = "roundUp";
  @SerializedName(SERIALIZED_NAME_ROUND_UP)
  private BigDecimal roundUp;

  public PriceDetails() {
  }

  public PriceDetails fullPrice(Float fullPrice) {
    this.fullPrice = fullPrice;
    return this;
  }

   /**
   * Get fullPrice
   * @return fullPrice
  **/
  @javax.annotation.Nullable
  public Float getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(Float fullPrice) {
    this.fullPrice = fullPrice;
  }


  public PriceDetails subTotal(Float subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @javax.annotation.Nullable
  public Float getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Float subTotal) {
    this.subTotal = subTotal;
  }


  public PriceDetails discounts(List<Object> discounts) {
    this.discounts = discounts;
    return this;
  }

  public PriceDetails addDiscountsItem(Object discountsItem) {
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


  public PriceDetails total(Float total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }


  public PriceDetails tax(Float tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  public Float getTax() {
    return tax;
  }

  public void setTax(Float tax) {
    this.tax = tax;
  }


  public PriceDetails balance(Float balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  public Float getBalance() {
    return balance;
  }

  public void setBalance(Float balance) {
    this.balance = balance;
  }


  public PriceDetails sales(List<Sale> sales) {
    this.sales = sales;
    return this;
  }

  public PriceDetails addSalesItem(Sale salesItem) {
    if (this.sales == null) {
      this.sales = new ArrayList<>();
    }
    this.sales.add(salesItem);
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @javax.annotation.Nullable
  public List<Sale> getSales() {
    return sales;
  }

  public void setSales(List<Sale> sales) {
    this.sales = sales;
  }


  public PriceDetails giftcards(List<Object> giftcards) {
    this.giftcards = giftcards;
    return this;
  }

  public PriceDetails addGiftcardsItem(Object giftcardsItem) {
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


  public PriceDetails recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * Contains recurring amount. Limited to 1 subscription package in the basket at a time.
   * @return recurring
  **/
  @javax.annotation.Nullable
  public Boolean getRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public PriceDetails recurringPeriod(Object recurringPeriod) {
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


  public PriceDetails recurringNextPaymentDate(Object recurringNextPaymentDate) {
    this.recurringNextPaymentDate = recurringNextPaymentDate;
    return this;
  }

   /**
   * Get recurringNextPaymentDate
   * @return recurringNextPaymentDate
  **/
  @javax.annotation.Nullable
  public Object getRecurringNextPaymentDate() {
    return recurringNextPaymentDate;
  }

  public void setRecurringNextPaymentDate(Object recurringNextPaymentDate) {
    this.recurringNextPaymentDate = recurringNextPaymentDate;
  }


  public PriceDetails username(String username) {
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


  public PriceDetails roundUp(BigDecimal roundUp) {
    this.roundUp = roundUp;
    return this;
  }

   /**
   * Get roundUp
   * @return roundUp
  **/
  @javax.annotation.Nullable
  public BigDecimal getRoundUp() {
    return roundUp;
  }

  public void setRoundUp(BigDecimal roundUp) {
    this.roundUp = roundUp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDetails priceDetails = (PriceDetails) o;
    return Objects.equals(this.fullPrice, priceDetails.fullPrice) &&
        Objects.equals(this.subTotal, priceDetails.subTotal) &&
        Objects.equals(this.discounts, priceDetails.discounts) &&
        Objects.equals(this.total, priceDetails.total) &&
        Objects.equals(this.tax, priceDetails.tax) &&
        Objects.equals(this.balance, priceDetails.balance) &&
        Objects.equals(this.sales, priceDetails.sales) &&
        Objects.equals(this.giftcards, priceDetails.giftcards) &&
        Objects.equals(this.recurring, priceDetails.recurring) &&
        Objects.equals(this.recurringPeriod, priceDetails.recurringPeriod) &&
        Objects.equals(this.recurringNextPaymentDate, priceDetails.recurringNextPaymentDate) &&
        Objects.equals(this.username, priceDetails.username) &&
        Objects.equals(this.roundUp, priceDetails.roundUp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullPrice, subTotal, discounts, total, tax, balance, sales, giftcards, recurring, recurringPeriod, recurringNextPaymentDate, username, roundUp);
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
    sb.append("class PriceDetails {\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    giftcards: ").append(toIndentedString(giftcards)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    recurringPeriod: ").append(toIndentedString(recurringPeriod)).append("\n");
    sb.append("    recurringNextPaymentDate: ").append(toIndentedString(recurringNextPaymentDate)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    roundUp: ").append(toIndentedString(roundUp)).append("\n");
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
    openapiFields.add("fullPrice");
    openapiFields.add("subTotal");
    openapiFields.add("discounts");
    openapiFields.add("total");
    openapiFields.add("tax");
    openapiFields.add("balance");
    openapiFields.add("sales");
    openapiFields.add("giftcards");
    openapiFields.add("recurring");
    openapiFields.add("recurringPeriod");
    openapiFields.add("recurringNextPaymentDate");
    openapiFields.add("username");
    openapiFields.add("roundUp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceDetails is not found in the empty JSON string", PriceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("discounts") != null && !jsonObj.get("discounts").isJsonNull() && !jsonObj.get("discounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
      }
      if (jsonObj.get("sales") != null && !jsonObj.get("sales").isJsonNull()) {
        JsonArray jsonArraysales = jsonObj.getAsJsonArray("sales");
        if (jsonArraysales != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sales").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sales` to be an array in the JSON string but got `%s`", jsonObj.get("sales").toString()));
          }

          // validate the optional field `sales` (array)
          for (int i = 0; i < jsonArraysales.size(); i++) {
            Sale.validateJsonElement(jsonArraysales.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("giftcards") != null && !jsonObj.get("giftcards").isJsonNull() && !jsonObj.get("giftcards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `giftcards` to be an array in the JSON string but got `%s`", jsonObj.get("giftcards").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceDetails>() {
           @Override
           public void write(JsonWriter out, PriceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceDetails
  * @throws IOException if the JSON string is invalid with respect to PriceDetails
  */
  public static PriceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceDetails.class);
  }

 /**
  * Convert an instance of PriceDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

