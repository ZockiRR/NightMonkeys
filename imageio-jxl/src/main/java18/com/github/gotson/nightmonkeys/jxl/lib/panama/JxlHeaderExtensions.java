// Generated by jextract

package com.github.gotson.nightmonkeys.jxl.lib.panama;

import jdk.incubator.foreign.GroupLayout;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

public class JxlHeaderExtensions {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("extensions")
    );

    public static MemoryLayout $LAYOUT() {
        return JxlHeaderExtensions.$struct$LAYOUT;
    }

    static final VarHandle extensions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("extensions"));

    public static VarHandle extensions$VH() {
        return JxlHeaderExtensions.extensions$VH;
    }

    public static long extensions$get(MemorySegment seg) {
        return (long) JxlHeaderExtensions.extensions$VH.get(seg);
    }

    public static void extensions$set(MemorySegment seg, long x) {
        JxlHeaderExtensions.extensions$VH.set(seg, x);
    }

    public static long extensions$get(MemorySegment seg, long index) {
        return (long) JxlHeaderExtensions.extensions$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void extensions$set(MemorySegment seg, long index, long x) {
        JxlHeaderExtensions.extensions$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment allocate(ResourceScope scope) {
        return allocate(SegmentAllocator.nativeAllocator(scope));
    }

    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }

    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope);
    }
}


