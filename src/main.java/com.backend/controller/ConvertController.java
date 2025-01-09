package com.backend.controller;

import com.backend.model.ConversionRequest;
import com.backend.model.ConversionResponse;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.MathContext;

@RestController
@Slf4j
public class ConvertController implements ConvertApi {

    @Override
    public ResponseEntity<ConversionResponse> convert(@Valid @RequestBody ConversionRequest request) {

        log.info("Amount {}, SourceCurrency {}, TargetCurrency {}", request.getAmount(), request.getSourceCurrency(), request.getTargetCurrency());

        BigDecimal rateSource = BigDecimal.valueOf(1); // Exemplo de taxa
        BigDecimal rateTarget = BigDecimal.valueOf(0.4); // Exemplo de taxa
        BigDecimal convertedAmount = request.getAmount().multiply(rateSource.divide(rateTarget, MathContext.DECIMAL128));

        ConversionResponse response = new ConversionResponse()
                .sourceCurrency(request.getSourceCurrency())
                .targetCurrency(request.getTargetCurrency())
                .convertedAmount(convertedAmount);
        log.info("ConvertedAmount {}", convertedAmount);

        return ResponseEntity.ok(response);
    }
}
