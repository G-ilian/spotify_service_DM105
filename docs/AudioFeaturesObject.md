# AudioFeaturesObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acousticness** | **Float** | A confidence measure from 0.0 to 1.0 of whether the track is acoustic. 1.0 represents high confidence the track is acoustic.  |  [optional]
**analysisUrl** | **String** | A URL to access the full audio analysis of this track. An access token is required to access this data.  |  [optional]
**danceability** | **Float** | Danceability describes how suitable a track is for dancing based on a combination of musical elements including tempo, rhythm stability, beat strength, and overall regularity. A value of 0.0 is least danceable and 1.0 is most danceable.  |  [optional]
**durationMs** | **Integer** | The duration of the track in milliseconds.  |  [optional]
**energy** | **Float** | Energy is a measure from 0.0 to 1.0 and represents a perceptual measure of intensity and activity. Typically, energetic tracks feel fast, loud, and noisy. For example, death metal has high energy, while a Bach prelude scores low on the scale. Perceptual features contributing to this attribute include dynamic range, perceived loudness, timbre, onset rate, and general entropy.  |  [optional]
**id** | **String** | The Spotify ID for the track.  |  [optional]
**instrumentalness** | **Float** | Predicts whether a track contains no vocals. \&quot;Ooh\&quot; and \&quot;aah\&quot; sounds are treated as instrumental in this context. Rap or spoken word tracks are clearly \&quot;vocal\&quot;. The closer the instrumentalness value is to 1.0, the greater likelihood the track contains no vocal content. Values above 0.5 are intended to represent instrumental tracks, but confidence is higher as the value approaches 1.0.  |  [optional]
**key** | **Integer** |  |  [optional]
**liveness** | **Float** | Detects the presence of an audience in the recording. Higher liveness values represent an increased probability that the track was performed live. A value above 0.8 provides strong likelihood that the track is live.  |  [optional]
**loudness** | **Float** |  |  [optional]
**mode** | **Integer** |  |  [optional]
**speechiness** | **Float** | Speechiness detects the presence of spoken words in a track. The more exclusively speech-like the recording (e.g. talk show, audio book, poetry), the closer to 1.0 the attribute value. Values above 0.66 describe tracks that are probably made entirely of spoken words. Values between 0.33 and 0.66 describe tracks that may contain both music and speech, either in sections or layered, including such cases as rap music. Values below 0.33 most likely represent music and other non-speech-like tracks.  |  [optional]
**tempo** | **Float** |  |  [optional]
**timeSignature** | **Integer** |  |  [optional]
**trackHref** | **String** | A link to the Web API endpoint providing full details of the track.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The object type.  |  [optional]
**uri** | **String** | The Spotify URI for the track.  |  [optional]
**valence** | **Float** | A measure from 0.0 to 1.0 describing the musical positiveness conveyed by a track. Tracks with high valence sound more positive (e.g. happy, cheerful, euphoric), while tracks with low valence sound more negative (e.g. sad, depressed, angry).  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AUDIO_FEATURES | &quot;audio_features&quot;
