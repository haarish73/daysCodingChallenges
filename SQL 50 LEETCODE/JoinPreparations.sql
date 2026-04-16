-- mysql> create table customers(customer_id INT PRIMARY KEY,
--     -> customer_name varchar(50));
-- Query OK, 0 rows affected (0.07 sec)

-- mysql> show tables;
-- +-------------------+
-- | Tables_in_haarish |
-- +-------------------+
-- | customers         |
-- +-------------------+
-- 1 row in set (0.02 sec)

-- mysql> select * from customers;
-- Empty set (0.01 sec)

-- mysql> desc customers;
-- +---------------+-------------+------+-----+---------+-------+
-- | Field         | Type        | Null | Key | Default | Extra |
-- +---------------+-------------+------+-----+---------+-------+
-- | customer_id   | int         | NO   | PRI | NULL    |       |
-- | customer_name | varchar(50) | YES  |     | NULL    |       |
-- +---------------+-------------+------+-----+---------+-------+
-- 2 rows in set (0.01 sec)

-- mysql> create table orders(order_id int PRIMARY KEY, customer_id int, Product_name varchar(50), amount BIGINT, date date);
-- Query OK, 0 rows affected (0.04 sec)

-- mysql> desc orders;
-- +--------------+-------------+------+-----+---------+-------+
-- | Field        | Type        | Null | Key | Default | Extra |
-- +--------------+-------------+------+-----+---------+-------+
-- | order_id     | int         | NO   | PRI | NULL    |       |
-- | customer_id  | int         | YES  |     | NULL    |       |
-- | Product_name | varchar(50) | YES  |     | NULL    |       |
-- | amount       | bigint      | YES  |     | NULL    |       |
-- | date         | date        | YES  |     | NULL    |       |
-- +--------------+-------------+------+-----+---------+-------+
-- 5 rows in set (0.00 sec)

-- mysql> INSERT INTO Customers VALUES
--     -> (1, 'Harish'),
--     -> (2, 'Rahul'),
--     -> (3, 'Priya'),
--     -> (4, 'Sneha'),
--     -> (5, 'Aman');
-- Query OK, 5 rows affected (0.01 sec)
-- Records: 5  Duplicates: 0  Warnings: 0

-- mysql> INSERT INTO Orders VALUES
--     -> (101, 1, 'Laptop', 70000, '2026-04-01'),
--     -> (102, 1, 'Mouse', 1000, '2026-04-02'),
--     -> (103, 3, 'Keyboard', 2000, '2026-04-02'),
--     -> (104, 4, 'Phone', 30000, '2026-04-03'),
--     -> (105, 4, 'Charger', 1500, '2026-04-03');
-- Query OK, 5 rows affected (0.01 sec)
-- Records: 5  Duplicates: 0  Warnings: 0

-- mysql> select * from customers;
-- +-------------+---------------+
-- | customer_id | customer_name |
-- +-------------+---------------+
-- |           1 | Harish        |
-- |           2 | Rahul         |
-- |           3 | Priya         |
-- |           4 | Sneha         |
-- |           5 | Aman          |
-- +-------------+---------------+
-- 5 rows in set (0.00 sec)

-- mysql> select * from orders;
-- +----------+-------------+--------------+--------+------------+
-- | order_id | customer_id | Product_name | amount | date       |
-- +----------+-------------+--------------+--------+------------+
-- |      101 |           1 | Laptop       |  70000 | 2026-04-01 |
-- |      102 |           1 | Mouse        |   1000 | 2026-04-02 |
-- |      103 |           3 | Keyboard     |   2000 | 2026-04-02 |
-- |      104 |           4 | Phone        |  30000 | 2026-04-03 |
-- |      105 |           4 | Charger      |   1500 | 2026-04-03 |
-- +----------+-------------+--------------+--------+------------+
-- 5 rows in set (0.00 sec)

















-- Q1. Show all customers with their orders

-- Return:

-- customer_name
-- product_name

mysql> select c.customer_name, o.product_name
    -> From customers c
    -> INNER JOIN orders o
    -> ON c.customer_id = o.customer_id;
-- +---------------+--------------+
-- | customer_name | product_name |
-- +---------------+--------------+
-- | Harish        | Laptop       |
-- | Harish        | Mouse        |
-- | Priya         | Keyboard     |
-- | Sneha         | Phone        |
-- | Sneha         | Charger      |
-- +---------------+--------------+


-- Q2. Find customers who never placed any order

-- Return:

-- customer_id
-- customer_name

-- 👉 Use LEFT JOIN + NULL

mysql> SELECT c.customer_id, c.customer_name
    -> FROM Customers c
    -> LEFT JOIN Orders o
    -> ON c.customer_id = o.customer_id
    -> WHERE o.order_id IS NULL;
-- +-------------+---------------+
-- | customer_id | customer_name |
-- +-------------+---------------+
-- |           2 | Rahul         |
-- |           5 | Aman          |
-- +-------------+---------------+

-- Q3. Count total orders placed by each customer

-- Return:

-- customer_name
-- total_orders

-- 👉 Use:

-- LEFT JOIN
-- COUNT
-- GROUP BY

solutions : 

mysql> select c.customer_name, COUNT(o.order_id) AS total_orders
    -> FROM Customers c
    -> LEFT JOIN orders o
    -> ON c.customer_id = o.customer_id
    -> GROUP BY c.customer_name;


-- +---------------+--------------+
-- | customer_name | total_orders |
-- +---------------+--------------+
-- | Harish        |            2 |
-- | Rahul         |            0 |
-- | Priya         |            1 |
-- | Sneha         |            2 |
-- | Aman          |            0 |
-- +---------------+--------------+



-- Q4. Find total amount spent by each customer

-- Return:

-- customer_name
-- total_spent

-- Include 0 for customers with no orders.

-- 👉 Use:

-- SUM()
-- COALESCE()
-- LEFT JOIN

select c.customer_name, COALESCE(SUM(o.amount), 0) as total_spent
From customer c JOIN orders 
ON c.customer_id = o.customer_id;
GROUP BY customer_name;




-- 🟡 Q5. Find the customer who spent the highest total amount

-- Return:

-- customer_name
-- total_spent

-- 👉 Use:

-- JOIN
-- GROUP BY
-- ORDER BY DESC
-- LIMIT 1

-- solutions: 

mysql> SELECT c.customer_name,
    ->        SUM(o.amount) AS total_spent
    -> FROM Customers c
    -> LEFT JOIN Orders o
    -> ON c.customer_id = o.customer_id
    -> GROUP BY c.customer_name
    -> ORDER BY total_spent DESC
    -> LIMIT 1;

    
-- +---------------+-------------+
-- | customer_name | total_spent |
-- +---------------+-------------+
-- | Harish        |       71000 |
-- +---------------+-------------+

Q6. Find customers who purchased more than 1 product

Return:

customer_name
total_orders

👉 Use:

GROUP BY
HAVING COUNT(*) > 1

Interviewers LOVE this.





