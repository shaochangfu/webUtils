1.更改配置文件：
/WebUtils2/src/main/resources/jdbc.properties
配置本地数据库用的

2.新建db
CREATE TABLE person (
  id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL,
  address VARCHAR(256) NOT NULL,
  postcode VARCHAR(16) NOT NULL,
  PRIMARY KEY (id)
);
