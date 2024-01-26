package com.items.ItemsPoC.repository;

import com.items.ItemsPoC.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Short> {
}

