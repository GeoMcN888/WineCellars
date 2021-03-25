package com.ait.clientfeign.feignclients;

import com.ait.clientfeign.model.Supplier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

/*I don't think this is needed anymore*/

@FeignClient("supplier-service")
public interface SupplierServiceClient {

   @GetMapping("suppliers/{supplierId}")
   Supplier getSupplierById(@PathVariable(value = "supplierId") long supplierId);

   @DeleteMapping("suppliers/{supplierId}")
   void deleteSupplierById(@PathVariable(value = "supplierId") long supplierId);

   @PostMapping("suppliers")
   Supplier addSupplier(@RequestBody Supplier supplier) ;

   @GetMapping("suppliers")
   public List<Supplier> getSuppliers(@RequestParam("name") Optional<String> name, @RequestParam("country")Optional<String> country);

}

