package com.zbl.nettyrpc.service;


import com.zbl.nettyrpc.dao.entity.OrderFundDetailENT;

/**
 * 资金明细
 *
 * @author zj
 * @create 2017-10-16 10:51:47
 **/
public interface OrderFundDetailService {


   /* ResultModel getUserFundDetails(String traceId, Long userId, int timeRegion, int type, int currentPage, int pageSize);

    ResultModel getUserFundDetailsNew(String traceId, Long userId, int timeRegion, int type, int currentPage, int pageSize);


    //    =========================admin==================================
    ExtModel listOrderFundDetail(JSONObject jsonParm);*/

    Long listOrderFundDetailCount(Long userId);

//    void updateOrderFundDetail(OrderFundDetailENT OrderFundDetail);
}
