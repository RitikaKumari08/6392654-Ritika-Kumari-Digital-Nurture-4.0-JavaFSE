package com.mockito.stubbing;

// Needed for assertEquals
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

// Test class
public class TestCase {

    @Test
    public void testExternalApi() {
        // Create a mock for the ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the getData() method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into MyService
        MyService service = new MyService(mockApi);

        // Call the method under test
        String result = service.fetchData();

        // Assert the result
        assertEquals("Mock Data", result);
    }
}

