// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {
    }

    static final VarHandle const$0 = constants$1.const$5.varHandle(MemoryLayout.PathElement.groupElement("__sig"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__sig"),
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("__opaque")
    ).withName("_opaque_pthread_condattr_t");
    static final VarHandle const$2 = constants$2.const$1.varHandle(MemoryLayout.PathElement.groupElement("__sig"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__sig"),
        MemoryLayout.sequenceLayout(56, JAVA_BYTE).withName("__opaque")
    ).withName("_opaque_pthread_mutex_t");
    static final VarHandle const$4 = constants$2.const$3.varHandle(MemoryLayout.PathElement.groupElement("__sig"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__sig"),
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("__opaque")
    ).withName("_opaque_pthread_mutexattr_t");
}


