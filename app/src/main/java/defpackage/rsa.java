package defpackage;

import android.os.Trace;
import j$.lang.Iterable$EL;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsa {
    private static final scn b = scn.K("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
    private static final AtomicReference c = new AtomicReference(sfd.a);
    public static final WeakHashMap a = new WeakHashMap();
    private static final rrz d = new rrz();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    public static rsn a() {
        return (rsn) d.get();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, rso] */
    public static rso b() {
        rsn rsnVarA = a();
        ?? r1 = rsnVarA.b;
        if (r1 != 0) {
            return r1;
        }
        rrr rrrVar = rsc.a;
        UUID uuidB = rsb.a.b();
        String strFv = rrq.fv(uuidB);
        scn scnVarD = d();
        if (!scnVarD.isEmpty()) {
            Iterable$EL.forEach(scnVarD, new lig(12));
        }
        return new rsc(uuidB, strFv, rsc.a, rsnVarA);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rso] */
    public static rso c(rsn rsnVar, rso rsoVar) {
        rso rsoVar2;
        Object obj = rsnVar.c;
        ?? r0 = rsnVar.b;
        if (r0 != rsoVar) {
            if (r0 == 0) {
                rsnVar.a = rrw.a();
            }
            if (rsnVar.a) {
                if (r0 != 0) {
                    if (rsoVar == null) {
                        rsoVar2 = null;
                    } else if (r0.a() == rsoVar && !qsz.t(r0)) {
                        Trace.endSection();
                    } else if (r0 != rsoVar.a() || qsz.t(rsoVar)) {
                        rsoVar2 = rsoVar;
                    } else {
                        qsz.q(rsoVar);
                    }
                    qsz.s(r0);
                } else {
                    rsoVar2 = rsoVar;
                }
                if (rsoVar2 != null) {
                    qsz.r(rsoVar2);
                }
            }
            if (r0 != rsoVar) {
                if (rsoVar == null) {
                    rsoVar = null;
                }
                rsnVar.b = rsoVar;
                return r0;
            }
        }
        return rsoVar;
    }

    public static scn d() {
        return (scn) c.get();
    }
}
