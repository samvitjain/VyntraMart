package com.virtusa.gstbill.repositories;

import com.virtusa.gstbill.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    @Modifying(clearAutomatically = true)
    @Query("update products p SET p.product_code=:code, p.product_name=:name,p.product_price=:price,p.product_gst=:gst where p.product_id=:id")
    @Transactional
    int updateProduct(@Param("code") int code,@Param("name") String name, @Param("price") int price,@Param("gst") int gst,@Param("id") UUID id);
}
