package br.edu.ifal.listadeconvidados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import br.edu.ifal.listadeconvidados.model.Convidados;

@RestController
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    @RequestMapping("/convidados")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        return modelAndView;

    }

}