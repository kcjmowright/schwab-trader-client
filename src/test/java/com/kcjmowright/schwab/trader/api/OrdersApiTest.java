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

import com.kcjmowright.schwab.trader.model.ApiOrderStatus;
import com.kcjmowright.schwab.trader.model.Order;
import com.kcjmowright.schwab.trader.model.OrderRequest;
import com.kcjmowright.schwab.trader.model.PreviewOrder;
import com.kcjmowright.schwab.trader.model.ServiceError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Ignore
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    /**
     * Cancel an order for a specific account
     *
     * Cancel a specific order for a specific account&lt;br&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOrderTest() {
        String accountNumber = null;
        Long orderId = null;
        api.cancelOrder(accountNumber, orderId);

        // TODO: test validations
    }
    /**
     * Get a specific order by its ID, for a specific account
     *
     * Get a specific order by its ID, for a specific account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() {
        String accountNumber = null;
        Long orderId = null;
        Order response = api.getOrder(accountNumber, orderId);

        // TODO: test validations
    }
    /**
     * Get all orders for a specific account.
     *
     * All orders for a specific account. Orders retrieved can be filtered based on input parameters below. Maximum date range is 1 year.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersByPathParamTest() {
        String accountNumber = null;
        String fromEnteredTime = null;
        String toEnteredTime = null;
        Long maxResults = null;
        ApiOrderStatus status = null;
        List<Order> response = api.getOrdersByPathParam(accountNumber, fromEnteredTime, toEnteredTime, maxResults, status);

        // TODO: test validations
    }
    /**
     * Get all orders for all accounts
     *
     * Get all orders for all accounts&lt;br&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersByQueryParamTest() {
        String fromEnteredTime = null;
        String toEnteredTime = null;
        Long maxResults = null;
        ApiOrderStatus status = null;
        List<Order> response = api.getOrdersByQueryParam(fromEnteredTime, toEnteredTime, maxResults, status);

        // TODO: test validations
    }
    /**
     * Place order for a specific account.
     *
     * Place an order for a specific account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() {
        OrderRequest body = null;
        String accountNumber = null;
        api.placeOrder(body, accountNumber);

        // TODO: test validations
    }
    /**
     * Preview order for a specific account. **Coming Soon**.
     *
     * Preview an order for a specific account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previewOrderTest() {
        PreviewOrder body = null;
        String accountNumber = null;
        PreviewOrder response = api.previewOrder(body, accountNumber);

        // TODO: test validations
    }
    /**
     * Replace order for a specific account
     *
     * Replace an existing order for an account. The existing order will be replaced by the new               order. Once replaced, the old order will be canceled and a new order will be created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceOrderTest() {
        OrderRequest body = null;
        String accountNumber = null;
        Long orderId = null;
        api.replaceOrder(body, accountNumber, orderId);

        // TODO: test validations
    }
}
