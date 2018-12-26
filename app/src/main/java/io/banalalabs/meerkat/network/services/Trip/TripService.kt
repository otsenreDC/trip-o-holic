package io.banalalabs.meerkat.network.services.Trip

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by EDC on 11/18/18.
 */
interface TripService {

    @GET("trips")
    fun list(@Query("key") authKey: String) : Call<TripListResponse>
}