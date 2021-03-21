package com.ait.wine.controller;

import com.ait.wine.model.Supplier;
import com.ait.wine.repository.SupplierRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @DeleteMapping("/suppliers/{supplierId}")
    public ResponseEntity deleteSupplierById(@PathVariable long supplierId) throws Exception {
        Supplier supplier = supplierRepository.findById(supplierId).orElseThrow(() -> new Exception("Not found"));
        supplierRepository.delete(supplier);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/suppliers")
    public ResponseEntity addSupplier(@RequestBody Supplier supplier) {
        supplierRepository.save(supplier);
        return ResponseEntity.accepted().body(supplier);
    }

    @GetMapping("/suppliers")
    public List<Supplier> getSuppliers(@RequestParam("name")Optional<String> name, @RequestParam("country")Optional<String> country) {
        if (name.isPresent() && country.isPresent()) {
             return supplierRepository.findByNameAndCountry(name, country);
        } else if (name.ifPresent(() -> { return supplierRepository.findByName(name);});)
    }

}
