package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbs {
    public Boolean a;
    public boolean b;
    private final sbk c;
    private final sbk d;

    public rbs() {
        int i = sbp.d;
        this.c = new sbk();
        this.d = new sbk();
        this.b = false;
    }

    public final rbt a() {
        this.a.getClass();
        return new rbt(this.a.booleanValue(), this.b, this.c.g(), this.d.g());
    }

    public final void b(rbv rbvVar) {
        this.a.getClass();
        this.c.h(rbvVar);
    }

    public final void c() {
        rnt.M(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}
