// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {
    }

    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "heif_context_read_from_memory_without_copy",
        constants$14.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(MemoryLayout.structLayout(
            JAVA_INT.withName("code"),
            JAVA_INT.withName("subcode"),
            RuntimeHelper.POINTER.withName("message")
        ).withName("heif_error"),
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "heif_context_read_from_reader",
        constants$15.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "heif_context_get_number_of_top_level_images",
        constants$9.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "heif_context_is_top_level_image_ID",
        constants$9.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "heif_context_get_list_of_top_level_image_IDs",
        constants$15.const$5
    );
}


