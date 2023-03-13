USE SDPAssignment

-- To create the table
CREATE TABLE Blood_Request_by_Bloodgroup(
	Blood_type VARCHAR (3) NOT NULL,
	Quantity INTEGER NOT NULL,
);

-- To insert values
INSERT INTO Blood_Request_by_Bloodgroup (blood_type, quantity)
VALUES
('A+', 30),
('A-', 15),
('B+', 35),
('B-', 10),
('AB+', 8),
('AB-', 2),
('O+', 50),
('O-', 20);

-- To view all the data from the table
SELECT * from Blood_Request_by_Bloodgroup