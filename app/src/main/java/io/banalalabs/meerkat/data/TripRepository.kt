package io.banalalabs.meerkat.data

import android.util.Log
import io.banalalabs.meerkat.models.Trip
import io.banalalabs.meerkat.network.TripoholicAPI


/**
 * Created by EDC on 11/18/18.
 */
class TripRepository : IRepository<Trip> {

    override fun list(): List<Trip> {
//        val call = TripoholicAPI().getTrips()
//        val response = call.execute()
//        if (response.isSuccessful) {
//            Log.d("Excellent", "response")
//        }
        return ArrayList()
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(entity: Trip) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(entity: Trip) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}