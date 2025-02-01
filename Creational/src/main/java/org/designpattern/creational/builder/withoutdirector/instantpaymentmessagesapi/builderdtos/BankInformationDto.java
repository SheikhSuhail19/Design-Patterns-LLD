package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos;

public final class BankInformationDto
{
	private String bankId;

	private String bankIdType;

	public String getBankId()
	{
		return bankId;
	}

	public BankInformationDto setBankId(String bankId)
	{
		this.bankId = bankId;
		return this;
	}

	public String getBankIdType()
	{
		return bankIdType;
	}

	public BankInformationDto setBankIdType(String bankIdType)
	{
		this.bankIdType = bankIdType;
		return this;
	}

	@Override
	public String toString()
	{
		return "BankInformationDto{" +
				"bankId='" + bankId + '\'' +
				", bankIdType='" + bankIdType + '\'' +
				'}';
	}

}