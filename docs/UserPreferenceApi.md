# UserPreferenceApi

All URIs are relative to *https://api.schwabapi.com/trader/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserPreference**](UserPreferenceApi.md#getUserPreference) | **GET** /userPreference | Get user preference information for the logged in user.

<a name="getUserPreference"></a>
# **getUserPreference**
> List&lt;UserPreference&gt; getUserPreference()

Get user preference information for the logged in user.

Get user preference information for the logged in user.

### Example
```java
// Import classes:
//import com.kcjmowright.schwab.trader.invoker.ApiClient;
//import com.kcjmowright.schwab.trader.invoker.ApiException;
//import com.kcjmowright.schwab.trader.invoker.Configuration;
//import com.kcjmowright.schwab.trader.invoker.auth.*;
//import com.kcjmowright.schwab.trader.api.UserPreferenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

UserPreferenceApi apiInstance = new UserPreferenceApi();
try {
    List<UserPreference> result = apiInstance.getUserPreference();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPreferenceApi#getUserPreference");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserPreference&gt;**](UserPreference.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

