// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama;

import jdk.incubator.foreign.FunctionDescriptor;

import java.lang.invoke.MethodHandle;

class constants$18 {

    static final FunctionDescriptor WebPDemux$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WebPDemux$MH = RuntimeHelper.downcallHandle(
        "WebPDemux",
        constants$18.WebPDemux$FUNC, false
    );
    static final FunctionDescriptor WebPDemuxPartial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WebPDemuxPartial$MH = RuntimeHelper.downcallHandle(
        "WebPDemuxPartial",
        constants$18.WebPDemuxPartial$FUNC, false
    );
    static final FunctionDescriptor WebPDemuxDelete$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WebPDemuxDelete$MH = RuntimeHelper.downcallHandle(
        "WebPDemuxDelete",
        constants$18.WebPDemuxDelete$FUNC, false
    );
    static final FunctionDescriptor WebPDemuxGetI$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle WebPDemuxGetI$MH = RuntimeHelper.downcallHandle(
        "WebPDemuxGetI",
        constants$18.WebPDemuxGetI$FUNC, false
    );
    static final FunctionDescriptor WebPDemuxGetFrame$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WebPDemuxGetFrame$MH = RuntimeHelper.downcallHandle(
        "WebPDemuxGetFrame",
        constants$18.WebPDemuxGetFrame$FUNC, false
    );
    static final FunctionDescriptor WebPDemuxNextFrame$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WebPDemuxNextFrame$MH = RuntimeHelper.downcallHandle(
        "WebPDemuxNextFrame",
        constants$18.WebPDemuxNextFrame$FUNC, false
    );
}


