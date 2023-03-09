USE SDPAssignment

--To create the table
CREATE TABLE Pending_Appointment (
	username VARCHAR (50),
    bloodbank_name VARCHAR(100),
    date DATE,
    time VARCHAR(100),
    address VARCHAR(200)
);

--To insert values
INSERT INTO Pending_Appointment (username, bloodbank_name, date, time, address) VALUES
('Lee Wei Han', 'Hospital Kuala Lumpur', '2023-04-20', '9:00 AM', 'Jalan Pahang, Kuala Lumpur'),
('Lee Wei Han','Hospital Putrajaya', '2023-04-26', '4:00 PM', 'Presint 7, 62250 Putrajaya'),
('Siti','Hospital Putrajaya', '2023-04-15', '1:00 PM', 'Presint 7, 62250 Putrajaya'),
('Siti','Hospital Putrajaya', '2023-03-15', '2:00 PM', 'Presint 7, 62250 Putrajaya'),
('Siti','Hospital Putrajaya', '2023-05-15', '3:00 PM', 'Presint 7, 62250 Putrajaya')


-- To view all the datas from the table
SELECT * from Pending_Appointment

