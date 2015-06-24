package ro.teamnet.bootstrap.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.bootstrap.domain.DictionaryCollection;
import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.bootstrap.repository.DictionaryCollectionRepository;
import ro.teamnet.bootstrap.service.AbstractService;
import ro.teamnet.bootstrap.service.DictionaryCollectionService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

/**
 * REST controller for managing dictionary collections.
 */
@RestController
@RequestMapping("/app/rest/dictionaryCollection")
public class DictionaryCollectionResource extends AbstractResource<DictionaryCollection,Long>{
    private final Logger log = LoggerFactory.getLogger(DictionaryCollectionResource.class);



    @Inject
    public DictionaryCollectionResource(DictionaryCollectionService abstractService) {
        super(abstractService);
    }


}
