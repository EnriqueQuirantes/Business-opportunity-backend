package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{

		@Query
		( "SELECT username, password FROM usuarios WHERE username LIKE %?1% AND password LIKE %?2%")
		UserModel login(String username, String password);
}
