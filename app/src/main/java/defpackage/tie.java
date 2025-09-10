package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tie extends tiv {
    final /* synthetic */ tiv a;

    public tie(tiv tivVar) {
        this.a = tivVar;
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        return new AtomicLong(((Number) this.a.a(tmlVar)).longValue());
    }
}
