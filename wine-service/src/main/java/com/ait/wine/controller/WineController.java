package com.ait.wine.controller;

import com.ait.wine.model.Wine;
import com.ait.wine.repository.WineRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WineController {

    private Logger LOGGER = LoggerFactory.getLogger(WineController.class);

    @Autowired
    WineRepository wineRepository;

    @GetMapping("/wine/{wineId}")
    public ResponseEntity<Wine> getWineById(@PathVariable long wineId) throws Exception {
        Wine wine = wineRepository.findById(wineId).orElseThrow(() -> new Exception("Not found"));
        return ResponseEntity.ok(wine);
    }
}
