package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qul {
    public static volatile rwc a;
    private static volatile rwc b;

    public static boolean a(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
