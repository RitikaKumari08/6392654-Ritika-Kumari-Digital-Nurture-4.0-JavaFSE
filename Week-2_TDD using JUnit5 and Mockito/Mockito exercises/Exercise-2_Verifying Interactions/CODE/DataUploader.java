package com.mockito;

public class DataUploader {
    private final NetworkClient client;

    public DataUploader(NetworkClient client) {
        this.client = client;
    }

    public void performUpload() {
        client.upload("TestPayload");
    }
}

