# TransactionMutualFund

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundFamilyName** | **String** |  |  [optional]
**fundFamilySymbol** | **String** |  |  [optional]
**fundGroup** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**exchangeCutoffTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**purchaseCutoffTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**redemptionCutoffTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot;
OPEN_END_NON_TAXABLE | &quot;OPEN_END_NON_TAXABLE&quot;
OPEN_END_TAXABLE | &quot;OPEN_END_TAXABLE&quot;
NO_LOAD_NON_TAXABLE | &quot;NO_LOAD_NON_TAXABLE&quot;
NO_LOAD_TAXABLE | &quot;NO_LOAD_TAXABLE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
