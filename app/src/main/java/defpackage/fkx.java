package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkx extends qkt {
    final /* synthetic */ tfo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkx(qhi qhiVar, tfo tfoVar) {
        super(4, qhiVar, 3);
        this.a = tfoVar;
    }

    @Override // defpackage.qkt
    public final void a(int i, ByteBuffer byteBuffer) {
        if (i == 0) {
            byteBuffer.putFloat(0.0f);
            byteBuffer.putFloat(0.0f);
            byteBuffer.putFloat(0.0f);
            return;
        }
        if (i == 1) {
            byteBuffer.putFloat(this.a.c);
            byteBuffer.putFloat(0.0f);
            byteBuffer.putFloat(0.0f);
        } else if (i == 2) {
            byteBuffer.putFloat(0.0f);
            byteBuffer.putFloat(this.a.d);
            byteBuffer.putFloat(0.0f);
        } else {
            if (i != 3) {
                throw new AssertionError("Invalid index.");
            }
            tfo tfoVar = this.a;
            byteBuffer.putFloat(tfoVar.c);
            byteBuffer.putFloat(tfoVar.d);
            byteBuffer.putFloat(0.0f);
        }
    }
}
