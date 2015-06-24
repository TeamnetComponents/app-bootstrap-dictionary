package ro.teamnet.bootstrap.service;

import org.springframework.data.repository.query.Param;
import ro.teamnet.bootstrap.domain.DictionaryElement;

import java.util.List;

public interface DictionaryElementService  extends AbstractService<DictionaryElement,Long>{

    List<DictionaryElement> findByDictionaryCode(String dictionaryCode);
}
