package com.khramov.restapimysql.Service;


import com.khramov.restapimysql.Entity.Sales;

import java.util.List;

public interface SalesService {

    public List<Sales> getAllSales();

    public Sales getOneSale(int a);

    public void addNewSale(Sales sales);

    public void deleteSale (int a);

//    public void updateSale (int a);

}
