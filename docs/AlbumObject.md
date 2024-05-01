# AlbumObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artists** | [**List&lt;SimplifiedArtistObject&gt;**](SimplifiedArtistObject.md) | The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  | 
**tracks** | **Object** | The tracks of the album.  | 
**copyrights** | [**List&lt;CopyrightObject&gt;**](CopyrightObject.md) | The copyright statements of the album.  | 
**externalIds** | **Object** | Known external IDs for the album.  | 
**genres** | **List&lt;String&gt;** | A list of the genres the album is associated with. If not yet classified, the array is empty.  | 
**label** | **String** | The label associated with the album.  | 
**popularity** | **Integer** | The popularity of the album. The value will be between 0 and 100, with 100 being the most popular.  | 
