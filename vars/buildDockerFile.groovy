#!/usr/bin/env groovy

def call() {
    echo 'hello1'
    def dockerFileContent = dockerContents.dockerFileText
    echo 'hello2'
    writeFile file:"testfolder/Dockerfile", text: dockerFileContent.dockerFileText
    sh "chmod a+x ./testfolder/Dockerfile"
}