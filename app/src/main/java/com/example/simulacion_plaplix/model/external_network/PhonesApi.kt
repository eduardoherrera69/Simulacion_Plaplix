package com.example.simulacion_plaplix.model.external_network

import com.example.simulacion_plaplix.model.pojos.Phones
import retrofit2.Response
import retrofit2.http.GET

interface PhonesApi {

    @GET("products/")
    suspend fun fetchAllPhones() : Response <List<Phones>>
}
