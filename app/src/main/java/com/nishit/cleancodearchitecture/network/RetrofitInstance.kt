package com.nishit.cleancodearchitecture.network

import com.nishit.cleancodearchitecture.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
	val api : ApiProvider by lazy {
		Retrofit.Builder()
			.baseUrl(Constants.BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.build()
			.create(ApiProvider::class.java)
	}
}
