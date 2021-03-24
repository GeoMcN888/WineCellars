package com.ait.clientfeign.feignclients;

import com.ait.clientfeign.model.Wine;
import com.ait.wine.model.Supplier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient("zuul-api-gateway")
public interface WineServiceClientZuul
{
    @GetMapping("wine-service/wine/{wineId}")
    Wine getWineById(@PathVariable int wineId);

    @DeleteMapping("wine-service/wine/{wineId}")
    void deleteWineById(@PathVariable int wineId);

    @PostMapping("wine-service/wine/{wineId}")
    Supplier addWine(@RequestBody Wine wine) ;

    @GetMapping("wine-service/wine")
    public List<Supplier> getWines(@RequestParam("name") Optional<String> name, @RequestParam("country")Optional<String> country);

}


