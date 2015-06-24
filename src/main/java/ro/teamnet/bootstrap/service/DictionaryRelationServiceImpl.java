package ro.teamnet.bootstrap.service;

import org.springframework.stereotype.Service;
import ro.teamnet.bootstrap.domain.DictionaryRelation;
import ro.teamnet.bootstrap.extend.AppRepository;
import ro.teamnet.bootstrap.repository.DictionaryRelationRepository;

import javax.inject.Inject;

@Service
public class DictionaryRelationServiceImpl extends AbstractServiceImpl<DictionaryRelation,Long> implements DictionaryRelationService {

    @Inject
    public DictionaryRelationServiceImpl(DictionaryRelationRepository repository) {
        super(repository);
    }
}
