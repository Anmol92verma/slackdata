package dev.baseio.slackdomain.domain.usecases

import dev.baseio.slackdomain.domain.model.channel.DomainLayerChannels
import dev.baseio.slackdomain.domain.model.message.DomainLayerMessages
import kotlinx.coroutines.flow.Flow

interface BaseUseCase<out Result, in ExecutableParam> {

  /**
   * Perform an operation with no input parameters.
   * Will throw an exception by default, if not implemented but invoked.
   *
   * @return
   */
  suspend fun perform(): Result = throw NotImplementedError()

  /**
   * Perform an operation.
   *  Will throw an exception by default, if not implemented but invoked.
   *
   * @param params
   * @return
   */
  suspend fun perform(params: ExecutableParam): Result? = throw NotImplementedError()

  fun performStreaming(params: ExecutableParam?): Flow<Result> = throw NotImplementedError()
}