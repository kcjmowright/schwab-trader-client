# AccountOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optionDeliverables** | [**List&lt;AccountAPIOptionDeliverable&gt;**](AccountAPIOptionDeliverable.md) |  |  [optional]
**putCall** | [**PutCallEnum**](#PutCallEnum) |  |  [optional]
**optionMultiplier** | **Integer** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**underlyingSymbol** | **String** |  |  [optional]

<a name="PutCallEnum"></a>
## Enum: PutCallEnum
Name | Value
---- | -----
PUT | &quot;PUT&quot;
CALL | &quot;CALL&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
VANILLA | &quot;VANILLA&quot;
BINARY | &quot;BINARY&quot;
BARRIER | &quot;BARRIER&quot;
UNKNOWN | &quot;UNKNOWN&quot;
