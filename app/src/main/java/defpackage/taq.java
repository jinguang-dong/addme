package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class taq extends sjg {
    public static final /* synthetic */ int b = 0;
    private static final long c = TimeUnit.HOURS.toSeconds(1);
    public final Context a;
    private final uem d;
    private final taw e;
    private final uem f;
    private final oeg g;

    public taq(Context context, oeg oegVar, uem uemVar, String str) {
        super(null);
        this.e = new taw(c);
        this.a = context;
        this.g = oegVar;
        this.f = uemVar;
        this.d = new tap(context, str);
    }

    private final void e(tba tbaVar, syu syuVar) {
        oeg oegVar = this.g;
        Object qwfVar = oegVar.d;
        if (qwfVar == null) {
            synchronized (oegVar) {
                qwfVar = oegVar.d;
                if (qwfVar == null) {
                    qwfVar = new qwf();
                    oegVar.d = qwfVar;
                }
            }
        }
        ske.W(((qwf) qwfVar).a(oegVar.c, true, true), rsx.d(new lso(this, syuVar, tbaVar, 3)), sxo.a);
    }

    @Override // defpackage.sjg, defpackage.sif
    public final void b(RuntimeException runtimeException, sid sidVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.sif
    public final void c(sid sidVar) {
        tap tapVar;
        ArrayList<tau> arrayList;
        String str = (String) tam.a(sidVar, tao.a);
        syu syuVar = (syu) (str == null ? rvk.a : rwc.j(ske.M(str))).e(ske.M(null));
        tap tapVar2 = (tap) this.d;
        tau tauVar = new tau(tapVar2.a().b(sidVar, 3, tam.b), syuVar, sidVar.e());
        String str2 = sidVar.l() != null ? sidVar.l().b : null;
        taw tawVar = this.e;
        tav tavVar = new tav(sidVar.f(), str2);
        synchronized (tawVar) {
            long j = tauVar.b;
            if (j >= tawVar.b || tawVar.c.size() >= 1000) {
                LinkedHashMap linkedHashMap = tawVar.c;
                Collection collectionValues = linkedHashMap.values();
                long nanos = TimeUnit.SECONDS.toNanos(tawVar.a);
                Iterator it = collectionValues.iterator();
                int size = linkedHashMap.size();
                while (it.hasNext()) {
                    tau tauVar2 = (tau) it.next();
                    tapVar = tapVar2;
                    long j2 = tauVar2.b + nanos;
                    if (j2 >= j && size <= 1000) {
                        tawVar.b = j2;
                        break;
                    }
                    if (tauVar2.c > 0 && tawVar.d.size() < 1000) {
                        tawVar.d.add(tauVar2);
                    }
                    it.remove();
                    size--;
                    tapVar2 = tapVar;
                }
                tapVar = tapVar2;
            } else {
                tapVar = tapVar2;
            }
            LinkedHashMap linkedHashMap2 = tawVar.c;
            tau tauVar3 = (tau) linkedHashMap2.get(tavVar);
            if (tauVar3 != null) {
                tauVar3.c++;
                synchronized (tawVar) {
                    arrayList = tawVar.d;
                    tawVar.d = new ArrayList();
                }
                for (tau tauVar4 : arrayList) {
                    tpc tpcVar = tauVar4.d;
                    long j3 = tauVar4.c;
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    tba tbaVar = (tba) tpcVar.b;
                    tba tbaVar2 = tba.a;
                    tbaVar.b |= 2;
                    tbaVar.d = j3;
                    e((tba) tpcVar.l(), tauVar4.a);
                }
                return;
            }
            linkedHashMap2.put(tavVar, tauVar);
            tam tamVarB = tapVar.a();
            tak takVarA = tal.a();
            takVarA.b(true);
            takVarA.c(true);
            takVarA.d(true);
            tpc tpcVarB = tamVarB.b(sidVar, 2, takVarA.a());
            Throwable th = (Throwable) tam.a(sidVar, sgy.a);
            if (sidVar.o().intValue() >= Integer.MAX_VALUE && !(th instanceof shg)) {
                suo suoVar = ((tba) tpcVarB.b).g;
                if (suoVar == null) {
                    suoVar = suo.a;
                }
                tpc tpcVar2 = (tpc) suoVar.a(5, null);
                tpcVar2.r(suoVar);
                tpc tpcVarQ = rkf.q(new tar(th));
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                suo suoVar2 = (suo) tpcVar2.b;
                sut sutVar = (sut) tpcVarQ.l();
                sutVar.getClass();
                suoVar2.k = sutVar;
                suoVar2.b |= 1024;
                suo suoVar3 = (suo) tpcVar2.l();
                if (!tpcVarB.b.C()) {
                    tpcVarB.o();
                }
                tba tbaVar3 = (tba) tpcVarB.b;
                suoVar3.getClass();
                tbaVar3.g = suoVar3;
                tbaVar3.b |= 32;
            }
            e((tba) tpcVarB.l(), syuVar);
        }
    }

    @Override // defpackage.sif
    public final boolean d(Level level) {
        if (((CameraApp) ((rnu) ((iyd) this.f).a).a).i == null || level.intValue() <= Level.WARNING.intValue()) {
            return false;
        }
        int i = gzx.a;
        return false;
    }
}
