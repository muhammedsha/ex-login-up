/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jibin
 * Created: 5 Apr, 2018
 */
DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  emp_id        VARCHAR(10) NOT NULL,
  name          VARCHAR(20) NOT NULL,
  email_address VARCHAR(25) NOT NULL,
  phone_no      VARCHAR(10)  NOT NULL);


INSERT INTO employee (emp_id, name, email_address, phone_no) VALUES ('123', 'admin', 'admin@admin.com', '155');

INSERT INTO employee (emp_id, name, email_address, phone_no) VALUES ('124', 'shah', 'shah@user.com', '156');