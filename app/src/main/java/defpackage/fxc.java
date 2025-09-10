package defpackage;

import android.view.Surface;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fxc extends uht implements uiu {
    int a;
    final /* synthetic */ fxd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc(fxd fxdVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = fxdVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxc) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        fxc fxcVar = new fxc(this.b, uhbVar);
        fxcVar.c = obj;
        return fxcVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        fxd fxdVar;
        Surface surface;
        gaw gawVar;
        gau gauVar;
        jae jaeVarC;
        uhi uhiVar = uhi.a;
        try {
            try {
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    und undVar = (und) this.c;
                    syu syuVar = this.b.i;
                    if (syuVar == null) {
                        ujp.c("viewfinderSinkFuture");
                        syuVar = null;
                    }
                    unj unjVarA = ukc.A(undVar, null, new htc(syuVar, (uhb) null, 1), 3);
                    unjVarA.o(new cjb(syuVar, 4));
                    this.a = 1;
                    obj = unjVarA.k(this);
                    if (obj == uhiVar) {
                        return uhiVar;
                    }
                }
                ngn ngnVar = (ngn) obj;
                fxdVar = this.b;
                gkf gkfVar = fxdVar.n;
                gaw gawVar2 = fxdVar.f;
                if (gawVar2 == null) {
                    ujp.c("config");
                    gawVar2 = null;
                }
                Surface surfaceA = gkfVar.a(gawVar2.d.c());
                if (surfaceA == null) {
                    fyc fycVar = fxdVar.d;
                    gaw gawVar3 = fxdVar.f;
                    if (gawVar3 == null) {
                        ujp.c("config");
                        gawVar3 = null;
                    }
                    gdv gdvVarA = fycVar.a(gawVar3);
                    if (gdvVarA == null) {
                        throw new IllegalArgumentException(uCzt.bKrPnO);
                    }
                    Surface surface2 = (Surface) gdvVarA.a.b().c();
                    fxdVar.k = gdvVarA;
                    surface = surface2;
                } else {
                    surface = surfaceA;
                }
                jod jodVar = fxdVar.q;
                gaw gawVar4 = fxdVar.f;
                if (gawVar4 == null) {
                    ujp.c("config");
                    gawVar = null;
                } else {
                    gawVar = gawVar4;
                }
                gau gauVar2 = fxdVar.g;
                if (gauVar2 == null) {
                    ujp.c(VnmwoBe.aDGujx);
                    gauVar = null;
                } else {
                    gauVar = gauVar2;
                }
                gawVar.getClass();
                gauVar.getClass();
                ngnVar.getClass();
                Object obj2 = ((ejt) jodVar.b).a;
                hkk hkkVar = new hkk(gawVar, gauVar, ngnVar, surface, jodVar.a);
                nkw nkwVar = nkw.UNINITIALIZED;
                int iOrdinal = gawVar.T.ordinal();
                if (iOrdinal == 2) {
                    jaeVarC = jea.c(hkkVar, (izm) obj2);
                } else {
                    if (iOrdinal == 5) {
                        throw new ueu("An operation is not implemented: Not yet implemented");
                    }
                    if (iOrdinal == 19) {
                        throw new ueu("An operation is not implemented: Not yet implemented");
                    }
                    if (iOrdinal == 13) {
                        throw new ueu("An operation is not implemented: Not yet implemented");
                    }
                    if (iOrdinal == 14) {
                        throw new ueu("An operation is not implemented: Not yet implemented");
                    }
                    jaeVarC = jea.c(hkkVar, (izm) obj2);
                }
                fxdVar.o = (lbj) jaeVarC.aA.a();
                lbj lbjVar = fxdVar.o;
                if (lbjVar != null) {
                    lbjVar.b.a();
                }
                Iterator it = fxdVar.l.iterator();
                while (it.hasNext()) {
                    ((fyt) it.next()).g();
                }
                fxdVar.a(fyv.c);
            } catch (Exception e) {
                ((sgt) fxd.a.b().i(e).M(473)).s("Failed to init camcorder session.");
                Iterator it2 = this.b.l.iterator();
                while (it2.hasNext()) {
                    ((fyt) it2.next()).h();
                }
                fxdVar = this.b;
                if (fxdVar.m == fyv.g) {
                }
            }
        } catch (Throwable th) {
            fxd fxdVar2 = this.b;
            if (fxdVar2.m != fyv.g) {
                throw th;
            }
            fxdVar = fxdVar2;
        }
        if (fxdVar.m == fyv.g) {
            lbj lbjVar2 = fxdVar.o;
            if (lbjVar2 != null) {
                lbjVar2.close();
            }
        }
        return ufg.a;
    }
}
