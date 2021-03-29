
CREATE TABLE namecard (
  id int NOT NULL,
  name varchar(10) NOT NULL,
  tel varchar(20) NOT NULL,
  email varchar(30) DEFAULT NULL,
  address varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ;