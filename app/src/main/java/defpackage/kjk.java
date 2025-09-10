package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjk implements kle {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;

    public kjk(lss lssVar, kle kleVar, iil iilVar, int i) {
        this.a = i;
        this.b = lssVar;
        this.c = kleVar;
        this.d = iilVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    private final void b() {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((poj) it.next()).close();
        }
        Iterator it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            ((poj) it2.next()).close();
        }
    }

    private static final void c(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Long l : map.keySet()) {
            if (l.longValue() < j) {
                ((poj) map.get(l)).close();
                arrayList.add(l);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            map.remove((Long) arrayList.get(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kle] */
    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
        rwc rwcVarJ;
        boolean z = false;
        if (this.a != 0) {
            if (pojVar.a() != 35) {
                pojVar.close();
                return;
            }
            ?? r0 = this.b;
            int iE = r0.e();
            if (r0.ah()) {
                ocq.aq(pojVar, pao.b(iE));
            }
            Object obj = this.d;
            rnt.B(pojVar.a() == 35, "Expected image format YUV but found: " + pojVar.a());
            iil iilVar = (iil) obj;
            iilVar.c.execute(new ng(iilVar, pojVar, iE, 9));
            this.c.a(pojVar, syuVar);
            return;
        }
        Long lValueOf = Long.valueOf(pojVar.d());
        kiy kiyVar = new kiy(pojVar);
        kiyVar.a.put(kix.a, syuVar);
        ?? r10 = this.c;
        r10.put(lValueOf, kiyVar);
        if (r10.isEmpty()) {
            rwcVarJ = rvk.a;
        } else {
            Iterator it = r10.values().iterator();
            long j = 0;
            while (it.hasNext()) {
                long jD = ((poj) it.next()).d();
                if (!z || jD > j) {
                    j = jD;
                }
                z = true;
            }
            rwcVarJ = !z ? rvk.a : rwc.j(Long.valueOf(j));
        }
        if (rwcVarJ.h()) {
            c(((Long) rwcVarJ.c()).longValue(), r10);
            c(((Long) rwcVarJ.c()).longValue(), this.b);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kle] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        kiy kiyVar;
        if (this.a != 0) {
            this.c.close();
            return;
        }
        try {
            syu syuVarL = ske.L(new pco());
            ?? r1 = this.c;
            poj pojVar = null;
            if (r1.isEmpty()) {
                kiyVar = null;
            } else {
                kiyVar = null;
                for (kiy kiyVar2 : r1.values()) {
                    if (kiyVar == null || kiyVar2.d() > kiyVar.d()) {
                        kiyVar = kiyVar2;
                    }
                }
            }
            if (kiyVar != null) {
                r1.remove(Long.valueOf(kiyVar.d()));
                syuVarL = kiyVar.k();
                syuVarL.getClass();
            }
            if (kiyVar != null) {
                long jD = kiyVar.d();
                ?? r3 = this.b;
                poj pojVar2 = (poj) r3.get(Long.valueOf(jD));
                if (pojVar2 != null) {
                    r3.remove(Long.valueOf(pojVar2.d()));
                }
                pojVar = pojVar2;
            }
            Object obj = this.d;
            rwc rwcVarI = rwc.i(kiyVar);
            rwc rwcVarI2 = rwc.i(pojVar);
            try {
                if (rwcVarI2.h()) {
                    ((poj) rwcVarI2.c()).close();
                }
                HashSet hashSet = new HashSet();
                hashSet.add(llz.CREATE_EARLY_FILMSTRIP_PREVIEW);
                hashSet.add(llz.CONVERT_TO_RGB_PREVIEW);
                hashSet.add(llz.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
                hashSet.add(llz.CLOSE_ON_ALL_TASKS_RELEASE);
                if (rwcVarI.h()) {
                    ((kjv) obj).e.b.add(syuVarL);
                    try {
                        kjw kjwVar = ((kjv) obj).d;
                        lly llyVar = kjwVar.b;
                        lmf lmfVar = new lmf((poj) rwcVarI.c());
                        lmfVar.d = syuVarL;
                        lmfVar.c = ((kjv) obj).b;
                        lmfVar.e = kjwVar.c;
                        lss lssVar = ((kjv) obj).a;
                        lmfVar.b(lssVar.f());
                        llyVar.d(lmfVar.a(), kjwVar.d, hashSet, lssVar, rwc.j(((kjv) obj).c));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    hht hhtVar = new hht("received an image, but it did not have any image data!");
                    ((sgt) kjw.a.b().M(3301)).v("%s", hhtVar.getMessage());
                    ((kjv) obj).a.F(nfo.a, hhtVar);
                }
            } finally {
                ((kjv) obj).e.close();
            }
        } finally {
            b();
        }
    }

    public kjk(kjv kjvVar, int i) {
        this.a = i;
        this.d = kjvVar;
        this.b = new HashMap();
        this.c = new HashMap();
    }
}
