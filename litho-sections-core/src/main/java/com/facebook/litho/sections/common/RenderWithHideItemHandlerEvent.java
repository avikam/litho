/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.litho.sections.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.litho.EventHandler;
import com.facebook.litho.annotations.Event;
import com.facebook.litho.widget.RenderInfo;

/**
 * An {@link Event} that gets triggered by a {@link HideableDataDiffSectionSpec} to render the edges
 * of the connection.
 *
 * <p>{@link RenderWithHideItemHandlerEvent} is triggered when the {@link
 * com.facebook.litho.sections.annotations.DiffSectionSpec} is generating the {@link
 * com.facebook.litho.sections.ChangeSet}.
 *
 * <p>This means that when {@link RenderWithHideItemHandlerEvent} is handled, the components are not
 * inserted into the adapter yet.
 *
 * @param index the index of the item in the collection.
 * @param model the edge model object.
 * @param hideItemHandler is the handler that should be used for hiding a model.
 * @param loggingExtras a bundle of logging extras we want to expose to the rendered component.
 */
@Event(returnType = RenderInfo.class)
public class RenderWithHideItemHandlerEvent {
  public int index;
  public Object model;
  public EventHandler<HideItemEvent> hideItemHandler;
  public @Nullable Bundle loggingExtras;
}
