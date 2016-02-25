## Proprioceptron

A virtual environment for testing and simulating machine learning algorithms

## Maven
    
For snapshots, add the following to your pom.xml file:

    <repository>
      <id>sonatype-oss-snapshots</id>
      <snapshots/>
      <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
    
    <dependency>
      <groupId>org.knowm.proprioceptron</groupId>
      <artifactId>proprioceptron-core</artifactId>
      <version>1.1.0-SNAPSHOT</version>
    </dependency>

## Building

    mvn clean package  
    mvn javadoc:javadoc  
    mvn clean deploy  
    
## Bugs

Please report any bugs or submit feature requests to [Proprioceptron's Github issue tracker](https://github.com/timmolter/Proprioceptron/issues).  
