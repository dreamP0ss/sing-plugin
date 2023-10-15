#!/bin/bash

set -x

# Version store

naive_version="v118.0.5993.65-1"

#########################

version_name="${1}_version"

eval "export VERSION=\$$version_name"
