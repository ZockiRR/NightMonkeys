// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class WebPYUVABuffer {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("y"),
        Constants$root.C_POINTER$LAYOUT.withName("u"),
        Constants$root.C_POINTER$LAYOUT.withName("v"),
        Constants$root.C_POINTER$LAYOUT.withName("a"),
        Constants$root.C_INT$LAYOUT.withName("y_stride"),
        Constants$root.C_INT$LAYOUT.withName("u_stride"),
        Constants$root.C_INT$LAYOUT.withName("v_stride"),
        Constants$root.C_INT$LAYOUT.withName("a_stride"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("y_size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("u_size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("a_size")
    ).withName("WebPYUVABuffer");
    public static MemoryLayout $LAYOUT() {
        return WebPYUVABuffer.$struct$LAYOUT;
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return WebPYUVABuffer.y$VH;
    }
    public static MemoryAddress y$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, MemoryAddress x) {
        WebPYUVABuffer.y$VH.set(seg, x);
    }
    public static MemoryAddress y$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, MemoryAddress x) {
        WebPYUVABuffer.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle u$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("u"));
    public static VarHandle u$VH() {
        return WebPYUVABuffer.u$VH;
    }
    public static MemoryAddress u$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.u$VH.get(seg);
    }
    public static void u$set( MemorySegment seg, MemoryAddress x) {
        WebPYUVABuffer.u$VH.set(seg, x);
    }
    public static MemoryAddress u$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.u$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void u$set(MemorySegment seg, long index, MemoryAddress x) {
        WebPYUVABuffer.u$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v"));
    public static VarHandle v$VH() {
        return WebPYUVABuffer.v$VH;
    }
    public static MemoryAddress v$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.v$VH.get(seg);
    }
    public static void v$set( MemorySegment seg, MemoryAddress x) {
        WebPYUVABuffer.v$VH.set(seg, x);
    }
    public static MemoryAddress v$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.v$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v$set(MemorySegment seg, long index, MemoryAddress x) {
        WebPYUVABuffer.v$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle a$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("a"));
    public static VarHandle a$VH() {
        return WebPYUVABuffer.a$VH;
    }
    public static MemoryAddress a$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.a$VH.get(seg);
    }
    public static void a$set( MemorySegment seg, MemoryAddress x) {
        WebPYUVABuffer.a$VH.set(seg, x);
    }
    public static MemoryAddress a$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)WebPYUVABuffer.a$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void a$set(MemorySegment seg, long index, MemoryAddress x) {
        WebPYUVABuffer.a$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_stride$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_stride"));
    public static VarHandle y_stride$VH() {
        return WebPYUVABuffer.y_stride$VH;
    }
    public static int y_stride$get(MemorySegment seg) {
        return (int)WebPYUVABuffer.y_stride$VH.get(seg);
    }
    public static void y_stride$set( MemorySegment seg, int x) {
        WebPYUVABuffer.y_stride$VH.set(seg, x);
    }
    public static int y_stride$get(MemorySegment seg, long index) {
        return (int)WebPYUVABuffer.y_stride$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_stride$set(MemorySegment seg, long index, int x) {
        WebPYUVABuffer.y_stride$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle u_stride$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("u_stride"));
    public static VarHandle u_stride$VH() {
        return WebPYUVABuffer.u_stride$VH;
    }
    public static int u_stride$get(MemorySegment seg) {
        return (int)WebPYUVABuffer.u_stride$VH.get(seg);
    }
    public static void u_stride$set( MemorySegment seg, int x) {
        WebPYUVABuffer.u_stride$VH.set(seg, x);
    }
    public static int u_stride$get(MemorySegment seg, long index) {
        return (int)WebPYUVABuffer.u_stride$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void u_stride$set(MemorySegment seg, long index, int x) {
        WebPYUVABuffer.u_stride$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_stride$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_stride"));
    public static VarHandle v_stride$VH() {
        return WebPYUVABuffer.v_stride$VH;
    }
    public static int v_stride$get(MemorySegment seg) {
        return (int)WebPYUVABuffer.v_stride$VH.get(seg);
    }
    public static void v_stride$set( MemorySegment seg, int x) {
        WebPYUVABuffer.v_stride$VH.set(seg, x);
    }
    public static int v_stride$get(MemorySegment seg, long index) {
        return (int)WebPYUVABuffer.v_stride$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_stride$set(MemorySegment seg, long index, int x) {
        WebPYUVABuffer.v_stride$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle a_stride$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("a_stride"));
    public static VarHandle a_stride$VH() {
        return WebPYUVABuffer.a_stride$VH;
    }
    public static int a_stride$get(MemorySegment seg) {
        return (int)WebPYUVABuffer.a_stride$VH.get(seg);
    }
    public static void a_stride$set( MemorySegment seg, int x) {
        WebPYUVABuffer.a_stride$VH.set(seg, x);
    }
    public static int a_stride$get(MemorySegment seg, long index) {
        return (int)WebPYUVABuffer.a_stride$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void a_stride$set(MemorySegment seg, long index, int x) {
        WebPYUVABuffer.a_stride$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_size"));
    public static VarHandle y_size$VH() {
        return WebPYUVABuffer.y_size$VH;
    }
    public static long y_size$get(MemorySegment seg) {
        return (long)WebPYUVABuffer.y_size$VH.get(seg);
    }
    public static void y_size$set( MemorySegment seg, long x) {
        WebPYUVABuffer.y_size$VH.set(seg, x);
    }
    public static long y_size$get(MemorySegment seg, long index) {
        return (long)WebPYUVABuffer.y_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_size$set(MemorySegment seg, long index, long x) {
        WebPYUVABuffer.y_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle u_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("u_size"));
    public static VarHandle u_size$VH() {
        return WebPYUVABuffer.u_size$VH;
    }
    public static long u_size$get(MemorySegment seg) {
        return (long)WebPYUVABuffer.u_size$VH.get(seg);
    }
    public static void u_size$set( MemorySegment seg, long x) {
        WebPYUVABuffer.u_size$VH.set(seg, x);
    }
    public static long u_size$get(MemorySegment seg, long index) {
        return (long)WebPYUVABuffer.u_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void u_size$set(MemorySegment seg, long index, long x) {
        WebPYUVABuffer.u_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_size"));
    public static VarHandle v_size$VH() {
        return WebPYUVABuffer.v_size$VH;
    }
    public static long v_size$get(MemorySegment seg) {
        return (long)WebPYUVABuffer.v_size$VH.get(seg);
    }
    public static void v_size$set( MemorySegment seg, long x) {
        WebPYUVABuffer.v_size$VH.set(seg, x);
    }
    public static long v_size$get(MemorySegment seg, long index) {
        return (long)WebPYUVABuffer.v_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_size$set(MemorySegment seg, long index, long x) {
        WebPYUVABuffer.v_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle a_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("a_size"));
    public static VarHandle a_size$VH() {
        return WebPYUVABuffer.a_size$VH;
    }
    public static long a_size$get(MemorySegment seg) {
        return (long)WebPYUVABuffer.a_size$VH.get(seg);
    }
    public static void a_size$set( MemorySegment seg, long x) {
        WebPYUVABuffer.a_size$VH.set(seg, x);
    }
    public static long a_size$get(MemorySegment seg, long index) {
        return (long)WebPYUVABuffer.a_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void a_size$set(MemorySegment seg, long index, long x) {
        WebPYUVABuffer.a_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

