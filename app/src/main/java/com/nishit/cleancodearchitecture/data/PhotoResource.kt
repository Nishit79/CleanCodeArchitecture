package com.nishit.cleancodearchitecture.data

import com.google.gson.annotations.SerializedName

data class PhotoResource (

    @SerializedName("id"               ) var id              : Int?     = null,
    @SerializedName("width"            ) var width           : Int?     = null,
    @SerializedName("height"           ) var height          : Int?     = null,
    @SerializedName("url"              ) var url             : String?  = null,
    @SerializedName("photographer"     ) var photographer    : String?  = null,
    @SerializedName("photographer_url" ) var photographerUrl : String?  = null,
    @SerializedName("photographer_id"  ) var photographerId  : Int?     = null,
    @SerializedName("avg_color"        ) var avgColor        : String?  = null,
    @SerializedName("src"              ) var src             : Src?     = Src(),
    @SerializedName("liked"            ) var liked           : Boolean? = null,
    @SerializedName("alt"              ) var alt             : String?  = null

)

data class Src (

    @SerializedName("original"  ) var original  : String? = null,
    @SerializedName("large2x"   ) var large2x   : String? = null,
    @SerializedName("large"     ) var large     : String? = null,
    @SerializedName("medium"    ) var medium    : String? = null,
    @SerializedName("small"     ) var small     : String? = null,
    @SerializedName("portrait"  ) var portrait  : String? = null,
    @SerializedName("landscape" ) var landscape : String? = null,
    @SerializedName("tiny"      ) var tiny      : String? = null

)
