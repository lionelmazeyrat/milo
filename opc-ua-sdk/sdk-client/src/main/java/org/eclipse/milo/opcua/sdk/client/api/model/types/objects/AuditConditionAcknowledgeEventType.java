/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.client.api.model.types.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.api.model.types.variables.PropertyType;
import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;


public interface AuditConditionAcknowledgeEventType extends AuditConditionEventType {

    Property<ByteString> EVENT_ID = new BasicProperty<>(
        QualifiedName.parse("0:EventId"),
        NodeId.parse("ns=0;i=15"),
        -1,
        ByteString.class
    );

    Property<LocalizedText> COMMENT = new BasicProperty<>(
        QualifiedName.parse("0:Comment"),
        NodeId.parse("ns=0;i=21"),
        -1,
        LocalizedText.class
    );


    CompletableFuture<? extends PropertyType> eventId();

    CompletableFuture<ByteString> getEventId();

    CompletableFuture<StatusCode> setEventId(ByteString value);

    CompletableFuture<? extends PropertyType> comment();

    CompletableFuture<LocalizedText> getComment();

    CompletableFuture<StatusCode> setComment(LocalizedText value);


}