package com.example.todo.service.tasks;

import java.util.List;

public record TaskSearchEntity(
        String summary,
        List<TaskStatus> status
) {
}
