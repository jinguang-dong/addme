package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class plk implements poi {
    private final ByteBuffer a;
    private final int b;
    private final int c;

    public plk(ByteBuffer byteBuffer, int i, int i2) {
        this.a = byteBuffer;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.poi
    public final ByteBuffer getBuffer() {
        return this.a;
    }

    @Override // defpackage.poi
    public final int getPixelStride() {
        return this.c;
    }

    @Override // defpackage.poi
    public final int getRowStride() {
        return this.b;
    }
}
