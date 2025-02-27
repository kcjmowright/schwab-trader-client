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

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Account
 */
public class Account {
  @JsonProperty("securitiesAccount")
  private SecuritiesAccount securitiesAccount = null;

  public Account securitiesAccount(SecuritiesAccount securitiesAccount) {
    this.securitiesAccount = securitiesAccount;
    return this;
  }

   /**
   * Get securitiesAccount
   * @return securitiesAccount
  **/
  @Schema(description = "")
  public SecuritiesAccount getSecuritiesAccount() {
    return securitiesAccount;
  }

  public void setSecuritiesAccount(SecuritiesAccount securitiesAccount) {
    this.securitiesAccount = securitiesAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.securitiesAccount, account.securitiesAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securitiesAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");

    sb.append("    securitiesAccount: ").append(toIndentedString(securitiesAccount)).append("\n");
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
