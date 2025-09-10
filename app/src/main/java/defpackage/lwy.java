package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwy extends ojl {
    private final juv a;
    private final owq b;
    private final pjo c;
    private final owf d;
    private final nmt e;

    public lwy(pjo pjoVar, juv juvVar, owq owqVar, owf owfVar, nmt nmtVar) {
        super((short[]) null);
        this.c = pjoVar;
        this.a = juvVar;
        this.b = owqVar;
        this.d = owfVar;
        this.e = nmtVar;
        float f = nmtVar.a;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        if (((ixq) this.d.dL()).equals(ixq.INACTIVE)) {
            return;
        }
        juv juvVar = this.a;
        Float f = (Float) juvVar.h.map(new idh(this.c, 19)).orElse(null);
        if (f != null) {
            float fA = this.e.a(f.floatValue());
            owq owqVar = this.b;
            if (fA != ((Float) owqVar.dL()).floatValue()) {
                owqVar.a(Float.valueOf(fA));
                shl shlVar = shx.a;
            }
        }
    }
}
