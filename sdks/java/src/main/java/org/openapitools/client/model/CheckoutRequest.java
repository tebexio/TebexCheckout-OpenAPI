/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CheckoutItem;
import org.openapitools.client.model.CheckoutRequestBasket;
import org.openapitools.client.model.Sale;

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
 * CheckoutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T11:07:31.251589-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CheckoutRequest {
  public static final String SERIALIZED_NAME_BASKET = "basket";
  @SerializedName(SERIALIZED_NAME_BASKET)
  private CheckoutRequestBasket basket;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CheckoutItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_SALE = "sale";
  @SerializedName(SERIALIZED_NAME_SALE)
  private Sale sale;

  public CheckoutRequest() {
  }

  public CheckoutRequest basket(CheckoutRequestBasket basket) {
    this.basket = basket;
    return this;
  }

   /**
   * Get basket
   * @return basket
  **/
  @javax.annotation.Nonnull
  public CheckoutRequestBasket getBasket() {
    return basket;
  }

  public void setBasket(CheckoutRequestBasket basket) {
    this.basket = basket;
  }


  public CheckoutRequest items(List<CheckoutItem> items) {
    this.items = items;
    return this;
  }

  public CheckoutRequest addItemsItem(CheckoutItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An array of &#x60;Packages&#x60; in the basket.
   * @return items
  **/
  @javax.annotation.Nonnull
  public List<CheckoutItem> getItems() {
    return items;
  }

  public void setItems(List<CheckoutItem> items) {
    this.items = items;
  }


  public CheckoutRequest sale(Sale sale) {
    this.sale = sale;
    return this;
  }

   /**
   * Get sale
   * @return sale
  **/
  @javax.annotation.Nullable
  public Sale getSale() {
    return sale;
  }

  public void setSale(Sale sale) {
    this.sale = sale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutRequest checkoutRequest = (CheckoutRequest) o;
    return Objects.equals(this.basket, checkoutRequest.basket) &&
        Objects.equals(this.items, checkoutRequest.items) &&
        Objects.equals(this.sale, checkoutRequest.sale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basket, items, sale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutRequest {\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    sale: ").append(toIndentedString(sale)).append("\n");
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
    openapiFields.add("basket");
    openapiFields.add("items");
    openapiFields.add("sale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("basket");
    openapiRequiredFields.add("items");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CheckoutRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckoutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutRequest is not found in the empty JSON string", CheckoutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CheckoutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `basket`
      CheckoutRequestBasket.validateJsonElement(jsonObj.get("basket"));
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        CheckoutItem.validateJsonElement(jsonArrayitems.get(i));
      };
      // validate the optional field `sale`
      if (jsonObj.get("sale") != null && !jsonObj.get("sale").isJsonNull()) {
        Sale.validateJsonElement(jsonObj.get("sale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutRequest>() {
           @Override
           public void write(JsonWriter out, CheckoutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutRequest
  * @throws IOException if the JSON string is invalid with respect to CheckoutRequest
  */
  public static CheckoutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutRequest.class);
  }

 /**
  * Convert an instance of CheckoutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

