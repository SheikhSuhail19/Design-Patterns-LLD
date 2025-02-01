package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi;

import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesListItemDto;
import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesRequestDto;
import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesResponseDto;

import java.util.ArrayList;
import java.util.List;

public class InstantPaymentMessagesServiceApiV1 implements IInstantPaymentMessagesServiceApiV1
{
	@Override
	public InstantPaymentMessagesResponseDto getMessages(String paymentTransactionId, String issuerBankId, String issuerBankIdType,
	                                                     String internalBankingOperationReference, String externalBankingOperationReference,
	                                                     String startCreationDateTime, String endCreationDateTime, String messageCode, String csm)
	{
		InstantPaymentMessagesRequestDto requestDto =
				new InstantPaymentMessagesRequestDto.InstantPaymentMessagesRequestDtoBuilder()
						.setPaymentTransactionId(paymentTransactionId).setIssuerBankId(issuerBankId)
						.setIssuerBankIdType(issuerBankIdType)
						.setInternalBankingOperationReference(internalBankingOperationReference)
						.setExternalBankingOperationReference(externalBankingOperationReference)
						.setStartCreationDateTime(startCreationDateTime)
						.setEndCreationDateTime(endCreationDateTime)
						.setMessageCode(messageCode).setCsm(csm)
						.build();

		List<InstantPaymentMessagesListItemDto> instantPaymentMessages = new ArrayList<>();

		InstantPaymentMessagesListItemDto instantPaymentMessage =
				new InstantPaymentMessagesListItemDto().setMessageCreationDateTime("messageCreationDateTime").setPaymentTransactionId(
						"paymentTransactionId").setIssuerBank(null).setReceiverBank(null).setMessageReference(
						"messageReference").setMessageIssuer("messageIssuer").setMessageType("messageType").setMessageXml("messageXml").setMessageCode("messageCode").setMessageRecipient("messageRecipient").setMessageExecutionStartTime("messageExecutionStartTime").setMessageExecutionEndTime("messageExecutionEndTime").setMessageExecutionDurationTime(1).setIpcePaymentStatusId("ipcePaymentStatusId").setCsm("csm").setInternalBankingOperationReference("internalBankingOperationReference").setExternalBankingOperationReference("externalBankingOperationReference").setId(1L).setOriginalMessageType("originalMessageType").setMessagePaymentStatus("messagePaymentStatus").setPaymentProcessTypeCode("paymentProcessTypeCode").setStatusBefore("statusBefore").setStatusAfter("statusAfter").setOriginalMessageReference("originalMessageReference");

		instantPaymentMessages.add(instantPaymentMessage);

		return new InstantPaymentMessagesResponseDto.InstantPaymentMessagesResponseDtoBuilder()
				.setInstantPaymentMessagesList(instantPaymentMessages)
				.setInstantPaymentMessagesListLength(instantPaymentMessages.size())
				.build();
	}
}
