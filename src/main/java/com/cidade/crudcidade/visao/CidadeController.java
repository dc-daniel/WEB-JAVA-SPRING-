package com.cidade.crudcidade.visao;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CidadeController {

    @GetMapping("/")
    public String listar(Model memoria) {
        var cidades = Set.of(
                new Cidade("Maringa", "PR")

        );
        memoria.addAttribute("listaCidades", cidades);
        return "/crud";
    }

}
