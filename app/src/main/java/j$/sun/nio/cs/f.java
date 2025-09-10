package j$.sun.nio.cs;

import java.nio.Buffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes3.dex */
public final class f extends g {
    public static final f a;

    static {
        int i = d.a;
        a = new f("UTF-8", new String[]{"UTF8", "unicode-1-1-utf-8"});
    }

    public static final void h(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }

    @Override // java.nio.charset.Charset
    public final CharsetDecoder newDecoder() {
        return new a(this, 1);
    }

    @Override // java.nio.charset.Charset
    public final CharsetEncoder newEncoder() {
        return new b(this);
    }
}
