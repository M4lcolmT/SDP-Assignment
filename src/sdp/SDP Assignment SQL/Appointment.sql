USE SDPAssignment

--To create the table
CREATE TABLE Appointment (
	username VARCHAR (50),
    bloodbank_name VARCHAR(100),
    date DATE,
    time VARCHAR(100),
    address VARCHAR(200)
);

--To insert values
INSERT INTO Appointment (username, bloodbank_name, date, time, address) VALUES
('Lee Wei Han', 'Hospital Kuala Lumpur', '2023-04-20', '9:00 AM', 'Jalan Pahang, 50586 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur'),
('Lee Wei Han','Hospital Putrajaya', '2023-02-26', '11:00 AM', 'Presint 7, 62250 Putrajaya'),
('Lee Wei Han','Hospital Putrajaya', '2023-01-15', '11:00 AM', 'Presint 7, 62250 Putrajaya')


-- To view all the datas from the table
SELECT * from Appointment
