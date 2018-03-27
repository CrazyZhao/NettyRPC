package com.zbl.nettyrpc.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zbl.nettyrpc.dao.OrderFundDetailDao;
import com.zbl.nettyrpc.db.DataSource;
import com.zbl.nettyrpc.service.OrderFundDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("orderFundDetailService")
public class OrderFundDetailServiceImpl implements OrderFundDetailService {
    private static final Logger logger = LoggerFactory.getLogger(OrderFundDetailServiceImpl.class);

    @Autowired
    private OrderFundDetailDao orderFundDetailDao;


    @DataSource(name = DataSource.DATA_SOURCE_READ)
    @Transactional(readOnly = true)
    public Long listOrderFundDetailCount(Long userId) {
        JSONObject obj = new JSONObject();
        obj.put("userId", userId);
        return orderFundDetailDao.listOrderFundDetailCount(obj);
    }

}
