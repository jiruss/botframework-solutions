/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An update to a payment request
 */
@ApiModel(description = "An update to a payment request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class PaymentRequestUpdate {
  @SerializedName("id")
  private String id = null;

  @SerializedName("details")
  private PaymentDetails details = null;

  @SerializedName("shippingAddress")
  private PaymentAddress shippingAddress = null;

  @SerializedName("shippingOption")
  private String shippingOption = null;

  public PaymentRequestUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID for the payment request to update
   * @return id
  **/
  @ApiModelProperty(value = "ID for the payment request to update")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentRequestUpdate details(PaymentDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Update payment details
   * @return details
  **/
  @ApiModelProperty(value = "Update payment details")
  public PaymentDetails getDetails() {
    return details;
  }

  public void setDetails(PaymentDetails details) {
    this.details = details;
  }

  public PaymentRequestUpdate shippingAddress(PaymentAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Updated shipping address
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "Updated shipping address")
  public PaymentAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PaymentAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PaymentRequestUpdate shippingOption(String shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

   /**
   * Updated shipping options
   * @return shippingOption
  **/
  @ApiModelProperty(value = "Updated shipping options")
  public String getShippingOption() {
    return shippingOption;
  }

  public void setShippingOption(String shippingOption) {
    this.shippingOption = shippingOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestUpdate paymentRequestUpdate = (PaymentRequestUpdate) o;
    return Objects.equals(this.id, paymentRequestUpdate.id) &&
        Objects.equals(this.details, paymentRequestUpdate.details) &&
        Objects.equals(this.shippingAddress, paymentRequestUpdate.shippingAddress) &&
        Objects.equals(this.shippingOption, paymentRequestUpdate.shippingOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, details, shippingAddress, shippingOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestUpdate {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingOption: ").append(toIndentedString(shippingOption)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
