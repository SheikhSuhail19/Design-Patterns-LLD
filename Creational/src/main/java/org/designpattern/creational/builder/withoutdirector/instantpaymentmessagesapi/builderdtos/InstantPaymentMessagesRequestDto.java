package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos;

public class InstantPaymentMessagesRequestDto
{
	private final String paymentTransactionId;

	private final String issuerBankId;

	private final String issuerBankIdType;

	private final String internalBankingOperationReference;

	private final String externalBankingOperationReference;

	private final String startCreationDateTime;

	private final String endCreationDateTime;

	private final String messageCode;

	private final String csm;

	private final String companyCode;

	private final String messageId;

	private final String messageIssuer;

	private final String messageType;

	private final String processingResult;

	private final String paymentProcessTypeCode;

	private final Boolean collapse;

	private final String range;

	private final String sort;

	private InstantPaymentMessagesRequestDto(InstantPaymentMessagesRequestDtoBuilder builder)
	{
		this.paymentTransactionId = builder.paymentTransactionId;
		this.issuerBankId = builder.issuerBankId;
		this.issuerBankIdType = builder.issuerBankIdType;
		this.internalBankingOperationReference = builder.internalBankingOperationReference;
		this.externalBankingOperationReference = builder.externalBankingOperationReference;
		this.startCreationDateTime = builder.startCreationDateTime;
		this.endCreationDateTime = builder.endCreationDateTime;
		this.messageCode = builder.messageCode;
		this.csm = builder.csm;
		this.companyCode = builder.companyCode;
		this.messageId = builder.messageId;
		this.messageIssuer = builder.messageIssuer;
		this.messageType = builder.messageType;
		this.processingResult = builder.processingResult;
		this.paymentProcessTypeCode = builder.paymentProcessTypeCode;
		this.collapse = builder.collapse;
		this.range = builder.range;
		this.sort = builder.sort;
	}

	public String getPaymentTransactionId()
	{
		return paymentTransactionId;
	}

	public String getIssuerBankId()
	{
		return issuerBankId;
	}

	public String getIssuerBankIdType()
	{
		return issuerBankIdType;
	}

	public String getInternalBankingOperationReference()
	{
		return internalBankingOperationReference;
	}

	public String getExternalBankingOperationReference()
	{
		return externalBankingOperationReference;
	}

	public String getStartCreationDateTime()
	{
		return startCreationDateTime;
	}

	public String getEndCreationDateTime()
	{
		return endCreationDateTime;
	}

	public String getMessageCode()
	{
		return messageCode;
	}

	public String getCsm()
	{
		return csm;
	}

	public String getCompanyCode()
	{
		return companyCode;
	}

	public String getMessageId()
	{
		return messageId;
	}

	public String getMessageIssuer()
	{
		return messageIssuer;
	}

	public String getMessageType()
	{
		return messageType;
	}

	public String getProcessingResult()
	{
		return processingResult;
	}

	public String getPaymentProcessTypeCode()
	{
		return paymentProcessTypeCode;
	}

	public Boolean getCollapse()
	{
		return collapse;
	}

	public String getRange()
	{
		return range;
	}

	public String getSort()
	{
		return sort;
	}

	@Override
	public String toString()
	{
		return "InstantPaymentMessagesRequestDto{" +
				"paymentTransactionId='" + paymentTransactionId + '\'' +
				", issuerBankId='" + issuerBankId + '\'' +
				", issuerBankIdType='" + issuerBankIdType + '\'' +
				", internalBankingOperationReference='" + internalBankingOperationReference + '\'' +
				", externalBankingOperationReference='" + externalBankingOperationReference + '\'' +
				", startCreationDateTime='" + startCreationDateTime + '\'' +
				", endCreationDateTime='" + endCreationDateTime + '\'' +
				", messageCode='" + messageCode + '\'' +
				", csm='" + csm + '\'' +
				", companyCode='" + companyCode + '\'' +
				", messageId='" + messageId + '\'' +
				", messageIssuer='" + messageIssuer + '\'' +
				", messageType='" + messageType + '\'' +
				", processingResult='" + processingResult + '\'' +
				", paymentProcessTypeCode='" + paymentProcessTypeCode + '\'' +
				", collapse=" + collapse +
				", range='" + range + '\'' +
				", sort='" + sort + '\'' +
				'}';
	}

	public static class InstantPaymentMessagesRequestDtoBuilder
	{
		private String paymentTransactionId;

		private String issuerBankId;

		private String issuerBankIdType;

		private String internalBankingOperationReference;

		private String externalBankingOperationReference;

		private String startCreationDateTime;

		private String endCreationDateTime;

		private String messageCode;

		private String csm;

		private String companyCode;

		private String messageId;

		private String messageIssuer;

		private String messageType;

		private String processingResult;

		private String paymentProcessTypeCode;

		private Boolean collapse;

		private String range;

		private String sort;

		public InstantPaymentMessagesRequestDtoBuilder setPaymentTransactionId(String paymentTransactionId)
		{
			this.paymentTransactionId = paymentTransactionId;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setIssuerBankId(String issuerBankId)
		{
			this.issuerBankId = issuerBankId;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setIssuerBankIdType(String issuerBankIdType)
		{
			this.issuerBankIdType = issuerBankIdType;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setInternalBankingOperationReference(
				String internalBankingOperationReference)
		{
			this.internalBankingOperationReference = internalBankingOperationReference;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setExternalBankingOperationReference(
				String externalBankingOperationReference)
		{
			this.externalBankingOperationReference = externalBankingOperationReference;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setStartCreationDateTime(String startCreationDateTime)
		{
			this.startCreationDateTime = startCreationDateTime;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setEndCreationDateTime(String endCreationDateTime)
		{
			this.endCreationDateTime = endCreationDateTime;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setMessageCode(String messageCode)
		{
			this.messageCode = messageCode;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setCsm(String csm)
		{
			this.csm = csm;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setCompanyCode(String companyCode)
		{
			this.companyCode = companyCode;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setMessageId(String messageId)
		{
			this.messageId = messageId;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setMessageIssuer(String messageIssuer)
		{
			this.messageIssuer = messageIssuer;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setMessageType(String messageType)
		{
			this.messageType = messageType;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setProcessingResult(String processingResult)
		{
			this.processingResult = processingResult;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setPaymentProcessTypeCode(String paymentProcessTypeCode)
		{
			this.paymentProcessTypeCode = paymentProcessTypeCode;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setCollapse(Boolean collapse)
		{
			this.collapse = collapse;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setRange(String range)
		{
			this.range = range;
			return this;
		}

		public InstantPaymentMessagesRequestDtoBuilder setSort(String sort)
		{
			this.sort = sort;
			return this;
		}

		public InstantPaymentMessagesRequestDto build()
		{
			return new InstantPaymentMessagesRequestDto(this);
		}
	}

}
