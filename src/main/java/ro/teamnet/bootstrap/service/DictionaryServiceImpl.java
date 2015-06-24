package ro.teamnet.bootstrap.service;

import org.springframework.stereotype.Service;
import ro.teamnet.bootstrap.domain.Dictionary;
import ro.teamnet.bootstrap.extend.AppRepository;
import ro.teamnet.bootstrap.repository.DictionaryRepository;

import javax.inject.Inject;

@Service
public class DictionaryServiceImpl extends AbstractServiceImpl<Dictionary,Long> implements DictionaryService {

    @Inject
    public DictionaryServiceImpl(DictionaryRepository repository) {
        super(repository);
    }
}
