# OrderStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountNumber** | **String** |  |  [optional]
**advancedOrderType** | [**AdvancedOrderTypeEnum**](#AdvancedOrderTypeEnum) |  |  [optional]
**closeTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**enteredTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**orderBalance** | [**OrderBalance**](OrderBalance.md) |  |  [optional]
**orderStrategyType** | [**OrderStrategyType**](OrderStrategyType.md) |  |  [optional]
**orderVersion** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**session** | [**Session**](Session.md) |  |  [optional]
**status** | [**ApiOrderStatus**](ApiOrderStatus.md) |  |  [optional]
**allOrNone** | **Boolean** |  |  [optional]
**discretionary** | **Boolean** |  |  [optional]
**duration** | [**Duration**](Duration.md) |  |  [optional]
**filledQuantity** | **Double** |  |  [optional]
**orderType** | [**OrderType**](OrderType.md) |  |  [optional]
**orderValue** | **Double** |  |  [optional]
**price** | **Double** |  |  [optional]
**quantity** | **Double** |  |  [optional]
**remainingQuantity** | **Double** |  |  [optional]
**sellNonMarginableFirst** | **Boolean** |  |  [optional]
**settlementInstruction** | [**SettlementInstruction**](SettlementInstruction.md) |  |  [optional]
**strategy** | [**ComplexOrderStrategyType**](ComplexOrderStrategyType.md) |  |  [optional]
**amountIndicator** | [**AmountIndicator**](AmountIndicator.md) |  |  [optional]
**orderLegs** | [**List&lt;OrderLeg&gt;**](OrderLeg.md) |  |  [optional]

<a name="AdvancedOrderTypeEnum"></a>
## Enum: AdvancedOrderTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
OTO | &quot;OTO&quot;
OCO | &quot;OCO&quot;
OTOCO | &quot;OTOCO&quot;
OT2OCO | &quot;OT2OCO&quot;
OT3OCO | &quot;OT3OCO&quot;
BLAST_ALL | &quot;BLAST_ALL&quot;
OTA | &quot;OTA&quot;
PAIR | &quot;PAIR&quot;
