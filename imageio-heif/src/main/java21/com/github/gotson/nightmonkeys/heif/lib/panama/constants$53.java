// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$53 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$53() {
    }

    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "heif_encoder_parameter_string_valid_values",
        constants$14.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(MemoryLayout.structLayout(
            JAVA_INT.withName("code"),
            JAVA_INT.withName("subcode"),
            RuntimeHelper.POINTER.withName("message")
        ).withName("heif_error"),
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "heif_encoder_parameter_integer_valid_values",
        constants$53.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "heif_encoder_set_parameter",
        constants$14.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "heif_encoder_get_parameter",
        constants$8.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "heif_encoder_has_default",
        constants$24.const$2
    );
}


