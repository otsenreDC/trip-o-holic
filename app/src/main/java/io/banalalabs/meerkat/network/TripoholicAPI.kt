package io.banalalabs.meerkat.network

import io.banalalabs.meerkat.network.services.Trip.TripListResponse
import io.banalalabs.meerkat.network.services.Trip.TripService
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by EDC on 11/18/18.
 */
class TripoholicAPI {

    private val BASE_URL = "https://firestore.googleapis.com/v1beta1/projects/meerkat-3f4be/databases/(default)/documents/"
    private val tripService: TripService
    private val AUTH_KEY = "AIzaSyAgKQNMptzmQUd7LKwqPjk9y8rjiNbNQgw"

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        this.tripService = retrofit.create(TripService::class.java)
    }

    fun getTrips(callback: Callback<TripListResponse>) {
        var s = this.tripService.list(AUTH_KEY)
        s.enqueue(callback)
    }

}