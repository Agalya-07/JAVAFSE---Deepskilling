package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
}