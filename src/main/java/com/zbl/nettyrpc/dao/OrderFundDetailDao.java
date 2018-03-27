package com.zbl.nettyrpc.dao;

import com.alibaba.fastjson.JSONObject;
import com.zbl.nettyrpc.dao.entity.OrderFundDetailENT;

import java.util.List;

/**
 * 资金明细
 *
 * @author zj
 * @create 2017-10-16 10:51:47
 **/
public interface OrderFundDetailDao {

    void saveOrderFundDetail(Long userId);


    Long listOrderFundDetailCount(JSONObject data);
}