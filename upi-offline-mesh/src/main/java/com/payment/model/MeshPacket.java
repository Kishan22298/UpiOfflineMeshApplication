package com.payment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MeshPacket {

    @NotBlank
    private String packetId; // UUID, used by intermediates for gossip dedup

    @Min(0)
    private int ttl; // Hops remaining; intermediates decrement it

    @NotNull
    private Long createdAt; // epoch millis, when sender created the packet

    @NotBlank
    private String ciphertext; // base64(RSA-encrypted AES key + AES-GCM ciphertext)


}
