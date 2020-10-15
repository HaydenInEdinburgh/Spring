package com.bernieye.service.impl;

import com.bernieye.dao.goodsDao;
import com.bernieye.dao.saleDao;
import com.bernieye.domain.Goods;
import com.bernieye.domain.Sale;
import com.bernieye.except.NotEnoughException;
import com.bernieye.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private saleDao saleDao;
    private goodsDao goodsDao;

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
            throw new NotEnoughException("库存不足");
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
