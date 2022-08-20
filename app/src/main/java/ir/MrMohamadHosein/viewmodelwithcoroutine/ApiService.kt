package ir.MrMohamadHosein.viewmodelwithcoroutine

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/student")
    suspend fun getAllStudents(): List<Student>

}