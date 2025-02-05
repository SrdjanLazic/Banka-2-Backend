package rs.edu.raf.si.bank2.users.requests;

import java.util.List;
import lombok.Data;
import rs.edu.raf.si.bank2.users.models.mariadb.PermissionName;

@Data
public class UpdateUserRequest {

    private String email;
    private String firstName;
    private String lastName;
    private List<PermissionName> permissions;
    private String jobPosition;
    private boolean active;
    private Double dailyLimit;
    private String phone;
}
