package com.tester.core.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private EnWordDTO enWordDTO;
    private NoWordDTO noWordDTO;
    private Long rating;
}
