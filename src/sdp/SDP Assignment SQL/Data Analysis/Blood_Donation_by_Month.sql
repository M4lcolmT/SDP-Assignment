USE SDPAssignment

-- To create the table
CREATE TABLE Blood_Donation_by_Month (
	month VARCHAR(20),
	quantity INT
);

-- To insert values
INSERT INTO Blood_Donation_by_Month(month, quantity)
VALUES
	('January', 100),
	('February', 120),
	('March', 90),
	('April', 80),
	('May', 110),
	('June', 95),
	('July', 105),
	('August', 85),
	('September', 75),
	('October', 130),
	('November', 140),
	('December', 115);


-- To view all the data from the table
SELECT * from Blood_Donation_by_Month
