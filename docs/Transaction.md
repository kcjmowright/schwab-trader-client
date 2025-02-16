# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityId** | **Long** |  |  [optional]
**time** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**user** | [**UserDetails**](UserDetails.md) |  |  [optional]
**description** | **String** |  |  [optional]
**accountNumber** | **String** |  |  [optional]
**type** | [**TransactionType**](TransactionType.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subAccount** | [**SubAccountEnum**](#SubAccountEnum) |  |  [optional]
**tradeDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**positionId** | **Long** |  |  [optional]
**orderId** | **Long** |  |  [optional]
**netAmount** | **Double** |  |  [optional]
**activityType** | [**ActivityTypeEnum**](#ActivityTypeEnum) |  |  [optional]
**transferItems** | [**List&lt;TransferItem&gt;**](TransferItem.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
PENDING | &quot;PENDING&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="SubAccountEnum"></a>
## Enum: SubAccountEnum
Name | Value
---- | -----
CASH | &quot;CASH&quot;
MARGIN | &quot;MARGIN&quot;
SHORT | &quot;SHORT&quot;
DIV | &quot;DIV&quot;
INCOME | &quot;INCOME&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="ActivityTypeEnum"></a>
## Enum: ActivityTypeEnum
Name | Value
---- | -----
ACTIVITY_CORRECTION | &quot;ACTIVITY_CORRECTION&quot;
EXECUTION | &quot;EXECUTION&quot;
ORDER_ACTION | &quot;ORDER_ACTION&quot;
TRANSFER | &quot;TRANSFER&quot;
UNKNOWN | &quot;UNKNOWN&quot;
