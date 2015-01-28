package ro.teamnet.bootstrap.repository;

import ro.teamnet.bootstrap.domain.Dictionary;
import ro.teamnet.bootstrap.extend.AppRepository;

/**
 * Spring Data JPA repository for the Dictionary entity.
 */
public interface DictionaryRepository extends AppRepository<Dictionary, Long> {
}
