CREATE TABLE present_t
(
    id     VARCHAR(64) NOT NULL PRIMARY KEY,
    name   VARCHAR(64) NOT NULL,
    status VARCHAR(64) NOT NULL
);

INSERT INTO present_t (id, name, status)
VALUES
    ('1', 'David', 'Active'),
    ('2', 'Eric', 'Inactive');