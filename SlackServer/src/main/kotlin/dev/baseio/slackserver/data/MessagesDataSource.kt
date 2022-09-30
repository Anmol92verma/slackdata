package dev.baseio.slackserver.data

import com.squareup.sqldelight.Query
import database.SkMessage
import kotlinx.coroutines.flow.Flow

interface MessagesDataSource {
  fun saveMessage(request: SkMessage): SkMessage
  fun getMessages(): Flow<Query<SkMessage>>
}