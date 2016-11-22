# rest-service
Simple rest service used for documentation, obtained from https://spring.io/guides/gs/rest-service/

If you want to rebuild the Docker image, remember to copy the .jar file created after the "mvn clean package" in the root of the project before runing the "docker build .". Also the image is aviable [here](https://hub.docker.com/r/marcsolde/hellorest/).

In order to deploy it to a JBoss EAP server, copy the war file generated with a 'mvn package' to '$EAPx_HOME/standalone/deployments' and it will be accessible via 'YOURSERVERIP:PORT/SERVICENAME/APICALL/'
