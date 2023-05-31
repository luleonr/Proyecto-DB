USE academico;

/*
Por ahora para esta entrega nos limitamos a realizar un único índice sobre la columna user_usuario 
de la tabla Usuario, esto dado a que la mayoría de procedimientos, por no decir todos, tiene como parámetro
el usuario que quiere llamar el procedimiento, esto dado que al momento de ser conectado por ejemplo a 
NetBeans para manipular la base de datos a partir de la interfaz gráfica, se accede directamente con los 
usuarios que hay en la base de datos a partir del comando SUBSTRING_INDEX(CURRENT_USER (), '@', 1), 
que devuelve el usuario que inicio la sesión en workbench, y así hacer los llamados a los procedimientos, en 
donde la mayoría usa el parámetro usuario para filtrar la información de acuerdo a una única persona, por esto 
al ser un atributo que debe ser único, y que se usa constantemente para consultas lo consideramos un perfecto
candidato para realizar un índice */

CREATE UNIQUE INDEX idx_user_usuario ON Usuario (user_usuario);

/*
Se contemplará la posibilidad de generar algún que otro índice para la entrega final, dependiendo 
de la necesidad de los mismos, dado que no queremos generar índices que no son necesarios, dado que como lo vimos 
en clase, generar muchos de estos, o hacerlo de una mala manera, hará que el programa se comporte de mala manera */