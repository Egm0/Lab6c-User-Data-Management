package ca.sait.lab6c.services;

import ca.sait.lab6c.dataaccess.RoleDB;
import ca.sait.lab6c.dataaccess.UserDB;
import ca.sait.lab6c.models.Role;
import ca.sait.lab6c.models.User;
import java.util.List;

public class RoleService {
    
    private RoleDB roleDB = new RoleDB();
    
    
    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }
}
