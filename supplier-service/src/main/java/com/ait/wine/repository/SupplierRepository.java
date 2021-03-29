package com.ait.wine.repository;

import com.ait.wine.model.Supplier;
import com.ait.wine.model.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<Supplier> findByNameAndCountry(String name, String country);
    List<Supplier> findByName(String name);
    List<Supplier> findByCountry(String country);

    @Query("SELECT w from Wine w JOIN w.wineSuppliers u where u.id = ?1 ")
    List<Wine> findWinesBySupplierId(@PathVariable("supplierId") long supplierId);

}
