package com.example.simulacion_plaplix

import com.example.simulacion_plaplix.model.external_network.PhonesRetrofitClient
import com.example.simulacion_plaplix.model.pojos.Phones
import retrofit2.Response

class PhonesRepository {

        private val serviceRetrApi = PhonesRetrofitClient.getPhonesRetrofitClient()

        fun getDataFromServer() {
            val resp = serviceRetrApi.fetchAllPhones()
            resp.en

}


}