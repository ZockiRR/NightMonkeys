// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {
    }

    static final VarHandle const$0 = constants$3.const$5.varHandle(MemoryLayout.PathElement.groupElement("__sig"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__sig"),
        RuntimeHelper.POINTER.withName("__cleanup_stack"),
        MemoryLayout.sequenceLayout(8176, JAVA_BYTE).withName("__opaque")
    ).withName("_opaque_pthread_t");
    static final VarHandle const$2 = constants$4.const$1.varHandle(MemoryLayout.PathElement.groupElement("__sig"));
    static final VarHandle const$3 = constants$4.const$1.varHandle(MemoryLayout.PathElement.groupElement("__cleanup_stack"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "heif_get_version",
        constants$4.const$4
    );
}


