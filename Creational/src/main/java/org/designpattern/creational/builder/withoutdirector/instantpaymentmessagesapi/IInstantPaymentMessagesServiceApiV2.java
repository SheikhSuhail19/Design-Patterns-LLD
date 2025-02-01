package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi;

import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesResponseDto;

public interface IInstantPaymentMessagesServiceApiV2
{
	InstantPaymentMessagesResponseDto getMessages(String paymentTransactionId, String issuerBankId, String issuerBankIdType,
	                                              String internalBankingOperationReference, String externalBankingOperationReference,
	                                              String startCreationDateTime, String endCreationDateTime, String messageCode, String csm, String messageId, String messageIssuer, String messageType, String processingResult, String paymentProcessTypeCode, Boolean collapse, String range, String sort);
}
