ROOT_DIR := ../
DOCKER_NAME = egr-connector
CHART_IMG = ${HELM_REPOSITORY}:${TAG}

include $(ROOT_DIR)/hack/make-rules/docker.mk

.PHONY: docker-build
docker-build: build
	docker build . -t ${IMG}

.PHONY: docker-push
docker-push:
	docker push ${IMG}

.PHONY: build
build:
	mvn -B clean install -DskipTests

.PHONY: test
test:
	mvn -B clean test

.PHONY: clean
clean:
	mvn clean && rm -f output-egeriaconnector.log

.PHONY: run
run:
	$(info EGERIA_SERVER_URL is $(EGERIA_SERVER_URL))
	nohup java -cp target/egeriaconnector-1.0-SNAPSHOT-jar-with-dependencies.jar:src/lib/* com.ibm.egeria.EgeriaConnector > output-egeriaconnector.log &  2>&1 ; echo "$$!" >> pids.txt; sleep 5

.PHONY: terminate
terminate:
	kill -9 $$( cat pids.txt ); rm -f pids.txt

.PHONY: chart-push
chart-push:
	helm chart save ./helm/afm ${CHART_IMG}
	helm chart push ${CHART_IMG}
	helm chart remove ${CHART_IMG}
