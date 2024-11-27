package com.wn.crm.entity;

import lombok.Data;

/**
 * 这个类是：
 *
 * @author: CHINHAE
 * @date: 2024/11/27 19:43
 * @version: 1.0
 */
@Data
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private String image;
    private boolean status;
}
