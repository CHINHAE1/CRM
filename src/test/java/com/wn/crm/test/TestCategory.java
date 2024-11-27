package com.wn.crm.test;

import com.wn.crm.entity.Category;
import org.junit.jupiter.api.Test;

/**
 * 这个类是：
 *
 * @author: CHINHAE
 * @date: 2024/11/27 19:03
 * @version: 1.0
 */
public class TestCategory {

    @Test
    public void testCategory(){
        Category category = new Category();
        category.setName("test");
        System.out.println(category.getName());
    }

    @Test
    public void testCategory2(){
        Category category = new Category();
        category.setName("cat");
        System.out.println(category.getName());
    }
}
