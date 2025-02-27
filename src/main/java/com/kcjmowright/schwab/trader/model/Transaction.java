/*
 * Trader API - Account Access and User Preferences
 * Schwab Trader API access to Account, Order entry and User Preferences
 *
 * OpenAPI spec version: 1.0.0
 * Contact: TraderAPI@Schwab.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.kcjmowright.schwab.trader.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.kcjmowright.schwab.trader.model.TransactionType;
import com.kcjmowright.schwab.trader.model.TransferItem;
import com.kcjmowright.schwab.trader.model.UserDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Transaction
 */


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "activityType", visible = true )
@JsonSubTypes({
})

public class Transaction {
  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("user")
  private UserDetails user = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("type")
  private TransactionType type = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    VALID("VALID"),
    INVALID("INVALID"),
    PENDING("PENDING"),
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets subAccount
   */
  public enum SubAccountEnum {
    CASH("CASH"),
    MARGIN("MARGIN"),
    SHORT("SHORT"),
    DIV("DIV"),
    INCOME("INCOME"),
    UNKNOWN("UNKNOWN");

    private String value;

    SubAccountEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static SubAccountEnum fromValue(String input) {
      for (SubAccountEnum b : SubAccountEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("subAccount")
  private SubAccountEnum subAccount = null;

  @JsonProperty("tradeDate")
  private OffsetDateTime tradeDate = null;

  @JsonProperty("settlementDate")
  private OffsetDateTime settlementDate = null;

  @JsonProperty("positionId")
  private Long positionId = null;

  @JsonProperty("orderId")
  private Long orderId = null;

  @JsonProperty("netAmount")
  private Double netAmount = null;

  /**
   * Gets or Sets activityType
   */
  public enum ActivityTypeEnum {
    ACTIVITY_CORRECTION("ACTIVITY_CORRECTION"),
    EXECUTION("EXECUTION"),
    ORDER_ACTION("ORDER_ACTION"),
    TRANSFER("TRANSFER"),
    UNKNOWN("UNKNOWN");

    private String value;

    ActivityTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ActivityTypeEnum fromValue(String input) {
      for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonTypeId
  private ActivityTypeEnum activityType = null;

  @JsonProperty("transferItems")
  private List<TransferItem> transferItems = null;

  public Transaction activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @Schema(description = "")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public Transaction time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Transaction user(UserDetails user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public UserDetails getUser() {
    return user;
  }

  public void setUser(UserDetails user) {
    this.user = user;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @Schema(description = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Transaction type(TransactionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Transaction subAccount(SubAccountEnum subAccount) {
    this.subAccount = subAccount;
    return this;
  }

   /**
   * Get subAccount
   * @return subAccount
  **/
  @Schema(description = "")
  public SubAccountEnum getSubAccount() {
    return subAccount;
  }

  public void setSubAccount(SubAccountEnum subAccount) {
    this.subAccount = subAccount;
  }

  public Transaction tradeDate(OffsetDateTime tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

   /**
   * Get tradeDate
   * @return tradeDate
  **/
  @Schema(description = "")
  public OffsetDateTime getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(OffsetDateTime tradeDate) {
    this.tradeDate = tradeDate;
  }

  public Transaction settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @Schema(description = "")
  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }

  public Transaction positionId(Long positionId) {
    this.positionId = positionId;
    return this;
  }

   /**
   * Get positionId
   * @return positionId
  **/
  @Schema(description = "")
  public Long getPositionId() {
    return positionId;
  }

  public void setPositionId(Long positionId) {
    this.positionId = positionId;
  }

  public Transaction orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Transaction netAmount(Double netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Get netAmount
   * @return netAmount
  **/
  @Schema(description = "")
  public Double getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(Double netAmount) {
    this.netAmount = netAmount;
  }

  public Transaction activityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @Schema(description = "")
  public ActivityTypeEnum getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }

  public Transaction transferItems(List<TransferItem> transferItems) {
    this.transferItems = transferItems;
    return this;
  }

  public Transaction addTransferItemsItem(TransferItem transferItemsItem) {
    if (this.transferItems == null) {
      this.transferItems = new ArrayList<>();
    }
    this.transferItems.add(transferItemsItem);
    return this;
  }

   /**
   * Get transferItems
   * @return transferItems
  **/
  @Schema(description = "")
  public List<TransferItem> getTransferItems() {
    return transferItems;
  }

  public void setTransferItems(List<TransferItem> transferItems) {
    this.transferItems = transferItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.activityId, transaction.activityId) &&
        Objects.equals(this.time, transaction.time) &&
        Objects.equals(this.user, transaction.user) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.accountNumber, transaction.accountNumber) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.subAccount, transaction.subAccount) &&
        Objects.equals(this.tradeDate, transaction.tradeDate) &&
        Objects.equals(this.settlementDate, transaction.settlementDate) &&
        Objects.equals(this.positionId, transaction.positionId) &&
        Objects.equals(this.orderId, transaction.orderId) &&
        Objects.equals(this.netAmount, transaction.netAmount) &&
        Objects.equals(this.activityType, transaction.activityType) &&
        Objects.equals(this.transferItems, transaction.transferItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, time, user, description, accountNumber, type, status, subAccount, tradeDate, settlementDate, positionId, orderId, netAmount, activityType, transferItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subAccount: ").append(toIndentedString(subAccount)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    transferItems: ").append(toIndentedString(transferItems)).append("\n");
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
