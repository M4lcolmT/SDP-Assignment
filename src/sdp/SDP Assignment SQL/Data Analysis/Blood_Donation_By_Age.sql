USE SDPAssignment

-- To create the table
CREATE TABLE Blood_Donation_By_Age (
	Age_Group VARCHAR(20),
	Quantity INT
);

-- To insert values
INSERT INTO Blood_Donation_By_Age (Age_Group, quantity)
VALUES
	('0-9', 5),
	('10-19', 20),
	('20-29', 80),
	('30-39', 120),
	('40-49', 110),
	('50-59', 90),
	('60-69', 50),
	('70-79', 30),
	('80-89', 10),
	('90+', 2);

-- To view all the data from the table
SELECT * from Blood_Donation_By_Age

