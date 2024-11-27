package com.wn.crm.test;

import com.wn.crm.entity.Manager;
import org.junit.jupiter.api.Test;

/**
 * 这个类是：
 *
 * @author: CHINHAE
 * @date: 2024/11/27 19:30
 * @version: 1.0
 */
public class TestManager {
    @Test
    public void testManager(){
        Manager manager = new Manager();
        manager.setAccount("admin");
        manager.setPassword("123456");
        System.out.println(manager.getAccount());
        System.out.println(manager.getPassword());
    }
}
