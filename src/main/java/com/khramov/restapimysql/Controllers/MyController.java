package com.khramov.restapimysql.Controllers;

import com.khramov.restapimysql.Entity.Sales;
import com.khramov.restapimysql.Service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/sales")
    public List<Sales> getAllSales(){
        return salesService.getAllSales();
    }

    @GetMapping("/sales/{a}")
    public Sales getOneSale(@PathVariable int a){
        return salesService.getOneSale(a);
    }

    @PostMapping("/sales/{sale}")
    public void addNewSale(@ModelAttribute Sales sales){
       salesService.addNewSale(sales);
    }

    @DeleteMapping("/sale/{a}")
    public void deleteSale (@PathVariable int a){
        salesService.deleteSale(a);
    }


}
