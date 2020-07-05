# vocabularyJavaTest

# This project has a test method to create a vocabulary entity.
# Also it can be reached from heroku 
# to list all vocabularies https://vocabularydetails.herokuapp.com/vocabulary
# for "Hallo Dostum " String https://vocabularydetails.herokuapp.com/ 

It has a junit test method to create e test entity.In addition If you give up from "Hallo Dostum" response,you can add to pom.xml file following dependency and can use HAL browser to create new test Entity easily.(Also you need to change  @RestController annotation to @RepositoryRestController in the Controller class.) 		

<dependency>
			<groupId>org.springframework.data</groupId>
			<artifactId>spring-data-rest-hal-explorer</artifactId>
</dependency>
