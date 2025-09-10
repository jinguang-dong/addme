package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blf extends blh {
    public final bkg a;

    public blf(bkg bkgVar) {
        this.a = bkgVar;
    }

    @Override // defpackage.blh
    public final bkg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blf) && a.ao(this.a, ((blf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
