package io.banalalabs.meerkat

import android.app.Activity
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import io.banalalabs.meerkat.network.TripoholicAPI
import io.banalalabs.meerkat.network.services.Trip.TripListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        asyncTask().execute()
    }
}

class asyncTask : AsyncTask<Void, Void, Void>() {
    override fun doInBackground(vararg params: Void?): Void? {
        TripoholicAPI().getTrips(object : Callback<TripListResponse> {
            override fun onResponse(call: Call<TripListResponse>, response: Response<TripListResponse>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        Log.d("Response", "" + it.documents?.size)
                    }

                } else {

                }
            }


            /**
             * Invoked when a network exception occurred talking to the server or when an unexpected
             * exception occurred creating the request or processing the response.
             */
            override fun onFailure(call: Call<TripListResponse>, t: Throwable) {

            }
        })
        return null
    }
}
