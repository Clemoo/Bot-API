package fr.lukam.bot.api.events.message.reactions.server;

import fr.lukam.bot.api.events.message.reactions.generic.MessageReactionEvent;
import fr.lukam.bot.api.events.server.member.ServerMemberEvent;

public interface ServerMessageReactionAddedEvent extends MessageReactionEvent, ServerMemberEvent {
}
