/* with
 char|byte|short|int|long|float|double|obj elem
 Mutable|Immutable mutability
*/
/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.collect.impl.hash;

import net.openhft.collect.CharCursor;
import net.openhft.collect.impl.*;
import net.openhft.collect.set.hash.HashCharSet;
import org.jetbrains.annotations.NotNull;

import java.util.*;


public class MutableDHashCharSetGO/*<>*/ extends MutableCharDHashSetSO/*<>*/
        implements HashCharSet/*<>*/, InternalCharCollectionOps/*<>*/ {

    public int hashCode() {
        return setHashCode();
    }

    @Override
    public String toString() {
        return setToString();
    }

    public boolean equals(Object obj) {
        return CommonSetOps.equals(this, obj);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return CommonCharCollectionOps.containsAll(this, c);
    }

    @NotNull
    @Override
    public CharCursor/*<>*/ cursor() {
        return setCursor();
    }


    /* if !(obj elem) */
    @Override
    public boolean add(Character e) {
        return add(e.charValue());
    }
    /* endif */

    @Override
    public boolean add(char key) {
        /* template Add */ throw new NotGenerated(); /* endtemplate */
    }

    /* if obj elem */
    private boolean addNullKey() {
        /* template Add with null elem */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */

    @Override
    public boolean addAll(@NotNull Collection<? extends Character> c) {
        return CommonCharCollectionOps.addAll(this, c);
    }

    @Override
    public boolean remove(Object key) {
        /* if !(obj elem) */
        return removeChar(((Character) key).charValue());
        /* elif obj elem //
        /* template Remove */
        // endif */
    }

    /* if obj elem */
    private boolean removeNullKey() {
        /* template Remove with null elem */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */

    /* if !(obj elem) */
    @Override
    public boolean removeChar(char key) {
        /* template Remove */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */
}