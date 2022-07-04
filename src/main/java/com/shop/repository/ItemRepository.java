package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    // 상품명으로 조회
    List<Item> findByItemNm(String itemNm);


    // 상품명 또는 상품 상세 설명으로 조회
    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);


    // Less Than 파라미터로 넘어온 가격보다 작은 상품 조회
    List<Item> findByPriceLessThan(Integer price);


    // OrderBy칼럼Desc,Asc
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

}
