package com.example.amphibiansapp.data.model

import com.google.gson.annotations.SerializedName

data class AmphibiansResponse(

	@field:SerializedName("AmphibiansResponse")
	val data: List<AmphibiansResponseItem>? = null
)

data class AmphibiansResponseItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("img_src")
	val imgSrc: String? = null
)
