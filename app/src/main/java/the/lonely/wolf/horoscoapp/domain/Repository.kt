package the.lonely.wolf.horoscoapp.domain

import the.lonely.wolf.horoscoapp.data.network.response.PredictionResponse
import the.lonely.wolf.horoscoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String):PredictionModel?
}