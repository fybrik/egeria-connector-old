ROOT_DIR := .
DOCKER_NAME = egr-connector

include $(ROOT_DIR)/hack/make-rules/docker.mk

KUBE_NAMESPACE ?= fybrik-system

.PHONY: docker-build
docker-build: build
	make docker-build -C connector-src

.PHONY: docker-push
docker-push:
	make docker-push -C connector-src

.PHONY: deploy
deploy:
	helm install fybrik-egeria $(ROOT_DIR)/chart \
		--set image=${DOCKER_HOSTNAME}/${DOCKER_NAMESPACE}/$(DOCKER_NAME):${DOCKER_TAGNAME} \
		--set serverURL=${EGERIA_SERVER_URL} \
		-n $(KUBE_NAMESPACE)

.PHONY: undeploy
undeploy:
	helm uninstall fybrik-egeria -n $(KUBE_NAMESPACE)

.PHONY: build
build:
	make build -C connector-src	

.PHONY: test
test:
	make test -C connector-src

.PHONY: clean
clean:
	make clean -C connector-src

.PHONY: run
run:
	make run -C connector-src

.PHONY: terminate
terminate:
	make terminate -C connector-src
