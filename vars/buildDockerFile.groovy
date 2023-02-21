#!/usr/bin/env groovy

def call() {
    def dockerFileContent = libraryResource "dockerContents.dockerFileContent"
    writeFile file:"testfolder/Dockerfile", text: dockerFileContent
    sh "chmod a+x ./testfolder/Dockerfile"
}