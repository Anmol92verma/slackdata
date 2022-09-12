package dev.baseio.slackdata.mapper

import database.SlackWorkspaces
import dev.baseio.slackdomain.model.workspaces.DomainLayerWorkspaces

class SlackWorkspaceMapper : EntityMapper<DomainLayerWorkspaces.SKWorkspace, SlackWorkspaces> {
  override fun mapToDomain(entity: SlackWorkspaces): DomainLayerWorkspaces.SKWorkspace {
    return DomainLayerWorkspaces.SKWorkspace(entity.uid, entity.name, entity.domain, entity.picUrl)
  }

  override fun mapToData(model: DomainLayerWorkspaces.SKWorkspace): SlackWorkspaces {
    return SlackWorkspaces(model.uuid, model.name, model.domain, model.picUrl)
  }
}