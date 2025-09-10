package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gaj implements gai {
    private final oxp a;

    public gaj(oxp oxpVar) {
        this.a = oxpVar;
    }

    @Override // defpackage.gai
    public final Range a() {
        return Range.create(30, Integer.valueOf(this.a.a()));
    }

    @Override // defpackage.gai
    public final Range b() {
        Integer numValueOf = Integer.valueOf(this.a.a());
        return Range.create(numValueOf, numValueOf);
    }
}
