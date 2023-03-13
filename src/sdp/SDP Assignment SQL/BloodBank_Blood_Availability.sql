USE SDPAssignment

--To create the table
CREATE TABLE BloodBank_Blood_Availability (
	bloodbank_name VARCHAR(100),
	A_pos INT,
	A_neg INT,
	B_pos INT,
	B_neg INT,
	O_pos INT,
	O_neg INT,
	AB_pos INT,
	AB_neg INT
);

--To insert values
INSERT INTO BloodBank_Blood_Availability (bloodbank_name, A_pos, A_neg, B_pos, B_neg, O_pos, O_neg, AB_pos, AB_neg) VALUES
('Hospital Seberang Jaya', 10, 5, 15, 7, 20, 10, 5, 2),
('Hospital Putrajaya', 5, 2, 8, 4, 12, 6, 3, 1),
('Hospital Raja Perempuan', 20, 8, 25, 10, 30, 15, 8, 3),
('Hospital Kuala Terengganu', 15, 7, 10, 5, 18, 9, 6, 2),
('Hospital Universiti Malaysia', 12, 6, 10, 4, 15, 7, 4, 1),
('Hospital Serdang', 18, 9, 20, 8, 25, 12, 6, 2),
('Hospital Tengku Ampuan Rahimah', 10, 5, 8, 3, 12, 6, 3, 1),
('Hospital Taiping', 5, 2, 5, 2, 8, 4, 2, 1),
('Hospital Kuala Krai', 8, 3, 5, 2, 10, 5, 3, 1),
('Hospital Bintulu', 10, 4, 12, 6, 15, 8, 4, 1),
('Hospital Sibu', 15, 7, 18, 9, 22, 11, 7, 2),
('Hospital Duchess', 10, 5, 8, 4, 12, 6, 3, 1),
('Hospital Kuala Lumpur', 25, 12, 30, 15, 40, 20, 12, 4);

-- To view all the datas from the table
SELECT * from BloodBank_Blood_Availability