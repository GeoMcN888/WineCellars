package com.ait.wine.controller;

import com.ait.wine.model.Supplier;
import com.ait.wine.repository.SupplierRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SupplierController {

    private Logger LOGGER = LoggerFactory.getLogger(SupplierController.class);

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping("/suppliers/{supplierId}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable long supplierId) throws Exception {
        Supplier supplier = supplierRepository.findById(supplierId).orElseThrow(() -> new Exception("Not found"));
        return ResponseEntity.ok(supplier);
    }

}
