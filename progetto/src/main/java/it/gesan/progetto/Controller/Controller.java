package it.gesan.progetto.Controller;

import it.gesan.progetto.Interface.Richiesta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/richiesta")
public class Controller {

    private final Richiesta richiesta;

    public Controller(Richiesta richiesta) {
        this.richiesta = richiesta;
    }

    @GetMapping("/chiamata")
    public String getChiamata() {
        return richiesta.getChiamata();
    }
}
