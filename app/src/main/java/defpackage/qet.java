package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qet {
    static {
        sjd.d("Mp4BoxSlices");
    }

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        if (bytes.length == 4) {
            return bytes;
        }
        throw new IllegalArgumentException(a.bw(str, "Type \"", "\" is not 4 characters"));
    }
}
