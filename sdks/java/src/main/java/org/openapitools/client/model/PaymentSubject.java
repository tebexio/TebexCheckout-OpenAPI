/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PaymentStatus;
import org.openapitools.client.model.PaymentSubjectCustomer;
import org.openapitools.client.model.PaymentSubjectFees;
import org.openapitools.client.model.PaymentSubjectPaymentMethod;
import org.openapitools.client.model.PaymentSubjectPrice;
import org.openapitools.client.model.PaymentSubjectProductsInner;
import org.openapitools.client.model.RevenueShare;
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
 * PaymentSubject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T15:30:05.763865-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class PaymentSubject {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentStatus status;

  public static final String SERIALIZED_NAME_PAYMENT_SEQUENCE = "payment_sequence";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SEQUENCE)
  private String paymentSequence;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private PaymentSubjectPrice price;

  public static final String SERIALIZED_NAME_PRICE_PAID = "price_paid";
  @SerializedName(SERIALIZED_NAME_PRICE_PAID)
  private PaymentSubjectPrice pricePaid;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentSubjectPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private PaymentSubjectFees fees;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private PaymentSubjectCustomer customer;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<PaymentSubjectProductsInner> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private List<Object> coupons = new ArrayList<>();

  public static final String SERIALIZED_NAME_GIFT_CARDS = "gift_cards";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS)
  private List<Object> giftCards = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECURRING_PAYMENT_REFERENCE = "recurring_payment_reference";
  @SerializedName(SERIALIZED_NAME_RECURRING_PAYMENT_REFERENCE)
  private String recurringPaymentReference;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Object custom;

  public static final String SERIALIZED_NAME_REVENUE_SHARE = "revenue_share";
  @SerializedName(SERIALIZED_NAME_REVENUE_SHARE)
  private List<RevenueShare> revenueShare = new ArrayList<>();

  public static final String SERIALIZED_NAME_DECLINE_REASON = "decline_reason";
  @SerializedName(SERIALIZED_NAME_DECLINE_REASON)
  private String declineReason;

  public PaymentSubject() {
  }

  public PaymentSubject transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public PaymentSubject status(PaymentStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public PaymentStatus getStatus() {
    return status;
  }

  public void setStatus(PaymentStatus status) {
    this.status = status;
  }


  public PaymentSubject paymentSequence(String paymentSequence) {
    this.paymentSequence = paymentSequence;
    return this;
  }

   /**
   * Get paymentSequence
   * @return paymentSequence
  **/
  @javax.annotation.Nullable
  public String getPaymentSequence() {
    return paymentSequence;
  }

  public void setPaymentSequence(String paymentSequence) {
    this.paymentSequence = paymentSequence;
  }


  public PaymentSubject createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentSubject price(PaymentSubjectPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public PaymentSubjectPrice getPrice() {
    return price;
  }

  public void setPrice(PaymentSubjectPrice price) {
    this.price = price;
  }


  public PaymentSubject pricePaid(PaymentSubjectPrice pricePaid) {
    this.pricePaid = pricePaid;
    return this;
  }

   /**
   * Get pricePaid
   * @return pricePaid
  **/
  @javax.annotation.Nullable
  public PaymentSubjectPrice getPricePaid() {
    return pricePaid;
  }

  public void setPricePaid(PaymentSubjectPrice pricePaid) {
    this.pricePaid = pricePaid;
  }


  public PaymentSubject paymentMethod(PaymentSubjectPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  public PaymentSubjectPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentSubjectPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentSubject fees(PaymentSubjectFees fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nullable
  public PaymentSubjectFees getFees() {
    return fees;
  }

  public void setFees(PaymentSubjectFees fees) {
    this.fees = fees;
  }


  public PaymentSubject customer(PaymentSubjectCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public PaymentSubjectCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentSubjectCustomer customer) {
    this.customer = customer;
  }


  public PaymentSubject products(List<PaymentSubjectProductsInner> products) {
    this.products = products;
    return this;
  }

  public PaymentSubject addProductsItem(PaymentSubjectProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  public List<PaymentSubjectProductsInner> getProducts() {
    return products;
  }

  public void setProducts(List<PaymentSubjectProductsInner> products) {
    this.products = products;
  }


  public PaymentSubject coupons(List<Object> coupons) {
    this.coupons = coupons;
    return this;
  }

  public PaymentSubject addCouponsItem(Object couponsItem) {
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


  public PaymentSubject giftCards(List<Object> giftCards) {
    this.giftCards = giftCards;
    return this;
  }

  public PaymentSubject addGiftCardsItem(Object giftCardsItem) {
    if (this.giftCards == null) {
      this.giftCards = new ArrayList<>();
    }
    this.giftCards.add(giftCardsItem);
    return this;
  }

   /**
   * Get giftCards
   * @return giftCards
  **/
  @javax.annotation.Nullable
  public List<Object> getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(List<Object> giftCards) {
    this.giftCards = giftCards;
  }


  public PaymentSubject recurringPaymentReference(String recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
    return this;
  }

   /**
   * Get recurringPaymentReference
   * @return recurringPaymentReference
  **/
  @javax.annotation.Nullable
  public String getRecurringPaymentReference() {
    return recurringPaymentReference;
  }

  public void setRecurringPaymentReference(String recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
  }


  public PaymentSubject custom(Object custom) {
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


  public PaymentSubject revenueShare(List<RevenueShare> revenueShare) {
    this.revenueShare = revenueShare;
    return this;
  }

  public PaymentSubject addRevenueShareItem(RevenueShare revenueShareItem) {
    if (this.revenueShare == null) {
      this.revenueShare = new ArrayList<>();
    }
    this.revenueShare.add(revenueShareItem);
    return this;
  }

   /**
   * Get revenueShare
   * @return revenueShare
  **/
  @javax.annotation.Nullable
  public List<RevenueShare> getRevenueShare() {
    return revenueShare;
  }

  public void setRevenueShare(List<RevenueShare> revenueShare) {
    this.revenueShare = revenueShare;
  }


  public PaymentSubject declineReason(String declineReason) {
    this.declineReason = declineReason;
    return this;
  }

   /**
   * Get declineReason
   * @return declineReason
  **/
  @javax.annotation.Nullable
  public String getDeclineReason() {
    return declineReason;
  }

  public void setDeclineReason(String declineReason) {
    this.declineReason = declineReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSubject paymentSubject = (PaymentSubject) o;
    return Objects.equals(this.transactionId, paymentSubject.transactionId) &&
        Objects.equals(this.status, paymentSubject.status) &&
        Objects.equals(this.paymentSequence, paymentSubject.paymentSequence) &&
        Objects.equals(this.createdAt, paymentSubject.createdAt) &&
        Objects.equals(this.price, paymentSubject.price) &&
        Objects.equals(this.pricePaid, paymentSubject.pricePaid) &&
        Objects.equals(this.paymentMethod, paymentSubject.paymentMethod) &&
        Objects.equals(this.fees, paymentSubject.fees) &&
        Objects.equals(this.customer, paymentSubject.customer) &&
        Objects.equals(this.products, paymentSubject.products) &&
        Objects.equals(this.coupons, paymentSubject.coupons) &&
        Objects.equals(this.giftCards, paymentSubject.giftCards) &&
        Objects.equals(this.recurringPaymentReference, paymentSubject.recurringPaymentReference) &&
        Objects.equals(this.custom, paymentSubject.custom) &&
        Objects.equals(this.revenueShare, paymentSubject.revenueShare) &&
        Objects.equals(this.declineReason, paymentSubject.declineReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, status, paymentSequence, createdAt, price, pricePaid, paymentMethod, fees, customer, products, coupons, giftCards, recurringPaymentReference, custom, revenueShare, declineReason);
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
    sb.append("class PaymentSubject {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentSequence: ").append(toIndentedString(paymentSequence)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricePaid: ").append(toIndentedString(pricePaid)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    giftCards: ").append(toIndentedString(giftCards)).append("\n");
    sb.append("    recurringPaymentReference: ").append(toIndentedString(recurringPaymentReference)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    revenueShare: ").append(toIndentedString(revenueShare)).append("\n");
    sb.append("    declineReason: ").append(toIndentedString(declineReason)).append("\n");
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
    openapiFields.add("transaction_id");
    openapiFields.add("status");
    openapiFields.add("payment_sequence");
    openapiFields.add("created_at");
    openapiFields.add("price");
    openapiFields.add("price_paid");
    openapiFields.add("payment_method");
    openapiFields.add("fees");
    openapiFields.add("customer");
    openapiFields.add("products");
    openapiFields.add("coupons");
    openapiFields.add("gift_cards");
    openapiFields.add("recurring_payment_reference");
    openapiFields.add("custom");
    openapiFields.add("revenue_share");
    openapiFields.add("decline_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentSubject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentSubject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSubject is not found in the empty JSON string", PaymentSubject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentSubject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentSubject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonNull()) && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        PaymentStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("payment_sequence") != null && !jsonObj.get("payment_sequence").isJsonNull()) && !jsonObj.get("payment_sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_sequence").toString()));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        PaymentSubjectPrice.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `price_paid`
      if (jsonObj.get("price_paid") != null && !jsonObj.get("price_paid").isJsonNull()) {
        PaymentSubjectPrice.validateJsonElement(jsonObj.get("price_paid"));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        PaymentSubjectPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      }
      // validate the optional field `fees`
      if (jsonObj.get("fees") != null && !jsonObj.get("fees").isJsonNull()) {
        PaymentSubjectFees.validateJsonElement(jsonObj.get("fees"));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        PaymentSubjectCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            PaymentSubjectProductsInner.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("coupons") != null && !jsonObj.get("coupons").isJsonNull() && !jsonObj.get("coupons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupons` to be an array in the JSON string but got `%s`", jsonObj.get("coupons").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("gift_cards") != null && !jsonObj.get("gift_cards").isJsonNull() && !jsonObj.get("gift_cards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `gift_cards` to be an array in the JSON string but got `%s`", jsonObj.get("gift_cards").toString()));
      }
      if ((jsonObj.get("recurring_payment_reference") != null && !jsonObj.get("recurring_payment_reference").isJsonNull()) && !jsonObj.get("recurring_payment_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurring_payment_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurring_payment_reference").toString()));
      }
      if (jsonObj.get("revenue_share") != null && !jsonObj.get("revenue_share").isJsonNull()) {
        JsonArray jsonArrayrevenueShare = jsonObj.getAsJsonArray("revenue_share");
        if (jsonArrayrevenueShare != null) {
          // ensure the json data is an array
          if (!jsonObj.get("revenue_share").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `revenue_share` to be an array in the JSON string but got `%s`", jsonObj.get("revenue_share").toString()));
          }

          // validate the optional field `revenue_share` (array)
          for (int i = 0; i < jsonArrayrevenueShare.size(); i++) {
            RevenueShare.validateJsonElement(jsonArrayrevenueShare.get(i));
          };
        }
      }
      if ((jsonObj.get("decline_reason") != null && !jsonObj.get("decline_reason").isJsonNull()) && !jsonObj.get("decline_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decline_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decline_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSubject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSubject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSubject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSubject.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSubject>() {
           @Override
           public void write(JsonWriter out, PaymentSubject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentSubject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentSubject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSubject
  * @throws IOException if the JSON string is invalid with respect to PaymentSubject
  */
  public static PaymentSubject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSubject.class);
  }

 /**
  * Convert an instance of PaymentSubject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

