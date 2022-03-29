-- DROP TABLE db_fonyouTest.Tb_Respuesta;
-- DROP TABLE db_fonyouTest.Tb_Pregunta;
-- DROP TABLE db_fonyouTest.Tb_Examen;
-- DROP TABLE db_fonyouTest.Tb_Estudiante;

-- Insert para estudiantes.
INSERT INTO db_fonyouTest.Tb_Estudiante (ciudad,edad,nombre,zonaHoraria)
VALUES ("Itagui",22,"Sara Patiño","GMT-5");
INSERT INTO db_fonyouTest.Tb_Estudiante (ciudad,edad,nombre,zonaHoraria)
VALUES ("Itagui",27,"Marlon Herrera","GMT-5");
INSERT INTO db_fonyouTest.Tb_Estudiante (ciudad,edad,nombre,zonaHoraria)
VALUES ("Santa Elena",30,"Horacio","GMT-5");

-- Insert para examenes
INSERT INTO db_fonyouTest.Tb_Examen (nombre,fechaExamen)
VALUES ("Examen_Sara",'2022-09-17');
INSERT INTO db_fonyouTest.Tb_Examen (nombre,fechaExamen)
VALUES ("Examen_Marlon",'2022-09-17');
INSERT INTO db_fonyouTest.Tb_Examen (nombre,fechaExamen)
VALUES ("Examen_Horacio",'2022-09-17');

-- Insert para preguntas
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuántos minutos tiene un día?",25,1);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuál es el planeta más cercano al Sol?",25,1);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cual es el antónimo de rico?",25,1);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuántas patas tiene una araña?",25,1);


INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuántos minutos tiene un día?",25,2);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuál es el planeta más cercano al Sol?",25,2);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cual es el antónimo de rico?",25,2);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuántas patas tiene una araña?",25,2);

INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuántos minutos tiene un día?",25,3);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuál es el planeta más cercano al Sol?",25,3);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cual es el antónimo de rico?",25,3);
INSERT INTO db_fonyouTest.Tb_Pregunta (enunciado,puntaje,examen_id)
VALUES ("¿Cuántas patas tiene una araña?",25,3);

-- Insert para respuestas correctas e incorrectas.

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1440 Mins.",1,1);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1680 Mins.",0,1);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1200 Mins.",0,1);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1111 Mins.",0,1);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1440 Mins.",1,5);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1680 Mins.",0,5);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1200 Mins.",0,5);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1111 Mins.",0,5);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1440 Mins.",1,9);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1680 Mins.",0,9);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1200 Mins.",0,9);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("1111 Mins.",0,9);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Mercurio",1,2);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pluton",0,2);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Tierra",0,2);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Venus",0,2);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Mercurio",1,6);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pluton",0,6);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Tierra",0,6);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Venus",0,6);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Mercurio",1,10);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pluton",0,10);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Tierra",0,10);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Venus",0,10);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pobre",1,3);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Millonario",0,3);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Multimillonario",0,3);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pobreza",0,3);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pobre",1,7);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Millonario",0,7);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Multimillonario",0,7);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pobreza",0,7);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pobre",1,11);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Millonario",0,11);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Multimillonario",0,11);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("Pobreza",0,11);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("8",1,4);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("6",0,4);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("10",0,4);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("4",0,4);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("8",1,8);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("6",0,8);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("10",0,8);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("4",0,8);

INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("8",1,12);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("6",0,12);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("10",0,12);
INSERT INTO db_fonyouTest.Tb_Respuesta (contenido,correct,pregunta_id)
VALUES ("4",0,12);

-- Validar data insertada si se desea.
SELECT * FROM db_fonyouTest.Tb_Estudiante;
SELECT * FROM db_fonyouTest.Tb_Examen;
SELECT * FROM db_fonyouTest.Tb_Pregunta;
SELECT * FROM db_fonyouTest.Tb_Respuesta;



