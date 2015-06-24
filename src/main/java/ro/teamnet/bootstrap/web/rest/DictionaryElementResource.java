package ro.teamnet.bootstrap.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.bootstrap.domain.DictionaryElement;
import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.bootstrap.repository.DictionaryElementRepository;
import ro.teamnet.bootstrap.service.AbstractService;
import ro.teamnet.bootstrap.service.DictionaryElementService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

/**
 * REST controller for managing dictionary element.
 */
@RestController
@RequestMapping("/app/rest/dictionaryElement")
public class DictionaryElementResource extends AbstractResource<DictionaryElement,Long>{

    private final Logger log = LoggerFactory.getLogger(DictionaryElementResource.class);



    @Inject
    public DictionaryElementResource(DictionaryElementService abstractService) {
        super(abstractService);
    }

    @Override
    public DictionaryElementService getService() {
        return (DictionaryElementService) super.getService();
    }

    /**
     * GET  /rest/dictionaryElementsByDictionaryCode/{code} -> get all the dictionary elements by dictionary code.
     */
    @RequestMapping(value = "/{code}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity getAllByDictionaryCode(@PathVariable String code) {
        log.debug("REST request to get all DictionaryElements by Dictionary code: "+code);
        return new ResponseEntity<>(getService().findByDictionaryCode(code), HttpStatus.OK);
    }
}
