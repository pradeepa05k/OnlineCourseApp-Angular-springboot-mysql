package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.AppUser;
import tech.getarrays.employeemanager.repo.AppUserRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class AppUserService {
    private final AppUserRepo appuserRepo;

    @Autowired
    public AppUserService(AppUserRepo appuserRepo) {
        this.appuserRepo = appuserRepo;
    }

    public AppUser addAppUser(AppUser appuser) {
        appuser.setAppUserCode(UUID.randomUUID().toString());
        return appuserRepo.save(appuser);
    }

    public List<AppUser> findAllAppUsers() {
        return appuserRepo.findAll();
    }

    public AppUser updateAppUser(AppUser appuser) {
        return appuserRepo.save(appuser);
    }

    public AppUser findAppUserById(Long id) {
        return appuserRepo.findAppUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteAppUser(Long id){
        appuserRepo.deleteAppUserById(id);
    }
}
