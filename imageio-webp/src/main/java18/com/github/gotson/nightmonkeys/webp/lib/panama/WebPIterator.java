// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama;

import jdk.incubator.foreign.GroupLayout;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

public class WebPIterator {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("frame_num"),
        Constants$root.C_INT$LAYOUT.withName("num_frames"),
        Constants$root.C_INT$LAYOUT.withName("x_offset"),
        Constants$root.C_INT$LAYOUT.withName("y_offset"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("duration"),
        Constants$root.C_INT$LAYOUT.withName("dispose_method"),
        Constants$root.C_INT$LAYOUT.withName("complete"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("bytes"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("size")
        ).withName("fragment"),
        Constants$root.C_INT$LAYOUT.withName("has_alpha"),
        Constants$root.C_INT$LAYOUT.withName("blend_method"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("pad"),
        Constants$root.C_POINTER$LAYOUT.withName("private_")
    ).withName("WebPIterator");

    public static MemoryLayout $LAYOUT() {
        return WebPIterator.$struct$LAYOUT;
    }

    static final VarHandle frame_num$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frame_num"));

    public static VarHandle frame_num$VH() {
        return WebPIterator.frame_num$VH;
    }

    public static int frame_num$get(MemorySegment seg) {
        return (int) WebPIterator.frame_num$VH.get(seg);
    }

    public static void frame_num$set(MemorySegment seg, int x) {
        WebPIterator.frame_num$VH.set(seg, x);
    }

    public static int frame_num$get(MemorySegment seg, long index) {
        return (int) WebPIterator.frame_num$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void frame_num$set(MemorySegment seg, long index, int x) {
        WebPIterator.frame_num$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle num_frames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_frames"));

    public static VarHandle num_frames$VH() {
        return WebPIterator.num_frames$VH;
    }

    public static int num_frames$get(MemorySegment seg) {
        return (int) WebPIterator.num_frames$VH.get(seg);
    }

    public static void num_frames$set(MemorySegment seg, int x) {
        WebPIterator.num_frames$VH.set(seg, x);
    }

    public static int num_frames$get(MemorySegment seg, long index) {
        return (int) WebPIterator.num_frames$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void num_frames$set(MemorySegment seg, long index, int x) {
        WebPIterator.num_frames$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle x_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_offset"));

    public static VarHandle x_offset$VH() {
        return WebPIterator.x_offset$VH;
    }

    public static int x_offset$get(MemorySegment seg) {
        return (int) WebPIterator.x_offset$VH.get(seg);
    }

    public static void x_offset$set(MemorySegment seg, int x) {
        WebPIterator.x_offset$VH.set(seg, x);
    }

    public static int x_offset$get(MemorySegment seg, long index) {
        return (int) WebPIterator.x_offset$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void x_offset$set(MemorySegment seg, long index, int x) {
        WebPIterator.x_offset$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle y_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_offset"));

    public static VarHandle y_offset$VH() {
        return WebPIterator.y_offset$VH;
    }

    public static int y_offset$get(MemorySegment seg) {
        return (int) WebPIterator.y_offset$VH.get(seg);
    }

    public static void y_offset$set(MemorySegment seg, int x) {
        WebPIterator.y_offset$VH.set(seg, x);
    }

    public static int y_offset$get(MemorySegment seg, long index) {
        return (int) WebPIterator.y_offset$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void y_offset$set(MemorySegment seg, long index, int x) {
        WebPIterator.y_offset$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));

    public static VarHandle width$VH() {
        return WebPIterator.width$VH;
    }

    public static int width$get(MemorySegment seg) {
        return (int) WebPIterator.width$VH.get(seg);
    }

    public static void width$set(MemorySegment seg, int x) {
        WebPIterator.width$VH.set(seg, x);
    }

    public static int width$get(MemorySegment seg, long index) {
        return (int) WebPIterator.width$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void width$set(MemorySegment seg, long index, int x) {
        WebPIterator.width$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));

    public static VarHandle height$VH() {
        return WebPIterator.height$VH;
    }

    public static int height$get(MemorySegment seg) {
        return (int) WebPIterator.height$VH.get(seg);
    }

    public static void height$set(MemorySegment seg, int x) {
        WebPIterator.height$VH.set(seg, x);
    }

    public static int height$get(MemorySegment seg, long index) {
        return (int) WebPIterator.height$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void height$set(MemorySegment seg, long index, int x) {
        WebPIterator.height$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle duration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("duration"));

    public static VarHandle duration$VH() {
        return WebPIterator.duration$VH;
    }

    public static int duration$get(MemorySegment seg) {
        return (int) WebPIterator.duration$VH.get(seg);
    }

    public static void duration$set(MemorySegment seg, int x) {
        WebPIterator.duration$VH.set(seg, x);
    }

    public static int duration$get(MemorySegment seg, long index) {
        return (int) WebPIterator.duration$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void duration$set(MemorySegment seg, long index, int x) {
        WebPIterator.duration$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle dispose_method$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dispose_method"));

    public static VarHandle dispose_method$VH() {
        return WebPIterator.dispose_method$VH;
    }

    public static int dispose_method$get(MemorySegment seg) {
        return (int) WebPIterator.dispose_method$VH.get(seg);
    }

    public static void dispose_method$set(MemorySegment seg, int x) {
        WebPIterator.dispose_method$VH.set(seg, x);
    }

    public static int dispose_method$get(MemorySegment seg, long index) {
        return (int) WebPIterator.dispose_method$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void dispose_method$set(MemorySegment seg, long index, int x) {
        WebPIterator.dispose_method$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle complete$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("complete"));

    public static VarHandle complete$VH() {
        return WebPIterator.complete$VH;
    }

    public static int complete$get(MemorySegment seg) {
        return (int) WebPIterator.complete$VH.get(seg);
    }

    public static void complete$set(MemorySegment seg, int x) {
        WebPIterator.complete$VH.set(seg, x);
    }

    public static int complete$get(MemorySegment seg, long index) {
        return (int) WebPIterator.complete$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void complete$set(MemorySegment seg, long index, int x) {
        WebPIterator.complete$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment fragment$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }

    static final VarHandle has_alpha$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("has_alpha"));

    public static VarHandle has_alpha$VH() {
        return WebPIterator.has_alpha$VH;
    }

    public static int has_alpha$get(MemorySegment seg) {
        return (int) WebPIterator.has_alpha$VH.get(seg);
    }

    public static void has_alpha$set(MemorySegment seg, int x) {
        WebPIterator.has_alpha$VH.set(seg, x);
    }

    public static int has_alpha$get(MemorySegment seg, long index) {
        return (int) WebPIterator.has_alpha$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void has_alpha$set(MemorySegment seg, long index, int x) {
        WebPIterator.has_alpha$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle blend_method$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blend_method"));

    public static VarHandle blend_method$VH() {
        return WebPIterator.blend_method$VH;
    }

    public static int blend_method$get(MemorySegment seg) {
        return (int) WebPIterator.blend_method$VH.get(seg);
    }

    public static void blend_method$set(MemorySegment seg, int x) {
        WebPIterator.blend_method$VH.set(seg, x);
    }

    public static int blend_method$get(MemorySegment seg, long index) {
        return (int) WebPIterator.blend_method$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void blend_method$set(MemorySegment seg, long index, int x) {
        WebPIterator.blend_method$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(64, 8);
    }

    static final VarHandle private_$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("private_"));

    public static VarHandle private_$VH() {
        return WebPIterator.private_$VH;
    }

    public static MemoryAddress private_$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress) WebPIterator.private_$VH.get(seg);
    }

    public static void private_$set(MemorySegment seg, MemoryAddress x) {
        WebPIterator.private_$VH.set(seg, x);
    }

    public static MemoryAddress private_$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress) WebPIterator.private_$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void private_$set(MemorySegment seg, long index, MemoryAddress x) {
        WebPIterator.private_$VH.set(seg.asSlice(index * sizeof()), x);
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


