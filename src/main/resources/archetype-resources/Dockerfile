FROM payara/server-full
RUN  curl -o /opt/payara41/glassfish/domains/domain1/lib/ext/mysql-connector.jar https://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.41/mysql-connector-java-5.1.41.jar
COPY target/${projectName}.war $DEPLOY_DIR