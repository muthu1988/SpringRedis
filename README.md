# SpringRedis
Spring Boot Service - CRUD on a Redis Server

Redis ran using Docker (docker run -d -p 6379:6379 --name localredis redis)

Redis Cluster ran usig Docker (docker run -i -t -p 7000:7000 -p 7001:7001 -p 7002:7002 -p 7003:7003 -p 7004:7004 -p 7005:7005 -p 7006:7006 -p 7007:7007 -d grokzen/redis-cluster)

Test :
curl -X POST \
  'http://localhost:7072/redis?param=' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: cbb6bb7e-106f-489e-8dfe-9998c7fd17c7' \
  -d '{
	"key" : "name",
	"value" : "muthu"
}'