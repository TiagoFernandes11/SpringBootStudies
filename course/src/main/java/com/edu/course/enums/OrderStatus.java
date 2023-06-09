package com.edu.course.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5),
    GAMBIARRA(6);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public static OrderStatus valueOf(int code) {
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        return OrderStatus.GAMBIARRA;
    }
}
