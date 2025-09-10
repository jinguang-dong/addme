package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kmw implements kmz {
    private static final sgv a = sgv.g("kmw");
    private final kmz b;

    public kmw(kmz kmzVar) {
        this.b = kmzVar;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.b.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.b.b();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kml] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        sgt sgtVar = (sgt) a.c().M(3326);
        kmz kmzVar = this.b;
        sgtVar.v("Running fallback command: %s", kmzVar);
        ggaVar.b.o().f();
        ggaVar.a.h();
        kmzVar.c(kmyVar, ggaVar);
    }
}
