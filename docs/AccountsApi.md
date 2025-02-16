# AccountsApi

All URIs are relative to *https://api.schwabapi.com/trader/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountsApi.md#getAccount) | **GET** /accounts/{accountNumber} | Get a specific account balance and positions for the logged in user.
[**getAccountNumbers**](AccountsApi.md#getAccountNumbers) | **GET** /accounts/accountNumbers | Get list of account numbers and their encrypted values
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** /accounts | Get linked account(s) balances and positions for the logged in user.

<a name="getAccount"></a>
# **getAccount**
> Account getAccount(accountNumber, fields)

Get a specific account balance and positions for the logged in user.

Specific account information with balances and positions. The balance information on these accounts is displayed by default but Positions will be returned based on the \&quot;positions\&quot; flag.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String accountNumber = "accountNumber_example"; // String | The encrypted ID of the account
String fields = "fields_example"; // String | This allows one to determine which fields they want returned. Possible values in this String can be: <br><code>positions</code><br> Example:<br><code>fields=positions</code>
try {
    Account result = apiInstance.getAccount(accountNumber, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| The encrypted ID of the account |
 **fields** | **String**| This allows one to determine which fields they want returned. Possible values in this String can be: &lt;br&gt;&lt;code&gt;positions&lt;/code&gt;&lt;br&gt; Example:&lt;br&gt;&lt;code&gt;fields&#x3D;positions&lt;/code&gt; | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountNumbers"></a>
# **getAccountNumbers**
> List&lt;AccountNumberHash&gt; getAccountNumbers()

Get list of account numbers and their encrypted values

Account numbers in plain text cannot be used outside of headers or request/response bodies. As the first step consumers must invoke this service to retrieve the list of plain text/encrypted value pairs, and use encrypted account values for all subsequent calls for any accountNumber request.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    List<AccountNumberHash> result = apiInstance.getAccountNumbers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountNumbers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AccountNumberHash&gt;**](AccountNumberHash.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> List&lt;Account&gt; getAccounts(fields)

Get linked account(s) balances and positions for the logged in user.

All the linked account information for the user logged in. The balances on these accounts are displayed by default however the positions on these accounts will be displayed based on the \&quot;positions\&quot; flag.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String fields = "fields_example"; // String | This allows one to determine which fields they want returned. Possible value in this String can be: <br><code>positions</code><br> Example:<br><code>fields=positions</code>
try {
    List<Account> result = apiInstance.getAccounts(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| This allows one to determine which fields they want returned. Possible value in this String can be: &lt;br&gt;&lt;code&gt;positions&lt;/code&gt;&lt;br&gt; Example:&lt;br&gt;&lt;code&gt;fields&#x3D;positions&lt;/code&gt; | [optional]

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

