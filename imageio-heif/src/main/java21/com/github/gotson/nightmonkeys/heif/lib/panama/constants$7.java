// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {
    }

    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid();
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "heif_deinit",
        constants$7.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("version"),
        JAVA_INT.withName("type"),
        RuntimeHelper.POINTER.withName("plugin"),
        RuntimeHelper.POINTER.withName("internal_handle")
    ).withName("heif_plugin_info");
    static final VarHandle const$3 = constants$7.const$2.varHandle(MemoryLayout.PathElement.groupElement("version"));
    static final VarHandle const$4 = constants$7.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$7.const$2.varHandle(MemoryLayout.PathElement.groupElement("plugin"));
}


