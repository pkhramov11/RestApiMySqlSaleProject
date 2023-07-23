package com.khramov.restapimysql.Service;

import com.khramov.restapimysql.DAO.SalesRepositories;
import com.khramov.restapimysql.Entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SalesServiceImpl implements SalesService{

    @Autowired
    SalesRepositories salesRepositories;

    @Override
    public List<Sales> getAllSales() {
        return salesRepositories.findAll();
    }

    @Override
    public Sales getOneSale(int a) {
        Sales sales = null;
        Optional<Sales> optional = salesRepositories.findById(a);
        if(optional.isPresent()){
            sales = optional.get();
        }
        return sales;
    }

    @Override
    public void addNewSale(Sales sales) {
        salesRepositories.save(sales);
    }

    @Override
    public void deleteSale(int a) {
        salesRepositories.deleteById(a);
    }

    @Override
    public Sales updateSale(Sales sales) {
        salesRepositories.save(sales);
        return sales;
    }
}
