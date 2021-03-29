package com.ait.wine.repository;

import com.ait.wine.model.Supplier;
import com.ait.wine.model.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface WineRepository extends JpaRepository<Wine, Long> {
    List<Wine> findByCountryAndGrapes(String country, String grapes);
    List<Wine> findByName(String name);
    List<Wine> findByCountry(String country);

    @Query("SELECT s from Supplier s JOIN s.supplierWines u where u.id = ?1 ")
    List<Supplier> findSuppliersByWineId(@PathVariable("wineId") long wineId);


}
