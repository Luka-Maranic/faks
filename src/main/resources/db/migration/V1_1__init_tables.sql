CREATE TABLE public.users (
    id              BIGSERIAL,
    firstName       text,
    lastName        text,
    email           text UNIQUE,
    password        text,
    PRIMARY KEY (id)
);
