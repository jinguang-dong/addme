package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iky {
    public static final sgv a = sgv.g("iky");
    public final ikz b;
    private final ilr c;

    public iky(ilr ilrVar, ikz ikzVar) {
        this.c = ilrVar;
        this.b = ikzVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sgt, shi] */
    public final void a() {
        this.c.a();
        ikz ikzVar = this.b;
        ikzVar.b = false;
        try {
            ikzVar.join(1000L);
        } catch (InterruptedException e) {
            ((sgt) ((sgt) ikz.a.b().i(e)).M((char) 2116)).v("%s", e.getMessage());
        }
    }
}
