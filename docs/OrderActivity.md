# OrderActivity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityType** | [**ActivityTypeEnum**](#ActivityTypeEnum) |  |  [optional]
**executionType** | [**ExecutionTypeEnum**](#ExecutionTypeEnum) |  |  [optional]
**quantity** | **Double** |  |  [optional]
**orderRemainingQuantity** | **Double** |  |  [optional]
**executionLegs** | [**List&lt;ExecutionLeg&gt;**](ExecutionLeg.md) |  |  [optional]

<a name="ActivityTypeEnum"></a>
## Enum: ActivityTypeEnum
Name | Value
---- | -----
EXECUTION | &quot;EXECUTION&quot;
ORDER_ACTION | &quot;ORDER_ACTION&quot;

<a name="ExecutionTypeEnum"></a>
## Enum: ExecutionTypeEnum
Name | Value
---- | -----
FILL | &quot;FILL&quot;
