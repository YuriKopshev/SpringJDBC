SELECT product_name
FROM ORDERS
 JOIN CUSTOMERS C on C.id = ORDERS.customer_id WHERE LOWER(name) = :name;