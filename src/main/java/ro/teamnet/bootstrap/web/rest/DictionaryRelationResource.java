package ro.teamnet.bootstrap.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.bootstrap.domain.DictionaryRelation;
import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.bootstrap.repository.DictionaryRelationRepository;
import ro.teamnet.bootstrap.service.AbstractService;
import ro.teamnet.bootstrap.service.DictionaryRelationService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

/**
 * REST controller for managing DictionaryRelation.
 */
@RestController
@RequestMapping("/app/rest/dictionaryRelation")
public class DictionaryRelationResource extends AbstractResource<DictionaryRelation,Long>{

    @Inject
    public DictionaryRelationResource(DictionaryRelationService abstractService) {
        super(abstractService);
    }
}
