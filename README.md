# docker_empty
springboot 도커 깡통 세팅


## 프로젝트 소개
git actions로 코드를 도커에 올려 자동배포할 수 있도록 함


## 개발환경
* /docker/docker-compose.yaml
* /web/build.gradle

참고

## 세팅 방법

### 프로젝트 설정
.gitignore의 project_name 수정

/.github/workflows/deploy.yml의 프로젝트 폴더 이름 세팅

/docker/nginx/nginx.conf의 $upstream 값 세팅

/docker/scripts/destroy.sh PROJECT_NAME 수정

/docker/.env 생성 -> 변수 설정

/web/settings.gradle의 rootProject.name 값 세팅

deploy.sh의 REPOSITORY 값 세팅

/web 폴더 이름 project_name으로 변경

/project_name으로/src/main/java/org/dizzyfox734의 rootProject.name과 동일하게 projectname 폴더 이름 변경

/project_name으로/src/main/java/org/dizzyfox734/{projectname}/Application.java의 package 수정



### 도커 포트 설정
/docker/docker-compose.yaml에서 외부포트 값 수정


### git actions 설정
.github/workflow/deploy.yml를 참고하여 git actions에 변수 설정