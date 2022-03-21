<%-- 
    Document   : Listas
    Created on : 03/08/2014, 10:02:14 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listas</title>
    </head>
    <body background="fondo1.jpg" text="blue">
        <h1>Listas Desordenadas</h1>
        Paises
        <ul type="circle">
            <li>Perú</li>
            <li>Argentina</li>
            <li>Brasil</li>
            <li>Colombia</li>
        </ul>
        <h1>Listas Ordenadas</h1>
        Jugadores
        <ol type="1">
            <li>Pizarro</li>
            <li>Messi</li>
            <li>Ronaldo</li>
            <li>Neymar</li>
            <li>Robbens</li>
        </ol>
        Equipos
        <ol type="A">
            <li>Alianza</li>
            <li>Universitario</li>
            <li>Cristal</li>
            <li>Vallejo</li>
            <li>SanMartin</li>
        </ol>
        <h1>Listas Multinivel</h1>
        <ol type="I">
            <li>Capitulo Primero</li>
            <ol type="A">
                <li>Conceptos Basicos</li>
                <ol type="1">
                    <li>Internet</li>
                    <li>Protocolos</li>
                    <li>Servicios</li>
                    <ul type="disc">
                        <li>WWW</li>
                        <li>Email</li>
                        <li>Telnet</li>
                        <li>Chat</li>
                    </ul>
                </ol>
                <li>Programacion</li>
                <ol type="1">
                    <li>Java Script</li>
                    <li>C++</li>
                </ol>
            </ol>
            <li>Capitulo Segundo</li>
        </ol>
        <h1>Listas de definicion (Vocabularios o Glosarios)</h1>
        <dl>
            <dt>Hardware</dt>
            <dd>Es la parte fisica del computador, formado por la Unidad Central de Proceso o Microprocesador,
            las memorias RAM y ROM, los Buses de datos y los Dispositivos Perifericos adicionalmente tambien
            lo componen los dispositivos de almacenamiento y multimedia</dd>
            <dt>Software</dt>
            <dd>Es la parte logica del computador formada por los programas y archivos instalados en la PC,
            El software mas importante es el sistema operativo, los lenguajes de programacion, los programas 
            de diseño, las aplicaciones comerciales, las bases de datos y el software creado por los usuarios</dd>
            <dt>Redes</dt>
            <dd>Son un conjunto de dispositivos conectados mediante cables de red o en forma inhalambrica
            para compartir informacion entre ellos. las redes pueden ser locales, departamentales o entre paises
            o a nivel mundial como Internet</dd>
        </dl>
    </body>
</html>
