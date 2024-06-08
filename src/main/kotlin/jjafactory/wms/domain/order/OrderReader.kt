package jjafactory.wms.domain.order

interface OrderReader {
    fun getById(id: Long): Order
}