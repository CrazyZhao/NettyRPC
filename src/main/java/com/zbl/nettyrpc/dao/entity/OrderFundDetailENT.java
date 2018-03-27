package com.zbl.nettyrpc.dao.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author
 * @create 2017-10-16 17:22:41
 **/

@Entity
@Table(name = "order_fund_detail")
public class OrderFundDetailENT implements java.io.Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 来源trade_fund_type表
     */
    private String fundCode;

    /**
     * 变动金额
     */
    private BigDecimal money;

    /**
     * 来源号(每类型的资金变动，只能有一次。比如存订单号，充值流水号，兑换流水号)，判断再加上s_fund_code
     */
    private Long sourceId;

    /**
     * 余额
     */
    private BigDecimal blance;

    /**
     * 修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;


    /**
     * 获取 主键 的值
     *
     * @return Long
     */
    @Id
    @Column(name = "n_id")
    public Long getId() {
        return id;
    }

    /**
     * 设置主键 的值
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户ID 的值
     *
     * @return Long
     */
    @Id
    @Column(name = "n_user_id")
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID 的值
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户名 的值
     *
     * @return String
     */
    @Column(name = "s_user_name")
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名 的值
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 来源trade_fund_type表 的值
     *
     * @return String
     */
    @Column(name = "s_fund_code")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * 设置来源trade_fund_type表 的值
     *
     * @param fundCode 来源trade_fund_type表
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    /**
     * 获取 变动金额 的值
     *
     * @return BigDecimal
     */
    @Column(name = "n_money")
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置变动金额 的值
     *
     * @param money 变动金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取 来源号(每类型的资金变动，只能有一次。比如存订单号，充值流水号，兑换流水号)，判断再加上s_fund_code 的值
     *
     * @return Long
     */
    @Column(name = "n_source_id")
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * 设置来源号(每类型的资金变动，只能有一次。比如存订单号，充值流水号，兑换流水号)，判断再加上s_fund_code 的值
     *
     * @param sourceId 来源号(每类型的资金变动，只能有一次。比如存订单号，充值流水号，兑换流水号)，判断再加上s_fund_code
     */
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取 余额 的值
     *
     * @return BigDecimal
     */
    @Column(name = "n_blance")
    public BigDecimal getBlance() {
        return blance;
    }

    /**
     * 设置余额 的值
     *
     * @param blance 余额
     */
    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }

    /**
     * 获取 修改时间 的值
     *
     * @return Date
     */
    @Column(name = "d_update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间 的值
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间 的值
     *
     * @return Date
     */
    @Column(name = "d_create_time")
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间 的值
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}