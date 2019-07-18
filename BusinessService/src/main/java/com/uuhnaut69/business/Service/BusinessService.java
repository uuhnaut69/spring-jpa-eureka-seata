package com.uuhnaut69.business.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uuhnaut69.business.Feign.OrderFeignClient;
import com.uuhnaut69.business.Feign.StorageFeignClient;

import io.seata.spring.annotation.GlobalTransactional;

@Service
public  class  BusinessService {

    @Autowired
    private StorageFeignClient storageFeignClient;
    @Autowired
    private OrderFeignClient orderFeignClient;

    /**
     * Reduce inventory, place an order
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     */
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        storageFeignClient.deduct(commodityCode, orderCount);

        orderFeignClient.create(userId, commodityCode, orderCount);
    }
}