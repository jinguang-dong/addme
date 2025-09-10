package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lly {
    private static final pas l = new pas(512, 384);
    protected final ExecutorService a;
    protected final ExecutorService b;
    protected final ExecutorService c;
    protected final ExecutorService d;
    private final llp m;
    private final pmi n;
    private final pbn o;
    private final pas p;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public final lmd k = new lmd();
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final Set g = new HashSet();

    public lly(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, pmi pmiVar, llp llpVar, pbn pbnVar, int i) {
        this.a = executorService;
        this.b = executorService2;
        this.c = executorService3;
        this.d = executorService4;
        this.n = pmiVar;
        this.m = llpVar;
        this.o = pbnVar;
        this.p = new pas(i, i);
    }

    public final void a(lmp lmpVar) {
        Map map = this.f;
        synchronized (map) {
            map.remove(lmpVar);
        }
    }

    public final void b(poj pojVar, Executor executor) {
        Map map = this.e;
        synchronized (map) {
            llw llwVar = (llw) map.get(pojVar);
            if (llwVar == null || llwVar.b() <= 0) {
                throw new RuntimeException("ERROR: Task implementation did NOT balance its release.");
            }
            llwVar.a(-1);
            this.h--;
            if (llwVar.b() == 0) {
                map.remove(pojVar);
                this.g.retainAll(map.keySet());
                if (llwVar.b) {
                    kee keeVar = new kee(this, (Object) pojVar, 17);
                    if (executor == null) {
                        keeVar.run();
                    } else {
                        executor.execute(keeVar);
                    }
                }
                if (llwVar.a) {
                    llwVar.d();
                }
            } else {
                map.put(pojVar, llwVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, llo] */
    public final boolean c(lss lssVar, Set set, boolean z, boolean z2, rwc rwcVar) {
        llw llwVar;
        lssVar.getClass();
        if (set.isEmpty()) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            poj pojVar = ((lmp) it.next()).e.a;
            Integer num = (Integer) map.get(pojVar);
            if (num == null) {
                map.put(pojVar, 1);
            } else {
                map.put(pojVar, Integer.valueOf(num.intValue() + 1));
            }
        }
        Set setKeySet = map.keySet();
        llf llfVar = new llf();
        llfVar.e(set.size());
        lme lmeVar = new lme(llfVar, lssVar, rwcVar);
        Map map2 = this.f;
        synchronized (map2) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                rnt.M(((obu) map2.get((lmp) it2.next())) == null, "Overlap of Shadow Task association.  You've possibly submitted the same task twice?");
            }
        }
        obu obuVar = new obu(lmeVar, setKeySet, (byte[]) null);
        HashSet<llw> hashSet = new HashSet(map.keySet().size());
        for (poj pojVar2 : map.keySet()) {
            int iIntValue = ((Integer) map.get(pojVar2)).intValue();
            Map map3 = this.e;
            synchronized (map3) {
                rnt.M(map3.get(pojVar2) == null, "Image is already being processed by another task.");
                llwVar = new llw(z, z2);
                llwVar.e(iIntValue);
                map3.put(pojVar2, llwVar);
                this.h += iIntValue;
                this.i++;
            }
            hashSet.add(llwVar);
        }
        this.m.a(obuVar.b);
        e(set, obuVar);
        for (llw llwVar2 : hashSet) {
            if (llwVar2.a) {
                llwVar2.c();
            }
        }
        return true;
    }

    public final void d(lmg lmgVar, Executor executor, Set set, lss lssVar, rwc rwcVar) {
        lly llyVar;
        lmg lmgVar2;
        lss lssVar2;
        HashSet hashSet = new HashSet();
        if (set.contains(llz.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK)) {
            pmi pmiVar = this.n;
            pbn pbnVar = this.o;
            llyVar = this;
            lmgVar2 = lmgVar;
            lssVar2 = lssVar;
            lmm lmmVar = new lmm(lmgVar2, executor, llyVar, lssVar2, pmiVar);
            if (set.contains(llz.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new lmr(lmgVar2, executor, llyVar, lssVar2, l, rwc.j(lmmVar), pbnVar));
            } else {
                hashSet.add(lmmVar);
            }
        } else {
            llyVar = this;
            lmgVar2 = lmgVar;
            lssVar2 = lssVar;
            if (set.contains(llz.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new lmr(lmgVar2, executor, llyVar, lssVar2, l, rvk.a, llyVar.o));
            }
        }
        if (set.contains(llz.CONVERT_TO_RGB_PREVIEW)) {
            lss lssVar3 = lssVar2;
            lssVar2 = lssVar3;
            hashSet.add(new lmn(lmgVar2, executor, llyVar, 3, lssVar3, llyVar.p, 3, llyVar.o));
        }
        Object obj = ((rwg) rwcVar).a;
        rwc rwcVarJ = rwc.j(new kee(llyVar, obj, 16));
        if (llyVar.c(lssVar2, hashSet, set.contains(llz.BLOCK_UNTIL_ALL_TASKS_RELEASE), set.contains(llz.CLOSE_ON_ALL_TASKS_RELEASE), rwcVarJ)) {
            lmd lmdVar = llyVar.k;
            poj pojVar = lmgVar2.a;
            List list = lmdVar.a;
            synchronized (list) {
                list.size();
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                if (pojVar == null) {
                    lmdVar.b.put(obj, null);
                } else {
                    lmdVar.b.put(obj, Long.valueOf(pojVar.d()));
                }
                list.size();
            }
        }
    }

    public final void e(Set set, obu obuVar) {
        Map map = this.f;
        synchronized (map) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                lmp lmpVar = (lmp) it.next();
                map.put(lmpVar, obuVar);
                llx llxVar = new llx(this, obuVar, lmpVar, this.o);
                int i = lmpVar.g - 1;
                if (i == 0) {
                    this.a.execute(llxVar);
                } else if (i == 1) {
                    this.b.execute(llxVar);
                } else if (i != 2) {
                    this.d.execute(llxVar);
                } else {
                    this.c.execute(llxVar);
                }
            }
        }
    }

    public final String toString() {
        int size;
        int size2;
        Map map = this.e;
        int size3 = this.f.size();
        int size4 = map.size();
        int i = this.h;
        lmd lmdVar = this.k;
        synchronized (lmdVar.a) {
            size = lmdVar.b.size();
        }
        List list = this.k.a;
        synchronized (list) {
            size2 = list.size();
        }
        return "ImageBackend Status BEGIN:\nShadow Image Map Size = " + size3 + "\nImage Semaphore Map Size = " + size4 + CZAHo.oErjPfflrgOhZ + i + "\nProxy Listener Map Size = " + size + "\nProxy Listener = " + size2 + "\nImageBackend Status END:\n";
    }
}
