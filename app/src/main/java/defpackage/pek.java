package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pek {
    public final int a;
    public final sbp b;
    public final sbp c;

    public pek(int i, sbp sbpVar, sbp sbpVar2) {
        this.a = i;
        this.b = sbpVar;
        this.c = sbpVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pek)) {
            return false;
        }
        pek pekVar = (pek) obj;
        return this.a == pekVar.a && Objects.equals(this.c, pekVar.c) && Objects.equals(this.b, pekVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.c, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pek(int i) {
        int i2 = sbp.d;
        sbp sbpVar = sex.a;
        this(i, sbpVar, sbpVar);
    }

    public pek(int i, List list) {
        this(i, sbp.j(list), sex.a);
    }
}
