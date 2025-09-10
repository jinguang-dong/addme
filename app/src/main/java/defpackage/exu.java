package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exu implements eqx {
    private final ByteBuffer a;

    public exu(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.eqx
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.eqx
    public final void b() {
    }
}
