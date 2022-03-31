package com.github.gotson.nightmonkeys.jxl.imageio.plugins;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class JpegXlImageReaderTest {

    @Test
    public void testReaderIsNotRegistered() {
        System.out.println("java.version: " + System.getProperty("java.version"));
        System.out.println("java.library.path: " + System.getProperty("java.library.path"));
        System.out.println("SPI file: " + ClassLoader.getSystemResource("META-INF/services/javax.imageio.spi.ImageReaderSpi"));

        ArrayList<ImageReader> readers = new ArrayList<>();
        ImageIO.getImageReadersBySuffix("jxl").forEachRemaining(readers::add);

        assertThat(readers).isEmpty();

        ImageIO.getImageReadersByMIMEType("image/jxl").forEachRemaining(readers::add);

        assertThat(readers).isEmpty();

        ImageIO.getImageReadersByFormatName("jxl").forEachRemaining(readers::add);

        assertThat(readers).isEmpty();
    }
}
