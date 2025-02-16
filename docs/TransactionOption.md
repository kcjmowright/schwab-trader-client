# TransactionOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expirationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**optionDeliverables** | [**List&lt;TransactionAPIOptionDeliverable&gt;**](TransactionAPIOptionDeliverable.md) |  |  [optional]
**optionPremiumMultiplier** | **Long** |  |  [optional]
**putCall** | [**PutCallEnum**](#PutCallEnum) |  |  [optional]
**strikePrice** | **Double** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**underlyingSymbol** | **String** |  |  [optional]
**underlyingCusip** | **String** |  |  [optional]
**deliverable** | [**TransactionInstrument**](TransactionInstrument.md) |  |  [optional]

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
