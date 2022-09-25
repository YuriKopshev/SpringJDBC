
CREATE TABLE ORDERS
(
    id INT AUTO_INCREMENT NOT NULL,
    date VARCHAR(255) NOT NULL,
    customer_id INT NOT NULL,
    product_name VARCHAR(255),
    amount INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);
