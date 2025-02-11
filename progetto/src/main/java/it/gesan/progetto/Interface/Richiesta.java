package it.gesan.progetto.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feignClient", url = "https://run.mocky.io/v3")
public interface Richiesta {

    @GetMapping("/c182c614-d07b-4970-b2d1-ebc33b1896bc")
    String getChiamata();

}
