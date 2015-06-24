package ro.teamnet.bootstrap.web.rest;

import org.springframework.web.bind.annotation.*;
import ro.teamnet.bootstrap.domain.ElementRelation;
import ro.teamnet.bootstrap.service.ElementRelationService;

import javax.inject.Inject;

/**
 * REST controller for managing ElementRelation.
 */
@RestController
@RequestMapping("/app/rest/elementRelation")
public class ElementRelationResource extends AbstractResource<ElementRelation,Long>{


    @Inject
    public ElementRelationResource(ElementRelationService abstractService) {
        super(abstractService);
    }
}
