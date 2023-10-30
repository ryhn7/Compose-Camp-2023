package com.example.marsphotos.network

import com.google.gson.annotations.SerializedName

data class MarsPhoto(

	@field:SerializedName("MarsPhoto")
	val marsPhoto: List<MarsPhotoItem?>? = null
)

data class MarsPhotoItem(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("img_src")
	val imgSrc: String? = null
)
