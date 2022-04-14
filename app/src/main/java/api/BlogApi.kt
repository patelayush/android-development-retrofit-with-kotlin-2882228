package api

import model.Post
import retrofit2.http.GET

interface BlogApi {
    @GET("posts")
    suspend fun getPosts():List<Post>
}