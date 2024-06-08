package jjafactory.wms.domain.order.cancel

import org.springframework.stereotype.Component

@Component
class OrderCancelValidator {
    fun validate(){
        userOwnOrder()
        validateCancelableOrder()
        validatePaymentMethod()
    }

    private fun userOwnOrder(){

    }

    private fun validateCancelableOrder(){

    }

    private fun validatePaymentMethod(){

    }
}