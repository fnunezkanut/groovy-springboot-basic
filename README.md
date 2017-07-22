# groovy-springboot-basic
An absolute basic groovy+springboot app I need as a target for performance testing

to run:

```
$ java -jar groovy-springboot-basic-0.0.1.jar
```


to check the only endpoint:

```
$ curl -i 'http://localhost:8080/info'
 
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Sat, 22 Jul 2017 14:31:03 GMT

{"message":"hello","uuid":"1657b9bc-39dd-4c96-bbdf-56bd6cc33bd0","accept":"*/*","userAgent":"curl/7.54.1","time":"Sat Jul 22 15:31:02 BST 2017"}
```
