package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fck extends ojl {
    private static final sgv c = sgv.g("fck");
    public volatile nkw a;
    poe b;
    private final owf d;
    private final owf e;
    private final Set f;
    private final fbm g;

    public fck(fbm fbmVar, owq owqVar, owq owqVar2) {
        super((short[]) null);
        this.a = nkw.UNINITIALIZED;
        this.d = owqVar;
        this.e = owqVar2;
        this.f = new HashSet();
        gzg gzgVar = gze.a;
        this.g = fbmVar;
        this.b = null;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Integer num;
        HashSet hashSet;
        synchronized (this) {
            this.b = poeVar;
        }
        CaptureResult.Key key = nvh.b;
        if (key == null || (num = (Integer) poeVar.a(key)) == null || num.intValue() != 1 || this.g.a() || ((Boolean) this.d.dL()).booleanValue() || ((Boolean) this.e.dL()).booleanValue()) {
            return;
        }
        synchronized (this) {
            hashSet = new HashSet(this.f);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final synchronized void b(Runnable runnable) {
        this.f.add(runnable);
    }

    public final synchronized void c(Runnable runnable) {
        this.f.remove(runnable);
    }

    public final synchronized boolean d(nms nmsVar) {
        poe poeVar = this.b;
        if (poeVar == null) {
            ((sgt) c.c().M(12)).s("Scene change support check, latest capture result is null, optimistically returning true.");
            return true;
        }
        String str = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null) {
            return true;
        }
        pjo pjoVarB = nmsVar.b(str);
        if (pjoVarB == null) {
            ((sgt) c.c().M(10)).s("Scene change support check, couldn't find characteristics for the physical camera, optimistically returning true.");
            return true;
        }
        return pjoVarB.F();
    }
}
