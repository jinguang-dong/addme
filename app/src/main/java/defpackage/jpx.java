package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpx implements tzt {
    private final tzx a;
    private final tzx b;

    public jpx(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jpw a() {
        return new jpw((pnk) this.a.a(), (Supplier) this.b.a());
    }
}
