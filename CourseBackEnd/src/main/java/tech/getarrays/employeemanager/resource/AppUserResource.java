package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.AppUser;
import tech.getarrays.employeemanager.service.AppUserService;

import java.util.List;

@RestController
@RequestMapping("/User")
public class AppUserResource {
    private final AppUserService appuserService;

    public AppUserResource(AppUserService appuserService) {
        this.appuserService = appuserService;
    }

    @GetMapping("/allUser")
    public ResponseEntity<List<AppUser>> getAllAppUsers () {
        List<AppUser> AppUsers = appuserService.findAllAppUsers();
        return new ResponseEntity<>(AppUsers, HttpStatus.OK);
    }

    @GetMapping("/findUser/{id}")
    public ResponseEntity<AppUser> getAppUserById (@PathVariable("id") Long id) {
        AppUser AppUser = appuserService.findAppUserById(id);
        return new ResponseEntity<>(AppUser, HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<AppUser> addAppUser(@RequestBody AppUser appuser) {
        AppUser newAppUser = appuserService.addAppUser(appuser);
        return new ResponseEntity<>(newAppUser, HttpStatus.CREATED);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<AppUser> updateAppUser(@RequestBody AppUser appuser) {
        AppUser updateAppUser = appuserService.updateAppUser(appuser);
        return new ResponseEntity<>(updateAppUser, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?> deleteAppUser(@PathVariable("id") Long id) {
        appuserService.deleteAppUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
