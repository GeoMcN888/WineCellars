package com.ait.clientfeign.feignclients;

import com.ait.clientfeign.model.Supplier;
import com.ait.clientfeign.model.Wine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@FeignClient("zuul-api-gateway")
public interface WineCellarServiceClientZuul
{
    @GetMapping("wine-service/wine/{wineId}")
    Wine getWineById(@PathVariable(value = "wineId") long wineId);

    @DeleteMapping("wine-service/wine/{wineId}")
    void deleteWineById(@PathVariable(value = "wineId") long wineId);

    @PostMapping("wine-service/wine/{wineId}")
    Wine addWine(@RequestBody Wine wine) ;

    @GetMapping("wine-service/wine")
    List<Wine> getWines(@RequestParam("name") Optional<String> name, @RequestParam("country")Optional<String> country, @RequestParam("grapes") Optional<String> grapes);

    @GetMapping("supplier-service/suppliers/{supplierId}")
    Supplier getSupplierById(@PathVariable(value = "supplierId") long supplierId);

    @DeleteMapping("supplier-service/suppliers/{supplierId}")
    void deleteSupplierById(@PathVariable(value = "supplierId") long supplierId);

    @PostMapping("supplier-service/suppliers")
    Supplier addSupplier(@RequestBody Supplier supplier) ;

    @GetMapping("supplier-service/suppliers")
    List<Supplier> getSuppliers(@RequestParam("name") Optional<String> name, @RequestParam("country")Optional<String> country);

}


