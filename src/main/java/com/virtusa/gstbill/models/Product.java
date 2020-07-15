package com.virtusa.gstbill.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private final UUID product_id;
    private int product_code;
    private String product_name;
    private int product_price;
    private int product_gst;
    private String product_link;


    public Product() {
        this.product_id = UUID.randomUUID();
        this.product_code = 0;
        this.product_name = "";
        this.product_price = 0;
        this.product_gst = 0;
        this.product_link="";
    }

    public Product(@JsonProperty("code") int product_code,
                   @JsonProperty("name") String product_name,
                   @JsonProperty("price") int product_price,
                   @JsonProperty("link") String product_link,
                   @JsonProperty("gst") int product_gst) {
        this.product_id = UUID.randomUUID();
        this.product_code = product_code;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_gst = product_gst;
        this.product_link=product_link;
    }


    public String getProduct_link() {
        return product_link;
    }

    public void setProduct_link(String product_link) {
        this.product_link = product_link;
    }

    public UUID getProduct_id() {
        return product_id;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_gst() {
        return product_gst;
    }

    public void setProduct_gst(int product_gst) {
        this.product_gst = product_gst;
    }
}
