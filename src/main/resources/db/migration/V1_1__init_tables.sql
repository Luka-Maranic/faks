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


CREATE TABLE public.results (
    id          BIGSERIAL,
    name        VARCHAR (100),
    total_score FLOAT,
    CONSTRAINT pk_results PRIMARY KEY (id)

);

CREATE TABLE public.answers (
    id                  BIGSERIAL,
    question            VARCHAR (500),
    correct_answer      BOOLEAN,
    score               INT,
    results_id  BIGSERIAL,
    CONSTRAINT pk_answers PRIMARY KEY (id),
      CONSTRAINT fk_answers_results FOREIGN KEY (results_id)
        REFERENCES public.results (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE public.questionnaire (
    id                  BIGSERIAL,
    name                VARCHAR (100),
    CONSTRAINT pk_questionnaire PRIMARY KEY (id)
);

CREATE TABLE public.questions (
    id                   BIGSERIAL,
    question             VARCHAR (500),
    correct_answer       VARCHAR (2),
    score                INT,
    questionnaire_id        BIGSERIAL,
    CONSTRAINT pk_questions PRIMARY KEY (id),
      CONSTRAINT fk_questions_questionnaire FOREIGN KEY (questionnaire_id)
        REFERENCES public.questionnaire (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

