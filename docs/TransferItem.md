# TransferItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**TransactionInstrument**](TransactionInstrument.md) |  |  [optional]
**amount** | **Double** |  |  [optional]
**cost** | **Double** |  |  [optional]
**price** | **Double** |  |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) |  |  [optional]
**positionEffect** | [**PositionEffectEnum**](#PositionEffectEnum) |  |  [optional]

<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
Name | Value
---- | -----
COMMISSION | &quot;COMMISSION&quot;
SEC_FEE | &quot;SEC_FEE&quot;
STR_FEE | &quot;STR_FEE&quot;
R_FEE | &quot;R_FEE&quot;
CDSC_FEE | &quot;CDSC_FEE&quot;
OPT_REG_FEE | &quot;OPT_REG_FEE&quot;
ADDITIONAL_FEE | &quot;ADDITIONAL_FEE&quot;
MISCELLANEOUS_FEE | &quot;MISCELLANEOUS_FEE&quot;
FUTURES_EXCHANGE_FEE | &quot;FUTURES_EXCHANGE_FEE&quot;
LOW_PROCEEDS_COMMISSION | &quot;LOW_PROCEEDS_COMMISSION&quot;
BASE_CHARGE | &quot;BASE_CHARGE&quot;
GENERAL_CHARGE | &quot;GENERAL_CHARGE&quot;
GST_FEE | &quot;GST_FEE&quot;
TAF_FEE | &quot;TAF_FEE&quot;
INDEX_OPTION_FEE | &quot;INDEX_OPTION_FEE&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="PositionEffectEnum"></a>
## Enum: PositionEffectEnum
Name | Value
---- | -----
OPENING | &quot;OPENING&quot;
CLOSING | &quot;CLOSING&quot;
AUTOMATIC | &quot;AUTOMATIC&quot;
UNKNOWN | &quot;UNKNOWN&quot;
