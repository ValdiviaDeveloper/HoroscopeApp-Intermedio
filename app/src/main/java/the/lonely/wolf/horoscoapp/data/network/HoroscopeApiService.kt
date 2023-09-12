package the.lonely.wolf.horoscoapp.data.network

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import the.lonely.wolf.horoscoapp.data.network.response.PredictionResponse

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign:String,@Query("lang") lang:String = "es"):PredictionResponse
}