// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

final class constants$35 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$35() {
    }

    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("bytes"),
        JAVA_LONG.withName("size")
    ).withName("WebPData");
    static final VarHandle const$1 = constants$35.const$0.varHandle(MemoryLayout.PathElement.groupElement("bytes"));
    static final VarHandle const$2 = constants$35.const$0.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "WebPGetDemuxVersion",
        constants$7.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "WebPDemuxInternal",
        constants$35.const$4
    );
}

