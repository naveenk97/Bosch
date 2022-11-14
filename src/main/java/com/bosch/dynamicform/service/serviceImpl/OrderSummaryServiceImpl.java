package com.bosch.dynamicform.service.serviceImpl;

import com.bosch.dynamicform.api.OrderSummaryRepository;
import com.bosch.dynamicform.service.OrderSummaryService;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class OrderSummaryServiceImpl implements OrderSummaryService {

    private final OrderSummaryRepository orderSummaryRepository;

    public OrderSummaryServiceImpl(OrderSummaryRepository orderSummaryRepository) {
        this.orderSummaryRepository = orderSummaryRepository;
    }

    @Override
    public ResponseEntity<String> fetchOrderSummary(String orderId) throws Exception {
//      String usersInfo=  feignUserInfo.getUserdatas(id);
//       User user= usersInfo.getUser;
//      if(user.equals("seller")||user == "seller"){
//          git
//      }
        Optional byId = orderSummaryRepository.findById(orderId);
        if(byId.isEmpty() || byId==null){
            throw new Exception("Oder not found by given orderId :"+orderId);
        }
        Object orders = byId.get();

        return null;
    }
}
