package org.red5.io.isobmff.atom;

import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.VideoSampleEntry;

public class HVC1Box extends VideoSampleEntry {

    public HVC1Box() {
        super(new Header("hvc1"));
    }

}
