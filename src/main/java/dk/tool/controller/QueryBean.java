package dk.tool.controller;

import dk.tool.service.CommonService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class QueryBean implements Query{

    private final CommonService commonService;

    @Override
    @GetMapping(value = "/listheaders", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getHeaders(@RequestHeader Map<String, String> headers) {
        return headers;
    }

    @Override
    @GetMapping(value = "/listallheaders", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHeaders(@RequestHeader MultiValueMap<String, String> headers) {
        return commonService.getMultiValueMapJSON(headers);
    }

}
