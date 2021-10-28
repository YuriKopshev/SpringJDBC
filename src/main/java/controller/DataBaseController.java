package controller;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import repository.MyRepo;


@RestController
@RequestMapping("/")
public class DataBaseController {


    public DataBaseController() {
    }


    @GetMapping("/products/fetch-product")
    public String getProduct(NativeWebRequest webRequest) {
        String name = webRequest.getParameter("name");
        return MyRepo.getProductName(name);
    }


}
