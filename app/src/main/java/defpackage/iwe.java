package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iwe {
    public static final sgv a = sgv.g("iwe");
    public final hkk d;
    private final int e;
    private iwd g;
    private lfb h;
    private szh i;
    private final List f = new ArrayList();
    public final List b = new ArrayList();
    public boolean c = false;

    public iwe(hkk hkkVar, int i) {
        this.e = i;
        this.d = hkkVar;
    }

    public final synchronized syu a() {
        szh szhVar;
        this.c = true;
        this.i = new szh();
        szhVar = this.i;
        this.g = new iwd(this, szhVar);
        return szhVar;
    }

    public final synchronized void b() {
        this.c = false;
        szh szhVar = this.i;
        if (szhVar != null) {
            szhVar.e(false);
        }
        List<tht> list = this.b;
        if (!list.isEmpty()) {
            for (tht thtVar : list) {
                String.format("Closing cached filtered frame %s.", Long.valueOf(thtVar.b.d()));
                thtVar.d.run();
            }
        }
        List<pdk> list2 = this.f;
        for (pdk pdkVar : list2) {
            String.format("Closing unfiltered frame %s.", pdkVar.b());
            pdkVar.close();
        }
        list2.clear();
        iwd iwdVar = this.g;
        if (iwdVar != null) {
            iwdVar.b = null;
        }
    }

    public final synchronized void c(float f, float f2, long j) {
        String.format("Capturing PSL frames for %s seconds at %s fps starting at %s", Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j));
        this.h = new lfb(j, f, f2, this.g);
        List<pdk> list = this.f;
        String.format("Filtering %s cached frames", Integer.valueOf(list.size()));
        for (pdk pdkVar : list) {
            lfb lfbVar = this.h;
            lfbVar.getClass();
            lfbVar.a(pdkVar);
        }
        list.clear();
    }

    public final synchronized void d(iwo iwoVar) {
        String.format("Capture in progress: %s", Boolean.valueOf(this.c));
        List list = this.b;
        if (list.isEmpty()) {
            ((sgt) a.c().M(2490)).t("[shot-%s] Filtered cache is empty", this.e);
        } else {
            String.format("Processing %s cached frames", Integer.valueOf(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iwoVar.b((tht) it.next());
            }
            list.clear();
        }
        if (!this.c) {
            iwoVar.e(false);
        } else {
            synchronized (this) {
                this.g.b = iwoVar;
            }
        }
    }

    public final synchronized void e(pdk pdkVar) {
        try {
            String.format("Received PSL frame %s", pdkVar.b());
            if (this.c) {
                pdk pdkVarA = pdkVar.a();
                if (pdkVarA == null) {
                    pdkVarA = new hxi(pdkVar.b(), pdkVar.c(), pdkVar.d());
                    String.format("Could not fork frame %s, passing an empty frame", pdkVar.b());
                }
                if (this.h == null) {
                    String.format("Caching unfiltered frame %s", pdkVar.b());
                    this.f.add(pdkVarA);
                } else {
                    String.format("filtering frame: %s", pdkVar.b());
                    lfb lfbVar = this.h;
                    lfbVar.getClass();
                    lfbVar.a(pdkVarA);
                }
            }
        } finally {
            pdkVar.close();
        }
    }

    public final synchronized boolean f() {
        if (this.c) {
            b();
            return true;
        }
        String.format("Capture was done already, keeping %s unfiltered and %s filtered frames.", Integer.valueOf(this.f.size()), Integer.valueOf(this.b.size()));
        return false;
    }
}
