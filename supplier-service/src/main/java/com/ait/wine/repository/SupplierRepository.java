package com.ait.wine.repository;

import com.ait.wine.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<Supplier> findByNameAndCountry(String name, String country);
    List<Supplier> findByName(String name);
    List<Supplier> findByCountry(String country);

}
