CREATE TABLE IF NOT EXISTS authn_data (
                                          user_id VARCHAR(50) PRIMARY KEY,
                                          user_password VARCHAR(100) NOT NULL,
                                          user_name VARCHAR(100) NOT NULL
);
