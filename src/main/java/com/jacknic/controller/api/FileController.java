package com.jacknic.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "文件", description = "文件操作")
@RestController
@RequestMapping("/api/file")
public class FileController {

    @ApiOperation("获取文件列表")
    @GetMapping("/list")
    public ModelMap list(@RequestParam(value = "path", defaultValue = "/") String path) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("name", "Jacknic");
        return modelMap;
    }


}
