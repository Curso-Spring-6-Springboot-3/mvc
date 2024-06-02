package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sparksx.curso.pringboot.webapp.springboot_web_mvc.models.dto.ParamDto;

@RestController
@RequestMapping("/api/params") // Prefix de la ruta
public class RequestParamsController {

    @GetMapping("/foo") // Para añadir un param ?message=valor
    public ParamDto foo(@RequestParam(required = false, defaultValue = "default Param") String message){ //Por default los RequestParams son requeridos
        ParamDto param = new ParamDto();
        param.setMessage(message != null ? message : "Sin param");
        return param;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code){

        ParamDto params = new ParamDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
}
