package com.bernieye.service.impl;

import com.bernieye.dao.goodsDao;
import com.bernieye.dao.saleDao;
import com.bernieye.domain.Goods;
import com.bernieye.domain.Sale;
import com.bernieye.except.NotEnoughException;
import com.bernieye.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private saleDao saleDao;
    private goodsDao goodsDao;
    /*rollbackFor 表示发生指定的异常一定回滚
    * 处理逻辑
    * 1）框架首先检查抛出的异常是不是在RollBack的属性列表中
    *   if yes， 不管什么类型异常，都会回滚
    * 2）if not, then 检查异常是否为 RuntimeException
    *    if yes， 就会滚。*/
//    @Transactional(
//            propagation = Propagation.REQUIRED,
//            isolation = Isolation.DEFAULT,
//            readOnly = false,
//            rollbackFor = {
//                    NullPointerException.class,
//                    NotEnoughException.class
//            }
//    )
    @Transactional
    @Override
    public void buy(Integer goodsId, Integer nums) {
        //record the purchase info, insert it into sale
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //update the stock
        Goods goods = goodsDao.selectGood(goodsId);
        System.out.println(goods.getAmount()+" " + goods.getName());

        if(goods == null){
            // no such good
            throw new NullPointerException("商品不存在");
        }else if( goods.getAmount() < nums){
            throw new NotEnoughException("编号是 "+ goodsId +" 库存不足");
        }

        //change the Object
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法完成");
    }

    public saleDao getSaleDao() {
        return saleDao;
    }

    public void setSaleDao(saleDao saleDao) {
        this.saleDao = saleDao;
    }

    public goodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(goodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
