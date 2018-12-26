package io.banalalabs.meerkat.models

import java.util.*

/**
 * Created by EDC on 11/18/18.
 */
interface IModel {
    var _id: Int
    var meeetingTime: Date
    var departingTime: Date
    var returnTime: Date
}