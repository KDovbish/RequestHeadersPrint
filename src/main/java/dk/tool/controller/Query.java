package dk.tool.controller;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public interface Query {
    /**
     * Отдать заголовки http-пакета в виде карты
     * @param headers Карта с заголовками
     * @return Карта с заголовками. К сожалению, если в заголовке несколько раз используется один и тот-же ключ с
     * разными значениями, то в карту попадет только одно значение - первое.
     */
    Map<String, String> getHeaders(Map<String, String> headers);

    /**
     * Отдать заголовки http-пакета в виде карты
     * @param headers Карта с заголовками. Эта карта позволяет хранить одинаковые ключи с разными значениями.
     * @return JSON-строка со всеми заголовками из мультикарты.
     */
    String getHeaders(MultiValueMap<String, String> headers);
}
