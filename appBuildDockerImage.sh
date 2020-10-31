#!/bin/bash
GAV=$(mvn -q -Dexec.executable=echo -Dexec.args='${project.groupId} ${project.artifactId} ${project.version}' --non-recursive exec:exec 2>/dev/null)
IFS=' ' read -r -a TMP <<< "$GAV"
GROUP_ID=${TMP[0]}
ARTIFACT_ID=${TMP[1]}
VERSION=${TMP[2]}

mvn clean package
docker build -t $ARTIFACT_ID:$VERSION .
