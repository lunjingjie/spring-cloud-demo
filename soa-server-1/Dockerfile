FROM maven:3.5-alpine as builder
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package -D maven.test.skip=true

FROM java:8-jre-alpine
EXPOSE 7023
ENV TZ=Asia/Shanghai
WORKDIR /usr/src/myapp/
COPY --from=builder /usr/src/app/target/*.jar ./app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]