# idporten-identifikatorer

![Maven build status](https://github.com/felleslosninger/idporten-generate-fnr/actions/workflows/call-maventests.yml/badge.svg?branch=main)
 
Generate random syntetic personidentfiers (fodselsnummer) for Norway.
https://www.skatteetaten.no/person/folkeregister/fodsel-og-navnevalg/barn-fodt-i-norge/fodselsnummer/

## Requirements
To build and run the library you need:

* Java 17
* Maven

## Running the library locally

From the command line: 
```
mvn install
```
See [GenerateSynteticFodselsnummerTest.java](/src/test/java/no/idporten/test/generate/fnr/GenerateSynteticFodselsnummerTest.java)