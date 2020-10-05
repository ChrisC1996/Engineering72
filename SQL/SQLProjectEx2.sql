use chris_db

CREATE TABLE spartans_table
(
    title VARCHAR(3)
)

ALTER TABLE spartans_table
ADD first_name VARCHAR(15);

ALTER TABLE spartans_table
ADD last_name VARCHAR(15);

ALTER TABLE spartans_table
ADD university_attended VARCHAR(40);

ALTER TABLE spartans_table
ADD course_taken VARCHAR(50);

ALTER TABLE spartans_table
ADD mark_achieved VARCHAR(5);

INSERT INTO spartans_table
(
    title, first_name, last_name, university_attended, course_taken, mark_achieved
)
VALUES
('Mr', 'Chris', 'Cunningham', 'Loughborough', 'Computer Science', '2:1'),
('Mr', 'Reece', 'Louch', 'Warwick', 'Computer Science', '2:2'),
('Mr', 'Saleh', 'Sandhu', 'Westminster', 'Computer Science', '2:1'),
('Mr', 'Svilen', 'Petrov', 'London Metropolitan', 'Computing', 'First'),
('Mr', 'Toyin', 'Ajani', 'Bath', 'Chemical Engineering', 'First'),
('Ms', 'Janja', 'Kovacevic', 'Massachusetts Amherst', 'Computer Science and Mathematics', '3.9'),
('Mr', 'Dami', 'Oshidele', 'Kings College London', 'Electronic Engineering with Management', '2:1'),
('Mr', 'Abdullah', 'Muhammad', 'Southampton', 'Physics', 'First'),
('Mr', 'Shahid', 'Enayat', 'Brunel', 'Electronic and Electrical Engineering', '2:2'),
('Mr', 'Ben', 'Swift', 'Nottingham Trent', 'Computer Science', '2:1'),
('Mr', 'Emmanuel', 'Buraimo', 'Kings College London', 'Computer Science', '2:1')

SELECT *  FROM spartans_table;