package defpackage;

import android.content.Context;
import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpb implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fpb(Context context, fto ftoVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, int i) {
        this.e = i;
        this.b = context;
        this.d = ftoVar;
        this.c = scheduledExecutorService;
        this.a = scheduledExecutorService2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mcw] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            ske.W(this.a, new fpc(this.b, this.d, 0), this.c);
            return;
        }
        if (i == 1) {
            ?? r0 = this.c;
            ?? r1 = this.a;
            sgv sgvVar = fkg.a;
            ske.W(r1, new fpc(this.b, this.d, 1), r0);
            return;
        }
        if (i == 2) {
            syu syuVarW = gsn.W((Context) this.b);
            final ?? r12 = this.a;
            final ?? r2 = this.c;
            final fto ftoVar = (fto) this.d;
            ojl.ck(syuVarW, new paf() { // from class: ftq
                @Override // defpackage.paf
                public final void a(Object obj) {
                    fto ftoVar2 = ftoVar;
                    new ftm(ftoVar2, r2, 4).a();
                    new ftm(ftoVar2, r12, 1).a();
                }
            }, sxo.a);
            return;
        }
        if (i == 3) {
            this.d.run();
            lzh lzhVar = (lzh) this.a.a();
            lzi lziVarA = lzj.a();
            lziVarA.a = "CameraVisionKit";
            lziVarA.e = 7;
            lziVarA.b(new sfm(pka.BACK));
            lziVarA.e(false);
            lziVarA.c(new sfm(nkw.PHOTO));
            lziVarA.d = rwc.j(this.c);
            ((AmbientMode.AmbientController) this.b).b(lzhVar, lziVarA.a());
            return;
        }
        if (i != 4) {
            owf owfVarH = owl.h(this.c, new hia(16));
            ((fdq) this.b).j().d(owfVarH.dK(this.a, this.d));
            return;
        }
        ?? r02 = this.d;
        scn scnVar = hrw.a;
        scnVar.getClass();
        ((fdq) this.b).j().d(owl.h(r02, new fdz(scnVar, 14)).dK(new hib(this.c, 13), this.a));
    }

    public /* synthetic */ fpb(mcw mcwVar, AmbientMode.AmbientController ambientController, uem uemVar, out outVar, int i) {
        this.e = i;
        this.d = mcwVar;
        this.b = ambientController;
        this.a = uemVar;
        this.c = outVar;
    }

    public /* synthetic */ fpb(owf owfVar, fdq fdqVar, owq owqVar, out outVar, int i) {
        this.e = i;
        this.c = owfVar;
        this.b = fdqVar;
        this.a = owqVar;
        this.d = outVar;
    }

    public /* synthetic */ fpb(rwc rwcVar, owf owfVar, fdq fdqVar, Executor executor, int i) {
        this.e = i;
        this.c = rwcVar;
        this.d = owfVar;
        this.b = fdqVar;
        this.a = executor;
    }

    public /* synthetic */ fpb(syu syuVar, Object obj, jgt jgtVar, out outVar, int i) {
        this.e = i;
        this.a = syuVar;
        this.b = obj;
        this.d = jgtVar;
        this.c = outVar;
    }
}
