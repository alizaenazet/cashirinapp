package com.alpcashierin.cashierin.utilities;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import okhttp3.ResponseBody;
import retrofit2.Converter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class MapResponseConverter implements Converter<ResponseBody, Map<String, Object>> {

    private final Gson gson;
    private final TypeAdapter<Map<String, Object>> adapter;

    public MapResponseConverter(Gson gson, TypeAdapter<Map<String, Object>> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public Map<String, Object> convert(ResponseBody value) throws IOException {
        JsonReader jsonReader = gson.newJsonReader(value.charStream());
        try {
            return adapter.read(jsonReader);
        } finally {
            value.close();
        }
    }
}
