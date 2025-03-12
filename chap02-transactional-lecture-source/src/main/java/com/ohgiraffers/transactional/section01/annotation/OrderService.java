package com.ohgiraffers.transactional.section01.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/* 주문이라는 데이터에 두도메인이 연관되어있고 하나의 트랜잭션이*/
@Service
public class OrderService {
    /* 설명, Order 도메인과 Menu 도메인 두개를 하나의 Service에서 트랜잭션 상 쓰는 경우를 상정 */
    /* 도메인 기준으로 나누었기 때문에 두개임. */
    private OrderMapper orderMapper;
    private MenuMapper menuMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper, MenuMapper menuMapper) {
        this.orderMapper = orderMapper;
        this.menuMapper = menuMapper;
    }

    /* service DML일때 보통 함. 순수 select일땐 필요없지요 */
    /* 설명. Service 계층의 메소드가 DML 작업용 트랜잭션이면 @Transactional을 추가한다. */
    @Transactional /*내부적으로 자동으로 Connection객체 할당되어 메소드가 끝나면 자동으로 커밋, 중간에 잘못되면 자동 롤백. */
    public void registNewOrder(OrderDTO orderInfo) { /*주문당 개수들이 담겨서 들어옴*/

        /* 설명. 1. 주문한 메뉴 코드만 추출(DTO에서) */
        /* 설명. 2. 주문한 메뉴 별로 Menu엔티티에 담아서 조회(select)해 오기(부가적인 메뉴의 정보 추출) */
        /* 설명. 3. 이 주문건에 대한 주문 총 합계를 계산 */
        /* 설명. 4. 1부터 3까지 하면 tbl_order 테이블에 추가(insert) */
        /* 설명. 5. tbl_order_menu 테이블에도 주문한 메뉴 갯수만큼 메뉴를 추가(insert) */
    }
}
