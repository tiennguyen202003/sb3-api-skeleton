package com.digiex.utility.web.model.dto;

import com.digiex.utility.web.model.Role;
import com.digiex.utility.web.model.User;
import com.digiex.utility.web.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDto {
    private Long id;
    private UUID userId;
    private Long roleId;

    public UserRole convertToEntity(User user, Role role) {
        return UserRole.builder()
                .id(this.id)
                .user(user)
                .role(role)
                .build();
    }

    public static UserRoleDto convertToDto(UserRole userRole) {
        return UserRoleDto.builder()
                .id(userRole.getId())
                .userId(userRole.getUser().getId())
                .roleId(userRole.getRole().getId())
                .build();
    }
}
