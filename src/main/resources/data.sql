INSERT INTO BOOKING (id, name, booking_type, status)
VALUES ('413e2297-b84b-42ef-97ed-16a8a9d1d671', 'Andreas Seidl', ' DAY ', 'PENDING'),
       ('b8160463-01a0-4c7a-bd46-5b3716dbe4c6', 'Ralf Montoya', 'AFTERNOON', 'APPROVED'),
       ('3c13c533-fbac-4881-b94d-f95cb2ef16c8', 'Betty McFarlane', 'MORNING', 'APPROVED');

INSERT INTO MEMBER (id, username, email, firstname, lastname, password_hash, newsletter, is_admin)
VALUES ('9135f12e-1b66-4ee6-bbae-df37303cc154', 'admin', 'admin@admin.ch', 'admin', 'administrator', '$2a$10$aDD6I9Ej5.W8busvlsdPx.JvMWyJX8cOeOfVb.3q73KH2swww/N9C', true, true), -- Password: password1234
       ('f6b24684-fff3-456d-bba7-fb6b376d678f', 'max', 'max@test.ch', 'max', 'muster', '$2a$10$aDD6I9Ej5.W8busvlsdPx.JvMWyJX8cOeOfVb.3q73KH2swww/N9C', true, false);