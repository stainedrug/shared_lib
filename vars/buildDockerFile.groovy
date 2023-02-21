#!/usr/bin/env groovy

def call() {
    def dockerFileContent = libraryResource "dockerContents.groovy"
    writeFile file:"testfolder/Dockerfile", text: dockerFileContent
    sh "chmod a+x ./testfolder/Dockerfile"
}