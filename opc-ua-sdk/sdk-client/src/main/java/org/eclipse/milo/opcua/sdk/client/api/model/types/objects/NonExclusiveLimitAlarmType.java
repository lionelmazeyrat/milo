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

import org.eclipse.milo.opcua.sdk.client.api.model.types.variables.TwoStateVariableType;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;


public interface NonExclusiveLimitAlarmType extends LimitAlarmType {


    CompletableFuture<? extends TwoStateVariableType> activeState();

    CompletableFuture<LocalizedText> getActiveState();

    CompletableFuture<StatusCode> setActiveState(LocalizedText value);

    CompletableFuture<? extends TwoStateVariableType> highHighState();

    CompletableFuture<LocalizedText> getHighHighState();

    CompletableFuture<StatusCode> setHighHighState(LocalizedText value);

    CompletableFuture<? extends TwoStateVariableType> highState();

    CompletableFuture<LocalizedText> getHighState();

    CompletableFuture<StatusCode> setHighState(LocalizedText value);

    CompletableFuture<? extends TwoStateVariableType> lowState();

    CompletableFuture<LocalizedText> getLowState();

    CompletableFuture<StatusCode> setLowState(LocalizedText value);

    CompletableFuture<? extends TwoStateVariableType> lowLowState();

    CompletableFuture<LocalizedText> getLowLowState();

    CompletableFuture<StatusCode> setLowLowState(LocalizedText value);

}