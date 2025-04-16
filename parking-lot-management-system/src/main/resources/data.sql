INSERT INTO parking_slot (slot_number, availability_status, vehicle_type) VALUES
(1, 'available', NULL),
(2, 'available', NULL),
(3, 'available', NULL),
(4, 'available', NULL),
(5, 'available', NULL),
(6, 'available', NULL),
(7, 'available', NULL),
(8, 'available', NULL),
(9, 'available', NULL),
(10, 'available', NULL);

INSERT INTO vehicle (vehicle_id, type, entry_time) VALUES
(1, 'car', NOW()),
(2, 'bike', NOW()),
(3, 'truck', NOW());

INSERT INTO admin (admin_id, username, password) VALUES
(1, 'admin', 'admin123');