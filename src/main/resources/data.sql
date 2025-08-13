CREATE TABLE IF NOT EXISTS CatalogItem (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(1024),
  price DOUBLE
);

INSERT INTO CatalogItem (name, description, price) VALUES
  ('Laptop', 'High-end gaming laptop', 1500.00),
  ('Smartphone', 'Latest Android smartphone', 800.00),
  ('Headphones', 'Noise-cancelling headphones', 200.00),
  ('Tablet', 'Portable touchscreen tablet', 400.00),
  ('Smartwatch', 'Wearable smart device', 250.00),
  ('Bluetooth Speaker', 'Wireless speaker with deep bass', 120.00),
  ('Gaming Console', 'Next-gen gaming console', 600.00),
  ('Monitor', '27-inch 4K UHD monitor', 350.00),
  ('Keyboard', 'Mechanical keyboard with RGB lighting', 90.00),
  ('Mouse', 'Wireless ergonomic mouse', 45.00),
  ('External Hard Drive', '2TB USB 3.0 external HDD', 100.00),
  ('Webcam', 'HD video conferencing webcam', 80.00),
  ('Printer', 'All-in-one wireless printer', 160.00),
  ('Router', 'Dual-band Wi-Fi router', 70.00),
  ('Fitness Tracker', 'Activity and sleep tracker', 60.00),
  ('E-reader', '6-inch e-ink e-reader', 110.00),
  ('VR Headset', 'Virtual reality headset', 300.00),
  ('Projector', 'Portable HD projector', 220.00),
  ('Drone', 'Quadcopter drone with camera', 450.00),
  ('Digital Camera', 'Mirrorless digital camera', 700.00),
  ('Flash Drive', '128GB USB 3.1 flash drive', 35.00),
  ('Smart Home Hub', 'Voice-activated smart hub', 130.00);