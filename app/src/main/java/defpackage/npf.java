package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npf implements Comparable {
    public final npo a;
    public npl b;

    public npf(npo npoVar) {
        this.a = npoVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.c.compareTo(((npf) obj).a.c);
    }
}
