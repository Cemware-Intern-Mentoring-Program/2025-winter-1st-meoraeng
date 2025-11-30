package com.cemware.lavine.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaskUpdateStatusRequest {
    @NotNull(message = "완료 상태는 필수입니다.")
    private Boolean done;
}

