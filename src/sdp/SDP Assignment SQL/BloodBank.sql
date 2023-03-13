USE SDPAssignment

--To create the table
CREATE TABLE BloodBank (
    bloodbank_name VARCHAR(100),
    address VARCHAR(200)
);


--To insert values
INSERT INTO BloodBank (bloodbank_name, address) VALUES
('Hospital Seberang Jaya', 'Jalan Tun Hussein Onn'),
('Hospital Putrajaya', 'Presint 7, 62250 Putrajaya'),
('Hospital Raja Perempuan' , 'Bandar Kota Bharu, Kelantan'),
('Hospital Kuala Terengganu', 'Jalan Sultan Mahmud, Terengganu'),
('Hospital Universiti Malaysia', 'Jalan Yaacob Latif, Kuala Lumpur'),
('Hospital Serdang', '43000 Kajang, Selangor'),
('Hospital Tengku Ampuan Rahimah', 'Jalan Langat, Selangor'),
('Hospital Taiping', 'Jalan Taman Tasik, Perak'),
('Hospital Kuala Krai', 'Jalan Tuan Haji Ahmad, Kelantan'),
('Hospital Bintulu', 'Jalan Tan Sri Dr Haji Bujang, Sarawak'),
('Hospital Sibu', 'Jalan Hospital, Sarawak'),
('Hospital Duchess', 'Jalan Utara, Sabah'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur'),
('Hospital Kuala Lumpur', 'Jalan Pahang, Kuala Lumpur')

-- To view all the datas from the table
SELECT * from BloodBank