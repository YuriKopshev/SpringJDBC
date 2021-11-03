package ru.netology.SpringJDBC.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netology.SpringJDBC.Orders;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MyRepo {

    @PersistenceContext
    private EntityManager manager;

    public List<Object> getProductName(String name) {
        Query query = manager.createQuery("select p.product_name from Orders p join Customers c on c.id =p.customers.id where c.name = :name ", Orders.class);
        query.setParameter("name",name);
        return query.getResultList();

//        SELECT product_name
//        FROM ORDERS
//        JOIN CUSTOMERS C on C.id = ORDERS.customer_id WHERE LOWER(name) = :name;

//    final String SCRIPT = read("myScript.sql");
//
//    public String read(String scriptFileName) {
//        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
//             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
//            return bufferedReader.lines().collect(Collectors.joining("\n"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    public List<String> getProductName(String name) {
//        MapSqlParameterSource parameters = new MapSqlParameterSource("name", name);
//        return template.queryForList(SCRIPT, parameters, String.class);
//    }
    }
}
