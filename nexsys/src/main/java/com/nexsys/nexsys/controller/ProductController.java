package com.nexsys.nexsys.controller;

import com.nexsys.nexsys.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/service")

public class ProductController {

    @GetMapping(value = "/nexsys/v1/products")
    public String allProduct(){
        String uri = "https://api.escuelajs.co/api/v1/products";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping(value = "/nexsys/v1/categories")
    public String getAllCategories(){
        String uri = "https://api.escuelajs.co/api/v1/categories/?categoryId=''";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }


    @PostMapping(value ="/nexsys/v1/categories/product")
    public String postProduct(@RequestBody ProductModel productModel){

        return productModel.toString();

    }
}
