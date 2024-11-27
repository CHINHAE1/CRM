package com.wn.crm.test;

import com.wn.crm.entity.Product;
import org.junit.jupiter.api.Test;

/**
 * 这个类是：
 *
 * @author: CHINHAE
 * @date: 2024/11/27 19:46
 * @version: 1.0
 */
public class TestProduct {
    @Test
    public void testProduct()
    {
        Product product = new Product();
        product.setId("1");
        product.setName("苹果");
        product.setPrice(10);
        product.setStock(100);
        product.setImage("http://www.baidu.com");
        product.setStatus(true);
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getStock());
        System.out.println(product.getImage());
        System.out.println(product.isStatus());
    }
}
