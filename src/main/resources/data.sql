insert into users (id, userName, fullName, email, password, active)
    values
        (1, 'Ivo', 'Ivic', 'ivo@gmail.hr', '$argon2i$v=19$m=16,t=2,p=1$c2lzZWt1cmFjcGlja2E$MfiNFyJke/jQNRG//BjJ7Q', true),
        (2, 'Stef', 'Stefek', 'stef@gmail.hr', '$argon2i$v=19$m=16,t=2,p=1$c2lzZWt1cmFjcGlja2E$MfiNFyJke/jQNRG//BjJ7Q', true),
        (3, 'Luka', 'Lukina', 'luks@gmail.hr', '$argon2i$v=19$m=16,t=2,p=1$c2lzZWt1cmFjcGlja2E$MfiNFyJke/jQNRG//BjJ7Q', true)),
        (4, 'Borna', 'Bratanic', 'borna@hotmail.com', '$argon2i$v=19$m=16,t=2,p=1$c2lzZWt1cmFjcGlja2E$MfiNFyJke/jQNRG//BjJ7Q', false);


insert into question (id, question, correctAnswer, score)
    values
        (1, 'Upitnik o zadovoljstvu života', '2', 18),
        (2, 'Upitnik o zadovoljstvu javnog prijevoza', '4', 20);


insert into qestionnaire (id, name, questions)
    values
        (1, 'Koliko često šećete?', 1),
        (2, 'Koliko često perete zube?', 1),
        (3, 'Koliko često vježbate?', 1),
        (4, 'Koliko često se vozite javnim prijevozom?', 2),
        (5, 'Koliko ste zadovolji kvalitetom voznog parka?', 2),
        (6, 'Koliko presjedanja u prosjeku na dan imate?', 2);

insert into results (id, name, totalScore, score, answers)
    values
        (1, 'rezultat1', 10, 1),
        (2, 'rezultat2', 20, 1),
        (3, 'rezultat3', 30, 1),
        (4, 'rezultat4', 40, 2),
        (5, 'rezultat5', 50, 2),
        (6, 'rezultat6', 60, 2);


insert into answers (id, question, correctAnswer, score, results)
    values
        (1, 'Koliko često šećete?', true, 10, 1),
        (2, 'Koliko često perete zube?', false, 20, 2),
        (3, 'Koliko često vježbate?', true, 30, 3),
        (4, 'Koliko često se vozite javnim prijevozom?', false, 40, 4),
        (5, 'Koliko ste zadovolji kvalitetom voznog parka?', true, 50, 5),
        (6, 'Koliko presjedanja u prosjeku na dan imate?', false, 60, 6);


insert into role (id, name, role)
    values
        (1, 'Admin', 1),
        (2, 'User', 2),
        (3, 'User', 3),
        (4, 'User', 4);
