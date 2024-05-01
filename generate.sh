#!/bin/bash

mkdir -p _generated
openapi-generator-cli validate -i openapi.yaml

openapi-generator-cli generate -i openapi.yaml -o _generated/php --api-package TebexCheckout --package-name TebexCheckout -g php --invoker-package TebexCheckout
openapi-generator-cli generate -i openapi.yaml -o _generated/php-laravel --api-package TebexCheckout --package-name TebexCheckout -g php-laravel
openapi-generator-cli generate -i openapi.yaml -o _generated/csharp --api-package TebexCheckout --package-name TebexCheckout -g csharp
openapi-generator-cli generate -i openapi.yaml -o _generated/cpp_ue4 --api-package TebexCheckout --package-name TebexCheckout -g cpp-ue4
openapi-generator-cli generate -i openapi.yaml -o _generated/go --api-package TebexCheckout --package-name TebexCheckout -g go
openapi-generator-cli generate -i openapi.yaml -o _generated/rust --api-package TebexCheckout --package-name TebexCheckout -g rust
openapi-generator-cli generate -i openapi.yaml -o _generated/python --api-package TebexCheckout --package-name TebexCheckout -g python
openapi-generator-cli generate -i openapi.yaml -o _generated/typescript-node --api-package TebexCheckout --package-name TebexCheckout -g typescript-node
openapi-generator-cli generate -i openapi.yaml -o _generated/postman-collection --api-package TebexCheckout --package-name TebexCheckout -g postman-collection