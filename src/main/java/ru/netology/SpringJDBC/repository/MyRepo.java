package ru.netology.SpringJDBC.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netology.SpringJDBC.model.Orders;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MyRepo {

    @PersistenceContext
    EntityManager manager;

    public List<Object> getProductName(String name) {
        return manager.createQuery("select o.product_name from Orders o where o.customers.name =:name").setParameter("name", name).getResultList();
    }
}
