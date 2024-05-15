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
import java.util.Arrays;

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
 * CreateBasketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-15T14:31:52.188140-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class CreateBasketRequest {
  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_COMPLETE_URL = "complete_url";
  @SerializedName(SERIALIZED_NAME_COMPLETE_URL)
  private String completeUrl;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Object custom;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_COMPLETE_AUTO_REDIRECT = "complete_auto_redirect";
  @SerializedName(SERIALIZED_NAME_COMPLETE_AUTO_REDIRECT)
  private Boolean completeAutoRedirect;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREATOR_CODE = "creator_code";
  @SerializedName(SERIALIZED_NAME_CREATOR_CODE)
  private String creatorCode;

  public CreateBasketRequest() {
  }

  public CreateBasketRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The URL a customer can return to without completing checkout
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public CreateBasketRequest completeUrl(String completeUrl) {
    this.completeUrl = completeUrl;
    return this;
  }

   /**
   * URL the customer can return to after completing payment
   * @return completeUrl
  **/
  @javax.annotation.Nullable
  public String getCompleteUrl() {
    return completeUrl;
  }

  public void setCompleteUrl(String completeUrl) {
    this.completeUrl = completeUrl;
  }


  public CreateBasketRequest custom(Object custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Any custom data to be passed through the request. This will be returned in a post-completion webhook.
   * @return custom
  **/
  @javax.annotation.Nullable
  public Object getCustom() {
    return custom;
  }

  public void setCustom(Object custom) {
    this.custom = custom;
  }


  public CreateBasketRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the customer
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreateBasketRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the customer
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreateBasketRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the customer
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CreateBasketRequest expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * An ISO8601 formatted date. After this date the basket cannot be used to checkout.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public CreateBasketRequest completeAutoRedirect(Boolean completeAutoRedirect) {
    this.completeAutoRedirect = completeAutoRedirect;
    return this;
  }

   /**
   * Automatically redirect to the complete_url provided
   * @return completeAutoRedirect
  **/
  @javax.annotation.Nullable
  public Boolean getCompleteAutoRedirect() {
    return completeAutoRedirect;
  }

  public void setCompleteAutoRedirect(Boolean completeAutoRedirect) {
    this.completeAutoRedirect = completeAutoRedirect;
  }


  public CreateBasketRequest country(String country) {
    this.country = country;
    return this;
  }

   /**
   * An ISO 3166-1 alpha-2 character code representing the customer&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public CreateBasketRequest creatorCode(String creatorCode) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBasketRequest createBasketRequest = (CreateBasketRequest) o;
    return Objects.equals(this.returnUrl, createBasketRequest.returnUrl) &&
        Objects.equals(this.completeUrl, createBasketRequest.completeUrl) &&
        Objects.equals(this.custom, createBasketRequest.custom) &&
        Objects.equals(this.firstName, createBasketRequest.firstName) &&
        Objects.equals(this.lastName, createBasketRequest.lastName) &&
        Objects.equals(this.email, createBasketRequest.email) &&
        Objects.equals(this.expiresAt, createBasketRequest.expiresAt) &&
        Objects.equals(this.completeAutoRedirect, createBasketRequest.completeAutoRedirect) &&
        Objects.equals(this.country, createBasketRequest.country) &&
        Objects.equals(this.creatorCode, createBasketRequest.creatorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, completeUrl, custom, firstName, lastName, email, expiresAt, completeAutoRedirect, country, creatorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBasketRequest {\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    completeUrl: ").append(toIndentedString(completeUrl)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    completeAutoRedirect: ").append(toIndentedString(completeAutoRedirect)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    creatorCode: ").append(toIndentedString(creatorCode)).append("\n");
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
    openapiFields.add("return_url");
    openapiFields.add("complete_url");
    openapiFields.add("custom");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("expires_at");
    openapiFields.add("complete_auto_redirect");
    openapiFields.add("country");
    openapiFields.add("creator_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBasketRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBasketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBasketRequest is not found in the empty JSON string", CreateBasketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBasketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBasketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonNull()) && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
      if ((jsonObj.get("complete_url") != null && !jsonObj.get("complete_url").isJsonNull()) && !jsonObj.get("complete_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complete_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complete_url").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) && !jsonObj.get("expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_at").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("creator_code") != null && !jsonObj.get("creator_code").isJsonNull()) && !jsonObj.get("creator_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBasketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBasketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBasketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBasketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBasketRequest>() {
           @Override
           public void write(JsonWriter out, CreateBasketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBasketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBasketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBasketRequest
  * @throws IOException if the JSON string is invalid with respect to CreateBasketRequest
  */
  public static CreateBasketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBasketRequest.class);
  }

 /**
  * Convert an instance of CreateBasketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

