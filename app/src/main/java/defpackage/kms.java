package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kms implements kmz {
    private static final sgv a = sgv.g("kms");
    private final kmz b;
    private final owf c;
    private final kqg d;
    private final qqq e;

    public kms(kqg kqgVar, qqq qqqVar, kmz kmzVar) {
        this.d = kqgVar;
        this.e = qqqVar;
        this.b = kmzVar;
        this.c = owl.c(kmzVar.a(), owl.d(kqgVar.a, 1));
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.c;
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.b.b();
    }

    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        boolean z;
        int i;
        kqg kqgVar = this.d;
        synchronized (kqgVar.b) {
            z = false;
            if (!kqgVar.f && kqgVar.c.isEmpty() && (i = kqgVar.e) > 0) {
                kqgVar.e = i - 1;
                kqgVar.d.a = Integer.valueOf(kqgVar.a());
                z = true;
            }
        }
        kqgVar.d.a();
        kqf kqfVar = z ? new kqf(kqgVar) : null;
        kqgVar.a.dL();
        if (kqfVar == null) {
            ((sgt) a.c().M(3325)).s("Ticket not available");
            return;
        }
        Object obj = ggaVar.b;
        rwc rwcVarI = rwc.i((lsb) obj);
        if (!rwcVarI.h()) {
            ((sgt) a.c().M(3324)).v("Capture session not a MultiImageCaptureSession: %s", obj);
        }
        jno jnoVarN = this.e.N(ggaVar);
        jnoVarN.b();
        if (rwcVarI.h()) {
            rwc rwcVarA = jnoVarN.a();
            if (rwcVarA.h()) {
                ((lsb) rwcVarI.c()).c = rwc.j(rwcVarA.c());
            }
        }
        ((kfl) ggaVar.d).e.d(kqfVar);
        this.b.c(kmyVar, ggaVar);
        jnoVarN.c();
    }
}
