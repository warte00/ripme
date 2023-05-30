package com.rarchives.ripme.tst.ripper.rippers;

import java.io.IOException;
import java.net.URL;

import com.rarchives.ripme.ripper.rippers.HbrowseRipper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


public class HbrowseRipperTest extends RippersTest {
    @Test
    @Disabled
    public void testPahealRipper() throws IOException {
        HbrowseRipper ripper = new HbrowseRipper(new URL("https://www.hbrowse.com/21013/c00001"));
        testRipper(ripper);
    }
}