package com.example.simulacion_plaplix.model

import com.example.simulacion_plaplix.PhonesApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PhonesRetrofitClient {

    companion object {

        private const val URL_BASE = "http://my-json-server.typicode.com/Himuravidal/FakeAPIdata/"
            fun getPhonesRetrofitClient() : PhonesApi{
                val mRetrofit = Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                return mRetrofit.create(PhonesApi::class.java)

            }


    }



}