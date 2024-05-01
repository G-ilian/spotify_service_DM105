# SectionObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**BigDecimal**](BigDecimal.md) | The starting point (in seconds) of the section. |  [optional]
**duration** | [**BigDecimal**](BigDecimal.md) | The duration (in seconds) of the section. |  [optional]
**confidence** | [**BigDecimal**](BigDecimal.md) | The confidence, from 0.0 to 1.0, of the reliability of the section&#x27;s \&quot;designation\&quot;. |  [optional]
**loudness** | [**BigDecimal**](BigDecimal.md) | The overall loudness of the section in decibels (dB). Loudness values are useful for comparing relative loudness of sections within tracks. |  [optional]
**tempo** | [**BigDecimal**](BigDecimal.md) | The overall estimated tempo of the section in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration. |  [optional]
**tempoConfidence** | [**BigDecimal**](BigDecimal.md) | The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain tempo changes or sounds which don&#x27;t contain tempo (like pure speech) which would correspond to a low value in this field. |  [optional]
**key** | **Integer** | The estimated overall key of the section. The values in this field ranging from 0 to 11 mapping to pitches using standard Pitch Class notation (E.g. 0 &#x3D; C, 1 &#x3D; C♯/D♭, 2 &#x3D; D, and so on). If no key was detected, the value is -1. |  [optional]
**keyConfidence** | [**BigDecimal**](BigDecimal.md) | The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key changes may correspond to low values in this field. |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \&quot;minor\&quot;, a 1 for \&quot;major\&quot;, or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches. |  [optional]
**modeConfidence** | [**BigDecimal**](BigDecimal.md) | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;. |  [optional]
**timeSignature** | **Integer** |  |  [optional]
**timeSignatureConfidence** | [**BigDecimal**](BigDecimal.md) | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;. Sections with time signature changes may correspond to low values in this field. |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
NUMBER_MINUS_1 | new BigDecimal(-1)
NUMBER_0 | new BigDecimal(0)
NUMBER_1 | new BigDecimal(1)
