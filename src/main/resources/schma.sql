#
# CREATE TABLE salesDb.user (
#                               id INT NOT NULL AUTO_INCREMENT,
#                               username VARCHAR(45) NOT NULL,
#                               password VARCHAR(100) NOT NULL,
#                               algorithm VARCHAR(45) NOT NULL,
#                               PRIMARY KEY (id)
#
# );
#
#
# CREATE TABLE salesDb.authority (
#                               id INT NOT NULL AUTO_INCREMENT,
#                               name VARCHAR(45) NOT NULL,
#                               user INT NOT NULL,
#                               PRIMARY KEY (id)
#
# );
#
#
# CREATE TABLE salesDb.product (
#                               id INT NOT NULL AUTO_INCREMENT,
#                               name VARCHAR(45) NOT NULL,
#                               price VARCHAR(45) NOT NULL,
#                               currency VARCHAR(45) NOT NULL,
#                               PRIMARY KEY (id)
#
# );