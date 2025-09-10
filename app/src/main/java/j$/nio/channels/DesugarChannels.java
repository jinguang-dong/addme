package j$.nio.channels;

import j$.desugar.sun.nio.fs.e;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (j$.adapter.a.a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof e)) {
            return new e(fileChannel, false, false, null);
        }
        int i = e.e;
        return (e) fileChannel;
    }
}
