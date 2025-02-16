package com.kcjmowright.schwab.trader.api;

import com.kcjmowright.schwab.trader.invoker.ApiClient;

import com.kcjmowright.schwab.trader.model.ApiOrderStatus;
import com.kcjmowright.schwab.trader.model.Order;
import com.kcjmowright.schwab.trader.model.OrderRequest;
import com.kcjmowright.schwab.trader.model.PreviewOrder;
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


@Component("com.kcjmowright.schwab.trader.api.OrdersApi")
public class OrdersApi {
    private ApiClient apiClient;

    public OrdersApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel an order for a specific account
     * Cancel a specific order for a specific account&lt;br&gt;
     * <p><b>200</b> - Empty response body if an order was successfully canceled.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param orderId The ID of the order being cancelled (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cancelOrder(String accountNumber, Long orderId) throws RestClientException {
        cancelOrderWithHttpInfo(accountNumber, orderId);
    }

    /**
     * Cancel an order for a specific account
     * Cancel a specific order for a specific account&lt;br&gt;
     * <p><b>200</b> - Empty response body if an order was successfully canceled.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param orderId The ID of the order being cancelled (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cancelOrderWithHttpInfo(String accountNumber, Long orderId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling cancelOrder");
        }
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling cancelOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        uriVariables.put("orderId", orderId);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/orders/{orderId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific order by its ID, for a specific account
     * Get a specific order by its ID, for a specific account
     * <p><b>200</b> - An order object, matching the input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param orderId The ID of the order being retrieved. (required)
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Order getOrder(String accountNumber, Long orderId) throws RestClientException {
        return getOrderWithHttpInfo(accountNumber, orderId).getBody();
    }

    /**
     * Get a specific order by its ID, for a specific account
     * Get a specific order by its ID, for a specific account
     * <p><b>200</b> - An order object, matching the input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param orderId The ID of the order being retrieved. (required)
     * @return ResponseEntity&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Order> getOrderWithHttpInfo(String accountNumber, Long orderId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling getOrder");
        }
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        uriVariables.put("orderId", orderId);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/orders/{orderId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Order> returnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all orders for a specific account.
     * All orders for a specific account. Orders retrieved can be filtered based on input parameters below. Maximum date range is 1 year.
     * <p><b>200</b> - A List of orders for the account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param fromEnteredTime Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;  Example fromEnteredTime is &#x27;2024-03-29T00:00:00.000Z&#x27;. &#x27;toEnteredTime&#x27; must also be set. (required)
     * @param toEnteredTime Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;.  Example toEnteredTime is &#x27;2024-04-28T23:59:59.000Z&#x27;. &#x27;fromEnteredTime&#x27; must also be set. (required)
     * @param maxResults The max number of orders to retrieve. Default is 3000. (optional)
     * @param status Specifies that only orders of this status should be returned. (optional)
     * @return List&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Order> getOrdersByPathParam(String accountNumber, String fromEnteredTime, String toEnteredTime, Long maxResults, ApiOrderStatus status) throws RestClientException {
        return getOrdersByPathParamWithHttpInfo(accountNumber, fromEnteredTime, toEnteredTime, maxResults, status).getBody();
    }

    /**
     * Get all orders for a specific account.
     * All orders for a specific account. Orders retrieved can be filtered based on input parameters below. Maximum date range is 1 year.
     * <p><b>200</b> - A List of orders for the account, matching the provided input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param accountNumber The encrypted ID of the account (required)
     * @param fromEnteredTime Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;  Example fromEnteredTime is &#x27;2024-03-29T00:00:00.000Z&#x27;. &#x27;toEnteredTime&#x27; must also be set. (required)
     * @param toEnteredTime Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are :&lt;br&gt; &lt;code&gt;yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ&lt;/code&gt;.  Example toEnteredTime is &#x27;2024-04-28T23:59:59.000Z&#x27;. &#x27;fromEnteredTime&#x27; must also be set. (required)
     * @param maxResults The max number of orders to retrieve. Default is 3000. (optional)
     * @param status Specifies that only orders of this status should be returned. (optional)
     * @return ResponseEntity&lt;List&lt;Order&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Order>> getOrdersByPathParamWithHttpInfo(String accountNumber, String fromEnteredTime, String toEnteredTime, Long maxResults, ApiOrderStatus status) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling getOrdersByPathParam");
        }
        // verify the required parameter 'fromEnteredTime' is set
        if (fromEnteredTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromEnteredTime' when calling getOrdersByPathParam");
        }
        // verify the required parameter 'toEnteredTime' is set
        if (toEnteredTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toEnteredTime' when calling getOrdersByPathParam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/orders").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromEnteredTime", fromEnteredTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toEnteredTime", toEnteredTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<List<Order>> returnType = new ParameterizedTypeReference<List<Order>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all orders for all accounts
     * Get all orders for all accounts&lt;br&gt;
     * <p><b>200</b> - A List of orders for the specified account or if its not mentioned, for all the linked accounts, matching the provided input parameters.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param fromEnteredTime Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are- yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ Date must be within 60 days from today&#x27;s date. &#x27;toEnteredTime&#x27; must also be set. (required)
     * @param toEnteredTime Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are - yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ. &#x27;fromEnteredTime&#x27; must also be set. (required)
     * @param maxResults The max number of orders to retrieve. Default is 3000. (optional)
     * @param status Specifies that only orders of this status should be returned. (optional)
     * @return List&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Order> getOrdersByQueryParam(String fromEnteredTime, String toEnteredTime, Long maxResults, ApiOrderStatus status) throws RestClientException {
        return getOrdersByQueryParamWithHttpInfo(fromEnteredTime, toEnteredTime, maxResults, status).getBody();
    }

    /**
     * Get all orders for all accounts
     * Get all orders for all accounts&lt;br&gt;
     * <p><b>200</b> - A List of orders for the specified account or if its not mentioned, for all the linked accounts, matching the provided input parameters.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param fromEnteredTime Specifies that no orders entered before this time should be returned. Valid ISO-8601 formats are- yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ Date must be within 60 days from today&#x27;s date. &#x27;toEnteredTime&#x27; must also be set. (required)
     * @param toEnteredTime Specifies that no orders entered after this time should be returned.Valid ISO-8601 formats are - yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ. &#x27;fromEnteredTime&#x27; must also be set. (required)
     * @param maxResults The max number of orders to retrieve. Default is 3000. (optional)
     * @param status Specifies that only orders of this status should be returned. (optional)
     * @return ResponseEntity&lt;List&lt;Order&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Order>> getOrdersByQueryParamWithHttpInfo(String fromEnteredTime, String toEnteredTime, Long maxResults, ApiOrderStatus status) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fromEnteredTime' is set
        if (fromEnteredTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromEnteredTime' when calling getOrdersByQueryParam");
        }
        // verify the required parameter 'toEnteredTime' is set
        if (toEnteredTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toEnteredTime' when calling getOrdersByQueryParam");
        }
        String path = UriComponentsBuilder.fromPath("/orders").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromEnteredTime", fromEnteredTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toEnteredTime", toEnteredTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<List<Order>> returnType = new ParameterizedTypeReference<List<Order>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Place order for a specific account.
     * Place an order for a specific account.
     * <p><b>201</b> - Empty response body if an order was successfully placed/created.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param body The new Order Object. (required)
     * @param accountNumber The encrypted ID of the account (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void placeOrder(OrderRequest body, String accountNumber) throws RestClientException {
        placeOrderWithHttpInfo(body, accountNumber);
    }

    /**
     * Place order for a specific account.
     * Place an order for a specific account.
     * <p><b>201</b> - Empty response body if an order was successfully placed/created.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param body The new Order Object. (required)
     * @param accountNumber The encrypted ID of the account (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> placeOrderWithHttpInfo(OrderRequest body, String accountNumber) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling placeOrder");
        }
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling placeOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/orders").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Preview order for a specific account. **Coming Soon**.
     * Preview an order for a specific account.
     * <p><b>200</b> - An order object, matching the input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param body The Order Object. (required)
     * @param accountNumber The encrypted ID of the account (required)
     * @return PreviewOrder
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PreviewOrder previewOrder(PreviewOrder body, String accountNumber) throws RestClientException {
        return previewOrderWithHttpInfo(body, accountNumber).getBody();
    }

    /**
     * Preview order for a specific account. **Coming Soon**.
     * Preview an order for a specific account.
     * <p><b>200</b> - An order object, matching the input parameters
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param body The Order Object. (required)
     * @param accountNumber The encrypted ID of the account (required)
     * @return ResponseEntity&lt;PreviewOrder&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PreviewOrder> previewOrderWithHttpInfo(PreviewOrder body, String accountNumber) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling previewOrder");
        }
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling previewOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/previewOrder").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<PreviewOrder> returnType = new ParameterizedTypeReference<PreviewOrder>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Replace order for a specific account
     * Replace an existing order for an account. The existing order will be replaced by the new               order. Once replaced, the old order will be canceled and a new order will be created.
     * <p><b>201</b> - Empty response body if an order was successfully replaced/created.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param body The Order Object. (required)
     * @param accountNumber The encrypted ID of the account (required)
     * @param orderId The ID of the order being retrieved. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void replaceOrder(OrderRequest body, String accountNumber, Long orderId) throws RestClientException {
        replaceOrderWithHttpInfo(body, accountNumber, orderId);
    }

    /**
     * Replace order for a specific account
     * Replace an existing order for an account. The existing order will be replaced by the new               order. Once replaced, the old order will be canceled and a new order will be created.
     * <p><b>201</b> - Empty response body if an order was successfully replaced/created.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @param body The Order Object. (required)
     * @param accountNumber The encrypted ID of the account (required)
     * @param orderId The ID of the order being retrieved. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> replaceOrderWithHttpInfo(OrderRequest body, String accountNumber, Long orderId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling replaceOrder");
        }
        // verify the required parameter 'accountNumber' is set
        if (accountNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountNumber' when calling replaceOrder");
        }
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling replaceOrder");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("accountNumber", accountNumber);
        uriVariables.put("orderId", orderId);
        String path = UriComponentsBuilder.fromPath("/accounts/{accountNumber}/orders/{orderId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
