USE SDPAssignment

-- To create the table
CREATE TABLE Blood_Requests (
	month VARCHAR(20),
	quantity INT
);

-- To insert values
INSERT INTO Blood_Requests (month, quantity)
VALUES
	('January', 50),
	('February', 80),
	('March', 60),
	('April', 40),
	('May', 90),
	('June', 70),
	('July', 55),
	('August', 45),
	('September', 65),
	('October', 75),
	('November', 85),
	('December', 95);

-- To view all the data from the table
SELECT * from Blood_Requests