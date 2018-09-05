

INSERT INTO usuarios ( usuario, name, email, age, nivel, escuela) VALUES ( 'Balerion', 'Armin', 'aguilar@gmail.com', 22, 1, "prepa 1");

INSERT INTO categorias (id, categories) VALUES (1, 'Pensamiento Matematico');
INSERT INTO categorias (id, categories) VALUES (2, 'Pensamiento analitico');
INSERT INTO categorias (id, categories) VALUES (3, 'Estructura de la lengua');
INSERT INTO categorias (id, categories) VALUES (4, 'Compresión lectora');
INSERT INTO categorias (id, categories) VALUES (5, 'Inglés');


INSERT INTO curso (id, name_course) VALUES (1, 'Exani I');
INSERT INTO curso (id, name_course) VALUES (2, 'Exani II');
INSERT INTO curso (id, name_course) VALUES (3, 'Inglés');
INSERT INTO curso (id, name_course) VALUES (4, 'Diagnostico 1');
INSERT INTO curso (id, name_course) VALUES (5, 'Diagnostico 2');



INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (1, 2, 1, 'Para ir de Ibarra a Quito hay que recorrer 135km. Si lleva una velocidad de 54km/h. ¿Cuántas horas deberá manejar para recorrer esa distancia?', 0 , "" );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (2, 2, 1, 'Un padre de familia reparte $400 entre sus 4 hijos de la siguiente manera: al mayor le da $120, al segundo $115, al tercero $105. ¿Cuánto recibirá el menor de todos?', 0 , "" );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (3, 2, 1, 'Se compran 1500 huevos por $120. Si se rompen 15 huevos y se venden a $2.70 la cubeta (30 huevos). ¿Cuánto gana? ', 0 , "" );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (4, 2, 3, 'Antonimo de bueno: ', 0, "" );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (5, 2, 3, 'Sinonimo de ebrio ', 0 , "");


INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (6, 2, 2, 'Determinar cuántos segmentos rectos se necesitarán para formar la Figura número 10.', 1 , 'exani2_pregunta_s2_e6' );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (7, 2, 2, '¿Qué número falta en la figura', 1 , 'exani2_pregunta_s2_e7' );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (8, 2, 2, '¿Cuál es la figura que sigue?', 1 , 'exani2_pregunta_s2_e8' );

   INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (9, 2, 4, '  EL BÚFALO CAFRE: Hay animales, como los antílopes y  gacelas,  que se han hecho célebres por su belleza. Otros, como el león, llaman la atención por su bravura y  orgulloso porte. Finalmente, los gigantes, como los  elefantes y jirafas, impresionan por sus colosales  proporciones. Pero existe una criatura africana que, al  margen de su tamaño, su porte y su  apariencia  física, es famosa entre todos los cazadores y zoólogos, precisamente por su peligrosidad. Me refiero al  búfalo cafre, el gran bóvido de las sabanas. Porque se sabe que este herbívoro ha causado más víctimas entre sus enemigos naturales incluido el hombre, que cualquier fiera, aparentemente más agresiva e incontrolable. Para los cazadores europeos y americanos que buscan en África emociones fuertes, el búfalo ha  constituido siempre una pieza codiciada.  Porque  si  el tirador no acierta a derribarlo del primer  disparo, su obligado rastreo resulta sumamente peligroso.  El búfalo herido se retira hacia los más  impenetrables matorrales y trata siempre de dar un rodeo para atacar por la espalda al hombre que lo busca, en un paraje que dificulta la visibilidad y los movimientos.  En la carga, el sólido rumiante, que puede alcanzar la tonelada de peso, avanza en línea recta, quebrando el matorral a su paso. Contrariamente  a  los toros, lleva siempre la cabeza levantada y el hocico al viento, para no perder el contacto  olfativo  con la víctima. Su fino oído y su aguda vista  completan el dispositivo agresor, conjugándose con una  agilidad inesperada en el volumen del rumiante. Sus cuernos, extraordinariamente  macizos,  forman  como  un casco sobre la frente,  para  curvarse  luego  hacia abajo y emerger en dos  afiladas  puntas  laterales. Basta el simple testarazo del  escudo  central  para matar a un hombre. Pero el búfalo acostumbra a ensañarse con sus enemigos, a los que pisotea después de derribarlos. Y aún se dice que con su lengua, áspera como papel de lija, puede lacerar la piel y los músculos. ¿Tendríamos que  pensar  tras  esta  comprometida descripción que el búfalo es un ser odioso,  merecedor de la más despiadada persecución?  En  absoluto, porque este apacible torazo  sólo  ataca  cuando  es acosado, comportándose, en condiciones normales, como una criatura inofensiva y tímida. Una abrasadora mañana de la gran Fosa del  Rift,  estábamos  filmando pelícanos blancos en las riberas del lago de Mañara, cuando sorprendimos a media docena de grandes  búfalos machos, revolcándose en un lodazal.  Félix Rodríguez de la Fuente. PREGUNTA: Son animales célebres por su belleza:', 0 , '' );

INSERT INTO preguntas (id, curso_id, category_id, descripcion, imagen, name_img)
VALUES (10, 2, 4, '  EL BÚFALO CAFRE: Hay animales, como los antílopes y  gacelas,  que se han hecho célebres por su belleza. Otros, como el león, llaman la atención por su bravura y  orgulloso porte. Finalmente, los gigantes, como los  elefantes y jirafas, impresionan por sus colosales  proporciones. Pero existe una criatura africana que, al  margen de su tamaño, su porte y su  apariencia  física, es famosa entre todos los cazadores y zoólogos, precisamente por su peligrosidad. Me refiero al  búfalo cafre, el gran bóvido de las sabanas. Porque se sabe que este herbívoro ha causado más víctimas entre sus enemigos naturales incluido el hombre, que cualquier fiera, aparentemente más agresiva e incontrolable. Para los cazadores europeos y americanos que buscan en África emociones fuertes, el búfalo ha  constituido siempre una pieza codiciada.  Porque  si  el tirador no acierta a derribarlo del primer  disparo, su obligado rastreo resulta sumamente peligroso.  El búfalo herido se retira hacia los más  impenetrables matorrales y trata siempre de dar un rodeo para atacar por la espalda al hombre que lo busca, en un paraje que dificulta la visibilidad y los movimientos.  En la carga, el sólido rumiante, que puede alcanzar la tonelada de peso, avanza en línea recta, quebrando el matorral a su paso. Contrariamente  a  los toros, lleva siempre la cabeza levantada y el hocico al viento, para no perder el contacto  olfativo  con la víctima. Su fino oído y su aguda vista  completan el dispositivo agresor, conjugándose con una  agilidad inesperada en el volumen del rumiante. Sus cuernos, extraordinariamente  macizos,  forman  como  un casco sobre la frente,  para  curvarse  luego  hacia abajo y emerger en dos  afiladas  puntas  laterales. Basta el simple testarazo del  escudo  central  para matar a un hombre. Pero el búfalo acostumbra a ensañarse con sus enemigos, a los que pisotea después de derribarlos. Y aún se dice que con su lengua, áspera como papel de lija, puede lacerar la piel y los músculos. ¿Tendríamos que  pensar  tras  esta  comprometida descripción que el búfalo es un ser odioso,  merecedor de la más despiadada persecución?  En  absoluto, porque este apacible torazo  sólo  ataca  cuando  es acosado, comportándose, en condiciones normales, como una criatura inofensiva y tímida. Una abrasadora mañana de la gran Fosa del  Rift,  estábamos  filmando pelícanos blancos en las riberas del lago de Mañara, cuando sorprendimos a media docena de grandes  búfalos machos, revolcándose en un lodazal.  Félix Rodríguez de la Fuente. PREGUNTA: El búfalo cafre destaca por su:', 0 , '' );

INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (1, 1, 2, 1);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (2, 2, 1, 1);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (3, 3, 3, 0);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (4, 4, 4, 0);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (5, 5, 1, 0);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (6, 6, 2, 1);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (7, 7, 3, 1);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (8, 8, 3, 0);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (9, 9, 2, 0);
INSERT INTO respuestas (id, pregunta_id, respuesta, imagen) VALUES (10,10, 1, 0);



INSERT INTO opciones (id, pregunta_id, img_status, opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (1, 1, 0,  '3', '','2.5', '', '2', '', '1.5','' );

 INSERT INTO opciones (id,pregunta_id, img_status, opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (2, 2, 0, '60', '','55', '', '70', '', '75','' );

 INSERT INTO opciones (id,pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (3, 3, 0, '$12.65', '','$13.0', '', '$13.65', '', '$12.65','' );

  INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (4, 4, 0,'Generoso', '','Piadoso', '', 'bondadoso', '', 'Malo','' );

   INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (5, 5, 0, 'beodo', '','curado', '', 'sobrio', '', 'rip','' );

 INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (6, 6, 0, '50', '','55', '', '60', '', '45','' );

 INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (7, 7, 0, '8', '','10', '', '12', '', '14','' );

 INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (8, 8, 1, '', 'exani2_opcion_a_s2_e8','', 'exani2_opcion_b_s2_e8', '', 'exani2_opcion_c_s2_e8', '','exani2_opcion_d_s2_e8' );


 INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (9, 9, 0, 'Los leones.', '','Los antílopes y gacelas.', '', 'Los búfalos.', '', 'todos los anteriores','' );


 INSERT INTO opciones (id, pregunta_id, img_status,  opcion_a, imagen_a_id, opcion_b, imagen_b_id,opcion_c, imagen_c_id,opcion_d, imagen_d_id )
 VALUES (10, 10, 0, 'Peligrosidad', '','Tamaño', '', 'Porte', '', 'Color','' );




 INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
  VALUES (1, 1, 'No hay descripción', 'exani2_solucion_s1_e1');

  INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (2, 2,'No hay descripción', 'exani2_solucion_s1_e2');

  INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (3, 3,'No hay descripción', 'exani2_solucion_s1_e3');

   INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (4, 4,'Antonimo es lo opuesto', '');

   INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (5, 5,'Sinonimos es lo mismo', '');

 INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (6, 6,'Resolución. – Una aplicación del razonamiento inductivo son los patrones numéricos los mismos que nos permiten predecir "lo que viene después" en una lista de números. En nuestro ejemplo si elaboramos un cuadro con la información dada nos queda:', 'exani2_solucion_s2_e6');

    INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (7, 7,'Análisis: En los círculos numéricos, los números ubicados en su interior se relacionan, entre sí, ya sea con el término adyacente o el opuesto. En este caso la solución se encontrará relacionando las regiones consecutivas y en sentido horario Resolución. – Analizando el gráfico podríamos determinar larespuesta de la siguiente manera',
  'exani2_solucion_s2_e7');

    INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (8, 8,'Va suprimiendo un rayo', '');

    INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (9, 9,'', '');

     INSERT INTO solucion (id, pregunta_id, descripcion, imagen)
 VALUES (10, 10,'', '');
