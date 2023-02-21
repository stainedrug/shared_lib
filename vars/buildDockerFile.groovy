#!/usr/bin/env groovy

def call() {
    def dockerFileContent = dockerContents.dockerFileText
    writeFile file:"./testfolder/Dockerfile", text: dockerFileContent
    sh "chmod a+x ./testfolder/Dockerfile"
}