package com.zychp.WarsawBusesData.ApiCaller;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ApiCall {
    private String type;
    private String line;
    private String apiUrl;

//    public ApiCall(String type, String line, String brigade) {
//        this(type, line);
//    }

    public ApiCall(String type, String line) {
        this.type = type;
        this.line = line;
        this.apiUrl = urlBuild();
    }

    private String urlBuild() {
        String host = "api.um.warszawa.pl";
        String path = "api/action/busestrams_get";
        String resource_id = "f2e5503e927d-4ad3-9500-4ab9e55deb59";
        String apiKey = loadApiKey();


        UriComponents uriComponents =
                UriComponentsBuilder.newInstance()
                        .scheme("https")
                        .host(host)
                        .path(path)
                        .queryParam("resource_id", resource_id)
                        .queryParam("apikey", apiKey)
                        .queryParam("type", type)
                        .queryParam("line", line)
                        .build()
                        .expand("java", "examples")
                        .encode();

        return uriComponents.toUriString();
    }

    private String loadApiKey() {
        File file = new File("apiKey");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert scanner != null;
        return scanner.nextLine();
    }

    public List<ApiBusDataEntity> makeCall() {
        RestTemplate restTemplate = new RestTemplate();

//        String response = restTemplate.getForObject(apiUrl, String.class);
//        System.out.println("response = " + response);

        ApiBusDataResultWrapper responseBusData = restTemplate.getForObject(apiUrl, ApiBusDataResultWrapper.class);
        assert responseBusData != null;
        return responseBusData.getResult();
    }
}

