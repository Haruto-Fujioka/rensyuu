INSERT INTO authn_data VALUES ('a001', 'pass', '田中');
INSERT INTO authn_data VALUES ('b123', 'pass', '佐藤');
INSERT INTO authn_data VALUES ('c567', 'pass', '斎藤');



\dt authn_data
\dt

SELECT table_schema, table_name
FROM information_schema.tables
WHERE table_name = 'authn_data';
