// Generated by jextract

package com.github.gotson.nightmonkeys.jxl.lib.panama;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.NativeSymbol;
import jdk.incubator.foreign.ResourceScope;

public interface jpegxl_free_func {

    void apply(jdk.incubator.foreign.MemoryAddress opaque, jdk.incubator.foreign.MemoryAddress address);

    static NativeSymbol allocate(jpegxl_free_func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(jpegxl_free_func.class, fi, constants$0.jpegxl_free_func$FUNC,
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }

    static jpegxl_free_func ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("jpegxl_free_func::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
        return (jdk.incubator.foreign.MemoryAddress opaque, jdk.incubator.foreign.MemoryAddress address) -> {
            try {
                constants$0.jpegxl_free_func$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable) opaque, (jdk.incubator.foreign.Addressable) address);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

