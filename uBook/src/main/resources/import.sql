--Creation du club
INSERT INTO CLUB (id,name) VALUES ('1','Whatsup');
--Creation des salles
INSERT INTO PLACE (id,description,name,id_club) VALUES ('1','Mur','Wambrechies','1');
INSERT INTO PLACE (id,description,name,id_club) VALUES ('2','Bloc','Villeneuve Ascq','1');
INSERT INTO PLACE (id,description,name,id_club) VALUES ('3','Mur','Lesquin','1');

--Creation des ressources
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('1','Voie 1','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('2','Voie 2','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('3','Voie 3','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('4','Voie 4','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('5','Voie 5','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('6','Voie 6','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('7','Voie 7','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('8','Voie 8','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('9','Voie 9','1');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('10','Voie 10','1');

INSERT INTO RESSOURCE (id,name,id_place) VALUES ('11','Bloc 1','2');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('12','Bloc 2','2');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('13','Bloc 3','2');

INSERT INTO RESSOURCE (id,name,id_place) VALUES ('14','Voie 1','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('15','Voie 2','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('16','Voie 3','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('17','Voie 4','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('18','Voie 5','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('19','Voie 6','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('20','Voie 7','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('21','Voie 8','3');
INSERT INTO RESSOURCE (id,name,id_place) VALUES ('22','Voie 9','3');

INSERT INTO MEMBER (id,first_name,last_name) VALUES ('1','Jean','Dupont');
INSERT INTO MEMBER (id,first_name,last_name) VALUES ('2','Alexandre','Leroy');
INSERT INTO MEMBER (id,first_name,last_name) VALUES ('3','Dany','Scayse');
INSERT INTO MEMBER (id,first_name,last_name) VALUES ('4','Lilly','Lequeen');


