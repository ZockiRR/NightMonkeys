// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct WebPYUVABuffer {
 *     uint8_t* y;
 *     uint8_t* u;
 *     uint8_t* v;
 *     uint8_t* a;
 *     int y_stride;
 *     int u_stride;
 *     int v_stride;
 *     int a_stride;
 *     size_t y_size;
 *     size_t u_size;
 *     size_t v_size;
 *     size_t a_size;
 * };
 * }
 */
public class WebPYUVABuffer {

    public static MemoryLayout $LAYOUT() {
        return constants$11.const$0;
    }
    public static VarHandle y$VH() {
        return constants$11.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* y;
     * }
     */
    public static MemorySegment y$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$11.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* y;
     * }
     */
    public static void y$set(MemorySegment seg, MemorySegment x) {
        constants$11.const$1.set(seg, x);
    }
    public static MemorySegment y$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$11.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, MemorySegment x) {
        constants$11.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle u$VH() {
        return constants$11.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* u;
     * }
     */
    public static MemorySegment u$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$11.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* u;
     * }
     */
    public static void u$set(MemorySegment seg, MemorySegment x) {
        constants$11.const$2.set(seg, x);
    }
    public static MemorySegment u$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$11.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void u$set(MemorySegment seg, long index, MemorySegment x) {
        constants$11.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v$VH() {
        return constants$11.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* v;
     * }
     */
    public static MemorySegment v$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$11.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* v;
     * }
     */
    public static void v$set(MemorySegment seg, MemorySegment x) {
        constants$11.const$3.set(seg, x);
    }
    public static MemorySegment v$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$11.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void v$set(MemorySegment seg, long index, MemorySegment x) {
        constants$11.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle a$VH() {
        return constants$11.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* a;
     * }
     */
    public static MemorySegment a$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$11.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* a;
     * }
     */
    public static void a$set(MemorySegment seg, MemorySegment x) {
        constants$11.const$4.set(seg, x);
    }
    public static MemorySegment a$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$11.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void a$set(MemorySegment seg, long index, MemorySegment x) {
        constants$11.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_stride$VH() {
        return constants$11.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y_stride;
     * }
     */
    public static int y_stride$get(MemorySegment seg) {
        return (int)constants$11.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y_stride;
     * }
     */
    public static void y_stride$set(MemorySegment seg, int x) {
        constants$11.const$5.set(seg, x);
    }
    public static int y_stride$get(MemorySegment seg, long index) {
        return (int)constants$11.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void y_stride$set(MemorySegment seg, long index, int x) {
        constants$11.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle u_stride$VH() {
        return constants$12.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int u_stride;
     * }
     */
    public static int u_stride$get(MemorySegment seg) {
        return (int)constants$12.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int u_stride;
     * }
     */
    public static void u_stride$set(MemorySegment seg, int x) {
        constants$12.const$0.set(seg, x);
    }
    public static int u_stride$get(MemorySegment seg, long index) {
        return (int)constants$12.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void u_stride$set(MemorySegment seg, long index, int x) {
        constants$12.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_stride$VH() {
        return constants$12.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int v_stride;
     * }
     */
    public static int v_stride$get(MemorySegment seg) {
        return (int)constants$12.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int v_stride;
     * }
     */
    public static void v_stride$set(MemorySegment seg, int x) {
        constants$12.const$1.set(seg, x);
    }
    public static int v_stride$get(MemorySegment seg, long index) {
        return (int)constants$12.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void v_stride$set(MemorySegment seg, long index, int x) {
        constants$12.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle a_stride$VH() {
        return constants$12.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int a_stride;
     * }
     */
    public static int a_stride$get(MemorySegment seg) {
        return (int)constants$12.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int a_stride;
     * }
     */
    public static void a_stride$set(MemorySegment seg, int x) {
        constants$12.const$2.set(seg, x);
    }
    public static int a_stride$get(MemorySegment seg, long index) {
        return (int)constants$12.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void a_stride$set(MemorySegment seg, long index, int x) {
        constants$12.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_size$VH() {
        return constants$12.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t y_size;
     * }
     */
    public static long y_size$get(MemorySegment seg) {
        return (long)constants$12.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t y_size;
     * }
     */
    public static void y_size$set(MemorySegment seg, long x) {
        constants$12.const$3.set(seg, x);
    }
    public static long y_size$get(MemorySegment seg, long index) {
        return (long)constants$12.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void y_size$set(MemorySegment seg, long index, long x) {
        constants$12.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle u_size$VH() {
        return constants$12.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t u_size;
     * }
     */
    public static long u_size$get(MemorySegment seg) {
        return (long)constants$12.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t u_size;
     * }
     */
    public static void u_size$set(MemorySegment seg, long x) {
        constants$12.const$4.set(seg, x);
    }
    public static long u_size$get(MemorySegment seg, long index) {
        return (long)constants$12.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void u_size$set(MemorySegment seg, long index, long x) {
        constants$12.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_size$VH() {
        return constants$12.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t v_size;
     * }
     */
    public static long v_size$get(MemorySegment seg) {
        return (long)constants$12.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t v_size;
     * }
     */
    public static void v_size$set(MemorySegment seg, long x) {
        constants$12.const$5.set(seg, x);
    }
    public static long v_size$get(MemorySegment seg, long index) {
        return (long)constants$12.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void v_size$set(MemorySegment seg, long index, long x) {
        constants$12.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle a_size$VH() {
        return constants$13.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t a_size;
     * }
     */
    public static long a_size$get(MemorySegment seg) {
        return (long)constants$13.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t a_size;
     * }
     */
    public static void a_size$set(MemorySegment seg, long x) {
        constants$13.const$0.set(seg, x);
    }
    public static long a_size$get(MemorySegment seg, long index) {
        return (long)constants$13.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void a_size$set(MemorySegment seg, long index, long x) {
        constants$13.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


