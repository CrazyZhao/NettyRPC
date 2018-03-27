package com.zbl.nettyrpc.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.zbl.nettyrpc.dao.BaseDao;
import com.zbl.nettyrpc.dao.OrderFundDetailDao;
import com.zbl.nettyrpc.dao.entity.OrderFundDetailENT;
import com.zbl.nettyrpc.utils.WhereUtils;
import org.springframework.stereotype.Repository;

/**
 * @author zhuxinhai
 */
@Repository("orderFundDetailDao")
public class OrderFundDetailDaoImpl extends BaseDao<OrderFundDetailENT> implements OrderFundDetailDao {

    public void saveOrderFundDetail(Long userId) {
        OrderFundDetailENT ent = new OrderFundDetailENT();
        ent.setUserId(userId);
        save(ent);
    }

    public Long listOrderFundDetailCount(JSONObject data) {
        String hql = "select count(id) from OrderFundDetailENT where 1=1 ";
        WhereUtils fullHql = WhereUtils.ins(hql)
                .andEq("userId", data.getLong("userId"));
        return count(fullHql.getAllSql(), fullHql.getParms()).longValue();
    }

}
