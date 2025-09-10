package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tpg implements Comparable {
    public final int a;
    public final Ctry b;

    public tpg(int i, Ctry ctry) {
        this.a = i;
        this.b = ctry;
    }

    public final trz a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((tpg) obj).a;
    }
}
