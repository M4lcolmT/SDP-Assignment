USE SDPAssignment

--To create the table
CREATE table CustomerDetails (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	age integer NOT NULL,
	bloodgroup VARCHAR(3) NOT NULL, 
	gender VARCHAR(6) NOT NULL,
	points integer,
	contactnumber VARCHAR (10)
)

--To insert values
INSERT INTO CustomerDetails (name, password, email, age, bloodgroup, gender, points)
VALUES
('Lee Wei Han', 'test', 'weihan@gmail.com', 19, 'O+', 'Male', '1000'),
('Ahmad Abdullah', 'p@ssw0rd', 'ahmad.abdullah@example.com', 30, 'B+', 'Male', '1000'),
('Siti Aminah', 'abc123', 'siti.aminah@example.com', 25, 'O+', 'Female', '1000'),
('Mohd Azmi', 'qwerty', 'mohd.azmi@example.com', 42, 'A+', 'Male', '1000'),
('Fatimah Binti', 'Pa$$w0rd', 'fatimah.binti@example.com', 35, 'AB-', 'Female', '1000'),
('Mokhtar Bin', 'letmein', 'mokhtar.bin@example.com', 50, 'O-', 'Male', '1000'),
('Norhayati Binti', 'p@ssword123', 'norhayati.binti@example.com', 38, 'B+', 'Female', '1000'),
('Ahmad Bin', 'Pa$$w0rd', 'ahmad.bin@example.com', 28, 'O+', 'Male', '1000'),
('Zainab Binti', 'qwerty123', 'zainab.binti@example.com', 33, 'AB+', 'Female', '1000'),
('Abdul Rahman', 'abc123', 'abdul.rahman@example.com', 31, 'A-', 'Male', '1000'),
('Nurul Syazwani', 'letmein', 'nurul.syazwani@example.com', 22, 'B-', 'Female', '1000'),
('Mohd Amirul', 'Pa$$w0rd', 'mohd.amirul@example.com', 29, 'O+', 'Male', '1000'),
('Nurul Izzati', 'p@ssword123', 'nurul.izzati@example.com', 26, 'A+', 'Female', '1000'),
('Norazila Binti', 'qwerty', 'norazila.binti@example.com', 34, 'B+', 'Female', '1000'),
('Ahmad Fauzi', 'abc123', 'ahmad.fauzi@example.com', 39, 'AB+', 'Male', '1000'),
('Nurul Ain', 'letmein', 'nurul.ain@example.com', 23, 'O-', 'Female', '1000'),
('Muhammad Syafiq', 'Pa$$w0rd', 'muhammad.syafiq@example.com', 27, 'B-', 'Male', '1000'),
('Zainab Binti', 'qwerty123', 'zainab.binti@example.com', 41, 'A+', 'Female', '1000'),
('Muhammad Faisal', 'abc123', 'muhammad.faisal@example.com', 30, 'O+', 'Male', '1000'),
('Nor Syahira', 'letmein', 'nor.syahira@example.com', 29, 'AB+', 'Female', '1000'),
('Amirul Syafiq', 'Pa$$w0rd', 'amirul.syafiq@example.com', 24, 'O-', 'Male', '1000'),
('Mardhiyah Binti', 'p@ssword123', 'mardhiyah.binti@example.com', 33, 'A-', 'Female', '1000'),
('Mohd Ali', 'qwerty', 'mohd.ali@example.com', 38, 'O+', 'Male', '1000'),
('Siti Aisyah', 'Pa$$w0rd', 'siti.aisyah@example.com', 28, 'B+', 'Female', '1000'),
('Ahmad Faiz', 'letmein', 'ahmad.faiz@example.com', 32, 'AB+', 'Male', '1000'),
('Nurul Ain', 'qwerty123', 'nurul.ain@example.com', 26, 'O-', 'Female', '1000'),
('Muhammad Amirul', 'abc123', 'muhammad.amirul@example.com', 31, 'A+', 'Male', '1000'),
('Nor Aisyah', 'Pa$$w0rd', 'nor.aisyah@example.com', 29, 'AB-', 'Female', '1000'),
('Mohd Ashraf', 'p@ssword123', 'mohd.ashraf@example.com', 35, 'B+', 'Male', '1000'),
('Nor Atikah', 'qwerty', 'nor.atikah@example.com', 27, 'O+', 'Female', '1000'),
('Mohd Hafiz', 'abc123', 'mohd.hafiz@example.com', 36, 'A-', 'Male', '1000'),
('Siti Aminah', 'letmein', 'siti.aminah@example.com', 23, 'AB+', 'Female', '1000'),
('Muhammad Azizi', 'Pa$$w0rd', 'muhammad.azizi@example.com', 28, 'B-', 'Male', '1000'),
('Nurul Syafiqah', 'p@ssword123', 'nurul.syafiqah@example.com', 27, 'A+', 'Female', '1000'),
('Nor Azimah', 'qwerty', 'nor.azimah@example.com', 33, 'O-', 'Female', '1000'),
('Muhammad Hafiz', 'abc123', 'muhammad.hafiz@example.com', 31, 'AB-', 'Male', '1000'),
('Nurul Husna', 'letmein', 'nurul.husna@example.com', 29, 'B+', 'Female', '1000'),
('Ahmad Fikri', 'Pa$$w0rd', 'ahmad.fikri@example.com', 28, 'A-', 'Male', '1000'),
('Nor Azlina', 'p@ssword123', 'nor.azlina@example.com', 36, 'O+', 'Female', '1000'),
('Muhammad Firdaus', 'qwerty', 'muhammad.firdaus@example.com', 25, 'B+', 'Male', '1000'),
('Siti Nadia', 'abc123', 'siti.nadia@example.com', 30, 'AB+', 'Female', '1000'),
('Muhammad Fahmi', 'letmein', 'muhammad.fahmi@example.com', 26, 'O-', 'Male', '1000'),
('Nor Hidayah', 'Pa$$w0rd', 'nor.hidayah@example.com', 31, 'A+', 'Female', '1000'),
('Mohd Hafizul', 'p@ssword123', 'mohd.hafizul@example.com', 34, 'B-', 'Male', '1000'),
('Siti Zulaikha', 'qwerty', 'siti.zulaikha@example.com', 27, 'AB-', 'Female', '1000'),
('Nurul Adilah', 'abc123', 'nurul.adilah@example.com', 28, 'O+', 'Female', '1000'),
('Ahmad Hafiz', 'letmein', 'ahmad.hafiz@example.com', 32, 'A-', 'Male', '1000'),
('Nor Hazwani', 'Pa$$w0rd', 'nor.hazwani@example.com', 30, 'B+', 'Female', '1000'),
('Siti Norhasikin', 'letmein', 'siti.norhasikin@example.com', 31, 'AB-', 'Female', '1000'),
('Muhammad Aiman', 'Pa$$w0rd', 'muhammad.aiman@example.com', 26, 'A+', 'Male', '1000')


-- To view all the datas from the table
SELECT * from CustomerDetails

