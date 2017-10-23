<%-- 
    Document   : sql
    Created on : Jul 19, 2017, 9:30:35 PM
    Author     : nishu

create databse st;

DROP TABLE IF EXISTS `st`.`countryid`;
CREATE TABLE `countryid` (
  `CountryId` int(10) unsigned NOT NULL auto_increment,
  `CountryName` varchar(20) character set latin1 collate latin1_bin default NULL,
  PRIMARY KEY  (`CountryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `st`.`stateid`;
CREATE TABLE `stateid` (
  `StateId` int(10) unsigned NOT NULL auto_increment,
  `StateName` varchar(20) NOT NULL,
  `CountryName` varchar(20) NOT NULL,
  PRIMARY KEY  (`StateId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



DROP TABLE IF EXISTS `st`.`cityid`;
CREATE TABLE `cityid` (
  `CityId` int(10) unsigned NOT NULL auto_increment,
  `CityName` varchar(45) NOT NULL,
  `StateName` varchar(45) NOT NULL,
  PRIMARY KEY  (`CityId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
