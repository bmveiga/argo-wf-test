mvn clean compile package
docker build -t argo-wf-app:v.0 .
docker image tag argo-wf-app:v.0 bmveig/argo-wf-app:v.0
docker image push bmveiga/appname:v.x