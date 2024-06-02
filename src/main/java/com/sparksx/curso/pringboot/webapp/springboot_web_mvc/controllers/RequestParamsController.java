package com.sparksx.curso.pringboot.webapp.springboot_web_mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sparksx.curso.pringboot.webapp.springboot_web_mvc.models.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api/params") // Prefix de la ruta
public class RequestParamsController {

    @GetMapping("/foo") // Para añadir un param ?message=valor despues del primer param los demas param llevan & en lugar de ?
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

    /// Ejemplo de lo mismo de arriba pero en lugar de ocupar anotaciones se hace de forma nativa
    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request){
        ParamDto params = new ParamDto();
        params.setCode(Integer.parseInt(request.getParameter("code")));
        params.setMessage(request.getParameter("text"));
        return params;
    }
}
