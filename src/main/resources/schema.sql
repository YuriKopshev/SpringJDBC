
CREATE TABLE CUSTOMERS
(
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    phone_number INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ORDERS
(
    id INT AUTO_INCREMENT NOT NULL,
    date DATE NOT NULL,
    customer_id INT NOT NULL,
    product_name VARCHAR(255),
    amount INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);

