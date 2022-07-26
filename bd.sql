/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.31-MariaDB : Database - kevindamian2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kevindamian2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `kevindamian2`;

/*Table structure for table `butaca` */

DROP TABLE IF EXISTS `butaca`;

CREATE TABLE `butaca` (
  `nbutaca` char(20) NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nbutaca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `butaca` */

insert  into `butaca`(`nbutaca`,`estado`) values ('AS001','Ocupado'),('AS0010','Ocupado'),('AS0011','Ocupado'),('AS0012','Ocupado'),('AS0013','Disponible'),('AS0014','Disponible'),('AS0015','Disponible'),('AS0016','Disponible'),('AS0017','Disponible'),('AS0018','Disponible'),('AS002','Disponible'),('AS003','Disponible'),('AS004','Disponible'),('AS005','Disponible'),('AS006','Disponible'),('AS007','Disponible'),('AS008','Disponible'),('AS009','Disponible');

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `idcliente` char(20) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `dni` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cliente` */

insert  into `cliente`(`idcliente`,`nombre`,`direccion`,`telefono`,`dni`) values ('CLI001','Diana Alvarado Rodriguez','Piura','987654567','78987654'),('CLI002','Kevin Roger ','Chulucanas','928238964','77097355'),('CLI003','Diana Alvarado Sanchez','Chulucanas','967532456','7010123'),('CLI004','Samir Bayona Gonzales','Chulucanas','987656789','7010123'),('CLI005','Marha Gonzales ramos','Chulucanas','967532456','7010123'),('CLI006','Kevin Sanchez Garcia','Piura','987650987','78945321'),('CLI007','Jeampier Moreno','Castilla','987609342','77865436');

/*Table structure for table `detalle_ventape` */

DROP TABLE IF EXISTS `detalle_ventape`;

CREATE TABLE `detalle_ventape` (
  `iddetalle_ventape` char(20) NOT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  `cantidad` decimal(9,2) DEFAULT NULL,
  `valor_venta` decimal(9,2) DEFAULT NULL,
  `idventa` char(20) NOT NULL,
  `idpelicula` char(20) NOT NULL,
  `nbutaca` char(20) DEFAULT NULL,
  KEY `fk_detalle_ventape_ventapeli1_idx` (`idventa`),
  KEY `fk_detalle_ventape_ pelicula1_idx` (`idpelicula`),
  KEY `nbutaca` (`nbutaca`),
  CONSTRAINT `detalle_ventape_ibfk_1` FOREIGN KEY (`nbutaca`) REFERENCES `butaca` (`nbutaca`),
  CONSTRAINT `fk_detalle_ventape_ pelicula1` FOREIGN KEY (`idpelicula`) REFERENCES `pelicula` (`idpelicula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_ventape_ventapeli1` FOREIGN KEY (`idventa`) REFERENCES `ventapeli` (`idventa`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `detalle_ventape` */

insert  into `detalle_ventape`(`iddetalle_ventape`,`precio`,`cantidad`,`valor_venta`,`idventa`,`idpelicula`,`nbutaca`) values ('D001',5.00,1.00,5.00,'B001','PE002','AS002'),('D002',5.00,1.00,5.00,'B002','PE002','AS001'),('D003',12.00,1.00,12.00,'B002','PE001','AS003'),('D004',12.00,1.00,12.00,'B004','PE001','AS004'),('D005',12.00,1.00,12.00,'B005','PE001','AS005'),('D006',15.00,1.00,15.00,'B003','PE003','AS004'),('D007',12.00,1.00,12.00,'B006','PE001','AS005'),('D008',15.00,1.00,15.00,'B003','PE003','AS004'),('D009',5.00,1.00,5.00,'B003','PE002','AS002'),('D010',5.00,1.00,5.00,'B007','PE002','AS0010'),('D011',15.00,1.00,15.00,'B008','PE003','AS001'),('D012',15.00,1.00,15.00,'B009','PE003','AS0011'),('D013',15.00,1.00,15.00,'B010','PE003','AS0012');

/*Table structure for table `detalle_ventapro` */

DROP TABLE IF EXISTS `detalle_ventapro`;

CREATE TABLE `detalle_ventapro` (
  `iddetalle_ventapro` char(20) NOT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  `cantidad` decimal(9,2) DEFAULT NULL,
  `valor_venta` decimal(9,2) DEFAULT NULL,
  `idproducto` char(20) NOT NULL,
  `idventapro` char(20) NOT NULL,
  KEY `fk_detalle_ventapro_producto1_idx` (`idproducto`),
  KEY `fk_detalle_ventapro_ventapro1_idx` (`idventapro`),
  CONSTRAINT `fk_detalle_ventapro_producto1` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_ventapro_ventapro1` FOREIGN KEY (`idventapro`) REFERENCES `ventapro` (`idventapro`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `detalle_ventapro` */

insert  into `detalle_ventapro`(`iddetalle_ventapro`,`precio`,`cantidad`,`valor_venta`,`idproducto`,`idventapro`) values ('D001',10.00,1.00,10.00,'PRO001','BO001'),('D002',10.00,2.00,20.00,'PRO002','BO003'),('D003',10.00,1.00,10.00,'PRO002','BO004'),('D004',30.00,1.00,30.00,'PRO003','BO002'),('D005',10.00,2.00,20.00,'PRO002','BO005'),('D006',30.00,1.00,30.00,'PRO003','BO001'),('D007',10.00,2.00,20.00,'PRO002','BO006'),('D008',10.00,2.00,20.00,'PRO002','BO007');

/*Table structure for table `detallecompra` */

DROP TABLE IF EXISTS `detallecompra`;

CREATE TABLE `detallecompra` (
  `iddetallecompra` char(20) NOT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `total` decimal(9,2) DEFAULT NULL,
  `idproducto` char(20) NOT NULL,
  `idproveedor` char(20) NOT NULL,
  PRIMARY KEY (`iddetallecompra`),
  KEY `fk_detallecompra_producto1_idx` (`idproducto`),
  KEY `fk_detallecompra_proveedor1_idx` (`idproveedor`),
  CONSTRAINT `fk_detallecompra_producto1` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detallecompra_proveedor1` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`idproveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `detallecompra` */

insert  into `detallecompra`(`iddetallecompra`,`precio`,`cantidad`,`total`,`idproducto`,`idproveedor`) values ('C001',5.00,10,50.00,'PRO001','P002'),('C002',5.00,20,100.00,'PRO002','P002'),('C003',15.00,30,450.00,'PRO003','P001'),('C004',5.00,10,50.00,'PRO004','P001'),('C005',10.00,50,500.00,'PRO005','P002'),('C006',10.00,30,300.00,'PRO006','P002'),('C007',10.00,20,200.00,'PRO007','P002'),('C008',15.00,10,150.00,'PRO008','P002');

/*Table structure for table `genero` */

DROP TABLE IF EXISTS `genero`;

CREATE TABLE `genero` (
  `idgenero` char(20) NOT NULL,
  `genero` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idgenero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `genero` */

insert  into `genero`(`idgenero`,`genero`) values ('GE001','Dramas'),('GE002','Terror'),('GE003','Comedia'),('GE004','Accion');

/*Table structure for table `pelicula` */

DROP TABLE IF EXISTS `pelicula`;

CREATE TABLE `pelicula` (
  `idpelicula` char(20) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `duracion` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `año` varchar(45) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `protagonistas` varchar(45) DEFAULT NULL,
  `idgenero` char(20) NOT NULL,
  `hora_c` char(20) DEFAULT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  `nsala` char(20) DEFAULT NULL,
  PRIMARY KEY (`idpelicula`),
  KEY `fk_ pelicula_genero_idx` (`idgenero`),
  KEY `nsala` (`nsala`),
  CONSTRAINT `fk_ pelicula_genero` FOREIGN KEY (`idgenero`) REFERENCES `genero` (`idgenero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pelicula_ibfk_1` FOREIGN KEY (`nsala`) REFERENCES `sala` (`nsala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pelicula` */

insert  into `pelicula`(`idpelicula`,`nombre`,`duracion`,`pais`,`año`,`director`,`protagonistas`,`idgenero`,`hora_c`,`precio`,`nsala`) values ('PE001','Choky 3','150 minutos','Europa','2017','Kevin Damian','Marck Garces, etc','GE001','5.00 pm',12.00,'S1001'),('PE002','LA MONJA','150 minutos','Peru','2017','Juan Ramirez','Yo y Ella','GE001','5:00 PM',5.00,'S1002'),('PE003','ASU MARE','2 Horas','Peru','2018','Segundo Ramirez','Carlos Alcantara','GE003',' 3:00 pm',15.00,'S1003'),('PE004','Mision Submarino','160 minutos','EEUU','2018','Jhon Lenon','Cris Edd, Mark Zucar','GE002','4:00 pm',15.00,'S1004'),('PE005','COCO','2 horas','Europa','2018','Juan Farias','Javier Pacheco','GE001','3:00 pm',10.00,'S1005');

/*Table structure for table `producto` */

DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `idproducto` char(20) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `fechav` date DEFAULT NULL,
  `presentacion` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='	';

/*Data for the table `producto` */

insert  into `producto`(`idproducto`,`descripcion`,`precio`,`stock`,`fechav`,`presentacion`,`estado`,`observacion`) values ('PRO001','Gaseosa Coca Cola',10.00,50,'2020-12-09','En Botella',' Todo bien','Sin Observacion'),('PRO002','Combo Personal',10.00,20,'2019-01-02','En caja','Todo bien','En observacion'),('PRO003','Combo Familiar',30.00,30,'2019-01-02','En caja','Todo bien','En observacion'),('PRO004','Gaseosa Inka Kola',10.00,10,'2018-12-12','En Botella','Todo Ok','Sin Observacion'),('PRO005','Gaseosa Peru Cola',20.00,50,'2020-12-09','En Botella','ok','Sin Observacion'),('PRO006','Combo Mixto',20.00,30,'2018-12-12','Caja','Todo Ok','Sin Observacion'),('PRO007','Gaseosa Peru cola',20.00,20,'2018-12-12','En Botella','Todo Ok','Sin Observacion'),('PRO008','Combo personal',30.00,10,'2018-12-12','Caja','Todo Ok','Sin Observacion');

/*Table structure for table `proveedor` */

DROP TABLE IF EXISTS `proveedor`;

CREATE TABLE `proveedor` (
  `idproveedor` char(20) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idproveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `proveedor` */

insert  into `proveedor`(`idproveedor`,`nombre`,`direccion`,`telefono`) values ('P001','Ana Chavez Risco','Chulucanas','987654345'),('P002','Gabriel Orozco','Paita','928467535'),('P003','Diana Alvarado Sanchez','Chulucanas','967532456');

/*Table structure for table `sala` */

DROP TABLE IF EXISTS `sala`;

CREATE TABLE `sala` (
  `nsala` char(20) NOT NULL,
  `capacidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nsala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sala` */

insert  into `sala`(`nsala`,`capacidad`) values ('S1001','40 personas'),('S1002','40 personas'),('S1003','40 personas'),('S1004','40 personas'),('S1005','40 personas');

/*Table structure for table `tipo_documento` */

DROP TABLE IF EXISTS `tipo_documento`;

CREATE TABLE `tipo_documento` (
  `idtipo_documento` char(20) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtipo_documento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='	';

/*Data for the table `tipo_documento` */

insert  into `tipo_documento`(`idtipo_documento`,`tipo`) values ('TIP001','Boleta'),('TIP002','Factura');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `idusuario` char(20) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `dni` varchar(45) DEFAULT NULL,
  `cargo` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `nivel` int(11) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `usuario` */

insert  into `usuario`(`idusuario`,`nombre`,`telefono`,`dni`,`cargo`,`usuario`,`contraseña`,`nivel`) values ('USU001','Kevin Damian Gonzale','976543467','7010123','Administrador','kevin','123',1),('USU002','Jose Maza','987645239','76598754','Vendedor','jos','1234',2),('USU003','Cristian Garcia','987645239','76598754','Vendedor Productos','cristian','123456',3),('USU004','Gabriela Bautista','987656789','78965345','Vendedor','gabi','123',2);

/*Table structure for table `ventapeli` */

DROP TABLE IF EXISTS `ventapeli`;

CREATE TABLE `ventapeli` (
  `idventa` char(20) NOT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `subtotal` decimal(9,2) DEFAULT NULL,
  `igv` decimal(9,2) DEFAULT NULL,
  `total` decimal(9,2) DEFAULT NULL,
  `idcliente` char(20) NOT NULL,
  `idusuario` char(20) NOT NULL,
  PRIMARY KEY (`idventa`),
  KEY `fk_ventapeli_cliente1_idx` (`idcliente`),
  KEY `fk_ventapeli_usuario1_idx` (`idusuario`),
  CONSTRAINT `fk_ventapeli_cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ventapeli_usuario1` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ventapeli` */

insert  into `ventapeli`(`idventa`,`documento`,`fecha`,`subtotal`,`igv`,`total`,`idcliente`,`idusuario`) values ('B001','Boleta','2018-12-12',4.24,0.76,5.00,'CLI002','USU002'),('B002','Boleta','2018-12-12',14.41,2.59,17.00,'CLI002','USU001'),('B003','Boleta','2018-12-12',29.66,5.34,35.00,'CLI002','USU001'),('B004','Boleta','2018-12-12',10.17,1.83,12.00,'CLI003','USU001'),('B005','Boleta','2018-12-12',10.17,1.83,12.00,'CLI001','USU001'),('B006','Boleta','2018-12-12',10.17,1.83,12.00,'CLI003','USU003'),('B007','Boleta','2018-12-12',4.24,0.76,5.00,'CLI001','USU001'),('B008','Boleta','2018-12-12',12.71,2.29,15.00,'CLI002','USU002'),('B009','Boleta','2018-12-10',12.71,2.29,15.00,'CLI006','USU002'),('B010','Boleta','2018-12-12',12.71,2.29,15.00,'CLI001','USU002');

/*Table structure for table `ventapro` */

DROP TABLE IF EXISTS `ventapro`;

CREATE TABLE `ventapro` (
  `idventapro` char(20) NOT NULL,
  `serie` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `sub_total` decimal(9,2) DEFAULT NULL,
  `igv` decimal(9,2) DEFAULT NULL,
  `total` decimal(9,2) DEFAULT NULL,
  `idcliente` char(20) NOT NULL,
  `idusuario` char(20) NOT NULL,
  PRIMARY KEY (`idventapro`),
  KEY `fk_ventapro_cliente1_idx` (`idcliente`),
  KEY `fk_ventapro_usuario1_idx` (`idusuario`),
  CONSTRAINT `fk_ventapro_cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ventapro_usuario1` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ventapro` */

insert  into `ventapro`(`idventapro`,`serie`,`fecha`,`estado`,`sub_total`,`igv`,`total`,`idcliente`,`idusuario`) values ('BO001','Boleta','2018-12-12','Todo Ok',33.90,6.10,40.00,'CLI002','USU001'),('BO002','Boleta','2018-12-12','ok',25.42,4.58,30.00,'CLI002','USU001'),('BO003','Boleta','2018-12-12','ok',16.95,3.05,20.00,'CLI003','USU001'),('BO004','Boleta','2018-12-12','Todo Ok',8.47,1.53,10.00,'CLI002','USU002'),('BO005','Boleta','2018-12-12','ok',16.95,3.05,20.00,'CLI005','USU003'),('BO006','Boleta','2018-10-12','Todo Ok',16.95,3.05,20.00,'CLI003','USU003'),('BO007','Boleta','2018-12-12','Todo Ok',16.95,3.05,20.00,'CLI002','USU003');

/* Procedure structure for procedure `sp_compra` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_compra` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_compra`( pr decimal(9,2), c int , idp char(20),idpr char(20)  )
BEGIN
    declare id char(20);
    DECLARE v DECIMAL(9,2);
    declare codp char(20);
    declare codpr char(20);
    select idproducto into codp from producto where idproducto=idp;
    select idproveedor into codpr from proveedor where idproveedor=idpr;
    
    
    SET id=(SELECT CONCAT('C',RIGHT(CONCAT('00',MAX(SUBSTRING(iddetallecompra,2)+1)),3))
	FROM detallecompra);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='C001';
		END;
	END IF;
	
	
	
	SET v = pr*c;
	INSERT INTO detallecompra (iddetallecompra,precio,
	cantidad,total,idproducto,idproveedor)
	VALUES(id,pr,c,v,codp,codpr);
	
	update producto	
	set precio = (pr *2),
	stock=c
	where idproducto=codp; 
	
	
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_detallepeli` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_detallepeli` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_detallepeli`( can decimal(9,2), idv char(20),idp char(20), idb char(20) )
BEGIN
	declare id char(20);
	declare codb char(20);
	DECLARE t DECIMAL(9,2);
	DECLARE v DECIMAL(9,2);
	DECLARE pr DECIMAL(9,2);
	SELECT precio INTO pr FROM pelicula
	WHERE idpelicula=idp;
	select nbutaca INTO codb from butaca  where nbutaca=idb;
	
	SET id=(SELECT CONCAT('D',RIGHT(CONCAT('00',MAX(SUBSTRING(iddetalle_ventape,2)+1)),3))
	FROM detalle_ventape);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='D001';
		END;
	END IF;
	
	SET v = pr*can;
	INSERT INTO detalle_ventape(iddetalle_ventape,precio,
	cantidad,valor_venta,idventa,idpelicula,nbutaca)
	VALUES(id,pr,can,v,idv,idp,idb);
	
	
	
	SELECT SUM(valor_venta) INTO t
	 FROM detalle_ventape
	 where idventa=idv;
	 UPDATE ventapeli SET total=t,
	 subtotal=(t / 1.18),
	 igv=(t/1.18) * 0.18
	 where idventa=idv;
	 
	 update butaca
	 set estado='Ocupado'
	 where nbutaca=idb;
	 
	 update ventapeli
	 set documento='Boleta'
	 where idventa=idv;
	 
	 update ventapeli
	 set idventa = replace(idventa,"T","B" )
	 where idventa=idv;	 
	 
	 
	 
	 
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarbutaca` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarbutaca` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarbutaca`( id char(20))
BEGIN
    delete from butaca
    where nbutaca=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarcliente` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarcliente` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarcliente`( id char(20))
BEGIN
    delete from cliente
    where idcliente=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminargenero` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminargenero` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminargenero`( id char(20))
BEGIN
    delete from genero
    where idgenero=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarpelicula` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarpelicula` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarpelicula`(id char(20))
BEGIN
    delete from pelicula
    where idpelicula=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarproducto` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarproducto` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarproducto`( id char(20))
BEGIN
    delete from producto
    where idproducto=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarproveedor` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarproveedor` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarproveedor`(id char(20))
BEGIN
    delete from proveedor
    where idproveedor=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarsala` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarsala` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarsala`(id varchar(20))
BEGIN
    delete from sala
    where nsala=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_eliminarusuario` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_eliminarusuario` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarusuario`( id char(20))
BEGIN
    delete from usuario
    where idusuario=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_detallepro` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_detallepro` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_detallepro`( can decimal(9,2), idp char(20), idv char(20) )
begin
	DECLARE id CHAR(20);
	DECLARE t DECIMAL(9,2);
	DECLARE v DECIMAL(9,2);
	DECLARE pr DECIMAL(9,2);
	SELECT precio INTO pr FROM producto
	WHERE idproducto=idp;
	
	SET id=(SELECT CONCAT('D',RIGHT(CONCAT('00',MAX(SUBSTRING(iddetalle_ventapro,2)+1)),3))
	FROM detalle_ventapro);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='D001';
		END;
	END IF;
	
	SET v = pr*can;
	
	INSERT INTO detalle_ventapro(iddetalle_ventapro,precio,
	cantidad,valor_venta,idproducto,idventapro)
	VALUES(id,pr,can,v,idp,idv);
	
	
	SELECT SUM(valor_venta) INTO t
	 FROM detalle_ventapro
	 WHERE idventapro=idv;
	 
	 UPDATE ventapro SET total=t,
	 sub_total=(t / 1.18),
	 igv=(t/1.18) * 0.18
	 WHERE idventapro=idv;
	 
	 UPDATE ventapro
	 SET serie='Boleta'
	 WHERE idventapro=idv;
	
	UPDATE ventapro
	 SET idventapro= REPLACE(idventapro,"RE","BO" )
	 WHERE idventapro=idv;
	
	
    
    
    
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarbutaca` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarbutaca` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarbutaca`( est varchar(45) )
BEGIN
      DECLARE id CHAR(20);
	SET id=(SELECT CONCAT('AS',RIGHT(CONCAT('00',MAX(SUBSTRING(nbutaca,4)+1)),6))
	FROM butaca);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='AS001';
		END;
	END IF;
	INSERT INTO butaca(nbutaca,estado)
	VALUES(id,est);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarcliente` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarcliente` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarcliente`(n varchar(45),dir varchar(45),tel varchar(10),dni char(8))
BEGIN
    DECLARE id CHAR(20);
	SET id=(SELECT CONCAT('CLI',RIGHT(CONCAT('00',MAX(SUBSTRING(idcliente,4)+1)),6))
	FROM cliente);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='CLI001';
		END;
	END IF;
	INSERT INTO cliente(idcliente,nombre,direccion,telefono,dni)
	VALUES(id,n,dir,tel,dni);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresargenero` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresargenero` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresargenero`(gen varchar(45))
BEGIN
    DECLARE id CHAR(20);
	SET id=(SELECT CONCAT('GE',RIGHT(CONCAT('00',MAX(SUBSTRING(idgenero,4)+1)),6))
	FROM genero);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='GE001';
		END;
	END IF;
	INSERT INTO genero(idgenero,genero)
	VALUES(id,gen);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarpelicula` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarpelicula` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarpelicula`(nom varchar(45),dur varchar(45),pai varchar(45),añ varchar(45),
    dire varchar(45),prota varchar(45),idg char(20),hc varchar(20), pre decimal(9,2) ,	ids char(20) )
BEGIN
	DECLARE id CHAR(20);
	DECLARE codg CHAR(20);
	declare cods char(20);
	SELECT idgenero INTO codg FROM genero WHERE idgenero=idg;
	select nsala into cods from sala where nsala=ids;
	
	SET id=(SELECT CONCAT('PE',RIGHT(CONCAT('00',
	MAX(SUBSTRING(idpelicula,4)+1)),6))FROM
	pelicula);
	
	IF ISNULL(id) THEN
		BEGIN
			SET id='PE001';
		END;
	END IF;
	INSERT INTO pelicula (idpelicula,nombre,duracion, pais,año,director,
	protagonistas,idgenero,hora_c,precio,nsala)
	VALUES(id,nom,dur,pai,añ,dire,prota,codg,hc,pre,cods);
	
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarproducto` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarproducto` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarproducto`(des varchar(45),pr decimal(9,2),st int, fe date,
    pre varchar(45),est varchar(45),obs varchar(45) )
BEGIN
    declare id char(20);
   
	
    	SET id=(SELECT CONCAT('PRO',RIGHT(CONCAT('00',MAX(SUBSTRING(idproducto,4)+1)),6)  )
    FROM producto  );
    IF ISNULL (id) THEN
    BEGIN
    SET id='PRO001';
    END;
    END IF;
    INSERT INTO producto (idproducto, descripcion,precio,stock,fechav,presentacion,estado,observacion)
    VALUES(id,des,pr,st,fe,pre,est,obs);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarproveedor` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarproveedor` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarproveedor`(nom varchar(45),dir varchar(45),tel varchar(45) )
BEGIN
    DECLARE id CHAR(20);
	
	
	SET id=(SELECT CONCAT('P',RIGHT(CONCAT('000',
	MAX(SUBSTRING(idproveedor,2)+1)),3))FROM
	proveedor);
	
	IF ISNULL(id) THEN
		BEGIN
			SET id='P001';
		END;
	END IF;
	INSERT INTO proveedor (idproveedor,nombre,direccion,telefono)
	VALUES(id,nom,dir,tel);
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarsala` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarsala` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarsala`(cap varchar(20) )
BEGIN
    DECLARE id CHAR(20);
	SET id=(SELECT CONCAT('S1',RIGHT(CONCAT('000',MAX(SUBSTRING(nsala,2)+1)),3))
	FROM sala);
	
	IF ISNULL(id) THEN
		BEGIN
		SET id='S1001';
		END;
	END IF;
	INSERT INTO sala(nsala,capacidad)
	VALUES(id,cap);
    
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresartipodocumento` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresartipodocumento` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresartipodocumento`(t varchar(45))
BEGIN
     DECLARE id CHAR(20);
    SET id=(SELECT CONCAT('TIP',RIGHT(CONCAT('00',MAX(SUBSTRING(idtipo_documento,4)+1)),6)  )
    FROM tipo_documento  );
    IF ISNULL (id) THEN
    BEGIN
    SET id='TIP001';
    END;
    END IF;
    INSERT INTO tipo_documento (idtipo_documento,tipo)
    VALUES(id,t);
    
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ingresarusuario` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ingresarusuario` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarusuario`(nom varchar(45),tel char(10),dn char(8),cr varchar(45),
     us varchar(45),con varchar(45), n int )
BEGIN
    declare id char(20);
    set id=(select concat('USU',RIGHT(CONCAT('00',MAX(substring(idusuario,4)+1)),6)  )
    from usuario  );
    IF ISNULL (id) then
    begin
    set id='USU001';
    END;
    END IF;
    INSERT INTO usuario (idusuario, nombre,telefono,dni,cargo,usuario,contraseña,nivel)
    values(id,nom,tel,dn,cr,us,con,n);
    
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarbutaca` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarbutaca` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarbutaca`( id char(20),est varchar(45))
BEGIN
    update butaca 
    set estado=est
    where nbutaca=id;
    
    update butaca
    set  estado='Disponible';
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarcliente` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarcliente` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarcliente`(id char(20),n varchar(45),dir varchar(45),tel varchar(10), dn char(8))
BEGIN
    update cliente 
    set nombre=n,
    direccion=dir,
    telefono=tel,
    dni=dn 
    where idcliente=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificargenero` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificargenero` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificargenero`( id char(20), g varchar(45))
BEGIN
    update genero
    set genero=g where idgenero=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarpelicula` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarpelicula` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarpelicula`( idp char(20),  nom VARCHAR(45),dur VARCHAR(45),pai VARCHAR(45),añ VARCHAR(45),
    dire VARCHAR(45),prota VARCHAR(45),idg CHAR(20),hc VARCHAR(20),pr decimal(9,2) , ns char(20) )
BEGIN
    update pelicula 
    set nombre=nom,duracion=dur,pais=pai,año=añ,
    director=dire,protagonistas=prota,idgenero=idg,hora_c=hc,precio=pr , nsala=ns
    where idpelicula=idp;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarproducto` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarproducto` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarproducto`(id char(20),des VARCHAR(45),pr DECIMAL(9,2),st INT, fe DATE,
    pre VARCHAR(45),est VARCHAR(45),obs VARCHAR(45))
BEGIN
    update producto
    set descripcion=des, precio=pr,stock=st,fechav=fe,presentacion=pre,
    estado=est,observacion=obs
    where idproducto=id;
    
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarproveedor` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarproveedor` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarproveedor`(id char(20),nom VARCHAR(45),dir VARCHAR(45),tel VARCHAR(45))
BEGIN
    update proveedor
    set nombre=nom,direccion=dir,telefono=tel
    where idproveedor=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarsala` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarsala` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarsala`( id char(20), n varchar(45) )
BEGIN
    update sala
    set capacidad=n
    where nsala=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarusuario` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarusuario` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarusuario`(id char(20),nom VARCHAR(45),tel CHAR(10),dn CHAR(8),cr VARCHAR(45),
     us VARCHAR(45),con VARCHAR(45), n int)
BEGIN
    update usuario
    set nombre=nom,
    telefono=tel,dni=dn,
    cargo=cr,usuario=us,contraseña=con,
    nivel=n
    where idusuario=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarventapelicula` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarventapelicula` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarventapelicula`(id char(20),doc VARCHAR(45), fec DATE,sub DECIMAL(9,2),ig DECIMAL(9,2),
    tot DECIMAL(9,2), idc CHAR(20),idu CHAR(20))
BEGIN
    update ventapeli 
    set documento=doc,
    fecha=fec,
    subtotal=sub,
    igv=ig,
    total=tot,
    idcliente=idc,
    idusuario=idu
    where idventa=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_modificarventaproducto` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_modificarventaproducto` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarventaproducto`(id char(20), se VARCHAR(20),fec DATE , est VARCHAR(45),st DECIMAL(9,2),ig DECIMAL(9,2),
    t DECIMAL(9,2), idc CHAR(20),idu CHAR(20) )
BEGIN
    update ventapro
    set serie=se, fecha=fec, estado=est,
    sub_total=st,igv=ig,total=t,idcliente=idc,idusuario=idu
    where idventapro=id;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ticketpelicula` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ticketpelicula` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ticketpelicula`( idven char(10) )
BEGIN
    
    
    SELECT pe.nombre ,pe.duracion,pe.hora_c, dvp.cantidad, sa.nsala,
dvp.nbutaca,
dvp.precio,dvp.valor_venta,vp.idcliente,vp.idusuario 
FROM ventapeli AS vp INNER JOIN detalle_ventape AS dvp ON vp.idventa=dvp.idventa 
INNER JOIN pelicula AS pe ON pe.idpelicula=dvp.idpelicula 
INNER JOIN genero AS ge ON ge.idgenero=pe.idgenero
INNER JOIN sala AS sa ON sa.nsala=pe.nsala 
INNER JOIN cliente AS cl ON cl.idcliente=vp.idcliente 
INNER JOIN usuario AS us ON us.idusuario=vp.idusuario 
WHERE vp.idventa=idven;
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ventapelicula` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ventapelicula` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ventapelicula`( doc varchar(45), fec date,sub decimal(9,2),ig decimal(9,2),
    tot decimal(9,2), idc char(20),idu char(20) )
BEGIN
    DECLARE id CHAR(20);
	DECLARE codc CHAR(20);
	DECLARE codu CHAR(20);
	SELECT idcliente INTO codc FROM cliente WHERE idcliente=idc;
	SELECT idusuario INTO codu FROM usuario WHERE usuario=idu;
	
	SET id=(SELECT CONCAT('T',RIGHT(CONCAT('000',MAX(SUBSTRING(idventa,2)+1)),3))FROM ventapeli);
	
	IF ISNULL(id) THEN
		BEGIN
			SET id='T001';
		END;
	END IF;
	
	INSERT INTO ventapeli(idventa,documento,fecha,subtotal,igv,total,idcliente,idusuario)
	VALUES(id,doc,fec,sub,ig,tot,idc,idu);
	
	
    END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_ventaproducto` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_ventaproducto` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ventaproducto`( se varchar(20),fec date , est varchar(45),st decimal(9,2),ig decimal(9,2),
    t decimal(9,2), idc char(20),idu char(20) )
BEGIN
    DECLARE id CHAR(20);
	DECLARE codc CHAR(20);
	DECLARE codu CHAR(20);
	
	SELECT idcliente INTO codc FROM cliente WHERE idcliente=idc;
	SELECT idusuario INTO codu FROM usuario WHERE idusuario=idu;
	
	
	
	SET id=(SELECT CONCAT('RE',RIGHT(CONCAT('00',
	MAX(SUBSTRING(idventapro,4)+1)),6))FROM
	ventapro);
	
	IF ISNULL(id) THEN
		BEGIN
			SET id='RE001';
		END;
	END IF;
	INSERT INTO ventapro (idventapro,serie,fecha, estado,sub_total,igv,
	total,idcliente,idusuario)
	VALUES(id,se,fec,est,st,ig,t,idc,idu);
	
    END */$$
DELIMITER ;

/*Table structure for table `v_productos` */

DROP TABLE IF EXISTS `v_productos`;

/*!50001 DROP VIEW IF EXISTS `v_productos` */;
/*!50001 DROP TABLE IF EXISTS `v_productos` */;

/*!50001 CREATE TABLE  `v_productos`(
 `codigo` char(20) ,
 `descripcion` varchar(45) ,
 `precio` decimal(9,2) ,
 `stock` int(11) ,
 `fecha` date ,
 `presentacion` varchar(45) ,
 `estado` varchar(45) ,
 `observacion` varchar(45) 
)*/;

/*View structure for view v_productos */

/*!50001 DROP TABLE IF EXISTS `v_productos` */;
/*!50001 DROP VIEW IF EXISTS `v_productos` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_productos` AS (select `p`.`idproducto` AS `codigo`,`p`.`descripcion` AS `descripcion`,`p`.`precio` AS `precio`,`p`.`stock` AS `stock`,`p`.`fechav` AS `fecha`,`p`.`presentacion` AS `presentacion`,`p`.`estado` AS `estado`,`p`.`observacion` AS `observacion` from `producto` `p`) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
