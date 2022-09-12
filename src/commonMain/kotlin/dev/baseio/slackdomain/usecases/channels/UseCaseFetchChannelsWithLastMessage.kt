package dev.baseio.slackdomain.usecases.channels


import dev.baseio.slackdomain.model.message.DomainLayerMessages
import dev.baseio.slackdomain.datasources.channels.SKDataSourceChannelLastMessage
import dev.baseio.slackdomain.usecases.BaseUseCase
import kotlinx.coroutines.flow.Flow

class UseCaseFetchChannelsWithLastMessage(private val SKDataSourceChannelLastMessage: SKDataSourceChannelLastMessage) :
  BaseUseCase<List<DomainLayerMessages.SKLastMessage>, Unit> {

  override fun performStreamingNullable(params: Unit?): Flow<List<DomainLayerMessages.SKLastMessage>> {
    return SKDataSourceChannelLastMessage.fetchChannels()
  }

}