-- noinspection SqlNoDataSourceInspectionForFile
-- noinspection SqlDialectInspectionForFile

INSERT INTO products (id, name) VALUES (default, 'Blue whiteboard markers'),
                                        (default, 'Green whiteboard markers'),
                                        (default, 'Orange whiteboard markers'),
                                        (default, 'Red whiteboard markers'),
                                        (default, 'Oatly litres');

INSERT INTO inventory_items (id, product_id, quantity) VALUES ('1', 1, 4),
                                                              ('2', 2, 6),
                                                              ('3', 3, 6),
                                                              ('4', 4, 6),
                                                              ('5', 5, 5);

INSERT INTO users (email, name, is_admin, clerk_id) VALUES ('admin@tolpuddle.tech', 'simon admin', true, 'user_2jbOj40LQGG8Y8RhHMgGO763eRq');
INSERT INTO users (email, name, is_admin, clerk_id) VALUES ('regular@tolpuddle.tech', 'simon regular', false, 'user_2jhcwIX4Gn6eY7PU7jBhaJcbOy6');
INSERT INTO users (email, name, is_admin, clerk_id) VALUES ('cypress+clerk_test@tolpuddle.tech', 'cypress admin', true, 'user_2jjMkCNC2oaUopPuZPwhtBlqdOA');
INSERT INTO users (email, name, is_admin, clerk_id) VALUES ('mathi.admin@gmail.com', 'Math math', true, 'user_2jm6AYThCDfPqMlHBO8jhwyPLMI');
INSERT INTO users (email, name, is_admin, clerk_id) VALUES ('alwaysthere@gmail.com', 'NonAdmin math', false, 'user_2jjIzGq8PO6mkRaF8aVabp4OVXR');
INSERT INTO requests (user_id, is_approved) VALUES (3, false);
INSERT INTO requests (user_id, is_approved) VALUES (5, true);
INSERT INTO requests (user_id, is_approved) VALUES (5, true);
INSERT INTO requests (user_id, is_approved) VALUES (5, true);
INSERT INTO request_products (product_id, request_id, quantity) VALUES (1, 1, 10);
INSERT INTO request_products (product_id, request_id, quantity) VALUES (2, 2, 5);
INSERT INTO request_products (product_id, request_id, quantity) VALUES (3, 3, 2);
INSERT INTO request_products (product_id, request_id, quantity) VALUES (5, 4, 20);
INSERT INTO orders (user_id, status, approved_date, request_id) VALUES (4, 'PENDING', '2024-07-26T13:00:00', 2);
INSERT INTO orders (user_id, status, approved_date, request_id) VALUES (4, 'PENDING', '2024-07-27T15:00:00', 3);