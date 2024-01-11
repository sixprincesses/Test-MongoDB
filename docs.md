# 들어가며

실습환경은 다음과 같습니다.

- Java 17
- Spring Boot 3.1.7
- Lombok
- Spring Data MongoDB
- Spring Web
- IntelliJ IDEA
- Window 10 & macOS

# 1. MongoDB 설치하기

먼저 `Docker`을 활용하여 설치를 하도록 하겠습니다.
이미지를 확인하기 위해서 [DockerHub - MongoDB](https://hub.docker.com/_/mongo)를 조회합니다.

```shell
# MongoDB 설치
docker run -d \
-p 27017:27017 \
--name mongo-container \
-v mongo-volume:/data/db \
mongo
```

각 옵션에 대한 설명은 아래와 같습니다.

- `-p` : 내부 포트와 외부 포트를 27017로 설정합니다.
- `--name` : 컨테이너의 이름을 `mongo-container`로 설정합니다.
- `-v` : 컨테이너가 삭제되어도 데이터를 유지하기 위해서 볼륨으로 연결을 합니다.

> 🌟 **Info**
>
> `MongoDB`의 기본 포트는 [제타위키 - 몽고DB](https://zetawiki.com/wiki/MongoDB_%EA%B8%B0%EB%B3%B8_%ED%8F%AC%ED%8A%B8) 에서 확인해본 결과
> "27017"인 것을 확인하였습니다.

다음과 같이 제대로 설치된 것을 확인할 수 있습니다.

<img width="800" alt="mongo install with docker" src="" />

## 1.1. DB 만들기

컨테이너를 생성하였으면 DB 를 만들어보겠습니다.

```shell
docker exec -it <mongoDB 컨테이너> /bin/bash
```

위의 명령어를 사용하여 컨테이너에 접속합니다.

이후 아래의 명령어를 입력하여 DB 에 접근할 수 있습니다.

```shell
mongosh 
```

> 🌟 **Info**
> 
> 이전에는 `mongo`로도 접속을 하였지만 일부 버전에서는 `mongosh`로 접속합니다.

# 2. 스프링 부트 설정

위에서 설치한 `MongoDB`와 스프링 부트의 설정을 연결하기 위한 `yml`을 다음과 같이 작성합니다.

```yaml

```