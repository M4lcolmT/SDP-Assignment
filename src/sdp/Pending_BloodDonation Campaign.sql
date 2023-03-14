USE SDPAssignment

--To create the table
CREATE TABLE Pending_BloodDonationCampaign (
    event_name VARCHAR(100) NOT NULL,
    date_time VARCHAR (50) NOT NULL,
    location VARCHAR(100) NOT NULL,
    address VARCHAR(200) NOT NULL,
    organizer_name VARCHAR(100) NOT NULL,
    organizer_email VARCHAR(100) NOT NULL,
    organizer_contact VARCHAR(20) NOT NULL,
);

-- To insert values
INSERT INTO Pending_BloodDonationCampaign (event_name, date_time, location, address, organizer_name, organizer_email, organizer_contact) VALUES
('Donate Blood at Mitsui Outlet Park', '2024-05-06 12:00:00', 'Mitsui Outlet Park, Sepang', 'Persiaran Komersial, 64000 KLIA, Selangor', 'Hospital Putrajaya', 'donor@hpp.moh.gov.my', '03-8312 4200'),
('Blood Donation Drive at Mahkota Parade', '2024-06-23 11:30:00', 'Mahkota Parade, Melaka', 'Jalan Merdeka, 75000 Melaka', 'National Blood Centre', 'nbc@moh.gov.my', '03-2615 0000')


-- To view all the datas from the table
SELECT * from Pending_BloodDonationCampaign



