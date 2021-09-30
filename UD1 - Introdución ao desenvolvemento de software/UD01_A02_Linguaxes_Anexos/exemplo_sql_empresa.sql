CREATE DATABASE  `empresa` ;

USE `empresa`;

CREATE TABLE `centros` (
  `cen_num` int(11) NOT NULL default '0',
  `cen_nom` char(30) default NULL,
  `cen_dir` char(30) default NULL,
  UNIQUE KEY `numcen` (`cen_num`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `centros` VALUES 	(10,'SEDE CENTRAL','C/ ALCALA, 820-MADRID'),
								(20,'RELACION CON CLIENTES','C/ ATOCHA, 405-MADRID');
 CREATE TABLE `deptos` (
  `dep_num` int(11) NOT NULL default '0',
  `dep_cen` int(11) NOT NULL default '0',
  `dep_dire` int(11) NOT NULL default '0',
  `dep_tipodir` char(1) default NULL,
  `dep_presu` decimal(9,2) default NULL,
  `dep_depen` int(11) default NULL,
  `dep_nom` char(20) default NULL,
  UNIQUE KEY `numdep` (`dep_num`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `deptos` VALUES (122,10,350,'F','60000.00',120,'PROCESO DE DATOS'),
							(121,10,110,'P','200000.00',120,'PERSONAL'),
							(120,10,150,'P','30000.00',100,'ORGANIZACION'),
							(112,20,270,'F','90000.00',110,'SECTOR SERVICIOS'),
							(111,20,400,'P','111000.00',110,'SECTOR INDUSTRIAL'),
							(110,20,180,'P','15000.00',100,'DIRECCION COMERCIAL'),
							(130,10,310,'P','20000.00',100,'FINANZAS'),
							(200,20,600,'F','80000.00',100,'TRANSPORTES'),
							(100,10,260,'P','120000.00',NULL,'DIRECCION GENERAL');
