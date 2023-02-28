USE SDPAssignment

--To create the table
CREATE TABLE BloodDonationCampaign (
    event_name VARCHAR(100) NOT NULL,
    date_time VARCHAR (50) NOT NULL,
    location VARCHAR(100) NOT NULL,
    address VARCHAR(200) NOT NULL,
    organizer_name VARCHAR(100) NOT NULL,
    organizer_email VARCHAR(100) NOT NULL,
    organizer_contact VARCHAR(20) NOT NULL,
);

-- To insert values
INSERT INTO BloodDonationCampaign (event_name, date_time, location, address, organizer_name, organizer_email, organizer_contact) VALUES
('Blood Donation Drive at Sunway Pyramid', '24/4/2023 8am-6pm', 'Sunway Pyramid, Petaling Jaya', 'No. 3, Jalan PJS 11/15, Bandar Sunway, 46150 Petaling Jaya, Selangor', 'Sunway Medical Centre', 'donor@sunmed.com.my', '03-7491 9191'),
('Donate Blood at Suria KLCC', '26/4/2023 8am-10pm', 'Suria KLCC, Kuala Lumpur', '241, Suria KLCC, Kuala Lumpur City Centre, 50088 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur', 'National Blood Centre', 'nbc@moh.gov.my', '03-2615 0000'),
('Blood Donation Campaign at Pavilion', '30/4/2023 8am-2pm', 'Pavilion, Kuala Lumpur', '168, Jalan Bukit Bintang, Bukit Bintang, 55100 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur', 'Malaysian Red Crescent Society', 'info@redcrescent.org.my', '03-2142 2044'),
('Blood Donation Drive at Mid Valley Megamall', '5/5/2023 10am-4pm', 'Mid Valley Megamall, Kuala Lumpur', 'Mid Valley City, Lingkaran Syed Putra, 59200 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur', 'Hospital Kuala Lumpur', 'donate@hkl.gov.my', '03-2615 5555'),
('Blood Donation Campaign at 1 Utama Shopping Centre', '10/5/2023 8am-6pm', '1 Utama Shopping Centre, Petaling Jaya', '1 Utama Shopping Centre, 1, Lebuh Bandar Utama, Bandar Utama, 47800 Petaling Jaya, Selangor', 'National Blood Centre', 'nbc@moh.gov.my', '03-2615 0000'),
('Donate Blood at IOI City Mall', '2023-08-19 14:00:00', 'IOI City Mall, Putrajaya', 'IOI City Mall, Lebuh IRC, IOI Resort City, 62502 Putrajaya, Wilayah Persekutuan Putrajaya', 'Hospital Putrajaya', 'donor@hpp.moh.gov.my', '03-8312 4200'),
('Donate Blood at Sunway Velocity Mall', '2023-10-08 10:00:00', 'Sunway Velocity Mall, Cheras', 'Lingkaran SV, Sunway Velocity, 55100 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur', 'Sunway Medical Centre', 'donor@sunmed.com.my', '03-7491 9191'),
('Blood Donation Campaign at Gurney Plaza', '2023-11-12 09:00:00', 'Gurney Plaza, George Town', 'Gurney Plaza, Persiaran Gurney, 10250 George Town, Pulau Pinang', 'Malaysian Red Crescent Society', 'info@redcrescent.org.my', '04-229 8703'),
('Blood Donation Drive at MyTOWN Shopping Centre', '2023-12-03 12:30:00', 'MyTOWN Shopping Centre, Kuala Lumpur', 'Jalan Cochrane, Seksyen 90, 55100 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur', 'Hospital Kuala Lumpur', 'donate@hkl.gov.my', '03-2615 5555'),
('Blood Donation Campaign at Dataran Pahlawan Melaka Megamall', '2024-01-14 11:00:00', 'Dataran Pahlawan Melaka Megamall, Melaka', 'Jalan Merdeka, Bandar Hilir, 75000 Melaka', 'National Blood Centre', 'nbc@moh.gov.my', '03-2615 0000'),
('Donate Blood at Sunway Carnival Mall', '2024-02-18 10:00:00', 'Sunway Carnival Mall, Seberang Jaya', '3068, Jalan Todak, Pusat Bandar Seberang Jaya, 13700 Perai, Pulau Pinang', 'Hospital Seberang Jaya', 'donor@hsj.moh.gov.my', '04-399 3333'),
('Blood Donation Drive at KSL City Mall', '2024-03-09 11:30:00', 'KSL City Mall, Johor Bahru', '33, Jalan Seladang, Taman Abad, 80250 Johor Bahru, Johor', 'Hospital Sultanah Aminah Johor Bahru', 'donor@hsajb.moh.gov.my', '07-225 7000'),
('Blood Donation Campaign at Suria Sabah Shopping Mall', '2024-04-15 09:00:00', 'Suria Sabah Shopping Mall, Kota Kinabalu', 'Jalan Tun Fuad Stephens, Pusat Bandar Kota Kinabalu, 88000 Kota Kinabalu, Sabah', 'Malaysian Red Crescent Society', 'info@redcrescent.org.my', '088-223 101'),
('Donate Blood at Mitsui Outlet Park', '2024-05-06 12:00:00', 'Mitsui Outlet Park, Sepang', 'Persiaran Komersial, 64000 KLIA, Selangor', 'Hospital Putrajaya', 'donor@hpp.moh.gov.my', '03-8312 4200'),
('Blood Donation Drive at Mahkota Parade', '2024-06-23 11:30:00', 'Mahkota Parade, Melaka', 'Jalan Merdeka, 75000 Melaka', 'National Blood Centre', 'nbc@moh.gov.my', '03-2615 0000')


-- To view all the datas from the table
SELECT * from BloodDonationCampaign

