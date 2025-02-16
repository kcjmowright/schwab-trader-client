package com.kcjmowright.schwab.trader.api;

import com.kcjmowright.schwab.trader.invoker.ApiClient;

import com.kcjmowright.schwab.trader.model.ServiceError;
import com.kcjmowright.schwab.trader.model.UserPreference;

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


@Component("com.kcjmowright.schwab.trader.api.UserPreferenceApi")
public class UserPreferenceApi {
    private ApiClient apiClient;

    public UserPreferenceApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserPreferenceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get user preference information for the logged in user.
     * Get user preference information for the logged in user.
     * <p><b>200</b> - List of user preference values.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @return List&lt;UserPreference&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserPreference> getUserPreference() throws RestClientException {
        return getUserPreferenceWithHttpInfo().getBody();
    }

    /**
     * Get user preference information for the logged in user.
     * Get user preference information for the logged in user.
     * <p><b>200</b> - List of user preference values.
     * <p><b>400</b> - An error message indicating the validation problem with the request.
     * <p><b>401</b> - An error message indicating either authorization token is invalid or there are no accounts the caller is allowed to view or use for trading that are registered with the provided third party application
     * <p><b>403</b> - An error message indicating the caller is forbidden from accessing this service
     * <p><b>404</b> - An error message indicating the resource is not found
     * <p><b>500</b> - An error message indicating there was an unexpected server error
     * <p><b>503</b> - An error message indicating server has a temporary problem responding
     * @return ResponseEntity&lt;List&lt;UserPreference&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserPreference>> getUserPreferenceWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/userPreference").build().toUriString();
        
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

        ParameterizedTypeReference<List<UserPreference>> returnType = new ParameterizedTypeReference<List<UserPreference>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
