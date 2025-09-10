package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fle extends qkt {
    private final FloatBuffer a;

    public fle(FloatBuffer floatBuffer) {
        super(floatBuffer.limit() / 4, qhu.h, 4);
        this.a = floatBuffer;
    }

    @Override // defpackage.qkt
    public final void a(int i, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (true) {
            int i3 = this.e;
            if (i2 >= i3) {
                return;
            }
            byteBuffer.putFloat(this.a.get((i3 * i) + i2));
            i2++;
        }
    }
}
