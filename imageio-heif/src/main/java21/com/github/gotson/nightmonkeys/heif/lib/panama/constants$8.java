// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$8 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$8() {
    }

    static final VarHandle const$0 = constants$7.const$2.varHandle(MemoryLayout.PathElement.groupElement("internal_handle"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(MemoryLayout.structLayout(
            JAVA_INT.withName("code"),
            JAVA_INT.withName("subcode"),
            RuntimeHelper.POINTER.withName("message")
        ).withName("heif_error"),
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "heif_load_plugin",
        constants$8.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(MemoryLayout.structLayout(
            JAVA_INT.withName("code"),
            JAVA_INT.withName("subcode"),
            RuntimeHelper.POINTER.withName("message")
        ).withName("heif_error"),
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "heif_load_plugins",
        constants$8.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "heif_unload_plugin",
        constants$6.const$5
    );
}


