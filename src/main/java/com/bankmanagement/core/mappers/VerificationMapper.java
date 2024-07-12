package com.bankmanagement.core.mappers;

import com.bankmanagement.core.dto.VerificationDto;
import com.bankmanagement.entities.VerificationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VerificationMapper {
    VerificationEntity toEntity(VerificationDto verificationDto);
    VerificationDto toDto(VerificationEntity verificationEntity);
}
