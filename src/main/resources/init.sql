INSERT INTO User (id, email, password, usertype) VALUES (1, 'mari@test.com', '123ABc', 'STUDENT');
INSERT INTO User (id, email, password, usertype) VALUES (2, 'ole@test.com', 'abC123', 'TEACHER');
INSERT INTO User (id, email, password, usertype) VALUES (3, 'kari@test.com', '1234Abc', 'STUDENT');
INSERT INTO User (id, email, password, usertype) VALUES (4, 'marianne@test.com', '1234Abc', 'STUDENT');

INSERT INTO Location (id, building, room) VALUES (1, 'Galleriet', '82');
INSERT INTO Location (id, building, room) VALUES (2, 'Galleriet', '81');
INSERT INTO Location (id, building, room) VALUES (3, 'Grunerlokka', '90');
INSERT INTO Location (id, building, room) VALUES (4, 'Plaza', '801');
INSERT INTO Location (id, building, room) VALUES (5, 'OsloCity', '702');


INSERT INTO Subject (id, name, FK_LOCATION) VALUES (1, 'PG5100', 1);
INSERT INTO Subject (id, name, FK_LOCATION) VALUES (2, 'PG6100', 2);
INSERT INTO Subject (id, name, FK_LOCATION) VALUES (3, 'PU7100', 3);
INSERT INTO SUBJECT (id, name, FK_LOCATION) VALUES (4, 'PA9090', 4);
INSERT INTO SUBJECT (id, name, FK_LOCATION) VALUES (5, 'testRoom', 5);


INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (1, 1);
INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (2, 1);
INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (1, 2);
INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (2, 3);

INSERT INTO Event(id, eventtype, description, title) VALUES   (1, 'FORELESNING', 'AI for nybegynnere', 'AI-9001');
INSERT INTO Event(id, eventtype, description, title)  VALUES  (2, 'FORELESNING', 'C programmering på nynorsk', 'C-2010');
INSERT INTO Event(id, eventtype, description, title)  VALUES  (3, 'FORELESNING', 'Muntlig eksamen i læren om hvordan man kan blåse opp en ballong', 'BL-099');
INSERT INTO Event(id, eventtype, description, title) VALUES   (4, 'EGENTRENING', 'Når katastrofen inntreffer - innlevering 1', 'KRUD-1');
INSERT INTO Event(id, eventtype, description, title)  VALUES  (5, 'FORELESNING', 'Dagens tema er latskap på et teknologisk vis', 'D2-IT');

INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (1, '2016-01-14 08:00:00', '2016-01-14 15:00:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (2, '2016-01-14 11:00:00', '2016-01-14 15:00:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (3, '2016-02-14 07:00:00', '2016-02-14 09:00:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (4, '2016-02-15 08:00:00', '2016-02-15 12:00:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (5, '2016-03-09 10:00:00', '2016-03-09 08:00:00');

INSERT INTO EVENT_DET (Event_ID, eventDetail_ID) VALUES (1,1);
INSERT INTO EVENT_DET (Event_ID, eventDetail_ID) VALUES (2,2);
INSERT INTO EVENT_DET (Event_ID, eventDetail_ID) VALUES (3,3);
INSERT INTO EVENT_DET (Event_ID, eventDetail_ID) VALUES (4,4);
INSERT INTO EVENT_DET (Event_ID, eventDetail_ID) VALUES (5,5);

