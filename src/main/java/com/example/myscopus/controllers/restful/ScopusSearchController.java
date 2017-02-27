package com.example.myscopus.controllers.restful;

import com.example.myscopus.models.Author;
import com.example.myscopus.models.scopusapi.ScopusSearchResult;
import com.example.myscopus.models.scopusapi.ScopusSearchResponse;
import com.example.myscopus.services.ScopusAPIService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import retrofit.RestAdapter;
import retrofit.converter.JacksonConverter;

/**
 * REST controller for searching for scientific work on Scopus.
 */
@RestController
@RequestMapping(value = "/scopus/search")
public class ScopusSearchController {

    @Value("${scopus.apikey}")
    private String apiKey;

    private static final Logger LOG = LoggerFactory.getLogger(ScopusSearchController.class);

    @RequestMapping(value = "/author", method = RequestMethod.POST)
    public ScopusSearchResult getScientificWorks(@RequestBody Author author) {
        LOG.info("author name ==> " + author.getName());

        String apiBaseUrl = "http://api.elsevier.com";
        String query = "auth(" + author.getName() + ")";
        int count = author.getCount();
        int start = author.getStart();

        RestAdapter adapter =
                new RestAdapter.Builder()
                        .setEndpoint(apiBaseUrl)
                        .setConverter(new JacksonConverter(new ObjectMapper()))
                        .build();

        ScopusAPIService scopusAPIService = adapter.create(ScopusAPIService.class);
        ScopusSearchResponse scopusSearchResponse = scopusAPIService.getByAuthor(start, count, query, apiKey);
        ScopusSearchResult scopusSearchResult = scopusSearchResponse.getScopusSearchResult();

        LOG.info("total ==> " + scopusSearchResult.getTotalResults());
        LOG.info("entries ==> " + scopusSearchResult.getEntries().size());
        return scopusSearchResult;
    }
}
