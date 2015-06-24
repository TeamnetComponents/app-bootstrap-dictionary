package ro.teamnet.bootstrap.service;

import org.springframework.stereotype.Service;
import ro.teamnet.bootstrap.domain.ElementRelation;
import ro.teamnet.bootstrap.repository.ElementRelationRepository;

import javax.inject.Inject;

@Service
public class ElementRelationServiceImpl extends AbstractServiceImpl<ElementRelation,Long> implements ElementRelationService {
    @Inject
    public ElementRelationServiceImpl(ElementRelationRepository repository) {
        super(repository);
    }
}
