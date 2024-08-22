// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama.webpdemux;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct WebPAnimDecoderOptions {
 *     WEBP_CSP_MODE color_mode;
 *     int use_threads;
 *     uint32_t padding[7];
 * }
 * }
 */
public class WebPAnimDecoderOptions {

    WebPAnimDecoderOptions() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        demux_h.C_INT.withName("color_mode"),
        demux_h.C_INT.withName("use_threads"),
        MemoryLayout.sequenceLayout(7, demux_h.C_INT).withName("padding")
    ).withName("WebPAnimDecoderOptions");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt color_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("color_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WEBP_CSP_MODE color_mode
     * }
     */
    public static final OfInt color_mode$layout() {
        return color_mode$LAYOUT;
    }

    private static final long color_mode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WEBP_CSP_MODE color_mode
     * }
     */
    public static final long color_mode$offset() {
        return color_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WEBP_CSP_MODE color_mode
     * }
     */
    public static int color_mode(MemorySegment struct) {
        return struct.get(color_mode$LAYOUT, color_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WEBP_CSP_MODE color_mode
     * }
     */
    public static void color_mode(MemorySegment struct, int fieldValue) {
        struct.set(color_mode$LAYOUT, color_mode$OFFSET, fieldValue);
    }

    private static final OfInt use_threads$LAYOUT = (OfInt)$LAYOUT.select(groupElement("use_threads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static final OfInt use_threads$layout() {
        return use_threads$LAYOUT;
    }

    private static final long use_threads$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static final long use_threads$offset() {
        return use_threads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static int use_threads(MemorySegment struct) {
        return struct.get(use_threads$LAYOUT, use_threads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static void use_threads(MemorySegment struct, int fieldValue) {
        struct.set(use_threads$LAYOUT, use_threads$OFFSET, fieldValue);
    }

    private static final SequenceLayout padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static final SequenceLayout padding$layout() {
        return padding$LAYOUT;
    }

    private static final long padding$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static final long padding$offset() {
        return padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static MemorySegment padding(MemorySegment struct) {
        return struct.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static void padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, padding$OFFSET, padding$LAYOUT.byteSize());
    }

    private static long[] padding$DIMS = { 7 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static long[] padding$dimensions() {
        return padding$DIMS;
    }
    private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static int padding(MemorySegment struct, long index0) {
        return (int)padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint32_t padding[7]
     * }
     */
    public static void padding(MemorySegment struct, long index0, int fieldValue) {
        padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

