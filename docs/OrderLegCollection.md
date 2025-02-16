# OrderLegCollection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderLegType** | [**OrderLegTypeEnum**](#OrderLegTypeEnum) |  |  [optional]
**legId** | **Long** |  |  [optional]
**instrument** | [**AccountsInstrument**](AccountsInstrument.md) |  |  [optional]
**instruction** | [**Instruction**](Instruction.md) |  |  [optional]
**positionEffect** | [**PositionEffectEnum**](#PositionEffectEnum) |  |  [optional]
**quantity** | **Double** |  |  [optional]
**quantityType** | [**QuantityTypeEnum**](#QuantityTypeEnum) |  |  [optional]
**divCapGains** | [**DivCapGainsEnum**](#DivCapGainsEnum) |  |  [optional]
**toSymbol** | **String** |  |  [optional]

<a name="OrderLegTypeEnum"></a>
## Enum: OrderLegTypeEnum
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

<a name="PositionEffectEnum"></a>
## Enum: PositionEffectEnum
Name | Value
---- | -----
OPENING | &quot;OPENING&quot;
CLOSING | &quot;CLOSING&quot;
AUTOMATIC | &quot;AUTOMATIC&quot;

<a name="QuantityTypeEnum"></a>
## Enum: QuantityTypeEnum
Name | Value
---- | -----
ALL_SHARES | &quot;ALL_SHARES&quot;
DOLLARS | &quot;DOLLARS&quot;
SHARES | &quot;SHARES&quot;

<a name="DivCapGainsEnum"></a>
## Enum: DivCapGainsEnum
Name | Value
---- | -----
REINVEST | &quot;REINVEST&quot;
PAYOUT | &quot;PAYOUT&quot;
