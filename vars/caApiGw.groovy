import groovy.transform.Field
vars/caApiGw.groovy

@Field caScanResultsUrl = "https://ec2-192.168.1.1.compute-1.amazonaws.com:8443/codescanresults?build_id="
@Field caCopyReportUrl = "https://ec2-192.168.1.1.compute-1.amazonaws.com:8443/copysummaryreports3?build_id="
@Field caCopyFormat = "&format=json"