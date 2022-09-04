DROP TABLE IF EXISTS currency;

CREATE TABLE currency (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  en_name VARCHAR(50) NOT NULL,
  ch_name VARCHAR(50) NOT NULL
);

INSERT INTO currency (id, en_name, ch_name) VALUES
	(1, 'USD', '美元'),
	(2, 'GBP', '英鎊'),
	(3, 'EUR', '歐元');

