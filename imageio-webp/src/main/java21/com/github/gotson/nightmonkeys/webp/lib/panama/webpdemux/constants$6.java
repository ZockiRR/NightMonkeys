// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webpdemux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$6 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$6() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "strtoumax",
        constants$5.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "wcstoimax",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "wcstoumax",
        constants$5.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "WebPMalloc",
        constants$6.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "WebPFree",
        constants$0.const$3
    );
}


