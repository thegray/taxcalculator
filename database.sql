CREATE DATABASE IF NOT EXISTS tax;

USE tax;

CREATE TABLE IF NOT EXISTS bill (
id INT(3) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
created DATETIME DEFAULT CURRENT_TIMESTAMP);

CREATE TABLE IF NOT EXISTS tax_item (
id INT(3) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
name VARCHAR(50) NOT NULL, 
tax_code INT(2) NOT NULL, 
price DOUBLE(10,2) NOT NULL, 
bill_id INT(3) UNSIGNED NOT NULL, 
FOREIGN KEY (bill_id) 
REFERENCES bill(id) 
ON UPDATE CASCADE 
ON DELETE RESTRICT);
