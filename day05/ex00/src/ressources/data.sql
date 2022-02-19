INSERT INTO chat.users (login, password)
 VALUES ('Mil', '001');
INSERT INTO chat.users (login, password)
 VALUES ('Robz', '002');
INSERT INTO chat.users (login, password)
 VALUES ('Thai', '003');
INSERT INTO chat.users (login, password)
 VALUES ('Fil', '004');
INSERT INTO chat.users (login, password)
 VALUES ('Ether', '005');

INSERT INTO chat.rooms (name, owner)
 VALUES ('General', 1);
INSERT INTO chat.rooms (name, owner)
 VALUES ('Pedago', 2);
INSERT INTO chat.rooms (name, owner)
 VALUES ('Staff', 3);
INSERT INTO chat.rooms (name, owner)
 VALUES ('Random', 4);
INSERT INTO chat.rooms (name, owner)
 VALUES ('Club', 5);

INSERT INTO chat.messages (author, room, text, timestamp)
 VALUES (1, 1, 'hey', '1970-01-01 00:00:01');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (2, 3, 'lol', '1970-01-01 00:00:01');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (5, 3, 'pouf', '1970-01-01 00:00:02');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (4, 4, 'asd qwe', '1970-01-01 00:00:04');
INSERT INTO chat.messages (author, room, text, timestamp)
VALUES (5, 5, 'foobar', '1970-01-01 00:00:05');
