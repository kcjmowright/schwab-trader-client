package com.kcjmowright.schwab.trader.api;

import com.kcjmowright.schwab.trader.invoker.ApiClient;

import com.kcjmowright.schwab.trader.model.ServiceError;
import com.kcjmowright.schwab.trader.model.Transaction;
import com.kcjmowright.schwab.trader.model.TransactionType;

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


@Component("com.kcjmowright.schwab.trader.api.TransactionsApi")
public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get specific transaction information for a specific account
     * Get specific transaction information for a specific account
     * <p><b>200</b> - A List of orders for the account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param transactionId The ID of the transaction being retrieved. (required)
     * @return List&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Transaction> getTransactionsById(String accountNumber, Long transactionId) throws RestClientException {
        return getTransactionsByIdWithHttpInfo(accountNumber, transactionId).getBody();
    }

    /**
     * Get specific transaction information for a specific account
     * Get specific transaction information for a specific account
     * <p><b>200</b> - A List of orders for the account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param transactionId The ID of the transaction being retrieved. (required)
     * @return ResponseEntity&lt;List&lt;Transaction&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Transaction>> getTransactionsByIdWithHttpInfo(String accountNumber, Long transactionId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling getTransactionsById");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionId' when calling getTransactionsById");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        uriVariables.put("transactionId", transactionId);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/transactions/{transactionId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<Transaction>> returnType = new ParameterizedTypeReference<List<Transaction>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all transactions information for a specific account.
     * All transactions for a specific account. Maximum number of transactions in response is 3000. Maximum date range is 1 year.
     * <p><b>200</b> - A List of orders for the account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param startDate Specifies that no transactions entered before this time should be returned. Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt; .  Example start date is &#x27;2024-03-28T21:10:42.000Z&#x27;. The &#x27;endDate&#x27; must also be set. (required)
     * @param endDate Specifies that no transactions entered after this time should be returned.Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;. Example start date is &#x27;2024-05-10T21:10:42.000Z&#x27;. The &#x27;startDate&#x27; must also be set. (required)
     * @param types Specifies that only transactions of this status should be returned. (required)
     * @param symbol It filters all the transaction activities based on the symbol specified. &lt;u&gt;NOTE:&lt;/u&gt; If there is any special character in the symbol, please send th encoded value. (optional)
     * @return List&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Transaction> getTransactionsByPathParam(String accountNumber, String startDate, String endDate, TransactionType types, String symbol) throws RestClientException {
        return getTransactionsByPathParamWithHttpInfo(accountNumber, startDate, endDate, types, symbol).getBody();
    }

    /**
     * Get all transactions information for a specific account.
     * All transactions for a specific account. Maximum number of transactions in response is 3000. Maximum date range is 1 year.
     * <p><b>200</b> - A List of orders for the account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param startDate Specifies that no transactions entered before this time should be returned. Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt; .  Example start date is &#x27;2024-03-28T21:10:42.000Z&#x27;. The &#x27;endDate&#x27; must also be set. (required)
     * @param endDate Specifies that no transactions entered after this time should be returned.Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;. Example start date is &#x27;2024-05-10T21:10:42.000Z&#x27;. The &#x27;startDate&#x27; must also be set. (required)
     * @param types Specifies that only transactions of this status should be returned. (required)
     * @param symbol It filters all the transaction activities based on the symbol specified. &lt;u&gt;NOTE:&lt;/u&gt; If there is any special character in the symbol, please send th encoded value. (optional)
     * @return ResponseEntity&lt;List&lt;Transaction&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Transaction>> getTransactionsByPathParamWithHttpInfo(String accountNumber, String startDate, String endDate, TransactionType types, String symbol) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling getTransactionsByPathParam");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling getTransactionsByPathParam");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling getTransactionsByPathParam");
        }
        // verify the required parameter 'types' is set
        if (types == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'types' when calling getTransactionsByPathParam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/transactions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "types", types));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<List<Transaction>> returnType = new ParameterizedTypeReference<List<Transaction>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
