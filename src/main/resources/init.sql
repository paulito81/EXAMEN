INSERT INTO User (id, email, password, usertype) VALUES (1, 'mari@test.com', '123ABc', 'STUDENT');
INSERT INTO User (id, email, password, usertype) VALUES (2, 'ole@test.com', 'abC123', 'TEACHER');
INSERT INTO User (id, email, password, usertype) VALUES (3, 'kari@test.com', '1234Abc', 'STUDENT');
INSERT INTO User (id, email, password, usertype) VALUES (4, 'marianne@test.com', '1234Abc', 'STUDENT');

INSERT INTO Location (id, building, room) VALUES (1, 'Galleriet', '82');
INSERT INTO Location (id, building, room) VALUES (2, 'Galleriet', '81');

INSERT INTO Subject (id, name, FK_LOCATION) VALUES (1, 'PG5100', 1);
INSERT INTO Subject (id, name, FK_LOCATION) VALUES (2, 'PG6100', 2);

INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (1, 1);
INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (2, 1);
INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (1, 2);
INSERT INTO USR_SUB (SUBJECTS_ID, USERS_ID) VALUES (2, 3)

INSERT INTO Event(id, eventtype, description,  title) VALUES  (1, 'FORELESNING', 'AI for nybegynnere', 'AI-9001');
INSERT INTO Event(id, eventtype, description, title)  VALUES  (2, 'FORELESNING', 'C programmering på nynorsk', 'C-2010');
INSERT INTO Event(id, eventtype, description, title)  VALUES  (3, 'FORELESNING', 'Muntlig eksamen i læren om hvordan man kan blåse opp en ballong', 'BL-099');
INSERT INTO Event(id, eventtype, description,  title) VALUES  (4, 'EGENTRENING', 'Når katastrofen inntreffer - innlevering 1', 'KRUD-1');
INSERT INTO Event(id, eventtype, description, title)  VALUES  (5, 'FORELESNING', 'Dagens tema er latskap på et teknologisk vis', 'D2-IT');

INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (1, '2016-01-14T00:33:33.373-05:00', '2016-01-14T10:33:33.373-05:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (2, '2016-02-13T12:33:33.373-05:00', '2016-02-13T14:00:33.373-05:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (3, '2016-03-11T10:33:33.373-05:00', '2016-03-11T12:00:33.373-05:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (4, '2016-04-10T08:33:33.373-05:00', '2016-04-10T10:10:33.373-05:00');
INSERT INTO eventDetail (id, startPoint, stopPoint) VALUES (5, '2016-05-09T15:33:33.373-05:00', '2016-05-09T17:13:33.373-05:00');

/*
INSERT INTO EVENT_DET (EVENT_ID, EVENTDETAIL_ID) VALUES (1,1);
INSERT INTO EVENT_DET (EVENT_ID, EVENTDETAIL_ID) VALUES (2,2);
INSERT INTO EVENT_DET (EVENT_ID, EVENTDETAIL_ID) VALUES (3,3);
INSERT INTO EVENT_DET (EVENT_ID, EVENTDETAIL_ID) VALUES (4,4);
INSERT INTO EVENT_DET (EVENT_ID, EVENTDETAIL_ID) VALUES (5,5);

*/