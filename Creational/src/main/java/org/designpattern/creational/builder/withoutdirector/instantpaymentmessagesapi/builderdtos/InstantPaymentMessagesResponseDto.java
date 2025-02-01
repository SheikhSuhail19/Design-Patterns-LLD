package org.designpattern.creational.builder.withoutdirector.instantpaymentmessagesapi.builderdtos;

import java.util.List;

public class InstantPaymentMessagesResponseDto
{
	private final int instantPaymentMessagesListLength;

	private final List<InstantPaymentMessagesListItemDto> instantPaymentMessagesList;

	private InstantPaymentMessagesResponseDto(InstantPaymentMessagesResponseDtoBuilder builder)
	{
		this.instantPaymentMessagesListLength = builder.instantPaymentMessagesListLength;
		this.instantPaymentMessagesList = builder.instantPaymentMessagesList;
	}

	public int getInstantPaymentMessagesListLength()
	{
		return instantPaymentMessagesListLength;
	}

	public List<InstantPaymentMessagesListItemDto> getInstantPaymentMessagesList()
	{
		return instantPaymentMessagesList;
	}

	@Override
	public String toString()
	{
		return "MessagesExtractionResponseDto{" + "instantPaymentMessagesListLength=" + instantPaymentMessagesListLength
				+ ", instantPaymentMessagesList=" + instantPaymentMessagesList + '}';
	}

	public static class InstantPaymentMessagesResponseDtoBuilder
	{
		private int instantPaymentMessagesListLength;

		private List<InstantPaymentMessagesListItemDto> instantPaymentMessagesList;

		public InstantPaymentMessagesResponseDtoBuilder setInstantPaymentMessagesListLength(
				int instantPaymentMessagesListLength)
		{
			this.instantPaymentMessagesListLength = instantPaymentMessagesListLength;
			return this;
		}

		public InstantPaymentMessagesResponseDtoBuilder setInstantPaymentMessagesList(
				List<InstantPaymentMessagesListItemDto> instantPaymentMessagesList)
		{
			this.instantPaymentMessagesList = instantPaymentMessagesList;
			return this;
		}

		public InstantPaymentMessagesResponseDto build()
		{
			return new InstantPaymentMessagesResponseDto(this);
		}
	}
}
