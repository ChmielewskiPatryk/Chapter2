insert into image(offer_id, scr, dimension) values
(1, 'https://www.prezydent.pl/dla-mediow/materialy-do-pobrania/zdjecia', '1600x1067'),
(2, 'https://www.pexels.com/photo/white-cumulus-clouds-2097628/', '3616x5435'),
(3, 'https://www.pexels.com/photo/bird-s-eye-view-photo-of-island-1433052/','2121x2651'),
(4, 'https://www.pexels.com/photo/multicolored-abstract-painting-1266808/','5325x3575'),
(5, 'https://www.pexels.com/photo/silhouette-photography-of-person-under-starry-sky-1906658/','3744x5616');

insert into users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at) values
(1,'Kacper', 6874414272, 'Kwiatkowa', 24, '658474812', '64-020', 300.00, 10.00, now()),
(2, 'Krzysztof', 6284218740, 'Polowa', 36, '624174573', '64-010', 50.00, 5.00, '2022-04-14'),
(3, 'Piotr', 6284793410, 'Wiatrowa', 9, '524984147', '62-053', 150.00, 8.5, '2021-10-14'),
(4, 'Dawid', 6241140790, 'Wolności', 17, '698252650', '61-124', 250.00, 9.0,'2022-08-12'),
(5, 'Eugeniusz', 7587550284, 'Paderewskiego', 3, '742845124', '60-742', 25.00, 5.4, '2004-11-24');

