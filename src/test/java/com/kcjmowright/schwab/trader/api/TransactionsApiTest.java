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

package com.kcjmowright.schwab.trader.api;

import com.kcjmowright.schwab.trader.model.ServiceError;
import com.kcjmowright.schwab.trader.model.Transaction;
import com.kcjmowright.schwab.trader.model.TransactionType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
@Ignore
public class TransactionsApiTest {

    private final TransactionsApi api = new TransactionsApi();

    /**
     * Get specific transaction information for a specific account
     *
     * Get specific transaction information for a specific account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsByIdTest() {
        String accountNumber = null;
        Long transactionId = null;
        List<Transaction> response = api.getTransactionsById(accountNumber, transactionId);

        // TODO: test validations
    }
    /**
     * Get all transactions information for a specific account.
     *
     * All transactions for a specific account. Maximum number of transactions in response is 3000. Maximum date range is 1 year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsByPathParamTest() {
        String accountNumber = null;
        String startDate = null;
        String endDate = null;
        TransactionType types = null;
        String symbol = null;
        List<Transaction> response = api.getTransactionsByPathParam(accountNumber, startDate, endDate, types, symbol);

        // TODO: test validations
    }
}
