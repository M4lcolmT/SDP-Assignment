USE SDPAssignment

-- To create the table
CREATE TABLE Blood_Donation_By_Gender (
	gender VARCHAR(10),
	quantity INT
);

-- To insert values
INSERT INTO Blood_Donation_By_Gender (gender, quantity)
VALUES
	('Male', 500),
	('Female', 300)

-- To view all the data from the table
SELECT * from Blood_Donation_By_Gender

