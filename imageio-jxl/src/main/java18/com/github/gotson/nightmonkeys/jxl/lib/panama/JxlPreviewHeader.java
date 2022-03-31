// Generated by jextract

package com.github.gotson.nightmonkeys.jxl.lib.panama;

import jdk.incubator.foreign.GroupLayout;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

/**
 * The codestream preview header
 */
public class JxlPreviewHeader {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("xsize"),
        Constants$root.C_INT$LAYOUT.withName("ysize")
    );

    public static MemoryLayout $LAYOUT() {
        return JxlPreviewHeader.$struct$LAYOUT;
    }

    static final VarHandle xsize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xsize"));

    public static VarHandle xsize$VH() {
        return JxlPreviewHeader.xsize$VH;
    }

    /**
     * Preview width in pixels
     */
    public static int xsize$get(MemorySegment seg) {
        return (int) JxlPreviewHeader.xsize$VH.get(seg);
    }

    /**
     * Preview width in pixels
     */
    public static void xsize$set(MemorySegment seg, int x) {
        JxlPreviewHeader.xsize$VH.set(seg, x);
    }

    /**
     * Preview width in pixels
     */
    public static int xsize$get(MemorySegment seg, long index) {
        return (int) JxlPreviewHeader.xsize$VH.get(seg.asSlice(index * sizeof()));
    }

    /**
     * Preview width in pixels
     */
    public static void xsize$set(MemorySegment seg, long index, int x) {
        JxlPreviewHeader.xsize$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle ysize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ysize"));

    public static VarHandle ysize$VH() {
        return JxlPreviewHeader.ysize$VH;
    }

    /**
     * Preview height in pixels
     */
    public static int ysize$get(MemorySegment seg) {
        return (int) JxlPreviewHeader.ysize$VH.get(seg);
    }

    /**
     * Preview height in pixels
     */
    public static void ysize$set(MemorySegment seg, int x) {
        JxlPreviewHeader.ysize$VH.set(seg, x);
    }

    /**
     * Preview height in pixels
     */
    public static int ysize$get(MemorySegment seg, long index) {
        return (int) JxlPreviewHeader.ysize$VH.get(seg.asSlice(index * sizeof()));
    }

    /**
     * Preview height in pixels
     */
    public static void ysize$set(MemorySegment seg, long index, int x) {
        JxlPreviewHeader.ysize$VH.set(seg.asSlice(index * sizeof()), x);
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


