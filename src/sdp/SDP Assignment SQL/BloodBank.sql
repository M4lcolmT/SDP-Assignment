USE SDPAssignment

--To create the table
CREATE TABLE BloodBank (
    bloodbank_name VARCHAR(100),
    date DATE,
    timeslot_available VARCHAR(100),
    address VARCHAR(200)
);

--To insert values
INSERT INTO BloodBank (bloodbank_name, date, timeslot_available, address) VALUES
('Hospital Seberang Jaya', '2023-03-24', '10:00 AM - 1:00 PM', 'Jalan Tun Hussein Onn, Pulau Pinang'),
('Hospital Putrajaya', '2023-03-26', '9:00 AM - 12:00 PM', 'Presint 7, 62250 Putrajaya'),
('Hospital Raja Perempuan Zainab II', '2023-03-28', '2:00 PM - 5:00 PM', 'Bandar Kota Bharu, Kelantan'),
('Hospital Kuala Terengganu', '2023-03-30', '10:00 AM - 1:00 PM', 'Jalan Sultan Mahmud, Terengganu'),
('Hospital Universiti Kebangsaan Malaysia', '2023-04-02', '9:00 AM - 12:00 PM', 'Jalan Yaacob Latif, Kuala Lumpur'),
('Hospital Serdang', '2023-04-05', '2:00 PM - 5:00 PM', '43000 Kajang, Selangor'),
('Hospital Tengku Ampuan Rahimah', '2023-04-08', '10:00 AM - 1:00 PM', 'Jalan Langat, Selangor'),
('Hospital Taiping', '2023-04-11', '2:00 PM - 5:00 PM', 'Jalan Taman Tasik, Perak'),
('Hospital Kuala Krai', '2023-04-14', '10:00 AM - 1:00 PM', 'Jalan Tuan Haji Ahmad, Kelantan'),
('Hospital Bintulu', '2023-04-17', '9:00 AM - 12:00 PM', 'Jalan Tan Sri Dr Haji Bujang, Sarawak'),
('Hospital Sibu', '2023-04-20', '2:00 PM - 5:00 PM', 'Jalan Hospital, Sarawak'),
('Hospital Duchess of Kent Sandakan', '2023-04-23', '10:00 AM - 1:00 PM', 'Jalan Utara, Sabah'),
('Hospital Kuala Lumpur', '2023-04-20', '9:00 AM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '10:00 AM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '12:00 PM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '1:00 PM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '3:00 PM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '4:00 PM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '5:00 PM', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', '2023-04-20', '6:00 PM', 'Jalan Pahang, Kuala Lumpur')

-- To view all the datas from the table
SELECT * from BloodBank

-- When y'all use the queries to call the sql data into java use the following code:
SELECT DISTINCT bloodbank_name, address from BloodBank