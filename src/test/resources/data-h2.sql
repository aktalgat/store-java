MERGE INTO roles KEY(id) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

--Password encoder https://www.dailycred.com/article/bcrypt-calculator
--Max number round 10
--Default password 12345
MERGE INTO users KEY(id) values
(1, 'user@domain.com', 'User', '$2a$10$h7MeivRcGNAnDS4p4buFuuYIbruyKcmT7DbKXwDagwNyMnvnuhXLS', 'user'),
(2, 'admin@domain.com', 'Admin', '$2a$10$h7MeivRcGNAnDS4p4buFuuYIbruyKcmT7DbKXwDagwNyMnvnuhXLS', 'admin');

MERGE INTO user_roles KEY(user_id, role_id) values
(1, 1),
(2, 2);