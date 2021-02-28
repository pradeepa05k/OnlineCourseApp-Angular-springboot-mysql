package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.AppUser;
import java.util.Optional;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    void deleteAppUserById(Long id);

    Optional<AppUser> findAppUserById(Long id);
}
