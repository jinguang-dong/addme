package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flc extends qkt {
    private final FloatBuffer a;
    private final float b;
    private final float f;

    public flc(FloatBuffer floatBuffer, float f, float f2) {
        super(floatBuffer.limit(), qhu.h, 3);
        this.a = floatBuffer;
        this.b = f;
        this.f = f2;
    }

    @Override // defpackage.qkt
    public final void a(int i, ByteBuffer byteBuffer) {
        int i2 = i % 2;
        FloatBuffer floatBuffer = this.a;
        int i3 = i - i2;
        byteBuffer.putFloat(floatBuffer.get(i3) * (i2 == 0 ? 1.0f : this.b));
        byteBuffer.putFloat(floatBuffer.get(i3 + 1) * (i2 == 0 ? 1.0f : this.f));
        byteBuffer.putFloat(i2 == 0 ? 0.0f : 1.0f);
    }
}
