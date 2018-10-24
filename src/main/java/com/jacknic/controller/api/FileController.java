package com.jacknic.controller.api;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/file")
public class FileController {

    @RequestMapping("/list")
    public ModelMap list(ModelMap modelMap) {
        modelMap.addAttribute("name", "Jacknic");
        return modelMap;
    }


}
