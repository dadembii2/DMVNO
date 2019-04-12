-- hello
DROP TABLE IF EXISTS hello;
CREATE TABLE hello (
	locale	varchar(255) NOT NULL,
  	msg		varchar(255)
);

-- bye
DROP TABLE IF EXISTS bye;
CREATE TABLE bye (
	locale	varchar(255) NOT NULL,
  	msg		varchar(255)
);
