package dk.tool.service;

import org.springframework.util.MultiValueMap;

public interface CommonService {
    /**
     * Получить JSON-представление для объекта реализующего интерфейс MultiValueMap
     * @param multiValueMap Карта
     * @return JSON в виде строки
     */
    String getMultiValueMapJSON(MultiValueMap<String, String> multiValueMap);
}
