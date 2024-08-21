// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct WebPBitstreamFeatures {
 *     int width;
 *     int height;
 *     int has_alpha;
 *     int has_animation;
 *     int format;
 *     uint32_t pad[5];
 * };
 * }
 */
public class WebPBitstreamFeatures {

    public static MemoryLayout $LAYOUT() {
        return constants$17.const$3;
    }
    public static VarHandle width$VH() {
        return constants$17.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$17.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$17.const$4.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$17.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$17.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$17.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$17.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$17.const$5.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$17.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$17.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle has_alpha$VH() {
        return constants$18.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int has_alpha;
     * }
     */
    public static int has_alpha$get(MemorySegment seg) {
        return (int)constants$18.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int has_alpha;
     * }
     */
    public static void has_alpha$set(MemorySegment seg, int x) {
        constants$18.const$0.set(seg, x);
    }
    public static int has_alpha$get(MemorySegment seg, long index) {
        return (int)constants$18.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void has_alpha$set(MemorySegment seg, long index, int x) {
        constants$18.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle has_animation$VH() {
        return constants$18.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int has_animation;
     * }
     */
    public static int has_animation$get(MemorySegment seg) {
        return (int)constants$18.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int has_animation;
     * }
     */
    public static void has_animation$set(MemorySegment seg, int x) {
        constants$18.const$1.set(seg, x);
    }
    public static int has_animation$get(MemorySegment seg, long index) {
        return (int)constants$18.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void has_animation$set(MemorySegment seg, long index, int x) {
        constants$18.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$18.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$18.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$18.const$2.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$18.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$18.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(20, 20);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


