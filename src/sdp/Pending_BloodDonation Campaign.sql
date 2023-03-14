USE SDPAssignment

--To create the table
CREATE TABLE Pending_BloodDonationCampaign (
    event_name VARCHAR(100) NOT NULL,
    event_date VARCHAR (20) NOT NULL,
    event_time VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    address VARCHAR(200) NOT NULL,
    organizer_name VARCHAR(100) NOT NULL,
    organizer_email VARCHAR(100) NOT NULL,
    organizer_contact VARCHAR(20) NOT NULL
);

-- To insert values
INSERT INTO Pending_BloodDonationCampaign (event_name, event_date, event_time, location, address, organizer_name, organizer_email, organizer_contact) VALUES
('Donate Blood at Mitsui Outlet Park', '2024-05-06', '10am - 4pm', 'Mitsui Outlet Park, Sepang', 'Persiaran Komersial, 64000 KLIA, Selangor', 'Hospital Putrajaya', 'donor@hpp.moh.gov.my', '03-8312 4200'),
('Blood Donation Drive at Mahkota Parade', '2024-06-23', '12pm - 6pm', 'Mahkota Parade, Melaka', 'Jalan Merdeka, 75000 Melaka', 'National Blood Centre', 'nbc@moh.gov.my', '03-2615 0000')


-- To view all the datas from the table
SELECT * from Pending_BloodDonationCampaign

--drop table Pending_BloodDonationCampaign

