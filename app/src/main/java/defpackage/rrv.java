package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrv {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rso] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static void a(Throwable th) {
        Throwable cause;
        Object obj;
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause == null && b(th) == null && (obj = rsa.a().b) != null) {
            ArrayList arrayList = new ArrayList();
            for (?? A = obj; A != 0; A = A.a()) {
                arrayList.add(A);
            }
            UUID uuidF = ((rso) arrayList.get(0)).f();
            uuidF.getClass();
            ((rso) arrayList.get(0)).j();
            sbk sbkVarE = sbp.e(arrayList.size());
            sbk sbkVarE2 = sbp.e(arrayList.size());
            for (rso rsoVar : ujp.aF(arrayList)) {
                sbkVarE2.h(rsoVar.c());
                sbkVarE.h(rsoVar.h());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                sbp sbpVarG = sbkVarE2.g();
                sbpVarG.getClass();
                sbp sbpVarG2 = sbkVarE.g();
                sbpVarG2.getClass();
                weakHashMap2.put(th, new rsr(sbpVarG, sbpVarG2, uuidF));
            }
        }
    }

    public static rtl b(Throwable th) {
        rnt.M(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            Throwable cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cause == null) {
                return null;
            }
            rsr rsrVar = (rsr) weakHashMap.get(cause);
            weakHashMap.put(th, rsrVar);
            return new rtl(rsrVar);
        }
    }
}
