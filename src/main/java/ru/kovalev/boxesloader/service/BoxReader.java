package ru.kovalev.boxesloader.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.kovalev.boxesloader.exception.FileReadingException;
import ru.kovalev.boxesloader.model.Box;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BoxReader implements JsonReader<Box>{

    @Override
    public List<Box> read(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(path), new TypeReference<>() {
            });
        } catch (IOException e) {
            throw new FileReadingException("Произошла ошибка при чтении файла: " + path, e);
        }
    }
}
