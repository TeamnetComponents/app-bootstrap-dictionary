package ro.teamnet.bootstrap.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.bootstrap.domain.Dictionary;
import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.bootstrap.repository.DictionaryRepository;
import ro.teamnet.bootstrap.service.AbstractService;
import ro.teamnet.bootstrap.service.DictionaryRelationService;
import ro.teamnet.bootstrap.service.DictionaryService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

/**
 * REST controller for managing Dictionary.
 */
@RestController
@RequestMapping("app/rest/dictionary")
public class DictionaryResource extends AbstractResource<Dictionary,Long>{


    @Inject
    public DictionaryResource(DictionaryService abstractService) {
        super(abstractService);
    }
}
