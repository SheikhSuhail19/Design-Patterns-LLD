package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi;

import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.BankInformationDto;
import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesListItemDto;
import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesRequestDto;
import org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos.InstantPaymentMessagesResponseDto;

import java.util.ArrayList;
import java.util.List;

public class InstantPaymentMessagesServiceApiV2 implements IInstantPaymentMessagesServiceApiV2
{
	@Override
	public InstantPaymentMessagesResponseDto getMessages(
			String paymentTransactionId, String issuerBankId, String issuerBankIdType, String internalBankingOperationReference, String externalBankingOperationReference, String startCreationDateTime, String endCreationDateTime, String messageCode, String csm, String messageId, String messageIssuer, String messageType, String processingResult, String paymentProcessTypeCode, Boolean collapse, String range, String sort)
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
						.setMessageId(messageId)
						.setMessageIssuer(messageIssuer)
						.setMessageType(messageType)
						.setProcessingResult(processingResult)
						.setPaymentProcessTypeCode(paymentProcessTypeCode)
						.setCollapse(collapse)
						.setRange(range)
						.setSort(sort)
						.build();

		List<InstantPaymentMessagesListItemDto> instantPaymentMessages = new ArrayList<>();

		InstantPaymentMessagesListItemDto instantPaymentMessage =
				new InstantPaymentMessagesListItemDto().setMessageCreationDateTime("messageCreationDateTime").setPaymentTransactionId(
						"paymentTransactionId").setIssuerBank(new BankInformationDto().setBankId("bankId").setBankIdType("bankIdType")).setReceiverBank(new BankInformationDto().setBankId("bankId").setBankIdType("bankIdType")).setMessageReference(
						"messageReference").setMessageIssuer("messageIssuer").setMessageType("messageType").setMessageXml("messageXml").setMessageCode("messageCode").setMessageRecipient("messageRecipient").setMessageExecutionStartTime("messageExecutionStartTime").setMessageExecutionEndTime("messageExecutionEndTime").setMessageExecutionDurationTime(1).setIpcePaymentStatusId("ipcePaymentStatusId").setCsm("csm").setInternalBankingOperationReference("internalBankingOperationReference").setExternalBankingOperationReference("externalBankingOperationReference").setId(1L).setOriginalMessageType("originalMessageType").setMessagePaymentStatus("messagePaymentStatus").setReasonCode("reasonCode").setPaymentProcessTypeCode("paymentProcessTypeCode").setStatusBefore("statusBefore").setStatusAfter("statusAfter").setOriginalMessageReference("originalMessageReference").setProcessingResult("processingResult");

		instantPaymentMessages.add(instantPaymentMessage);

		return new InstantPaymentMessagesResponseDto.InstantPaymentMessagesResponseDtoBuilder()
				.setInstantPaymentMessagesList(instantPaymentMessages)
				.setInstantPaymentMessagesListLength(instantPaymentMessages.size())
				.build();
	}
}
