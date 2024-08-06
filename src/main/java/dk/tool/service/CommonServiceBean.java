package dk.tool.service;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonServiceBean implements CommonService {
    @Override
    public String getMultiValueMapJSON(MultiValueMap<String, String> multiValueMap) {
        //  Строковой список наполняется заголовками в json-формате
        List<String> headerList = new ArrayList<>();
        multiValueMap.forEach(
                (k, v) -> v.forEach( listValue -> headerList.add("\"" + k + "\":\"" + listValue + "\"" ) )
        );

        //  Формируется json-блок из всех заголовоков в только что сформированном списке
        String jsonString = "{";
        if (headerList.size() > 0 ) {
            for(int i = 0; i <= headerList.size() - 2; i++) {
                jsonString = jsonString + headerList.get(i) + ",";
            }
            jsonString = jsonString + headerList.get(headerList.size() - 1);
        }
        jsonString = jsonString + "}";

        return jsonString;
    }
}
