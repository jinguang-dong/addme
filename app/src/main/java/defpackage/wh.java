package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wh implements wb {
    public final pl a;
    public final wg b;
    public final utl c;
    private final po d;

    @Override // defpackage.wb
    public final void a(qe qeVar) {
        utl utlVar;
        Object objC;
        qj qjVar;
        toString();
        Objects.toString(qeVar);
        do {
            utlVar = this.c;
            objC = utlVar.c();
            qjVar = (qj) objC;
        } while (!utlVar.f(objC, ((qjVar instanceof qi) || (qjVar instanceof qh)) ? qh.a : qeVar));
    }

    @Override // defpackage.wb
    public final void b() {
        toString();
        this.c.e(qg.a);
    }

    @Override // defpackage.wb
    public final void c() {
        toString();
        this.c.e(qh.a);
        this.b.h(null);
    }

    public final void d() {
        this.b.close();
    }

    public final void e(rb rbVar) {
        wg wgVar = this.b;
        synchronized (wgVar.d) {
            rb rbVar2 = wgVar.e;
            wgVar.e = rbVar;
            if (rbVar2 != null || rbVar != null) {
                if (rbVar != null) {
                    wgVar.j.M(new vx(rbVar));
                } else {
                    wgVar.j.M(vv.d);
                }
            }
        }
        if (rbVar == null) {
            List list = wgVar.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((wc) list.get(i)).q();
            }
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.d + ')';
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, und] */
    public wh(qrh qrhVar, po poVar, pl plVar, wk wkVar, List list) {
        qrhVar.getClass();
        poVar.getClass();
        wkVar.getClass();
        list.getClass();
        this.d = poVar;
        this.a = plVar;
        Map map = plVar.i;
        Map map2 = plVar.k;
        qm qmVar = tb.a;
        qm qmVar2 = tb.c;
        if (a.ao(null, true) || a.ao(null, true)) {
            Objects.toString(qmVar2);
        }
        Set set = (Set) sx.a.get(Build.MANUFACTURER);
        if (set != null) {
            set.contains(Build.DEVICE);
        }
        int iMax = Math.max(0, 0);
        vs vsVar = iMax != 0 ? new vs(iMax) : null;
        wg wgVar = new wg(poVar, map, map2, ske.bJ(list, ske.bm(vsVar)), rnt.ao(new Object[]{wkVar, vsVar}), qrhVar.e, (una) qrhVar.c);
        this.b = wgVar;
        if (vsVar != null) {
            if (vsVar.b == null) {
                vsVar.b = wgVar;
                wgVar.g(false);
                Log.w("CXCP", "Capture processing has been disabled for " + wgVar + uCzt.EeRLKxLOhXPo + vsVar.a + " frames have been completed.");
            } else {
                throw new IllegalStateException("GraphLoop has already been set!");
            }
        }
        this.c = utm.a(qh.a);
    }
}
