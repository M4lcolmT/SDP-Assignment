USE SDPAssignment

--To create the table
CREATE TABLE AdminDetails (
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
);

--To insert values
INSERT INTO AdminDetails (username, password) VALUES
('admin', 'letmein'),
('admin1', 'p@ssword123'),
('admin2', 'Pa$$w0rd'),
('admin3', 'qwerty'),
('admin4', 'abc123'),
('admin5', 'letmein'),
('admin6', 'admin123'),
('admin7', 'password'),
('admin8', 'admin'),
('admin9', 'administrator');

-- To view all the datas from the table
SELECT * from AdminDetails