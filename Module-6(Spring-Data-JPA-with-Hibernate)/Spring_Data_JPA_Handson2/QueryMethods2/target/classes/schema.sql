DROP TABLE IF EXISTS stock;

CREATE TABLE stock (
    st_code VARCHAR(10) PRIMARY KEY,
    st_name VARCHAR(100) NOT NULL,
    st_date DATE,
    st_open DOUBLE,
    st_close DOUBLE,
    st_volume BIGINT
);