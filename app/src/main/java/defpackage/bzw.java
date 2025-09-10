package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzw implements bwt {
    public final int a;
    public Float b = null;
    public Float c = null;
    public cbl d = null;
    public cbl e = null;
    private final List f;

    public bzw(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.bwt
    public final boolean dn() {
        return this.f.contains(this);
    }
}
