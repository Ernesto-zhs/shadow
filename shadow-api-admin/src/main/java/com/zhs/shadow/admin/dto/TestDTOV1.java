package com.zhs.shadow.admin.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class TestDTOV1 {

    private BigDecimal score;

    private List<TestDTO> list;

}
