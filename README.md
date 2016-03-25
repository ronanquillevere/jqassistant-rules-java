# jqassistant-rules-java
Generator of java classes from jqassistant-rules xsd

## How to use

1) As a jar

Download the jar and add it to your project

2) As a mvn dependency (not published on maven central yet)

- Copy the project to your repository 
- Deploy it. 
- Then add the dependency to your project

	<dependency>
	  <groupId>com.github.ronanquillevre</groupId>
	  <artifactId>jqassistant-rules-java</artifactId>
	  <version>1.0-SNAPSHOT</version>
	</dependency>

## How to customize
Fork the project and update pom.xml to changes the java files packages if needed

	<configuration>
	  <!-- The package in which the source files will be generated. -->
	  <packageName>com.github.ronanquillevre.jqassistantrulesjava</packageName>
	  <!-- The working directory to create the generated java source files. -->
	  <outputDirectory>${basedir}/src/main/java</outputDirectory>
	</configuration>

Then deploy the project to your maven repository 

`` mvn clean deploy ``
