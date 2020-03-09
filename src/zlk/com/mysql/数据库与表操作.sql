-- 一：操作数据库：CRUD
-- 1、创建-----------------------
-- 1）、创建数据库，判断不存在，并且指定字符集
CREATE DATABASE IF NOT EXISTS testDatabase CHARACTER SET utf8;

-- CRUD,Create 创建、Retrieve 查询 （show databases）、update 修改、Delete 删除

-- 2、查询-----------------------
-- 1）、查询所有数据库
SHOW DATABASES;
-- 2）、查看某个数据库的字符集
SHOW CREATE DATABASE mysql;

-- 3、修改-----------------------
-- 1）、修改数据库字符集
ALTER DATABASE testDatabase CHARACTER SET utf8;

-- 4、删除-----------------------
DROP DATABASE IF EXISTS 数据库名称

-- 5、使用数据库-----------------------
-- 1）查询当前正在使用的数据库名称
SELECT DATABASE();
-- 2)使用数据库
USE 数据库名称；


/**
常用数据库类型：
 1.int 整数类型。
 2、double 小数类型。
 3、date 日期类型，只包含年月日。 yyyy-MM-dd
    datetime:日期 yyyy-MM-dd HH:SS:DD
 5、timestamp：时间戳类型，如果不给该字段赋值，或赋值为null，则默认使用当前的系统时间，来自动赋值。
 6、varchar:字符串类型。如name varchar(20);最大20个字符；“张三”。两个字符。
*/

-- 二：操作表
-- 1、创建-----------------------
-- 1）、创建表
CREATE TABLE student(
 sname VARCHAR(5),
 age INT
)

-- 2、查询-----------------------
-- 1）、查询某个数据库中所有表名称
SHOW TABLES;
-- 2）、查看某个表结构
DESC 表名;

-- 3、修改-----------------------
-- 1）、修改表名
ALTER TABLE 表名 RENAME TO 新的表名;
-- 2）、修改表字符集
ALTER TABLE 表名 CHARACTER SET 字符集名称;
-- 3）、添加一列
ALTER TABLE 表名 ADD 列名 数据类型;
-- 4）、修改列名称、类型

-- 5）、删除列

-- 4、删除-----------------------
DROP TABLE IF EXISTS 表名;

-- 5、使用数据库-----------------------
-- 1）查询当前正在使用的数据库名称
SELECT DATABASE();
-- 2)使用数据库
USE 数据库名称；

