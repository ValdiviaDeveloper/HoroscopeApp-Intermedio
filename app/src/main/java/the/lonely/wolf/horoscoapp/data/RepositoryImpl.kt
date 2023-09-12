package the.lonely.wolf.horoscoapp.data

import the.lonely.wolf.horoscoapp.data.network.HoroscopeApiService
import the.lonely.wolf.horoscoapp.data.network.response.PredictionResponse
import the.lonely.wolf.horoscoapp.domain.Repository
import the.lonely.wolf.horoscoapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService)  :Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        //llamar a retrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { return null }
        return null
    }
}