package com.example.todo.controller.tasks;

import java.util.List;
import java.util.Optional;

public record TaskSearchDTO(
        String summary,
        List<String> statusList
) {

    public boolean isChecked(String status) {
        return Optional.ofNullable(statusList)
                .map(l -> l.contains(status))
                .orElse(false);
    }
}
