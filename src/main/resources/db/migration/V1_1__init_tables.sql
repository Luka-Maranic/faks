CREATE TABLE public.role (
    id          BIGSERIAL,
    name        text,
    PRIMARY KEY (id)
);

CREATE TABLE public.users (
    id              BIGSERIAL,
    first_name       text,
    last_name        text,
    email           text,
    password        text,
    position        text,
    active          boolean,
    role_id         BIGINT,
    PRIMARY KEY (id),
    foreign key (role_id) references public.role (id)
);

CREATE TABLE public.category (
    id              BIGSERIAL,
    name            text,
    PRIMARY KEY (id)
);
