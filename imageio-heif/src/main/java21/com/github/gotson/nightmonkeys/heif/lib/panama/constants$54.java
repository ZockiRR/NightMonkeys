// Generated by jextract

package com.github.gotson.nightmonkeys.heif.lib.panama;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;

final class constants$54 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$54() {
    }

    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("version"),
        JAVA_BYTE.withName("save_alpha_channel"),
        JAVA_BYTE.withName("macOS_compatibility_workaround"),
        JAVA_BYTE.withName("save_two_colr_boxes_when_ICC_and_nclx_available"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("output_nclx_profile"),
        JAVA_BYTE.withName("macOS_compatibility_workaround_no_nclx_profile"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("image_orientation"),
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("version"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("preferred_chroma_downsampling_algorithm"),
            JAVA_INT.withName("preferred_chroma_upsampling_algorithm"),
            JAVA_BYTE.withName("only_use_preferred_chroma_algorithm"),
            MemoryLayout.paddingLayout(3)
        ).withName("color_conversion_options")
    ).withName("heif_encoding_options");
    static final VarHandle const$1 = constants$54.const$0.varHandle(MemoryLayout.PathElement.groupElement("version"));
    static final VarHandle const$2 = constants$54.const$0.varHandle(MemoryLayout.PathElement.groupElement("save_alpha_channel"));
    static final VarHandle const$3 = constants$54.const$0.varHandle(MemoryLayout.PathElement.groupElement("macOS_compatibility_workaround"));
    static final VarHandle const$4 = constants$54.const$0.varHandle(MemoryLayout.PathElement.groupElement("save_two_colr_boxes_when_ICC_and_nclx_available"));
    static final VarHandle const$5 = constants$54.const$0.varHandle(MemoryLayout.PathElement.groupElement("output_nclx_profile"));
}


