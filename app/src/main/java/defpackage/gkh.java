package defpackage;

import com.google.ar.core.Session;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import j$.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gkh implements fre {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gkh(Object obj, uem uemVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = uemVar;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fre
    public final syu b() throws fnu {
        paq ivkVar;
        int i = this.c;
        if (i == 0) {
            ((our) this.a).d(new gge(((hbp) this.b.a()).t(), 2));
            return ske.M(true);
        }
        if (i != 1) {
            if (((gaw) this.a).F) {
                gko gkoVar = (gko) this.b.a();
                if (!((AtomicBoolean) gkoVar.d).getAndSet(true)) {
                    ?? r0 = gkoVar.a;
                    mhs mhsVar = new mhs();
                    mhsVar.c(gkoVar.c);
                    mhsVar.d("CamcorderTS");
                    mhsVar.e(new gba(gkoVar, 18));
                    mhsVar.f(new gba(gkoVar, 19));
                    mhsVar.g((mhp) gkoVar.b);
                    r0.d(mhsVar.a());
                }
            }
            return ske.M(true);
        }
        Object obj = this.a;
        fna fnaVar = (fna) obj;
        if (fnaVar.c.getAndSet(true)) {
            ((sgt) fna.a.c().M(282)).s("Already started tracking.");
            ivkVar = new fhf(2);
        } else {
            try {
                try {
                    ((Session) ((fna) obj).i.a).resume();
                    gzi gziVar = gyi.a;
                    hbp hbpVar = fnaVar.l;
                    foy foyVar = fnaVar.i;
                    pdv pdvVar = fnaVar.b;
                    paq paqVarC = hbpVar.c(foyVar);
                    peo peoVar = (peo) Collection.EL.stream(pdvVar.d()).collect(sdz.b);
                    pdn pdnVarC = fnaVar.j.c(pdvVar, peoVar.c().f);
                    fmz fmzVar = new fmz(obj, peoVar, 0);
                    pdnVarC.l(fmzVar);
                    ivkVar = new ivk(fnaVar, paqVarC, pdnVarC, fmzVar, 1);
                } catch (CameraNotAvailableException e) {
                    throw new fnu(e);
                } catch (RuntimeException e2) {
                    throw ezh.l(e2);
                }
            } catch (fnu e3) {
                throw new IllegalStateException("Unable to start ARCore.", e3);
            }
        }
        ((our) this.b).d(ivkVar);
        return ske.M(true);
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        int i = this.c;
        return i != 0 ? i != 1 ? gsn.Z(this) : gsn.Z(this) : gsn.Z(this);
    }

    public /* synthetic */ gkh(our ourVar, fna fnaVar, int i) {
        this.c = i;
        this.b = ourVar;
        this.a = fnaVar;
    }
}
