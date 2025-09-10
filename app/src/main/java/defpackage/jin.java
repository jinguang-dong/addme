package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jin implements jiw {
    public static final sgv a = sgv.g("jin");
    private static final prc i = new uxi();
    final ArrayBlockingQueue b;
    public final oet c;
    private final occ d;
    private final ScheduledExecutorService e;
    private final pbn f;
    private final Context g;
    private final uem h;

    public jin(Context context, ScheduledExecutorService scheduledExecutorService, pbn pbnVar) {
        List list = occ.m;
        oco ocoVar = oco.a;
        ojl.aw("ANDROID_CAMERA");
        occ occVar = new occ(context, "ANDROID_CAMERA", null, ocoVar, null, null, null);
        oet oetVar = new oet(context.getApplicationContext(), new opj());
        this.b = new ArrayBlockingQueue(100);
        this.d = occVar;
        this.c = oetVar;
        this.e = scheduledExecutorService;
        this.f = pbnVar;
        this.g = context;
        this.h = new uem() { // from class: jil
            @Override // defpackage.uem, defpackage.uel
            public final Object a() {
                return qpt.av(this.a.c.j());
            }
        };
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, syu] */
    @Override // defpackage.jiw
    public final void a(sod sodVar) {
        pfl pflVar = new pfl(sodVar);
        ArrayBlockingQueue arrayBlockingQueue = this.b;
        if (!arrayBlockingQueue.offer(pflVar)) {
            ((sgt) a.c().M(2772)).s("Queue full. Discarded camera event.");
        }
        if (arrayBlockingQueue.peek() == null) {
            return;
        }
        ?? A = this.h.a();
        sgh sghVar = (sgh) ojl.ci(A);
        if (sghVar != null) {
            b(sghVar);
        } else {
            ScheduledExecutorService scheduledExecutorService = this.e;
            ske.W(ske.T(A, 5L, TimeUnit.SECONDS, scheduledExecutorService), new jim(this), scheduledExecutorService);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, tqr] */
    public final void b(sgh sghVar) {
        try {
            pbn pbnVar = this.f;
            pbnVar.f("clearcut.process");
            ArrayList arrayList = new ArrayList();
            this.b.drainTo(arrayList, 100);
            rnt.x(sghVar);
            opm opmVar = ((opp) sghVar.a).a;
            ojl.ay(opmVar);
            if (opmVar.a == 1) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.d.f(((pfl) it.next()).a, pro.a(this.g, i)).b();
                }
            }
            pbnVar.g();
        } catch (Throwable th) {
            this.f.g();
            throw th;
        }
    }
}
