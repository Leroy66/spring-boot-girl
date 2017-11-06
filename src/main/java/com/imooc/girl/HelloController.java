package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProprities girlProprities;

    //@RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return  girlProprities.getCupSize()+"哈哈哈"+"   ---  "+id ;
        //return  "index";
    }


}
