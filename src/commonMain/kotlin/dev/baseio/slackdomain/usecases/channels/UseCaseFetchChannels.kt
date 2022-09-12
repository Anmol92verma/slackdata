package dev.baseio.slackdomain.usecases.channels

import dev.baseio.slackdomain.datasources.channels.SKDataSourceChannels
import dev.baseio.slackdomain.model.channel.DomainLayerChannels
import dev.baseio.slackdomain.usecases.BaseUseCase
import kotlinx.coroutines.flow.Flow

class UseCaseFetchChannels(
  private val skDataSourceChannels: SKDataSourceChannels,
) : BaseUseCase<List<DomainLayerChannels.SKChannel>, Unit> {

  override fun performStreamingNullable(params: Unit?): Flow<List<DomainLayerChannels.SKChannel>> {
    return skDataSourceChannels.fetchChannels()
  }

}
