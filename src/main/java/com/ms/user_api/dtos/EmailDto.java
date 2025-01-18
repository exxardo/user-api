package com.ms.user_api.dtos;

import java.util.UUID;

public record EmailDto(UUID id, String emailUser, String subject, String message) {

}
