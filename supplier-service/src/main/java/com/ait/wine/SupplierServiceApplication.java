package com.ait.wine;

import com.ait.wine.model.Supplier;
import com.ait.wine.model.Wine;
import com.ait.wine.repository.SupplierRepository;
import com.ait.wine.repository.WineRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class SupplierServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SupplierServiceApplication.class, args);
        SupplierRepository supplierRepository = configurableApplicationContext.getBean(SupplierRepository.class);
        WineRepository wineRepository = configurableApplicationContext.getBean(WineRepository.class);

        Supplier supplier1 = new Supplier("Lavinia", "France");
        Supplier supplier2 = new Supplier("Cash Vin", "France");
        Supplier supplier3 = new Supplier("Sommellerie de France", "France");
        Supplier supplier4 = new Supplier("Tenute dItalia", "Italy");
        Supplier supplier5 = new Supplier("Italian Wine Merchants", "Italy");
        Supplier supplier6 = new Supplier("Carlota", "Spain");
        Supplier supplier7 = new Supplier("La Llar del Vi", "Spain");
        Supplier supplier8 = new Supplier("Bodega Santa Cecilia", "Spain");
        Supplier supplier9 = new Supplier("Fecovita", "Argentina");
        Supplier supplier10 = new Supplier("Baggio", "Argentina");
        Supplier supplier11 = new Supplier("Youngs Market Co.", "USA");
        Supplier supplier12 = new Supplier("Empire Merchants", "USA");
        Supplier supplier13 = new Supplier("Winebow Group", "USA");
        Supplier supplier14 = new Supplier("Southern Glazers Wine & Spirits", "USA");
        Supplier supplier15 = new Supplier("Breakthru Beverage Group", "USA");
        List<Supplier> suppliers = Arrays.asList(supplier1, supplier2, supplier3, supplier4, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10, supplier11, supplier12, supplier13, supplier14, supplier15);

        Wine wine1 = new Wine("Kelehr Red", "Moorish", "Italy", "Northern", "1999", "sjgernaqgerdhrdj", "Great quality red wine from Italy");
        Wine wine2 = new Wine("Dada Chocolat", "Merlot", "Italy", "Northern", "1976", "sjgernaqgerdhrdj", "Great quality Dada red wine from Italy");
        Wine wine3 = new Wine("Boolean Red", "Shiraz", "France", "Southern", "1989", "sjgernaqgerdhrdj", "Fruity aroma red wine");
        Wine wine4 = new Wine("Cottirol", "Merlot", "Italy", "Northern", "1979", "sjgernaqgerdhrdj", "Another wine");
        List<Wine> wines = Arrays.asList(wine1, wine2, wine3, wine4);


        supplier1.supplierWines(wine1);
        supplier2.supplierWines(wine4);
        supplier3.supplierWines(wine3);
        supplier4.supplierWines(wine4);
        supplier1.supplierWines(wine2);
        supplier1.supplierWines(wine4);
        supplierRepository.saveAll(suppliers);

    }

}

