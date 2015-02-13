package ro.teamnet.bootstrap.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.teamnet.bootstrap.domain.DictionaryElement;
import ro.teamnet.bootstrap.extend.AppRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the DictionaryElement entity.
 */
public interface DictionaryElementRepository extends AppRepository<DictionaryElement, Long> {
    @Query("select de from DictionaryElement de join de.dictionary d where d.code = :dictionaryCode")
    List<DictionaryElement> findByDictionaryCode(@Param(value = "dictionaryCode") String dictionaryCode);
}
