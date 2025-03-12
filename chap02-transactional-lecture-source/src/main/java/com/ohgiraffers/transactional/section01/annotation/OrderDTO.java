package com.ohgiraffers.transactional.section01.annotation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/*메뉴를 품은 주문*/
public class OrderDTO {
    /* 서버가 시간을 만들고 나중에 스트림형태로 바꾸기 쉽고 DB에 String? stream? 형태로 보내기에도 쉬움? */
    private LocalDate orderDate;                // 서버의 현재 날짜
    private LocalTime orderTime;                // 서버의 현재 시간

    private List<OrderMenuDTO> orderMenus;      // 한 건의 주문에 고객이 주문한 메뉴들

    public OrderDTO() {
    }

    public OrderDTO(LocalDate orderDate, LocalTime orderTime, List<OrderMenuDTO> orderMenus) {
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderMenus = orderMenus;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public List<OrderMenuDTO> getOrderMenus() {
        return orderMenus;
    }

    public void setOrderMenus(List<OrderMenuDTO> orderMenus) {
        this.orderMenus = orderMenus;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                ", orderMenus=" + orderMenus +
                '}';
    }
}
