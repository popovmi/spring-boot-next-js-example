## build dev image
```bash
docker build . -t spring-demo-api -f Dockerfile.dev
```

## docker dev
```bash
docker run -it --rm -p 3000:8080 -v ${pwd}:/app spring-demo-api
```
open localhost:3000 in browser