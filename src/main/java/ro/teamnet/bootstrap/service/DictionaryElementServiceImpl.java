package ro.teamnet.bootstrap.service;

import org.springframework.stereotype.Service;
import ro.teamnet.bootstrap.domain.DictionaryElement;
import ro.teamnet.bootstrap.extend.AppRepository;
import ro.teamnet.bootstrap.repository.DictionaryElementRepository;

import javax.inject.Inject;
import java.util.List;

@Service
public class DictionaryElementServiceImpl extends AbstractServiceImpl<DictionaryElement,Long> implements DictionaryElementService {

    @Inject
    public DictionaryElementServiceImpl(DictionaryElementRepository repository) {
        super(repository);
    }

    @Override
    protected DictionaryElementRepository getRepository() {
        return (DictionaryElementRepository) super.getRepository();
    }

    @Override
    public List<DictionaryElement> findByDictionaryCode(String dictionaryCode) {
        return getRepository().findByDictionaryCode(dictionaryCode);
    }
}
