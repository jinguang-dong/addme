package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcm extends bdf {
    public static final bcm a = new bcm();

    private bcm() {
        super(0, 3, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        bdh bdhVar;
        baw bawVar = (baw) bdiVar.c(1);
        axq axqVar = (axq) bdiVar.c(0);
        bbv bbvVar = (bbv) bdiVar.c(2);
        baz bazVarC = bawVar.c();
        if (bdgVar != null) {
            try {
                bdhVar = new bdh(bdgVar, bazVar);
            } catch (Throwable th) {
                bazVarC.z(false);
                throw th;
            }
        } else {
            bdhVar = null;
        }
        if (!bbvVar.b.i()) {
            ayi.i("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        bbvVar.a.k(axrVar, bazVarC, bfnVar, bdhVar);
        bazVarC.z(true);
        bazVar.y();
        bazVar.Y(bawVar, bawVar.a(axqVar));
        bazVar.A();
    }
}
