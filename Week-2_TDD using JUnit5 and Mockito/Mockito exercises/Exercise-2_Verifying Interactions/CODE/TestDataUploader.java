package com.mockito;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestDataUploader {
    @Test
    public void testUploadCalledWithCorrectArgument() {
        // Step 1: Create mock
        NetworkClient mockClient = Mockito.mock(NetworkClient.class);

        // Step 2: Call method with specific argument
        DataUploader uploader = new DataUploader(mockClient);
        uploader.performUpload();

        // Step 3: Verify interaction
        verify(mockClient).upload("TestPayload");
    }
}

