package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihv implements tzt {
    private final tzx a;

    public ihv(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Supplier a() {
        return new lbs(((ini) this.a).a(), 1);
    }
}
