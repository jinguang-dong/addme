package defpackage;

import j$.util.Optional;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kyp implements kmz {
    public static final sgv a = sgv.g("kyp");
    public final peo b;
    public final klf c;
    private final pdv d;
    private final kit e;
    private final pfu f;

    public kyp(pfu pfuVar, peo peoVar, pdv pdvVar, klf klfVar, kit kitVar) {
        this.f = pfuVar;
        this.b = peoVar;
        this.d = pdvVar;
        this.c = klfVar;
        this.e = kitVar;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return new owi(true);
    }

    @Override // defpackage.kmz
    public final owf b() {
        return new owi(this.e);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, lss] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        pdv pdvVar;
        Optional optionalEmpty = Optional.empty();
        int i = 0;
        while (true) {
            pfu pfuVar = this.f;
            if (pfuVar != null && (pdvVar = this.d) != null) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                pdk pdkVarB = pfuVar.b(pdvVar);
                szh szhVar = new szh();
                pdkVarB.j(new kyo(this, pdkVarB, ggaVar, szhVar));
                try {
                    laa laaVar = (laa) szhVar.s();
                    if (laaVar == laa.NO_ERROR) {
                        break;
                    }
                    optionalEmpty = laaVar != null ? Optional.ofNullable(laaVar.a()) : Optional.empty();
                    i = i2;
                } catch (InterruptedException | ExecutionException e) {
                    ((sgt) ((sgt) a.b().i(e)).M((char) 3752)).s("Error acquiring image.");
                    optionalEmpty = Optional.of(e);
                    sgv sgvVar = a;
                    ((sgt) sgvVar.c().M(3750)).t("Couldn't capture image after %s attempts.", 3);
                    Throwable th = (Throwable) optionalEmpty.orElse(new hht("Something went wrong!"));
                    ((sgt) sgvVar.c().M(3746)).s("Aborting shot.");
                    ggaVar.a.f();
                    ggaVar.b.F(nfo.a, th);
                    kmyVar.close();
                }
            } else {
                break;
            }
        }
        kmyVar.close();
    }
}
