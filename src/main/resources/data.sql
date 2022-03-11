DROP TABLE IF EXISTS employees;
 
CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);
 
INSERT INTO employees (first_name, last_name, mail, password) VALUES
  ('Christophe', 'Gina', 'christophegina@mail.com', 'laurent'),
  ('Sophie', 'Foncek', 'sophiefoncek@mail.com', 'sophie'),
  ('Sophie', 'Bouvry', 'sophiebouvry@mail.com', 'sophie'),
  ('Agathe', 'Feeling', 'agathefeeling@mail.com', 'agathe');  
 