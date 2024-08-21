// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __darwin_pthread_handler_rec {
 *     void (*__routine)(void*);
 *     void* __arg;
 *     struct __darwin_pthread_handler_rec* __next;
 * };
 * }
 */
public class __darwin_pthread_handler_rec {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$2;
    }
    /**
     * {@snippet :
 * void (*__routine)(void*);
     * }
     */
    public interface __routine {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(__routine fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$0.const$4, fi, constants$0.const$3, scope);
        }
        static __routine ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$0.const$5.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle __routine$VH() {
        return constants$1.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*__routine)(void*);
     * }
     */
    public static MemorySegment __routine$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*__routine)(void*);
     * }
     */
    public static void __routine$set(MemorySegment seg, MemorySegment x) {
        constants$1.const$0.set(seg, x);
    }
    public static MemorySegment __routine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void __routine$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static __routine __routine(MemorySegment segment, Arena scope) {
        return __routine.ofAddress(__routine$get(segment), scope);
    }
    public static VarHandle __arg$VH() {
        return constants$1.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* __arg;
     * }
     */
    public static MemorySegment __arg$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* __arg;
     * }
     */
    public static void __arg$set(MemorySegment seg, MemorySegment x) {
        constants$1.const$1.set(seg, x);
    }
    public static MemorySegment __arg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void __arg$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __next$VH() {
        return constants$1.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __darwin_pthread_handler_rec* __next;
     * }
     */
    public static MemorySegment __next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __darwin_pthread_handler_rec* __next;
     * }
     */
    public static void __next$set(MemorySegment seg, MemorySegment x) {
        constants$1.const$2.set(seg, x);
    }
    public static MemorySegment __next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


