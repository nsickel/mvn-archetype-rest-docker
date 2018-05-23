### Objective
This is a maven archetype for fast creation of a java-ee rest aplication, running inside payara webserver in dockerfile.

### Usage
After cloning the project execute following steps:
```
1. mvn install
2. change to directory where app should be created
3. mvn archetype:generate -DarchetypeGroupId=com.nsickel -DarchetypeArtifactId=rest-docker-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId={groupId} -DartifactId={appName}
```

