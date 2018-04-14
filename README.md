# Running 3 node consul server on kubernetes or minikube

This tutorial will walk you through following
* Spring boot microservice and consul agent running and co-located in a POD
* 3 node consul server or 3 different PODS
* Consul agent will connect with 3 node consul server master
* Access consul UI for administration

kubectl port-forward consul-0 8500:8500

## Deploy microservice and consul agent
```
kubectl create -f deploy.yaml    
```

## Create consul configmap
```
kubectl create -f consul-config.yaml
```

## Create consul service
```
kubectl create -f consul-server-service.yaml
```

## Create consul deployment
```
kubectl create -f consul-server-deploy.yaml
```

## Cleanup and Purge command
```
kubectl delete statefulset, service consul
kubectl delete config consul-config

```
