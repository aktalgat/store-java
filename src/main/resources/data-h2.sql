MERGE INTO roles KEY(id) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

--Password encoder https://www.dailycred.com/article/bcrypt-calculator
--Max number round 10
MERGE INTO users KEY(id) values
(2, 'user01@email.em', 'User01', '$2a$10$BGanhgbFSeh7GYd76EkcluEtQSTgURpEDIq6jJXl6jrWWeWIFwbIq', 'user01');

MERGE INTO user_roles KEY(user_id, role_id) values
(2, 2);

delete from user_roles where user_id=1;
delete from users where id=1;