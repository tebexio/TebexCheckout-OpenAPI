#!/bin/bash

go install github.com/go-swagger/go-swagger/cmd/swagger@latest

mkdir -p _out
~/go/bin/swagger flatten --format=yaml openapi.yaml > _out/TebexCheckout-OpenAPI.yaml
~/go/bin/swagger flatten --format=json openapi.yaml > _out/TebexCheckout-OpenAPI.json