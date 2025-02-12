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

package com.facebook.litho.sections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Classes with this annotation will generate the <code>ChangeSet</code> a list should display.
 *
 * <p>For example:
 *
 * <pre>
 *
 * {@literal @}DiffSectionSpec
 *  public class MyDiffSectionSpec {
 *
 *   {@literal @}OnDiff
 *    protected void onDiff(
 *        SectionContext c,
 *        ChangeSet changeSet,
 *       {@code Diff<MyProp>} prop) {
 *
 *      if(prop.getPrevious() == null) {
 *        changeSet.add(Change.insert(...));
 *      } else {
 *        changeSet.add(Change.update(...));
 *      }
 *    }
 *  }
 * </pre>
 *
 * @see GroupSectionSpec
 * @see OnViewportChanged
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DiffSectionSpec {
  String value() default "";

  /** List of event POJOs this component can dispatch. Used to generate event dispatch methods. */
  Class<?>[] events() default {};

  /**
   * @return Boolean indicating whether the generated class should be public. If not, it will be
   *     package-private.
   */
  boolean isPublic() default true;
}
