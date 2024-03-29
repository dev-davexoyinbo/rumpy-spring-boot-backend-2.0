package com.example.rumpy.repository;

import com.example.rumpy.model.CartItem;
import com.example.rumpy.model.ProductItem;
import com.example.rumpy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, String> {
    List<CartItem> findByUser(User user);

    Optional<CartItem> findByProductItemAndUser(ProductItem productItem, User user);

    Integer countByUser(User user);

    Optional<CartItem> findByIdAndUser(String id, User user);
}//end interface CartItemRepository
