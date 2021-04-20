package com.ac1dtest.coinwidget.model;

import com.ac1dtest.coinwidget.model.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class RestClient {

	@Autowired
	private RestTemplate restTemplate;

	public Data apiCall() {
		String KEY = "8da0885e-9b08-49df-994e-0f4f432b6743";
		String URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";

		HttpHeaders headers = new HttpHeaders();
		headers.set("X-CMC_PRO_API_KEY", KEY);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
				.queryParam("start", 1)
				.queryParam("limit", 5);

		HttpEntity<?> entity = new HttpEntity<>(headers);
		ResponseEntity<Data> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, Data.class);

		return response.getBody();
	}
}
