package api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val baseUrl = "https://jsonplaceholder.typicode.com"
object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val api: BlogApi by lazy {
        retrofit.create(BlogApi::class.java)
    }
}