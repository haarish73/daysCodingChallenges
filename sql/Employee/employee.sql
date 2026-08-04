create database InterviewSql;
-- Query OK, 1 row affected (0.01 sec)

use InterviewSql;
Database changed

create table emoloyee(emp_id Int PRIMARY KEY, emp_name VARCHAR(50),
    department VARCHAR(50), SALARY INT, AGE INT, CITY VARCHAR(50));
-- Query OK, 0 rows affected (0.03 sec)

-- iNSERT INTO TABLE

> insert into emoloyee values(1,'Harish','cse',10000,22,'Hyderabad');
-- Query OK, 1 row affected (0.01 sec)

mysql> insert into emoloyee values(2,'Rahul','IT',50000,25,'Hyderabad');
-- Query OK, 1 row affected (0.01 sec)

mysql> insert into emoloyee values(3,'Amit','HR',30000,29,'Pune');
-- Query OK, 1 row affected (0.01 sec)

mysql> insert into emoloyee values(4,'Riya','Sales',20000,21,'Delhi');
-- Query OK, 1 row affected (0.00 sec)

mysql> insert into emoloyee values(5,'Sneha','HR',30000,24,'Mumbai');
-- Query OK, 1 row affected (0.01 sec)

mysql> insert into emoloyee values(6,'Karan','IT',70000,30,'Hyderabad');
-- Query OK, 1 row affected (0.01 sec)

mysql> insert into emoloyee values(7,'Neha','sales',52000,26,'Mumbai');
-- Query OK, 1 row affected (0.01 sec)

mysql> insert into emoloyee values(8,'Rohit','Finance',48000,29,'Chennai');
-- Query OK, 1 row affected (0.00 sec)

mysql> insert into emoloyee values(9,'Anjali','Finance',55000,27,'Hyderabad');
-- Query OK, 1 row affected (0.00 sec)

mysql> insert into emoloyee values(10,'Arjun','It',60000,31,'Delhi');
-- Query OK, 1 row affected (0.01 sec)

-- Display all employee records.
select * FROM emoloyee

-- Q2
-- Display only employee names.
select emp_name as name from emoloyee;

-- Q3
-- Display employee names and salaries.
select emp_name as name, salary from emoloyee;

-- Q4
-- Show employees whose salary is greater than 50000.
select * from emoloyee where salary > 50000;


-- Q5
-- Show employees whose age is less than 25.
select * from emoloyee where age < 25;

-- Q6
-- Display employees from Hyderabad.
select * from emoloyee where city='Hyderabad';

-- Q7
-- Display employees from Delhi.
select * from emoloyee where city='DELHI';

-- Q8
-- Display employees whose department is IT.
select * from emoloyee where DEPARTMENT='IT';
+--------+----------+------------+--------+------+-----------+
| emp_id | emp_name | department | SALARY | AGE  | CITY      |
+--------+----------+------------+--------+------+-----------+
|      2 | Rahul    | IT         |  50000 |   25 | Hyderabad |
|      6 | Karan    | IT         |  70000 |   30 | Hyderabad |
|     10 | Arjun    | It         |  60000 |   31 | Delhi     |
+--------+----------+------------+--------+------+-----------+

-- Q9
-- Display employees whose salary is exactly 40000.
 select * from emoloyee where SALARY=40000;
Empty set (0.00 sec)

-- Q10
-- Display employees whose age is greater than 25.
select * from emoloyee where age > 25;
+--------+----------+------------+--------+------+-----------+
| emp_id | emp_name | department | SALARY | AGE  | CITY      |
+--------+----------+------------+--------+------+-----------+
|      3 | Amit     | HR         |  30000 |   29 | Pune      |
|      6 | Karan    | IT         |  70000 |   30 | Hyderabad |
|      7 | Neha     | sales      |  52000 |   26 | Mumbai    |
|      8 | Rohit    | Finance    |  48000 |   29 | Chennai   |
|      9 | Anjali   | Finance    |  55000 |   27 | Hyderabad |
|     10 | Arjun    | It         |  60000 |   31 | Delhi     |
+--------+----------+------------+--------+------+-----------+

-- Q11
-- Find employees whose salary is between 40000 and 60000.
select * from emoloyee where salary between 40000 and 60000;
+--------+----------+------------+--------+------+-----------+
| emp_id | emp_name | department | SALARY | AGE  | CITY      |
+--------+----------+------------+--------+------+-----------+
|      2 | Rahul    | IT         |  50000 |   25 | Hyderabad |
|      7 | Neha     | sales      |  52000 |   26 | Mumbai    |
|      8 | Rohit    | Finance    |  48000 |   29 | Chennai   |
|      9 | Anjali   | Finance    |  55000 |   27 | Hyderabad |
|     10 | Arjun    | It         |  60000 |   31 | Delhi     |
+--------+----------+------------+--------+------+-----------+
5 rows in set (0.00 sec)