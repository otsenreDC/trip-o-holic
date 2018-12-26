package io.banalalabs.meerkat.data

import io.banalalabs.meerkat.models.IModel

/**
 * Created by EDC on 11/18/18.
 */
interface IRepository<T : IModel> {

    fun list() : List<T>
    fun getById(id: Int)
    fun add(entity: T)
    fun update(entity: T)
    fun delete(id: Int)
}