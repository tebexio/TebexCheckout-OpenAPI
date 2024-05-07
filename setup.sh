#!/bin/bash

# Install yq for YAML parsing
os_name=$(uname -s)
if [[ "$os_name" == "Linux" ]]; then
    apt install yq
elif [[ "$os_name" == "Darwin" ]]; then
    brew install yq
else
    echo "Unknown operating system."
    exit
fi

# Install the OpenAPI generator
npm install @openapitools/openapi-generator-cli -g