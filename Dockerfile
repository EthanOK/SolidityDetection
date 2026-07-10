FROM docker.m.daocloud.io/library/maven:3.9-eclipse-temurin-8 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn -B package -DskipTests \
    -Dcheckstyle.skip=true \
    -Dpmd.skip=true \
    -Dcpd.skip=true

FROM docker.m.daocloud.io/library/eclipse-temurin:8-jre-jammy

WORKDIR /app

COPY --from=build /app/target/SolidityDetection-1.1-jar-with-dependencies.jar app.jar
COPY docker-entrypoint.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
CMD ["-p", "/contracts"]
