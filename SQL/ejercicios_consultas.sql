#1. Listar los nombres de los usuarios
SELECT nombre FROM Usuarios;

#2. Calcular el saldo máximo de los uusarios de sexo "Mujer"
SELECT MAX(saldo) FROM Usuarios WHERE sexo = 'M';

#3. Listar nombre y telefono de los uusarios con telefono NOKIA, BLACKBERRY o SONY
SELECT nombre, telefono FROM Usuarios WHERE marca IN('NOKIA','BLACKBERRY', 'SONY');

#4. Contar los usuarios sin saldo o inactivos
SELECT COUNT(*) FROM Usuarios WHERE NOT activo or saldo<=0;

#5. Listar el login de los usuarios con nivel 1,2 o 3
SELECT nombre FROM Usuarios where activo and nivel IN(1,2,3);

#6. Listar los numeros de telefono con saldo menor o igual a 300
SELECT telefono FROM Usuarios where saldo <= 300;

#7. Calcular la suma de los saldos de los usuarios de la compañía NEXTEL
SELECT SUM(saldo) FROM Usuarios where compania= 'NEXTEL';

#8. Contar el número de usuarios por compañía telefónica
SELECT compania, COUNT(*) FROM Usuarios GROUP by compania;

#9. Contar el numero de usuarios por nivel
SELECT nivel, COUNT(*) FROM Usuarios GROUP BY nivel;

#10. Listar el login de los uusarios con nivel 2
SELECT nombre FROM Usuarios where activo and nivel=2;

#11. Mostrar el email de los usuarios que usan gmail
SELECT email FROM Usuarios where email like '%gmail.com';

#12. Listar nombre y teléfono de los usuarios con telefono LG, SAMSUNG o MOTOROLA
SELECT nombre, telefono FROM Usuarios where marca IN('LG', 'SAMSUNG', 'MOTOROLA');

#13. Listar nombre y teléfono de los usuarios que no sean de la marca LG o SAMSUNG
SELECT nombre, telefono FROM Usuarios where marca NOT IN('LG', 'SAMSUNG');

#14. Listar el login y telefono de los usuarios con compania telefonica IUSACELL
SELECT usuario, telefono FROM Usuarios where compania= 'IUSACELL';

#15. Listar el login y telefono de los usuarios con compañia IUSACELL o AXEL
SELECT usuario, telefono FROM Usuarios where compania IN('IUSACELL','AXEL');

#16. Calcular el saldo promedio de los usuarios que tienen telefono marca NOKIA
SELECT AVG(saldo) FROM Usuarios WHERE marca='NOKIA';

#17. Listar el login y telefono de los usuarios con compañia IUSACELL o AXEL
SELECT usuario, telefono FROM Usuarios where compania IN('IUSACELL', 'AXEL');

#18. Mostrar el email de los usuarios que no usan yahoo
SELECT email FROM Usuarios where email not like('%yahoo.com');

#19. Listar el loging y telefono de los usuarios con compania que no sea TELCEL o IUSACELL
SELECT usuario, telefono FROM Usuarios WHERE compania NOT IN('TELCEL','IUSACELL');

#20. Listar el loging y telefono de los usuarios con compania UNEFON
SELECT usuario, telefono FROM Usuarios WHERE compania= 'UNEFON';

#21. Listar las diferentes marcas de celular en orden alfabetico descendientemente
SELECT marca FROM Usuarios ORDER BY marca DESC;

#22. Listar las diferentes marcas aleatoriamente
SELECT DISTINCT compania FROM Usuarios ORDER BY RAND();

#23. Listar el login de los usuarios con nivel 0 o 2
SELECT usuario FROM Usuarios where nivel IN(0,2);

#24. Calcular el saldo promedio de los usuarios que tienen LG
SELECT AVG(saldo) FROM Usuarios where marca='LG';

#25. Listar el login de los usuarios con nivel 1 o 3
SELECT usuario FROM Usuarios where nivel in(1,3);

#26. Listar nombre y telefono de los usuarios con telefono que no sea de la marca blackberry
SELECT nombre, telefono FROM Usuarios where not marca='LG';

#27. Listar el login de los usuarios con nivel 3
SELECT usuario FROM Usuarios where nivel=3;

#28. Listar el login de los usuarios con nivel 0
SELECT usuario FROM Usuarios where nivel=0;

#29. Listar el login con usuarios con nivel 1
SELECT usuario FROM Usuarios where nivel=1;

#30. Contar el numero de usuarios por sexo
SELECT COUNT(*) FROM Usuarios GROUP BY sexo;

#31. Listar el login y el telefono de los usuarios con compania AT&T 
SELECT usuario,telefono FROM Usuarios where compania='AT&T';

#32. Listar las diferentes companias en orden alfabetico descendentemente
SELECT compania FROM Usuarios ORDER BY compania DESC;

#33. Listar el login de los usuarios inactivos
SELECT usuario FROM Usuarios WHERE not activo;

#34. Listar los numeros de telefono sin saldo
SELECT telefono FROM Usuarios WHERE saldo <=0;

#35. Calcular el saldo minimo de los usuarios de sexo 'Hombre'
SELECT MIN(saldo) FROM Usuarios WHERE sexo='H';

#36. Listar los numeros de telefono con saldo mayor a 300
SELECT telefono FROM Usuarios WHERE saldo >=300;

#37. Contar el numero de usuarios por marca de telefono
SELECT marca, COUNT(*) FROM Usuarios GROUP BY marca;

#38. Listar nombre y telefono de los usuarios con telefono que no sea marca LG
SELECT nombre, telefono FROM USUARIOS WHERE not marca='LG';

#39. Listar las diferentes companias en orden alfabetico ascendentemente
SELECT DISTINCT compania FROM Usuarios ORDER BY compania ASC;

#40. Calcular la suma de los saldos de los usuarios con compania UNEFON
SELECT SUM(saldo) FROM Usuarios WHERE compania='UNEFON';

#41. Mostrar el email de los usuarios que usan hotmail
SELECT email FROM Usuarios where email like'%hotmail.com';

#42. Listar los nombres de los usuarios sin saldo o inactivos
SELECT usuario FROM Usuarios where saldo <=0 or not activo;

#44. Listar las diferentes marcas de celular aleatroriamente
SELECT DISTINCT marca FROM Usuarios ORDER By  RAND();

#45. Listar el loging y telefono de los usuarios con compania IUSACELL o UNEFON
SELECT usuario, telefono FROM Usuarios WHERE compania IN('IUSACELL','UNEFON');

#46. Listar nombre y telefono de los usuarios con telfono que no sea de la marca MOTOROLA o NOKIA
SELECT nombre, telefono FROM Usuarios WHERE marca NOT IN('MOTOROLA','NOKIA');

#47. Calcular suma de saldos usuarios con TELCEL
SELECT SUM(saldo) FROM Usuarios WHERE compania= 'TELCEL';

