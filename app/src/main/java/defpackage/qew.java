package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qew {
    public final int a;
    final /* synthetic */ qay b;

    public qew(qay qayVar, int i) {
        this.b = qayVar;
        this.a = i;
    }

    public final int a() {
        return ((ByteBuffer) this.b.a).getInt(this.a);
    }
}
