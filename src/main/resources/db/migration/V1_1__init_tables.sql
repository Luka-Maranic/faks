CREATE TABLE public.users (
    id              BIGSERIAL,
    first_name       text,
    last_name        text,
    email           text,
    password        text,
    position        text,
    active          boolean,
    PRIMARY KEY (id)
);
