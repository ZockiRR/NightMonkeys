// Generated by jextract

package com.github.gotson.nightmonkeys.webp.lib.panama;

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
 * struct WebPAuxStats {
 *     int coded_size;
 *     float PSNR[5];
 *     int block_count[3];
 *     int header_bytes[2];
 *     int residual_bytes[3][4];
 *     int segment_size[4];
 *     int segment_quant[4];
 *     int segment_level[4];
 *     int alpha_data_size;
 *     int layer_data_size;
 *     uint32_t lossless_features;
 *     int histogram_bits;
 *     int transform_bits;
 *     int cache_bits;
 *     int palette_size;
 *     int lossless_size;
 *     int lossless_hdr_size;
 *     int lossless_data_size;
 *     uint32_t pad[2];
 * }
 * }
 */
public class WebPAuxStats {

    WebPAuxStats() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        encode_h.C_INT.withName("coded_size"),
        MemoryLayout.sequenceLayout(5, encode_h.C_FLOAT).withName("PSNR"),
        MemoryLayout.sequenceLayout(3, encode_h.C_INT).withName("block_count"),
        MemoryLayout.sequenceLayout(2, encode_h.C_INT).withName("header_bytes"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(4, encode_h.C_INT)).withName("residual_bytes"),
        MemoryLayout.sequenceLayout(4, encode_h.C_INT).withName("segment_size"),
        MemoryLayout.sequenceLayout(4, encode_h.C_INT).withName("segment_quant"),
        MemoryLayout.sequenceLayout(4, encode_h.C_INT).withName("segment_level"),
        encode_h.C_INT.withName("alpha_data_size"),
        encode_h.C_INT.withName("layer_data_size"),
        encode_h.C_INT.withName("lossless_features"),
        encode_h.C_INT.withName("histogram_bits"),
        encode_h.C_INT.withName("transform_bits"),
        encode_h.C_INT.withName("cache_bits"),
        encode_h.C_INT.withName("palette_size"),
        encode_h.C_INT.withName("lossless_size"),
        encode_h.C_INT.withName("lossless_hdr_size"),
        encode_h.C_INT.withName("lossless_data_size"),
        MemoryLayout.sequenceLayout(2, encode_h.C_INT).withName("pad")
    ).withName("WebPAuxStats");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt coded_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("coded_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int coded_size
     * }
     */
    public static final OfInt coded_size$layout() {
        return coded_size$LAYOUT;
    }

    private static final long coded_size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int coded_size
     * }
     */
    public static final long coded_size$offset() {
        return coded_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int coded_size
     * }
     */
    public static int coded_size(MemorySegment struct) {
        return struct.get(coded_size$LAYOUT, coded_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int coded_size
     * }
     */
    public static void coded_size(MemorySegment struct, int fieldValue) {
        struct.set(coded_size$LAYOUT, coded_size$OFFSET, fieldValue);
    }

    private static final SequenceLayout PSNR$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("PSNR"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static final SequenceLayout PSNR$layout() {
        return PSNR$LAYOUT;
    }

    private static final long PSNR$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static final long PSNR$offset() {
        return PSNR$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static MemorySegment PSNR(MemorySegment struct) {
        return struct.asSlice(PSNR$OFFSET, PSNR$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static void PSNR(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PSNR$OFFSET, PSNR$LAYOUT.byteSize());
    }

    private static long[] PSNR$DIMS = { 5 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static long[] PSNR$dimensions() {
        return PSNR$DIMS;
    }
    private static final VarHandle PSNR$ELEM_HANDLE = PSNR$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static float PSNR(MemorySegment struct, long index0) {
        return (float)PSNR$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * float PSNR[5]
     * }
     */
    public static void PSNR(MemorySegment struct, long index0, float fieldValue) {
        PSNR$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout block_count$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("block_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static final SequenceLayout block_count$layout() {
        return block_count$LAYOUT;
    }

    private static final long block_count$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static final long block_count$offset() {
        return block_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static MemorySegment block_count(MemorySegment struct) {
        return struct.asSlice(block_count$OFFSET, block_count$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static void block_count(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, block_count$OFFSET, block_count$LAYOUT.byteSize());
    }

    private static long[] block_count$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static long[] block_count$dimensions() {
        return block_count$DIMS;
    }
    private static final VarHandle block_count$ELEM_HANDLE = block_count$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static int block_count(MemorySegment struct, long index0) {
        return (int)block_count$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int block_count[3]
     * }
     */
    public static void block_count(MemorySegment struct, long index0, int fieldValue) {
        block_count$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout header_bytes$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("header_bytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static final SequenceLayout header_bytes$layout() {
        return header_bytes$LAYOUT;
    }

    private static final long header_bytes$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static final long header_bytes$offset() {
        return header_bytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static MemorySegment header_bytes(MemorySegment struct) {
        return struct.asSlice(header_bytes$OFFSET, header_bytes$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static void header_bytes(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, header_bytes$OFFSET, header_bytes$LAYOUT.byteSize());
    }

    private static long[] header_bytes$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static long[] header_bytes$dimensions() {
        return header_bytes$DIMS;
    }
    private static final VarHandle header_bytes$ELEM_HANDLE = header_bytes$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static int header_bytes(MemorySegment struct, long index0) {
        return (int)header_bytes$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int header_bytes[2]
     * }
     */
    public static void header_bytes(MemorySegment struct, long index0, int fieldValue) {
        header_bytes$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout residual_bytes$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("residual_bytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static final SequenceLayout residual_bytes$layout() {
        return residual_bytes$LAYOUT;
    }

    private static final long residual_bytes$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static final long residual_bytes$offset() {
        return residual_bytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static MemorySegment residual_bytes(MemorySegment struct) {
        return struct.asSlice(residual_bytes$OFFSET, residual_bytes$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static void residual_bytes(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, residual_bytes$OFFSET, residual_bytes$LAYOUT.byteSize());
    }

    private static long[] residual_bytes$DIMS = { 3, 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static long[] residual_bytes$dimensions() {
        return residual_bytes$DIMS;
    }
    private static final VarHandle residual_bytes$ELEM_HANDLE = residual_bytes$LAYOUT.varHandle(sequenceElement(), sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static int residual_bytes(MemorySegment struct, long index0, long index1) {
        return (int)residual_bytes$ELEM_HANDLE.get(struct, 0L, index0, index1);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int residual_bytes[3][4]
     * }
     */
    public static void residual_bytes(MemorySegment struct, long index0, long index1, int fieldValue) {
        residual_bytes$ELEM_HANDLE.set(struct, 0L, index0, index1, fieldValue);
    }

    private static final SequenceLayout segment_size$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("segment_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static final SequenceLayout segment_size$layout() {
        return segment_size$LAYOUT;
    }

    private static final long segment_size$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static final long segment_size$offset() {
        return segment_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static MemorySegment segment_size(MemorySegment struct) {
        return struct.asSlice(segment_size$OFFSET, segment_size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static void segment_size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, segment_size$OFFSET, segment_size$LAYOUT.byteSize());
    }

    private static long[] segment_size$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static long[] segment_size$dimensions() {
        return segment_size$DIMS;
    }
    private static final VarHandle segment_size$ELEM_HANDLE = segment_size$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static int segment_size(MemorySegment struct, long index0) {
        return (int)segment_size$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int segment_size[4]
     * }
     */
    public static void segment_size(MemorySegment struct, long index0, int fieldValue) {
        segment_size$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout segment_quant$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("segment_quant"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static final SequenceLayout segment_quant$layout() {
        return segment_quant$LAYOUT;
    }

    private static final long segment_quant$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static final long segment_quant$offset() {
        return segment_quant$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static MemorySegment segment_quant(MemorySegment struct) {
        return struct.asSlice(segment_quant$OFFSET, segment_quant$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static void segment_quant(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, segment_quant$OFFSET, segment_quant$LAYOUT.byteSize());
    }

    private static long[] segment_quant$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static long[] segment_quant$dimensions() {
        return segment_quant$DIMS;
    }
    private static final VarHandle segment_quant$ELEM_HANDLE = segment_quant$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static int segment_quant(MemorySegment struct, long index0) {
        return (int)segment_quant$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int segment_quant[4]
     * }
     */
    public static void segment_quant(MemorySegment struct, long index0, int fieldValue) {
        segment_quant$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout segment_level$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("segment_level"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static final SequenceLayout segment_level$layout() {
        return segment_level$LAYOUT;
    }

    private static final long segment_level$OFFSET = 124;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static final long segment_level$offset() {
        return segment_level$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static MemorySegment segment_level(MemorySegment struct) {
        return struct.asSlice(segment_level$OFFSET, segment_level$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static void segment_level(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, segment_level$OFFSET, segment_level$LAYOUT.byteSize());
    }

    private static long[] segment_level$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static long[] segment_level$dimensions() {
        return segment_level$DIMS;
    }
    private static final VarHandle segment_level$ELEM_HANDLE = segment_level$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static int segment_level(MemorySegment struct, long index0) {
        return (int)segment_level$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int segment_level[4]
     * }
     */
    public static void segment_level(MemorySegment struct, long index0, int fieldValue) {
        segment_level$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt alpha_data_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alpha_data_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int alpha_data_size
     * }
     */
    public static final OfInt alpha_data_size$layout() {
        return alpha_data_size$LAYOUT;
    }

    private static final long alpha_data_size$OFFSET = 140;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int alpha_data_size
     * }
     */
    public static final long alpha_data_size$offset() {
        return alpha_data_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int alpha_data_size
     * }
     */
    public static int alpha_data_size(MemorySegment struct) {
        return struct.get(alpha_data_size$LAYOUT, alpha_data_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int alpha_data_size
     * }
     */
    public static void alpha_data_size(MemorySegment struct, int fieldValue) {
        struct.set(alpha_data_size$LAYOUT, alpha_data_size$OFFSET, fieldValue);
    }

    private static final OfInt layer_data_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("layer_data_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int layer_data_size
     * }
     */
    public static final OfInt layer_data_size$layout() {
        return layer_data_size$LAYOUT;
    }

    private static final long layer_data_size$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int layer_data_size
     * }
     */
    public static final long layer_data_size$offset() {
        return layer_data_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int layer_data_size
     * }
     */
    public static int layer_data_size(MemorySegment struct) {
        return struct.get(layer_data_size$LAYOUT, layer_data_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int layer_data_size
     * }
     */
    public static void layer_data_size(MemorySegment struct, int fieldValue) {
        struct.set(layer_data_size$LAYOUT, layer_data_size$OFFSET, fieldValue);
    }

    private static final OfInt lossless_features$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lossless_features"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t lossless_features
     * }
     */
    public static final OfInt lossless_features$layout() {
        return lossless_features$LAYOUT;
    }

    private static final long lossless_features$OFFSET = 148;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t lossless_features
     * }
     */
    public static final long lossless_features$offset() {
        return lossless_features$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t lossless_features
     * }
     */
    public static int lossless_features(MemorySegment struct) {
        return struct.get(lossless_features$LAYOUT, lossless_features$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t lossless_features
     * }
     */
    public static void lossless_features(MemorySegment struct, int fieldValue) {
        struct.set(lossless_features$LAYOUT, lossless_features$OFFSET, fieldValue);
    }

    private static final OfInt histogram_bits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("histogram_bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int histogram_bits
     * }
     */
    public static final OfInt histogram_bits$layout() {
        return histogram_bits$LAYOUT;
    }

    private static final long histogram_bits$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int histogram_bits
     * }
     */
    public static final long histogram_bits$offset() {
        return histogram_bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int histogram_bits
     * }
     */
    public static int histogram_bits(MemorySegment struct) {
        return struct.get(histogram_bits$LAYOUT, histogram_bits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int histogram_bits
     * }
     */
    public static void histogram_bits(MemorySegment struct, int fieldValue) {
        struct.set(histogram_bits$LAYOUT, histogram_bits$OFFSET, fieldValue);
    }

    private static final OfInt transform_bits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transform_bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int transform_bits
     * }
     */
    public static final OfInt transform_bits$layout() {
        return transform_bits$LAYOUT;
    }

    private static final long transform_bits$OFFSET = 156;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int transform_bits
     * }
     */
    public static final long transform_bits$offset() {
        return transform_bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int transform_bits
     * }
     */
    public static int transform_bits(MemorySegment struct) {
        return struct.get(transform_bits$LAYOUT, transform_bits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int transform_bits
     * }
     */
    public static void transform_bits(MemorySegment struct, int fieldValue) {
        struct.set(transform_bits$LAYOUT, transform_bits$OFFSET, fieldValue);
    }

    private static final OfInt cache_bits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cache_bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cache_bits
     * }
     */
    public static final OfInt cache_bits$layout() {
        return cache_bits$LAYOUT;
    }

    private static final long cache_bits$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cache_bits
     * }
     */
    public static final long cache_bits$offset() {
        return cache_bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cache_bits
     * }
     */
    public static int cache_bits(MemorySegment struct) {
        return struct.get(cache_bits$LAYOUT, cache_bits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cache_bits
     * }
     */
    public static void cache_bits(MemorySegment struct, int fieldValue) {
        struct.set(cache_bits$LAYOUT, cache_bits$OFFSET, fieldValue);
    }

    private static final OfInt palette_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("palette_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int palette_size
     * }
     */
    public static final OfInt palette_size$layout() {
        return palette_size$LAYOUT;
    }

    private static final long palette_size$OFFSET = 164;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int palette_size
     * }
     */
    public static final long palette_size$offset() {
        return palette_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int palette_size
     * }
     */
    public static int palette_size(MemorySegment struct) {
        return struct.get(palette_size$LAYOUT, palette_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int palette_size
     * }
     */
    public static void palette_size(MemorySegment struct, int fieldValue) {
        struct.set(palette_size$LAYOUT, palette_size$OFFSET, fieldValue);
    }

    private static final OfInt lossless_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lossless_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int lossless_size
     * }
     */
    public static final OfInt lossless_size$layout() {
        return lossless_size$LAYOUT;
    }

    private static final long lossless_size$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int lossless_size
     * }
     */
    public static final long lossless_size$offset() {
        return lossless_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int lossless_size
     * }
     */
    public static int lossless_size(MemorySegment struct) {
        return struct.get(lossless_size$LAYOUT, lossless_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int lossless_size
     * }
     */
    public static void lossless_size(MemorySegment struct, int fieldValue) {
        struct.set(lossless_size$LAYOUT, lossless_size$OFFSET, fieldValue);
    }

    private static final OfInt lossless_hdr_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lossless_hdr_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int lossless_hdr_size
     * }
     */
    public static final OfInt lossless_hdr_size$layout() {
        return lossless_hdr_size$LAYOUT;
    }

    private static final long lossless_hdr_size$OFFSET = 172;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int lossless_hdr_size
     * }
     */
    public static final long lossless_hdr_size$offset() {
        return lossless_hdr_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int lossless_hdr_size
     * }
     */
    public static int lossless_hdr_size(MemorySegment struct) {
        return struct.get(lossless_hdr_size$LAYOUT, lossless_hdr_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int lossless_hdr_size
     * }
     */
    public static void lossless_hdr_size(MemorySegment struct, int fieldValue) {
        struct.set(lossless_hdr_size$LAYOUT, lossless_hdr_size$OFFSET, fieldValue);
    }

    private static final OfInt lossless_data_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lossless_data_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int lossless_data_size
     * }
     */
    public static final OfInt lossless_data_size$layout() {
        return lossless_data_size$LAYOUT;
    }

    private static final long lossless_data_size$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int lossless_data_size
     * }
     */
    public static final long lossless_data_size$offset() {
        return lossless_data_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int lossless_data_size
     * }
     */
    public static int lossless_data_size(MemorySegment struct) {
        return struct.get(lossless_data_size$LAYOUT, lossless_data_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int lossless_data_size
     * }
     */
    public static void lossless_data_size(MemorySegment struct, int fieldValue) {
        struct.set(lossless_data_size$LAYOUT, lossless_data_size$OFFSET, fieldValue);
    }

    private static final SequenceLayout pad$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pad"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static final SequenceLayout pad$layout() {
        return pad$LAYOUT;
    }

    private static final long pad$OFFSET = 180;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static final long pad$offset() {
        return pad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static MemorySegment pad(MemorySegment struct) {
        return struct.asSlice(pad$OFFSET, pad$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static void pad(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pad$OFFSET, pad$LAYOUT.byteSize());
    }

    private static long[] pad$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static long[] pad$dimensions() {
        return pad$DIMS;
    }
    private static final VarHandle pad$ELEM_HANDLE = pad$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static int pad(MemorySegment struct, long index0) {
        return (int)pad$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint32_t pad[2]
     * }
     */
    public static void pad(MemorySegment struct, long index0, int fieldValue) {
        pad$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

