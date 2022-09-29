package ru.netology.SpringJDBC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringJDBC.model.Orders;
import ru.netology.SpringJDBC.repository.MyRepo;

import java.util.List;


@RestController
@RequestMapping("/")
public class DataBaseController {

    private final MyRepo myRepo;

    public DataBaseController(MyRepo myRepo) {
        this.myRepo = myRepo;
    }

    @GetMapping("products/fetch-product")
    public List<Object> getProduct(@RequestParam String name) {
        return myRepo.getProductName(name);
    }
}
