DELETE FROM gang-member;
INSERT INTO gang-member(ID, CREATIONTIME, UPDATETIME, VERSION, FIRSTNAME, LASTNAME, EMAIL, PHONE) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Rui', 'Ferrão', 'mail@gmail.com', '777888999'),
  (2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'Sergio', 'Gouveia', 'mail@gmail.com', '777888111'),
  (3, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'Bruno', 'Ferreira', 'mail@gmail.com', '777888000');
DELETE FROM item;
INSERT INTO item(ITEM_TYPE, ID, CREATIONTIME, UPDATETIME, VERSION, GANG_MEMBER_ID) VALUES
  ('Shrimp', 1, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2, 100.0, 1),
  ('Mariachi', 2, TIMESTAMP '2017-10-10 10:23:02.194', TIMESTAMP '2017-10-10 10:23:19.801', 1, 50.5, 1),
  ('Taco', 3, TIMESTAMP '2017-10-10 14:30:37.769', TIMESTAMP '2017-10-10 14:30:43.042', 1, 10.0, 2),
  ('Mariachi', 4, TIMESTAMP '2017-10-10 14:30:38.426', TIMESTAMP '2017-10-10 14:30:46.471', 1, 150.0, 2),
  ('Shrimp', 5, TIMESTAMP '2017-10-10 14:30:37.769', TIMESTAMP '2017-10-10 14:30:43.042', 1, 0.0, 3),
  ('Taco', 6, TIMESTAMP '2017-10-10 14:30:38.426', TIMESTAMP '2017-10-10 14:30:46.471', 1, 0.0, 3);








