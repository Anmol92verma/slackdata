package dev.baseio.slackdata.injection

import dev.baseio.slackdomain.domain.usecases.channels.*
import dev.baseio.slackdomain.domain.usecases.chat.UseCaseSendMessage
import dev.baseio.slackdomain.domain.usecases.chat.UseCaseFetchMessages
import org.koin.dsl.module

val useCaseModule = module {
  single { UseCaseFetchChannels(get()) }
  single { UseCaseFetchChannelsWithLastMessage(get()) }
  single { UseCaseFetchMessages(get()) }
  single { UseCaseSendMessage(get()) }
  single { UseCaseCreateChannel(get()) }
  single { UseCaseCreateChannels(get()) }
  single { UseCaseGetChannel(get()) }
  single { UseCaseFetchChannelCount(get()) }
  single { UseCaseSearchChannel(get()) }
  single { UseCaseFetchUsers(get()) }
}