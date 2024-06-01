CREATE  TABLE item (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    description VARCHAR,
    target_stock NUMERIC,
    stock NUMERIC
);
