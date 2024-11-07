package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.*;

//import aplicationSCA.service.MsgService;
import model.Aluno;

@RestController
@RequestMapping("/sca")
public class MsgController {

    @Autowired
    //private MsgService msgService;

    //@Autowired
    //private AAA aaa;

    @GetMapping
    public String scaMsg() {
        return "Mensagem";
    }

    @PostMapping("/id")
    public String scaMsgPost(@PathVariable("id") String id, @RequestParam(value="filter", defaultValue = "nenhum") String filter, @RequestBody Aluno name){
        return "Mensagem" ;
    }
}
