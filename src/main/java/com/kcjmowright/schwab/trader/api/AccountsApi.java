package com.kcjmowright.schwab.trader.api;

import com.kcjmowright.schwab.trader.invoker.ApiClient;

import com.kcjmowright.schwab.trader.model.Account;
import com.kcjmowright.schwab.trader.model.AccountNumberHash;
import com.kcjmowright.schwab.trader.model.ServiceError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Component("com.kcjmowright.schwab.trader.api.AccountsApi")
public class AccountsApi {
    private ApiClient apiClient;

    public AccountsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a specific account balance and positions for the logged in user.
     * Specific account information with balances and positions. The balance information on these accounts is displayed by default but Positions will be returned based on the \&quot;positions\&quot; flag.
     * <p><b>200</b> - A valid account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param fields This allows one to determine which fields they want returned. Possible values in this String can be: &lt;br&gt;&lt;code&gt;positions&lt;/code&gt;&lt;br&gt; Example:&lt;br&gt;&lt;code&gt;fields&#x3D;positions&lt;/code&gt; (optional)
     * @return Account
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Account getAccount(String accountNumber, String fields) throws RestClientException {
        return getAccountWithHttpInfo(accountNumber, fields).getBody();
    }

    /**
     * Get a specific account balance and positions for the logged in user.
     * Specific account information with balances and positions. The balance information on these accounts is displayed by default but Positions will be returned based on the \&quot;positions\&quot; flag.
     * <p><b>200</b> - A valid account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param fields This allows one to determine which fields they want returned. Possible values in this String can be: &lt;br&gt;&lt;code&gt;positions&lt;/code&gt;&lt;br&gt; Example:&lt;br&gt;&lt;code&gt;fields&#x3D;positions&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;Account&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Account> getAccountWithHttpInfo(String accountNumber, String fields) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling getAccount");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<Account> returnType = new ParameterizedTypeReference<Account>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get list of account numbers and their encrypted values
     * Account numbers in plain text cannot be used outside of headers or request/response bodies. As the first step consumers must invoke this service to retrieve the list of plain text/encrypted value pairs, and use encrypted account values for all subsequent calls for any accountNumber request.
     * <p><b>200</b> - List of valid \&quot;accounts\&quot;, matching the provided input parameters.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @return List&lt;AccountNumberHash&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountNumberHash> getAccountNumbers() throws RestClientException {
        return getAccountNumbersWithHttpInfo().getBody();
    }

    /**
     * Get list of account numbers and their encrypted values
     * Account numbers in plain text cannot be used outside of headers or request/response bodies. As the first step consumers must invoke this service to retrieve the list of plain text/encrypted value pairs, and use encrypted account values for all subsequent calls for any accountNumber request.
     * <p><b>200</b> - List of valid \&quot;accounts\&quot;, matching the provided input parameters.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @return ResponseEntity&lt;List&lt;AccountNumberHash&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountNumberHash>> getAccountNumbersWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/accounts/accountNumbers").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<List<AccountNumberHash>> returnType = new ParameterizedTypeReference<List<AccountNumberHash>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get linked account(s) balances and positions for the logged in user.
     * All the linked account information for the user logged in. The balances on these accounts are displayed by default however the positions on these accounts will be displayed based on the \&quot;positions\&quot; flag.
     * <p><b>200</b> - List of valid \&quot;accounts\&quot;, matching the provided input parameters.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param fields This allows one to determine which fields they want returned. Possible value in this String can be: &lt;br&gt;&lt;code&gt;positions&lt;/code&gt;&lt;br&gt; Example:&lt;br&gt;&lt;code&gt;fields&#x3D;positions&lt;/code&gt; (optional)
     * @return List&lt;Account&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Account> getAccounts(String fields) throws RestClientException {
        return getAccountsWithHttpInfo(fields).getBody();
    }

    /**
     * Get linked account(s) balances and positions for the logged in user.
     * All the linked account information for the user logged in. The balances on these accounts are displayed by default however the positions on these accounts will be displayed based on the \&quot;positions\&quot; flag.
     * <p><b>200</b> - List of valid \&quot;accounts\&quot;, matching the provided input parameters.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param fields This allows one to determine which fields they want returned. Possible value in this String can be: &lt;br&gt;&lt;code&gt;positions&lt;/code&gt;&lt;br&gt; Example:&lt;br&gt;&lt;code&gt;fields&#x3D;positions&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;List&lt;Account&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Account>> getAccountsWithHttpInfo(String fields) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/accounts").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<List<Account>> returnType = new ParameterizedTypeReference<List<Account>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
