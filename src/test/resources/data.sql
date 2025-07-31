INSERT INTO status (ID, VERSION, NAME) VALUES (1, 1, 'Imported lead');
INSERT INTO status (ID, VERSION, NAME) VALUES (2, 1, 'Not contacted');
INSERT INTO status (ID, VERSION, NAME) VALUES (3, 1, 'Contacted');
INSERT INTO status (ID, VERSION, NAME) VALUES (4, 1, 'Customer');
INSERT INTO status (ID, VERSION, NAME) VALUES (5, 1, 'Closed (lost)');

INSERT INTO company (ID, VERSION, NAME) VALUES (6, 1, 'Phillips Van Heusen Corp.');
INSERT INTO company (ID, VERSION, NAME) VALUES (7, 1, 'Avaya Inc.');
INSERT INTO company (ID, VERSION, NAME) VALUES (8, 1, 'Laboratory Corporation of America Holdings');
INSERT INTO company (ID, VERSION, NAME) VALUES (9, 1, 'AutoZone, Inc.');
INSERT INTO company (ID, VERSION, NAME) VALUES (10, 1, 'Linens ''n Things Inc.');

INSERT INTO contact (ID, VERSION, EMAIL, FIRST_NAME, LAST_NAME, COMPANY_ID, STATUS_ID) VALUES (11, 1, 'eula.lane@jigrormo.ye', 'Eula', 'Lane', 8, 1);
INSERT INTO contact (ID, VERSION, EMAIL, FIRST_NAME, LAST_NAME, COMPANY_ID, STATUS_ID) VALUES (12, 1, 'barry.rodriquez@zun.mm', 'Barry', 'Rodriquez', 7, 5);
INSERT INTO contact (ID, VERSION, EMAIL, FIRST_NAME, LAST_NAME, COMPANY_ID, STATUS_ID) VALUES (13, 1, 'eugenia.selvi@capfad.vn', 'Eugenia', 'Selvi', 6, 3);
INSERT INTO contact (ID, VERSION, EMAIL, FIRST_NAME, LAST_NAME, COMPANY_ID, STATUS_ID) VALUES (14, 1, 'alejandro.miles@dec.bn', 'Alejandro', 'Miles', 10, 3);
