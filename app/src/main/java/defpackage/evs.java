package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evs implements evh {
    public static final evs a = new evs(1, null);
    private final /* synthetic */ int b;

    public evs(int i) {
        this.b = i;
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new euw(evlVar.a(eux.class, InputStream.class), 6) : evk.a : new evt(evlVar.a(eux.class, InputStream.class));
    }

    @Deprecated
    public evs(int i, byte[] bArr) {
        this.b = i;
    }
}
