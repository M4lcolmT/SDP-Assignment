USE SDPAssignment

--To create the table
CREATE TABLE Appointment (
	username VARCHAR (50),
    bloodbank_name VARCHAR(100),
    date DATE,
    time VARCHAR(100)
);

--To insert values
INSERT INTO Appointment (username, bloodbank_name, date, time) VALUES
('Lee Wei Han', 'Hospital Kuala Lumpur', '2023-04-20', '9:00 AM'),
('Lee Wei Han','Hospital Putrajaya', '2023-02-26', '11:00 AM'),
('Lee Wei Han','Hospital Putrajaya', '2023-01-15', '11:00 AM')


-- To view all the datas from the table
SELECT * from Appointment
