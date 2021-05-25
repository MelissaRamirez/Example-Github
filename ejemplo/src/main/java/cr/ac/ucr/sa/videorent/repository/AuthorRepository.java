package cr.ac.ucr.sa.videorent.repository;
import cr.ac.ucr.sa.videorent.entity.Author;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
@Transactional(readOnly=true)
	public interface AuthorRepository extends JpaRepository<Author, Long> {
 
		@Query("SELECT a FROM Author a JOIN FETCH a.books WHERE a.name = ?1")
	List<Author> findAuthorByName(String name);
	}
	
	
