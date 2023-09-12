package the.lonely.wolf.horoscoapp.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenManger: TokenManger):Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder().header("Autorization",tokenManger.getToken()).build()
        return chain.proceed(request)
    }

    class TokenManger @Inject constructor(){
        fun getToken():String = "sub"
    }
}