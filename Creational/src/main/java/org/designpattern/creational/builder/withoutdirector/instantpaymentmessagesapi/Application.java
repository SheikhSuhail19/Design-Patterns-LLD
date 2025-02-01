package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi;

import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesResponseDto;

public class Application
{
	public static void main(String[] args)
	{
		InstantPaymentMessagesServiceApiV1 instantPaymentMessagesServiceApiV1 = new InstantPaymentMessagesServiceApiV1();
		InstantPaymentMessagesResponseDto instantPaymentMessagesResponseDtoV1 = instantPaymentMessagesServiceApiV1.getMessages("paymentTransactionId", "issuerBankId", "issuerBankIdType", "internalBankingOperationReference", "externalBankingOperationReference", "startCreationDateTime", "endCreationDateTime", "messageCode", "csm");
		System.out.println(instantPaymentMessagesResponseDtoV1);

		InstantPaymentMessagesServiceApiV2 instantPaymentMessagesServiceApiV2 = new InstantPaymentMessagesServiceApiV2();
		InstantPaymentMessagesResponseDto instantPaymentMessagesResponseDtoV2 = instantPaymentMessagesServiceApiV2.getMessages("paymentTransactionId", "issuerBankId", "issuerBankIdType", "internalBankingOperationReference", "externalBankingOperationReference", "startCreationDateTime", "endCreationDateTime", "messageCode", "csm", "messageId", "messageIssuer", "messageType", "processingResult", "paymentProcessTypeCode", true, "range", "sort");
		System.out.println(instantPaymentMessagesResponseDtoV2);
	}
}
