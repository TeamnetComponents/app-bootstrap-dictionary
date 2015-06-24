package ro.teamnet.bootstrap.service;

import org.springframework.stereotype.Service;
import ro.teamnet.bootstrap.domain.DictionaryCollection;
import ro.teamnet.bootstrap.extend.AppRepository;
import ro.teamnet.bootstrap.repository.DictionaryCollectionRepository;

import javax.inject.Inject;

@Service
public class DictionaryCollectionServiceImpl extends AbstractServiceImpl<DictionaryCollection,Long> implements DictionaryCollectionService {
    @Inject
    public DictionaryCollectionServiceImpl(DictionaryCollectionRepository repository) {
        super(repository);
    }
}
