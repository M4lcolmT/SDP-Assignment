USE SDPAssignment

-- To create the table
CREATE TABLE Blood_Inventory(
	Blood_type VARCHAR (3) NOT NULL,
	Quantity INTEGER NOT NULL,
);

-- To insert values
INSERT INTO Blood_inventory (blood_type, quantity)
VALUES
('A+', 50),
('A-', 20),
('B+', 30),
('B-', 15),
('AB+', 10),
('AB-', 5),
('O+', 100),
('O-', 40);

-- To view all the data from the table
SELECT * from Blood_Inventory