CREATE TABLE public.users (
    id              BIGSERIAL,
    firstName       text,
    lastName        text,
    email           text UNIQUE,
    password        text,
    PRIMARY KEY (id)
);

CREATE TABLE public.course (
    id              BIGINT,
    name            text,
    PRIMARY KEY (id)
);