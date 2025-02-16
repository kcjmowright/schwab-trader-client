# TransactionBaseInstrument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetType** | [**AssetTypeEnum**](#AssetTypeEnum) |  | 
**cusip** | **String** |  |  [optional]
**symbol** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**instrumentId** | **Long** |  |  [optional]
**netChange** | **Double** |  |  [optional]

<a name="AssetTypeEnum"></a>
## Enum: AssetTypeEnum
Name | Value
---- | -----
EQUITY | &quot;EQUITY&quot;
OPTION | &quot;OPTION&quot;
INDEX | &quot;INDEX&quot;
MUTUAL_FUND | &quot;MUTUAL_FUND&quot;
CASH_EQUIVALENT | &quot;CASH_EQUIVALENT&quot;
FIXED_INCOME | &quot;FIXED_INCOME&quot;
CURRENCY | &quot;CURRENCY&quot;
COLLECTIVE_INVESTMENT | &quot;COLLECTIVE_INVESTMENT&quot;
