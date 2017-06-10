package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.Repository.ShipwreckRepository;
import com.boot.controller.ShipWreckController;
import com.boot.model.Shipwreck;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipWreckController sc;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet(){
		//ShipWreckController sc = new ShipWreckController();
		Shipwreck sw = new Shipwreck();
		sw.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(sw);
		
		Shipwreck shipwreck = sc.get(1L);
		
		verify(shipwreckRepository).findOne(1l);
		
		//JUnit Assert Statements
		//assertEquals(1l, shipwreck.getId().longValue());
		
		//HamCrest Assert Statements
		assertThat(shipwreck.getId(),is(1l));
		
	}

}
