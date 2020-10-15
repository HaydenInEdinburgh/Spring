package com.bernieye.dao;

import com.bernieye.domain.Goods;

public interface goodsDao {
    //update the stock
    //goods represents the order information
    int updateGoods(Goods goods);

    //get the goods' info
    Goods selectGood(Integer id);
}
