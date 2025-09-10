package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lmh extends lmb {
    public static final sgv e = sgv.g("lmh");
    public final jiz f;
    private final rwc g;
    private lmg h;
    private double i;

    public lmh(lly llyVar, lmk lmkVar, rwc rwcVar, jiz jizVar) {
        super(llyVar, lmkVar);
        this.h = null;
        this.i = 0.0d;
        this.g = rwcVar;
        this.f = jizVar;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kle] */
    public final synchronized void c(Set set, lss lssVar) {
        mdq mdqVar;
        ArrayList arrayList;
        if (set.isEmpty()) {
            ((sgt) e.c().M(4232)).t("Filtered Image future failed to return a single image. There are %d images.  No Image produced.", set.size());
            return;
        }
        if (set.size() > 1) {
            ((sgt) e.b().M(4231)).t("Filtered Image return multiple images. There are %d images.  No Image produced.", set.size());
            throw new IllegalStateException("Lucky Shot Filter returned multiple images.");
        }
        jiz jizVar = this.f;
        jizVar.e = SystemClock.elapsedRealtimeNanos();
        mdm mdmVarO = lssVar.o();
        if (mdmVarO == null || (mdqVar = ((mdo) mdmVarO).o) == null) {
            rwc rwcVar = this.g;
            lmg lmgVar = (lmg) set.iterator().next();
            ((mdo) lssVar.o()).n = this.f;
            Object obj = ((rwg) rwcVar).a;
            ((kjj) ((oge) obj).b).a.g("finish lucky shot selection, pass to the piped image saver");
            ?? r6 = ((oge) obj).a;
            try {
                poj pojVar = lmgVar.a;
                syu syuVar = lmgVar.c;
                syuVar.getClass();
                r6.a(pojVar, syuVar);
                r6.close();
                return;
            } finally {
            }
        }
        mdqVar.e = jizVar.d;
        mdqVar.f = jizVar.e;
        synchronized (jizVar.a) {
            List list = jizVar.f;
            arrayList = list != null ? new ArrayList(list) : null;
        }
        mdqVar.h = arrayList;
        rwc rwcVar2 = this.g;
        lmg lmgVar2 = (lmg) set.iterator().next();
        ((mdo) lssVar.o()).n = this.f;
        Object obj2 = ((rwg) rwcVar2).a;
        ((kjj) ((oge) obj2).b).a.g("finish lucky shot selection, pass to the piped image saver");
        ?? r62 = ((oge) obj2).a;
        poj pojVar2 = lmgVar2.a;
        syu syuVar2 = lmgVar2.c;
        syuVar2.getClass();
        r62.a(pojVar2, syuVar2);
        r62.close();
        return;
    }

    @Override // defpackage.lmb, defpackage.lma, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        SystemClock.elapsedRealtimeNanos();
        super.close();
    }

    public final synchronized lmg d(lmg lmgVar, double d) {
        lmg lmgVar2 = this.h;
        if (lmgVar2 != null && d <= this.i) {
            return lmgVar;
        }
        this.h = lmgVar;
        this.i = d;
        return lmgVar2;
    }
}
