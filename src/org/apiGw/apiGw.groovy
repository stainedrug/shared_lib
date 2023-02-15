class apiGw {
    private String ApiGwHostname;
    private String ApiGwAction;
    private String ApiGwArgument;
    private String ApiGwUsername;
    private String ApiGwPassword;
    private Text ApiGwApiCurl;
}

Text setUrlCommand() {
    this.ApiGwApiCurl = '';
}
Text getCurlCommand() {
    return this.ApiGwApiCurl
}

String getPassword() {
    return this.ApiGwPassword
}

