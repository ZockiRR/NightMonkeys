// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$37 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$37() {
    }

    static final VarHandle const$0 = constants$34.const$3.varHandle(MemoryLayout.PathElement.groupElement("decoder_id"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "heif_decoding_options_alloc",
        constants$4.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "heif_decoding_options_free",
        constants$0.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(MemoryLayout.structLayout(
            JAVA_INT.withName("code"),
            JAVA_INT.withName("subcode"),
            RuntimeHelper.POINTER.withName("message")
        ).withName("heif_error"),
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "heif_decode_image",
        constants$37.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "heif_image_get_colorspace",
        constants$9.const$5
    );
}


