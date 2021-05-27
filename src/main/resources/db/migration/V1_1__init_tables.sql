CREATE TABLE public.role (
    id          BIGSERIAL,
    name        VARCHAR (50),
    PRIMARY KEY (id)
);

CREATE TABLE public.users (
    id              BIGSERIAL,
    full_name       VARCHAR (50),
    user_name       VARCHAR (50),
    email           VARCHAR (50),
    password        text,
    active          BOOLEAN,
    role_id         BIGINT,
    PRIMARY KEY (id),
    foreign key (role_id) references public.role (id)
);

CREATE TABLE public.answers (
    id                  BIGSERIAL,
    question            VARCHAR (500),
    correct_answer      BOOLEAN,
    score               INT,
    CONSTRAINT pk_answers PRIMARY KEY (id)
);


CREATE TABLE public.results (
    id          BIGSERIAL,
    name        VARCHAR (100),
    total_score FLOAT,
    answers_id  BIGSERIAL,
    CONSTRAINT pk_results PRIMARY KEY (id),
      CONSTRAINT fk_ok_results_answers FOREIGN KEY (answers_id)
        REFERENCES public.answers (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION

);

CREATE TABLE public.questions (
    id                   BIGSERIAL,
    question             VARCHAR (500),
    correct_answer       VARCHAR (2),
    score                INT,
    CONSTRAINT ok_questions PRIMARY KEY (id)
);

CREATE TABLE public.questionnaire (
    id                  BIGSERIAL,
    name                VARCHAR (100),
    questions_id        BIGSERIAL,
    CONSTRAINT ok_questionnaire PRIMARY KEY (id),
      CONSTRAINT fk_ok_questionnaire_questions FOREIGN KEY (questions_id)
        REFERENCES public.questions (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
