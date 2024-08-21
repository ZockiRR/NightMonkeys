// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webpdemux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _opaque_pthread_cond_t {
 *     long __sig;
 *     char __opaque[40];
 * };
 * }
 */
public class _opaque_pthread_cond_t {

    public static MemoryLayout $LAYOUT() {
        return constants$1.const$5;
    }
    public static VarHandle __sig$VH() {
        return constants$2.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long __sig;
     * }
     */
    public static long __sig$get(MemorySegment seg) {
        return (long)constants$2.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long __sig;
     * }
     */
    public static void __sig$set(MemorySegment seg, long x) {
        constants$2.const$0.set(seg, x);
    }
    public static long __sig$get(MemorySegment seg, long index) {
        return (long)constants$2.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void __sig$set(MemorySegment seg, long index, long x) {
        constants$2.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __opaque$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


