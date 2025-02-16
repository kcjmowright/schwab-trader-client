# TransactionsApi

All URIs are relative to *https://api.schwabapi.com/trader/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionsById**](TransactionsApi.md#getTransactionsById) | **GET** /accounts/{accountNumber}/transactions/{transactionId} | Get specific transaction information for a specific account
[**getTransactionsByPathParam**](TransactionsApi.md#getTransactionsByPathParam) | **GET** /accounts/{accountNumber}/transactions | Get all transactions information for a specific account.

<a name="getTransactionsById"></a>
# **getTransactionsById**
> List&lt;Transaction&gt; getTransactionsById(accountNumber, transactionId)

Get specific transaction information for a specific account

Get specific transaction information for a specific account

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TransactionsApi apiInstance = new TransactionsApi();
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
Long transactionId = 789L; // Long | The ID of the transaction being retrieved.
try {
    List<Transaction> result = apiInstance.getTransactionsById(accountNumber, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| The encrypted ID of the account |
 **transactionId** | **Long**| The ID of the transaction being retrieved. |

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsByPathParam"></a>
# **getTransactionsByPathParam**
> List&lt;Transaction&gt; getTransactionsByPathParam(accountNumber, startDate, endDate, types, symbol)

Get all transactions information for a specific account.

All transactions for a specific account. Maximum number of transactions in response is 3000. Maximum date range is 1 year.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

TransactionsApi apiInstance = new TransactionsApi();
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
String startDate = "startDate_example"; // String | Specifies that no transactions entered before this time should be returned. Valid ISO-8601 formats are :<br> <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code> .  Example start date is '2024-03-28T21:10:42.000Z'. The 'endDate' must also be set.
String endDate = "endDate_example"; // String | Specifies that no transactions entered after this time should be returned.Valid ISO-8601 formats are :<br> <code>yyyy-MM-dd'T'HH:mm:ss.SSSZ</code>. Example start date is '2024-05-10T21:10:42.000Z'. The 'startDate' must also be set.
TransactionType types = new TransactionType(); // TransactionType | Specifies that only transactions of this status should be returned.
String symbol = "symbol_example"; // String | It filters all the transaction activities based on the symbol specified. <u>NOTE:</u> If there is any special character in the symbol, please send th encoded value.
try {
    List<Transaction> result = apiInstance.getTransactionsByPathParam(accountNumber, startDate, endDate, types, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsByPathParam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| The encrypted ID of the account |
 **startDate** | **String**| Specifies that no transactions entered before this time should be returned. Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt; .  Example start date is &#x27;2024-03-28T21:10:42.000Z&#x27;. The &#x27;endDate&#x27; must also be set. |
 **endDate** | **String**| Specifies that no transactions entered after this time should be returned.Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;. Example start date is &#x27;2024-05-10T21:10:42.000Z&#x27;. The &#x27;startDate&#x27; must also be set. |
 **types** | [**TransactionType**](.md)| Specifies that only transactions of this status should be returned. |
 **symbol** | **String**| It filters all the transaction activities based on the symbol specified. &lt;u&gt;NOTE:&lt;/u&gt; If there is any special character in the symbol, please send th encoded value. | [optional]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

