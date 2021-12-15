# IBAN Validator
IBAN Validator project


# Build and run
```
$ mvn install
$ mvn spring-boot:run
```
Then use one of the below or replace {IBAN} with the IBAN-number you would like to test.
```
$ curl http://localhost:8080/iban?ibannumber=ES79 2100 0813 6101 2345 6789
$ curl http://localhost:8080/iban?ibannumber=GB98 MIDL 0700 9312 3456 78
$ curl http://localhost:8080/iban?ibannumber={IBAN}
```

Formatted IBAN examples:

| Country |	IBAN formatting example |
| ------- | ------------------------|
|	Belgium	|	BE71 0961 2345 6769	|
|	Brazil	|	BR15 0000 0000 0000 1093 2840 814 P2	|
|	Costa Rica	|	CR99 0000 0000 0000 8888 88	|
|	France	|	FR76 3000 6000 0112 3456 7890 189	|
|	Ireland	|	IE12 BOFI 9000 0112 3456 78	|
|	Germany	|	DE91 1000 0000 0123 4567 89	|
|	Greece	|	GR96 0810 0010 0000 0123 4567 890	|
|	Mauritius	|	MU43 BOMM 0101 1234 5678 9101 000 MUR	|
|	Pakistan	|	PK70 BANK 0000 1234 5678 9000	|
|	Poland	|	PL10 1050 0099 7603 1234 5678 9123	|
|	Romania	|	RO09 BCYP 0000 0012 3456 7890	|
|	Saint Lucia	|	LC14 BOSL 1234 5678 9012 3456 7890 1234	|
|	Saudi Arabia	|	SA44 2000 0001 2345 6789 1234	|
|	Spain	|	ES79 2100 0813 6101 2345 6789	|
|	Sweden	|	SE87 3000 0000 0101 2345 6789	|
|	Switzerland	|	CH56 0483 5012 3456 7800 9	|
|	United Kingdom	|	GB98 MIDL 0700 9312 3456 78	|



If you prefer you can build a jar file:
```
$ mvn package
$ java -jar target/iban-0.0.1-SNAPSHOT.jar
```

# Docker
