package com.aivestor.Investor_backend.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockIndexResponse {
    private String rt_cd;
    private String msg_cd;
    private String msg1;
    private Object output1;
    private Object[] output2;
}
