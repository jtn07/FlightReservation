Flight Reservation 

Model Diagram.

<p align ="center">
<img src="https://user-images.githubusercontent.com/51705706/137016160-58d37139-0cf7-4a68-b13f-c67083a8394e.jpg" width="500" height="500">
</p>
# All api's 

All URIs are relative to *https://FlightBooking*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeReservation**](DefaultApi.md#completeReservation) | **POST** /completeReservation | POST completeReservation
[**findFlights**](DefaultApi.md#findFlights) | **POST** /findFlights | POST findFlights
[**registerUser**](DefaultApi.md#registerUser) | **POST** /registerUser | POST registerUser
[**updateReservationRequest**](DefaultApi.md#updateReservationRequest) | **POST** /reservations/update/ | POST reservations/update/


<a name="completeReservation"></a>
# **completeReservation**
> completeReservation()

POST completeReservation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://FlightBooking");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.completeReservation();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#completeReservation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="findFlights"></a>
# **findFlights**
> findFlights(from, to, UNKNOWN_PARAMETER_NAME)

POST findFlights

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://FlightBooking");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String from = "from_example"; // String | 
    String to = "to_example"; // String | 
     UNKNOWN_PARAMETER_NAME = new null(); //  | 
    try {
      apiInstance.findFlights(from, to, UNKNOWN_PARAMETER_NAME);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#findFlights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**|  |
 **to** | **String**|  |
 **UNKNOWN_PARAMETER_NAME** | [****](.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="registerUser"></a>
# **registerUser**
> registerUser()

POST registerUser

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://FlightBooking");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.registerUser();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#registerUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="updateReservationRequest"></a>
# **updateReservationRequest**
> updateReservationRequest()

POST reservations/update/

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://FlightBooking");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.updateReservationRequest();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateReservationRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |





