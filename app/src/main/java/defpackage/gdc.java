package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gdc implements oyh {
    private final byte[] a;

    public gdc(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        this.a = bArr;
        byteBuffer.get(bArr);
    }

    @Override // defpackage.oyh
    public final byte[] a() {
        return this.a;
    }
}
