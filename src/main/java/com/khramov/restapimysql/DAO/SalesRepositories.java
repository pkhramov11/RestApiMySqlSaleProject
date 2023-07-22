package com.khramov.restapimysql.DAO;

import com.khramov.restapimysql.Entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepositories extends JpaRepository<Sales, Integer> {
}
