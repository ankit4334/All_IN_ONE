/*

CREATE DATABASE cognizant;
USE cognizant;

CREATE TABLE employee(
id INT PRIMARY KEY,
Ename VARCHAR(50),
salary INT NOT NULL,
city VARCHAR(20) 
);

-- Add a new column in our table
alter table employee add column hireDate VARCHAR(20);
select * from employee;

INSERT INTO employee
(id, Ename, salary, city)
VALUES
(1, "Raunak", 30000, "Bihar"),
(2, "Ankit", 40000, "Bihar"),
(3, "Adam", 25000, "Delhi"),
(4, "Jhon", 15000, "Mumbai"),
(5, "Bob", 20000, "Mumbai"),
(6, "Aman", 15000, "Mumbai"),
(7, "Rahul", 30000, "Pune");

-- calculate how many rows in employee table.

select count(*) from employee;


-- Add/Update data in our new given column.
 update  employee set hireDate = "01-JAN-25" where id = 1;
 update  employee set hireDate = "01-JAN-25" where id = 2;
 update  employee set hireDate = "01-APR-24" where id = 3;
 update  employee set hireDate = "01-DEC-22" where id = 4;
 update  employee set hireDate = "01-JAN-15" where id = 5;
 update  employee set hireDate = "01-MAY-23" where id = 6;
 update  employee set hireDate = "01-JAN-22" where id = 7;
 

select * from employee;



-- Display first and last rows of the table.  (suppose we don't know how many rows in employee table).

select * from employee
where id=1 or id=(select count(*) from employee);

-- Display last two rows of the table.  (suppose we don't know how many rows in employee table).

SELECT * FROM employee
ORDER BY id DESC
LIMIT 2;
          -- This query sorts the rows in descending order by id and returns the first two results, which are the last two rows in the original order.


-- If you need the rows to be in the original order, you can use a subquery:

-- i: 
select * from employee
where id > (select count(*)-2 from employee);


-- ii:
SELECT * FROM (SELECT * FROM employee ORDER BY id DESC LIMIT 2) AS LastTwoRows
ORDER BY id ASC;




-- Display first and last 2 rows of the table.  (suppose we don't know how many rows in employee table).

select * from employee
where id > (select count(*)-2 from employee) or id in(1, 2);



-- Display Even records only of the table. 

select * from employee
where mod(id, 2) = 0;

-- Display Odd records only of the table.  

select * from employee
where mod(id, 2) = 1;

 
-- 1> Find the second highest salary of an employee ?

SELECT MAX(salary) FROM employee
WHERE salary NOT IN (SELECT MAX(salary) FROM employee);

select max(salary) from employee
where salary < (select max(salary) from employee);

-- Find first 2 highest salary.

select distinct salary from employee
order by salary desc
limit 2;

-- Find the (Nth) 3rd highest salary.  

SELECT DISTINCT salary FROM employee
ORDER BY salary DESC
LIMIT 1 OFFSET 2;         -- OFFSET 2 skips the top 2 salaries, returning the 3rd


-- 2> City wise highest salary ? 

select max(salary), city from employee
group by city;



-- 3> Display duplicate values of a column and its frequency.

select city, count(*) from employee
group by city
having count(*) > 1; 

-- 5> Display the employee names whose name start with "A".

select Ename from employee
where Ename like 'A%';


-- 5> Display the employee names whose name ends with 'K'.

select Ename from employee
where Ename like "%N";


-- 6> Display the names of all employees having "N" in any position in their name.

select Ename from employee
where Ename like "%N%";


-- 7> Display the name of all employees whose name doesn`t contain "N" anywhere.

select Ename from employee
where Ename not like '%N%';


-- 8> Display the name of employees whose name start with 'A' and end with 'N'.

select Ename from employee
where Ename like 'A%N';


-- 9> Display the name of employees whose name contains exactly 4 letters.

select Ename from employee
where Ename like '__';


-- 10> Display the name of employees whose name contains (i) second letter as 'A' (ii) fourth letter as 'N'.

select Ename from employee
where Ename like '_A%';

select Ename from employee
where Ename like '___N%';


-- 11> Dispalay the employee names and hire dates for the employee joined in the month of December.

select hireDate, Ename from employee
where hireDate like '%JAN%';
-- where hireDate like '%-25%';  -- joined in year wise 


-- 12> Display Nth row of table

-- i: display 2nd row of the table.

select * from employee
where id = 2; 


-- ii: display all row upto 4th row  and then delete first three row of employee table.

SELECT * FROM employee
WHERE id <= 4
AND id NOT IN (
    SELECT id FROM employee WHERE id <= 3
);

-- iii: display 2nd, 3rd, 7th records.

select * from employee
where id in(2,3,7);

-- 13>  <i> UNION removes duplicate values while combining.

create table sample1(
city varchar(20),
country varchar(20)
);

insert into sample1(city, country)
values
("hyderabad", "india"),
("hyderabad", "india"),
("bhutan", "thimpu");

select * from sample1;

create table sample2(
city varchar(20),
country varchar(20)
);

insert into sample2
(city, country)
values
("hyderabad", "india"),
("london", "uk"),
("texas", "usa"),
("california", "usa");

select * from sample2;


-- i: Applying UNION b/w Single Column(city) 


select city from sample1
union
select city from sample2;

-- ii: Applying UNION b/w Two or more column(of same data type).

select city, country from sample1
union 
select city, country from sample2;



-- <ii>  UNION ALL allows duplicate values while combining.

 select city from sample1
 union all
 select city from sample2;
 
 
 
 -- 14> INNER JOIN : returns only the matching rows based on a join condition. 
 
 create table student(
 id int primary key,
 name varchar(50)
 );
 
 insert into student
 (id, name)
 values
 (101, "adam"),
 (102, "bob"),
 (103, "casey");
 
 select * from student;
 
 create table course(
 id int primary key,
 course varchar(50)
 );
 
 insert into course
 (id, course)
 values
 (102, "english"),
 (105, "math"),
 (103, "science"),
 (107, "computer science");
 
 select * from course;
 
 select * from student
 Inner join course
 on student.id = course.id;



 


*/