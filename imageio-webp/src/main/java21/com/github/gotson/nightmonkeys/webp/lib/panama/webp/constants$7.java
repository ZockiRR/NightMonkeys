// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "WebPGetDecoderVersion",
        constants$7.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "WebPGetInfo",
        constants$7.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "WebPDecodeRGBA",
        constants$7.const$4
    );
}


