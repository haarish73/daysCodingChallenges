-- in this file i will revise the concepts of dml(data manipulation languages).
-- commands : 
-- insert
-- update 
-- delete

-- 1. insert command
INSERT INTO TABLE students VALUES(1,"Harish",23,"Hyderabad");

-- 2. update
mysql> update students set city = 'mumbai' where id = 2;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from students;
+------+--------+------+-----------+
| id   | name   | age  | city      |
+------+--------+------+-----------+
|    1 | Harish |   22 | Hyderabad |
|    2 | Rahul  |   23 | mumbai    |
+------+--------+------+-----------+
2 rows in set (0.00 sec)

-- 3. delete
mysql> delete from students where id = 2;
Query OK, 1 row affected (0.01 sec)

mysql> select * from students;
+------+--------+------+-----------+
| id   | name   | age  | city      |
+------+--------+------+-----------+
|    1 | Harish |   22 | Hyderabad |
+------+--------+------+-----------+
1 row in set (0.00 sec)