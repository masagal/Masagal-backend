package org.example.groupbackend.inventory.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UpdateInventoryItemDto(String id, String label, Integer quantity) {
}
