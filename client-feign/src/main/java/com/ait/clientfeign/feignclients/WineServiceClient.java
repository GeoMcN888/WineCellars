package com.ait.clientfeign.feignclients;

import com.ait.clientfeign.model.Wine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*I don't think this is needed anymore*/

@FeignClient("wine-service")
public interface WineServiceClient
{
    @GetMapping("wine/{wineId}")
    Wine getWineById(@PathVariable(value = "wineId") long wineId);

    @DeleteMapping("wine/{wineId}")
    void deleteWineById(@PathVariable(value = "wineId") long wineId);
}



