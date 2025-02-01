package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos;

public class InstantPaymentMessagesListItemDto
{
	private String messageCreationDateTime;

	private String paymentTransactionId;

	private BankInformationDto issuerBank;

	private BankInformationDto receiverBank;

	private String messageReference;

	private String messageIssuer;

	private String messageType;

	private String messageXml;

	private String messageCode;

	private String messageRecipient;

	private String messageExecutionStartTime;

	private String messageExecutionEndTime;

	private Integer messageExecutionDurationTime;

	private String ipcePaymentStatusId;

	private String csm;

	private String internalBankingOperationReference;

	private String externalBankingOperationReference;

	private Long id;

	private String originalMessageType;

	private String messagePaymentStatus;

	private String reasonCode;

	private String paymentProcessTypeCode;

	private String statusBefore;

	private String statusAfter;

	private String originalMessageReference;

	private String processingResult;

	public String getMessageCreationDateTime()
	{
		return messageCreationDateTime;
	}

	public InstantPaymentMessagesListItemDto setMessageCreationDateTime(String messageCreationDateTime)
	{
		this.messageCreationDateTime = messageCreationDateTime;
		return this;
	}

	public String getPaymentTransactionId()
	{
		return paymentTransactionId;
	}

	public InstantPaymentMessagesListItemDto setPaymentTransactionId(String paymentTransactionId)
	{
		this.paymentTransactionId = paymentTransactionId;
		return this;
	}

	public BankInformationDto getIssuerBank()
	{
		return issuerBank;
	}

	public InstantPaymentMessagesListItemDto setIssuerBank(BankInformationDto issuerBank)
	{
		this.issuerBank = issuerBank;
		return this;
	}

	public BankInformationDto getReceiverBank()
	{
		return receiverBank;
	}

	public InstantPaymentMessagesListItemDto setReceiverBank(BankInformationDto receiverBank)
	{
		this.receiverBank = receiverBank;
		return this;
	}

	public String getMessageReference()
	{
		return messageReference;
	}

	public InstantPaymentMessagesListItemDto setMessageReference(String messageReference)
	{
		this.messageReference = messageReference;
		return this;
	}

	public String getMessageIssuer()
	{
		return messageIssuer;
	}

	public InstantPaymentMessagesListItemDto setMessageIssuer(String messageIssuer)
	{
		this.messageIssuer = messageIssuer;
		return this;
	}

	public String getMessageType()
	{
		return messageType;
	}

	public InstantPaymentMessagesListItemDto setMessageType(String messageType)
	{
		this.messageType = messageType;
		return this;
	}

	public String getMessageXml()
	{
		return messageXml;
	}

	public InstantPaymentMessagesListItemDto setMessageXml(String messageXml)
	{
		this.messageXml = messageXml;
		return this;
	}

	public String getMessageCode()
	{
		return messageCode;
	}

	public InstantPaymentMessagesListItemDto setMessageCode(String messageCode)
	{
		this.messageCode = messageCode;
		return this;
	}

	public String getMessageRecipient()
	{
		return messageRecipient;
	}

	public InstantPaymentMessagesListItemDto setMessageRecipient(String messageRecipient)
	{
		this.messageRecipient = messageRecipient;
		return this;
	}

	public String getMessageExecutionStartTime()
	{
		return messageExecutionStartTime;
	}

	public InstantPaymentMessagesListItemDto setMessageExecutionStartTime(String messageExecutionStartTime)
	{
		this.messageExecutionStartTime = messageExecutionStartTime;
		return this;
	}

	public String getMessageExecutionEndTime()
	{
		return messageExecutionEndTime;
	}

	public InstantPaymentMessagesListItemDto setMessageExecutionEndTime(String messageExecutionEndTime)
	{
		this.messageExecutionEndTime = messageExecutionEndTime;
		return this;
	}

	public Integer getMessageExecutionDurationTime()
	{
		return messageExecutionDurationTime;
	}

	public InstantPaymentMessagesListItemDto setMessageExecutionDurationTime(Integer messageExecutionDurationTime)
	{
		this.messageExecutionDurationTime = messageExecutionDurationTime;
		return this;
	}

	public String getIpcePaymentStatusId()
	{
		return ipcePaymentStatusId;
	}

	public InstantPaymentMessagesListItemDto setIpcePaymentStatusId(String ipcePaymentStatusId)
	{
		this.ipcePaymentStatusId = ipcePaymentStatusId;
		return this;
	}

	public String getCsm()
	{
		return csm;
	}

	public InstantPaymentMessagesListItemDto setCsm(String csm)
	{
		this.csm = csm;
		return this;
	}

	public String getInternalBankingOperationReference()
	{
		return internalBankingOperationReference;
	}

	public InstantPaymentMessagesListItemDto setInternalBankingOperationReference(String internalBankingOperationReference)
	{
		this.internalBankingOperationReference = internalBankingOperationReference;
		return this;
	}

	public String getExternalBankingOperationReference()
	{
		return externalBankingOperationReference;
	}

	public InstantPaymentMessagesListItemDto setExternalBankingOperationReference(String externalBankingOperationReference)
	{
		this.externalBankingOperationReference = externalBankingOperationReference;
		return this;
	}

	public Long getId()
	{
		return id;
	}

	public InstantPaymentMessagesListItemDto setId(Long id)
	{
		this.id = id;
		return this;
	}

	public String getOriginalMessageType()
	{
		return originalMessageType;
	}

	public InstantPaymentMessagesListItemDto setOriginalMessageType(String originalMessageType)
	{
		this.originalMessageType = originalMessageType;
		return this;
	}

	public String getMessagePaymentStatus()
	{
		return messagePaymentStatus;
	}

	public InstantPaymentMessagesListItemDto setMessagePaymentStatus(String messagePaymentStatus)
	{
		this.messagePaymentStatus = messagePaymentStatus;
		return this;
	}

	public String getReasonCode()
	{
		return reasonCode;
	}

	public InstantPaymentMessagesListItemDto setReasonCode(String reasonCode)
	{
		this.reasonCode = reasonCode;
		return this;
	}

	public String getPaymentProcessTypeCode()
	{
		return paymentProcessTypeCode;
	}

	public InstantPaymentMessagesListItemDto setPaymentProcessTypeCode(String paymentProcessTypeCode)
	{
		this.paymentProcessTypeCode = paymentProcessTypeCode;
		return this;
	}

	public String getStatusBefore()
	{
		return statusBefore;
	}

	public InstantPaymentMessagesListItemDto setStatusBefore(String statusBefore)
	{
		this.statusBefore = statusBefore;
		return this;
	}

	public String getStatusAfter()
	{
		return statusAfter;
	}

	public InstantPaymentMessagesListItemDto setStatusAfter(String statusAfter)
	{
		this.statusAfter = statusAfter;
		return this;
	}

	public String getOriginalMessageReference()
	{
		return originalMessageReference;
	}

	public InstantPaymentMessagesListItemDto setOriginalMessageReference(String originalMessageReference)
	{
		this.originalMessageReference = originalMessageReference;
		return this;
	}

	public String getProcessingResult()
	{
		return processingResult;
	}

	public InstantPaymentMessagesListItemDto setProcessingResult(String processingResult)
	{
		this.processingResult = processingResult;
		return this;
	}

	@Override
	public String toString()
	{
		return "InstantPaymentMessagesListItemDto{" + "messageCreationDateTime='" + messageCreationDateTime + '\'' + ", paymentTransactionId='" + paymentTransactionId + '\'' + ", issuerBank=" + issuerBank + ", receiverBank=" + receiverBank + ", messageReference='" + messageReference + '\'' + ", messageIssuer='" + messageIssuer + '\'' + ", messageType='" + messageType + '\'' + ", messageXml='" + messageXml + '\'' + ", messageCode='" + messageCode + '\'' + ", messageRecipient='" + messageRecipient + '\'' + ", messageExecutionStartTime='" + messageExecutionStartTime + '\'' + ", messageExecutionEndTime='" + messageExecutionEndTime + '\'' + ", messageExecutionDurationTime=" + messageExecutionDurationTime + ", ipcePaymentStatusId='" + ipcePaymentStatusId + '\'' + ", csm='" + csm + '\'' + ", internalBankingOperationReference='" + internalBankingOperationReference + '\'' + ", externalBankingOperationReference='" + externalBankingOperationReference + '\'' + ", id=" + id + ", originalMessageType='" + originalMessageType + '\'' + ", messagePaymentStatus='" + messagePaymentStatus + '\'' + ", reasonCode='" + reasonCode + '\'' + ", paymentProcessTypeCode='" + paymentProcessTypeCode + '\'' + ", statusBefore='" + statusBefore + '\'' + ", statusAfter='" + statusAfter + '\'' + ", originalMessageReference='" + originalMessageReference + '\'' + ", processingResult='" + processingResult + '\'' + '}';
	}

}
