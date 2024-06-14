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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.BasketRowMeta;
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
 * BasketRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-14T12:22:39.312899-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BasketRow {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_BASKET = "basket";
  @SerializedName(SERIALIZED_NAME_BASKET)
  private Integer basket;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private Integer _package;

  public static final String SERIALIZED_NAME_OVERRIDE = "override";
  @SerializedName(SERIALIZED_NAME_OVERRIDE)
  private Integer override;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private Integer server;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_GIFT_USERNAME_ID = "gift_username_id";
  @SerializedName(SERIALIZED_NAME_GIFT_USERNAME_ID)
  private Integer giftUsernameId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Object options;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_RECURRING_PERIOD = "recurring_period";
  @SerializedName(SERIALIZED_NAME_RECURRING_PERIOD)
  private String recurringPeriod;

  public static final String SERIALIZED_NAME_RECURRING_NEXT_PAYMENT_DATE = "recurring_next_payment_date";
  @SerializedName(SERIALIZED_NAME_RECURRING_NEXT_PAYMENT_DATE)
  private OffsetDateTime recurringNextPaymentDate;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private BasketRowMeta meta;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Object custom;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_RECURRING_PRICE = "recurring_price";
  @SerializedName(SERIALIZED_NAME_RECURRING_PRICE)
  private Float recurringPrice;

  public BasketRow() {
  }

  public BasketRow id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public BasketRow basket(Integer basket) {
    this.basket = basket;
    return this;
  }

   /**
   * Numeric basket ID
   * @return basket
  **/
  @javax.annotation.Nullable
  public Integer getBasket() {
    return basket;
  }

  public void setBasket(Integer basket) {
    this.basket = basket;
  }


  public BasketRow _package(Integer _package) {
    this._package = _package;
    return this;
  }

   /**
   * Package ID associated with this item
   * @return _package
  **/
  @javax.annotation.Nullable
  public Integer getPackage() {
    return _package;
  }

  public void setPackage(Integer _package) {
    this._package = _package;
  }


  public BasketRow override(Integer override) {
    this.override = override;
    return this;
  }

   /**
   * Package ID associated with this item
   * @return override
  **/
  @javax.annotation.Nullable
  public Integer getOverride() {
    return override;
  }

  public void setOverride(Integer override) {
    this.override = override;
  }


  public BasketRow quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public BasketRow server(Integer server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  public Integer getServer() {
    return server;
  }

  public void setServer(Integer server) {
    this.server = server;
  }


  public BasketRow price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }


  public BasketRow giftUsernameId(Integer giftUsernameId) {
    this.giftUsernameId = giftUsernameId;
    return this;
  }

   /**
   * Get giftUsernameId
   * @return giftUsernameId
  **/
  @javax.annotation.Nullable
  public Integer getGiftUsernameId() {
    return giftUsernameId;
  }

  public void setGiftUsernameId(Integer giftUsernameId) {
    this.giftUsernameId = giftUsernameId;
  }


  public BasketRow options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }


  public BasketRow recurring(Boolean recurring) {
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


  public BasketRow recurringPeriod(String recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
    return this;
  }

   /**
   * Get recurringPeriod
   * @return recurringPeriod
  **/
  @javax.annotation.Nullable
  public String getRecurringPeriod() {
    return recurringPeriod;
  }

  public void setRecurringPeriod(String recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
  }


  public BasketRow recurringNextPaymentDate(OffsetDateTime recurringNextPaymentDate) {
    this.recurringNextPaymentDate = recurringNextPaymentDate;
    return this;
  }

   /**
   * Get recurringNextPaymentDate
   * @return recurringNextPaymentDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRecurringNextPaymentDate() {
    return recurringNextPaymentDate;
  }

  public void setRecurringNextPaymentDate(OffsetDateTime recurringNextPaymentDate) {
    this.recurringNextPaymentDate = recurringNextPaymentDate;
  }


  public BasketRow meta(BasketRowMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  public BasketRowMeta getMeta() {
    return meta;
  }

  public void setMeta(BasketRowMeta meta) {
    this.meta = meta;
  }


  public BasketRow custom(Object custom) {
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


  public BasketRow imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public BasketRow recurringPrice(Float recurringPrice) {
    this.recurringPrice = recurringPrice;
    return this;
  }

   /**
   * Get recurringPrice
   * @return recurringPrice
  **/
  @javax.annotation.Nullable
  public Float getRecurringPrice() {
    return recurringPrice;
  }

  public void setRecurringPrice(Float recurringPrice) {
    this.recurringPrice = recurringPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketRow basketRow = (BasketRow) o;
    return Objects.equals(this.id, basketRow.id) &&
        Objects.equals(this.basket, basketRow.basket) &&
        Objects.equals(this._package, basketRow._package) &&
        Objects.equals(this.override, basketRow.override) &&
        Objects.equals(this.quantity, basketRow.quantity) &&
        Objects.equals(this.server, basketRow.server) &&
        Objects.equals(this.price, basketRow.price) &&
        Objects.equals(this.giftUsernameId, basketRow.giftUsernameId) &&
        Objects.equals(this.options, basketRow.options) &&
        Objects.equals(this.recurring, basketRow.recurring) &&
        Objects.equals(this.recurringPeriod, basketRow.recurringPeriod) &&
        Objects.equals(this.recurringNextPaymentDate, basketRow.recurringNextPaymentDate) &&
        Objects.equals(this.meta, basketRow.meta) &&
        Objects.equals(this.custom, basketRow.custom) &&
        Objects.equals(this.imageUrl, basketRow.imageUrl) &&
        Objects.equals(this.recurringPrice, basketRow.recurringPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, basket, _package, override, quantity, server, price, giftUsernameId, options, recurring, recurringPeriod, recurringNextPaymentDate, meta, custom, imageUrl, recurringPrice);
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
    sb.append("class BasketRow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    giftUsernameId: ").append(toIndentedString(giftUsernameId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    recurringPeriod: ").append(toIndentedString(recurringPeriod)).append("\n");
    sb.append("    recurringNextPaymentDate: ").append(toIndentedString(recurringNextPaymentDate)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    recurringPrice: ").append(toIndentedString(recurringPrice)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("basket");
    openapiFields.add("package");
    openapiFields.add("override");
    openapiFields.add("quantity");
    openapiFields.add("server");
    openapiFields.add("price");
    openapiFields.add("gift_username_id");
    openapiFields.add("options");
    openapiFields.add("recurring");
    openapiFields.add("recurring_period");
    openapiFields.add("recurring_next_payment_date");
    openapiFields.add("meta");
    openapiFields.add("custom");
    openapiFields.add("image_url");
    openapiFields.add("recurring_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BasketRow
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BasketRow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BasketRow is not found in the empty JSON string", BasketRow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BasketRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BasketRow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recurring_period") != null && !jsonObj.get("recurring_period").isJsonNull()) && !jsonObj.get("recurring_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurring_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurring_period").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        BasketRowMeta.validateJsonElement(jsonObj.get("meta"));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BasketRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BasketRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BasketRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BasketRow.class));

       return (TypeAdapter<T>) new TypeAdapter<BasketRow>() {
           @Override
           public void write(JsonWriter out, BasketRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BasketRow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BasketRow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BasketRow
  * @throws IOException if the JSON string is invalid with respect to BasketRow
  */
  public static BasketRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BasketRow.class);
  }

 /**
  * Convert an instance of BasketRow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

