# OrdersApi

All URIs are relative to *https://api.schwabapi.com/trader/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](OrdersApi.md#cancelOrder) | **DELETE** /accounts/{accountNumber}/orders/{orderId} | Cancel an order for a specific account
[**getOrder**](OrdersApi.md#getOrder) | **GET** /accounts/{accountNumber}/orders/{orderId} | Get a specific order by its ID, for a specific account
[**getOrdersByPathParam**](OrdersApi.md#getOrdersByPathParam) | **GET** /accounts/{accountNumber}/orders | Get all orders for a specific account.
[**getOrdersByQueryParam**](OrdersApi.md#getOrdersByQueryParam) | **GET** /orders | Get all orders for all accounts
[**placeOrder**](OrdersApi.md#placeOrder) | **POST** /accounts/{accountNumber}/orders | Place order for a specific account.
[**previewOrder**](OrdersApi.md#previewOrder) | **POST** /accounts/{accountNumber}/previewOrder | Preview order for a specific account. **Coming Soon**.
[**replaceOrder**](OrdersApi.md#replaceOrder) | **PUT** /accounts/{accountNumber}/orders/{orderId} | Replace order for a specific account

<a name="cancelOrder"></a>
# **cancelOrder**
> cancelOrder(accountNumber, orderId)

Cancel an order for a specific account

Cancel a specific order for a specific account&lt;br&gt;

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
Long orderId = 789L; // Long | The ID of the order being cancelled
try {
    apiInstance.cancelOrder(accountNumber, orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| The encrypted ID of the account |
 **orderId** | **Long**| The ID of the order being cancelled |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(accountNumber, orderId)

Get a specific order by its ID, for a specific account

Get a specific order by its ID, for a specific account

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
Long orderId = 789L; // Long | The ID of the order being retrieved.
try {
    Order result = apiInstance.getOrder(accountNumber, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| The encrypted ID of the account |
 **orderId** | **Long**| The ID of the order being retrieved. |

### Return type

[**Order**](Order.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrdersByPathParam"></a>
# **getOrdersByPathParam**
> List&lt;Order&gt; getOrdersByPathParam(accountNumber, fromEnteredTime, toEnteredTime, maxResults, status)

Get all orders for a specific account.

All orders for a specific account. Orders retrieved can be filtered based on input parameters below. Maximum date range is 1 year.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
String fromEnteredTime = "fromEnteredTime_example"; // String | Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are :<br> <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>  Example fromEnteredTime is '2024-03-29T00:00:00.000Z'. 'toEnteredTime' must also be set.
String toEnteredTime = "toEnteredTime_example"; // String | Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are :<br> <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>.  Example toEnteredTime is '2024-04-28T23:59:59.000Z'. 'fromEnteredTime' must also be set.
Long maxResults = 789L; // Long | The max number of orders to retrieve. Default is 3000.
ApiOrderStatus status = new ApiOrderStatus(); // ApiOrderStatus | Specifies that only orders of this status should be returned.
try {
    List<Order> result = apiInstance.getOrdersByPathParam(accountNumber, fromEnteredTime, toEnteredTime, maxResults, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrdersByPathParam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| The encrypted ID of the account |
 **fromEnteredTime** | **String**| Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;  Example fromEnteredTime is &#x27;2024-03-29T00:00:00.000Z&#x27;. &#x27;toEnteredTime&#x27; must also be set. |
 **toEnteredTime** | **String**| Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;.  Example toEnteredTime is &#x27;2024-04-28T23:59:59.000Z&#x27;. &#x27;fromEnteredTime&#x27; must also be set. |
 **maxResults** | **Long**| The max number of orders to retrieve. Default is 3000. | [optional]
 **status** | [**ApiOrderStatus**](.md)| Specifies that only orders of this status should be returned. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrdersByQueryParam"></a>
# **getOrdersByQueryParam**
> List&lt;Order&gt; getOrdersByQueryParam(fromEnteredTime, toEnteredTime, maxResults, status)

Get all orders for all accounts

Get all orders for all accounts&lt;br&gt;

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String fromEnteredTime = "fromEnteredTime_example"; // String | Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are- yyyy-MM-dd'T'HH:mm:ss.SSSZ Date must be within 60 days from today's date. 'toEnteredTime' must also be set.
String toEnteredTime = "toEnteredTime_example"; // String | Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are - yyyy-MM-dd'T'HH:mm:ss.SSSZ. 'fromEnteredTime' must also be set.
Long maxResults = 789L; // Long | The max number of orders to retrieve. Default is 3000.
ApiOrderStatus status = new ApiOrderStatus(); // ApiOrderStatus | Specifies that only orders of this status should be returned.
try {
    List<Order> result = apiInstance.getOrdersByQueryParam(fromEnteredTime, toEnteredTime, maxResults, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrdersByQueryParam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromEnteredTime** | **String**| Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are- yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ Date must be within 60 days from today&#x27;s date. &#x27;toEnteredTime&#x27; must also be set. |
 **toEnteredTime** | **String**| Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are - yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ. &#x27;fromEnteredTime&#x27; must also be set. |
 **maxResults** | **Long**| The max number of orders to retrieve. Default is 3000. | [optional]
 **status** | [**ApiOrderStatus**](.md)| Specifies that only orders of this status should be returned. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="placeOrder"></a>
# **placeOrder**
> placeOrder(body, accountNumber)

Place order for a specific account.

Place an order for a specific account.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
OrderRequest body = new OrderRequest(); // OrderRequest | The new Order Object.
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
try {
    apiInstance.placeOrder(body, accountNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#placeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderRequest**](OrderRequest.md)| The new Order Object. |
 **accountNumber** | **String**| The encrypted ID of the account |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="previewOrder"></a>
# **previewOrder**
> PreviewOrder previewOrder(body, accountNumber)

Preview order for a specific account. **Coming Soon**.

Preview an order for a specific account.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
PreviewOrder body = new PreviewOrder(); // PreviewOrder | The Order Object.
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
try {
    PreviewOrder result = apiInstance.previewOrder(body, accountNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#previewOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreviewOrder**](PreviewOrder.md)| The Order Object. |
 **accountNumber** | **String**| The encrypted ID of the account |

### Return type

[**PreviewOrder**](PreviewOrder.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceOrder"></a>
# **replaceOrder**
> replaceOrder(body, accountNumber, orderId)

Replace order for a specific account

Replace an existing order for an account. The existing order will be replaced by the new               order. Once replaced, the old order will be canceled and a new order will be created.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
OrderRequest body = new OrderRequest(); // OrderRequest | The Order Object.
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
Long orderId = 789L; // Long | The ID of the order being retrieved.
try {
    apiInstance.replaceOrder(body, accountNumber, orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#replaceOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderRequest**](OrderRequest.md)| The Order Object. |
 **accountNumber** | **String**| The encrypted ID of the account |
 **orderId** | **Long**| The ID of the order being retrieved. |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

