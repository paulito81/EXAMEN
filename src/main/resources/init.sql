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

/*
INSERT INTO EVENT(id, description, title, eventtype) VALUES (1, 'AI-9001', 'AI for nybegynnere','FORELESNING');
INSERT INTO EVENT(id, description, title, eventtype) VALUES (2, 'C-2010', 'C programmering på nynorsk','FORELESNING');
INSERT INTO EVENT(id, description, title, eventtype) VALUES (3, 'BL-099', 'Muntlig eksamen i læren om hvordan man kan blåse opp en ballong');
INSERT INTO EVENT(id, description, title, eventtype) VALUES (4, 'KRUD-1', 'Når katastrofen inntreffer - innlevering 1');
INSERT INTO EVENT(id, description, title, eventtype) VALUES (5, 'D2-IT', 'Dagens tema er latskap på et teknologisk vis');

INSERT INTO EVENT_DETAIL (id, startpoint, stoppoint) VALUES (1, '2016-01-10 08:00', '2016-01-10 12:00');
INSERT INTO EVENT_DETAIL (id, startpoint, stoppoint) VALUES (2, '2016-11-01 08:00', '2016-11-01 12:00');
INSERT INTO EVENT_DETAIL (id, startpoint, stoppoint) VALUES (3, '2016-01-11 11:00', '2016-01-12 13:00');
INSERT INTO EVENT_DETAIL (id, startpoint, stoppoint) VALUES (4, '2016-01-14 13:00', '2016-01-20 14:00');
INSERT INTO EVENT_DETAIL (id, startpoint, stoppoint) VALUES (5, '2016-03-10 08:00', '2016-03-10 12:00');
INSERT INTO EVENT_DET (EVENT_ID, EVENT_DETAIL_ID) VALUES (1,1);
INSERT INTO EVENT_DET (EVENT_ID, EVENT_DETAIL_ID) VALUES (2,2);
INSERT INTO EVENT_DET (EVENT_ID, EVENT_DETAIL_ID) VALUES (3,3);
INSERT INTO EVENT_DET (EVENT_ID, EVENT_DETAIL_ID) VALUES (4,4);
INSERT INTO EVENT_DET (EVENT_ID, EVENT_DETAIL_ID) VALUES (5,5);
*/