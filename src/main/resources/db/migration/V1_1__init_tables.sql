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

CREATE TABLE public.subscribe (
    id          BIGSERIAL,
    full_name   text,
    email       text,
    active      boolean,
    PRIMARY KEY (id)
);

CREATE TABLE public.subscribe_category (
    id                  BIGSERIAL,
    subscribe_id       BIGINT,
    category_id         BIGINT,
    PRIMARY KEY (id),
    foreign key (subscribe_id ) references public.subscribe (id) ON DELETE CASCADE,
    foreign key (category_id) references public.category (id) ON DELETE CASCADE
);