MERGE INTO roles KEY(id) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

--Password encoder https://www.dailycred.com/article/bcrypt-calculator
--Max number round 10
MERGE INTO users KEY(id) values
(1, 'aktalgat@mail.ru', 'Talgat', '$2a$10$h7MeivRcGNAnDS4p4buFuuYIbruyKcmT7DbKXwDagwNyMnvnuhXLS', 'talgat'),
(2, 'user01@email.em', 'User01', '$2a$10$h7MeivRcGNAnDS4p4buFuuYIbruyKcmT7DbKXwDagwNyMnvnuhXLS', 'user01');

MERGE INTO user_roles KEY(user_id, role_id) values
(1, 1),
(2, 2);