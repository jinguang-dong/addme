package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class utn extends utt {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.utt
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(utm.a);
        return true;
    }

    @Override // defpackage.utt
    public final /* bridge */ /* synthetic */ uhb[] b(Object obj) {
        this.a.set(null);
        return uts.a;
    }
}
