package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.wear.ambient.AmbientDelegate;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnl extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl(ConstraintTrackingWorker constraintTrackingWorker, dwi dwiVar, ejs ejsVar, ebx ebxVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.e = constraintTrackingWorker;
        this.b = dwiVar;
        this.d = ejsVar;
        this.c = ebxVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((dnl) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 1) {
            return ((dnl) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 2) {
            return ((dnl) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 3) {
            return ((dnl) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 4) {
            return ((dnl) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dnl) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [dtz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [dub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, syu] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.f;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj2 = this.b;
                ?? r2 = this.c;
                Object obj3 = this.d;
                ?? r4 = this.e;
                this.a = 1;
                if (((dno) obj2).b(r2, (AmbientDelegate) obj3, r4, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        if (i == 1) {
            uhi uhiVar2 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj4 = this.c;
                Object obj5 = this.d;
                chz chzVarF = blb.f((Rect) this.b);
                this.a = 1;
                obj = ((cav) obj4).a((ScrollCaptureSession) obj5, chzVarF, this);
                if (obj == uhiVar2) {
                    return uhiVar2;
                }
            }
            this.e.d(blb.d((chz) obj));
            return ufg.a;
        }
        if (i == 2) {
            uhi uhiVar3 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                urk urkVarA = ((dtw) this.d).a();
                this.a = 1;
                if (ung.D(urkVarA, this) == uhiVar3) {
                    return uhiVar3;
                }
            }
            ((dtw) this.d).e((Activity) this.b, this.e, this.c);
            return ufg.a;
        }
        if (i == 3) {
            uhi uhiVar4 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                urk urkVarA2 = ((dtw) this.d).a();
                this.a = 1;
                if (ung.D(urkVarA2, this) == uhiVar4) {
                    return uhiVar4;
                }
            }
            ((dtw) this.d).d((Activity) this.b, this.e, this.c);
            return ufg.a;
        }
        if (i == 4) {
            uhi uhiVar5 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj6 = this.b;
                Object obj7 = this.d;
                this.a = 1;
                obj = eds.a((ejs) obj6, (ebx) obj7, this);
                if (obj == uhiVar5) {
                    return uhiVar5;
                }
            }
            ((AtomicInteger) this.e).set(((Number) obj).intValue());
            this.c.cancel(true);
            return ufg.a;
        }
        uhi uhiVar6 = uhi.a;
        int i2 = this.a;
        rnt.aN(obj);
        if (i2 != 0) {
            return obj;
        }
        Object obj8 = this.e;
        Object obj9 = this.b;
        Object obj10 = this.d;
        Object obj11 = this.c;
        this.a = 1;
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) obj8;
        Object objH = constraintTrackingWorker.h((dwi) obj9, (ejs) obj10, (ebx) obj11, this);
        return objH == uhiVar6 ? uhiVar6 : objH;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r7v2, types: [dtz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [dub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, syu] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.b;
            return new dnl((dno) obj2, (uif) this.c, (AmbientDelegate) this.d, (uiq) this.e, uhbVar, 0);
        }
        if (i == 1) {
            Object obj3 = this.c;
            Object obj4 = this.d;
            return new dnl((cav) obj3, (ScrollCaptureSession) obj4, (Rect) this.b, (Consumer) this.e, uhbVar, 1);
        }
        if (i == 2) {
            Object obj5 = this.d;
            return new dnl((dtw) obj5, (Activity) this.b, (Executor) this.e, (dtz) this.c, uhbVar, 2);
        }
        if (i == 3) {
            Object obj6 = this.d;
            return new dnl((dtw) obj6, (Activity) this.b, (Executor) this.e, (dub) this.c, uhbVar, 3);
        }
        if (i != 4) {
            Object obj7 = this.e;
            Object obj8 = this.b;
            return new dnl((ConstraintTrackingWorker) obj7, (dwi) obj8, (ejs) this.d, (ebx) this.c, uhbVar, 5);
        }
        Object obj9 = this.b;
        Object obj10 = this.d;
        return new dnl((ejs) obj9, (ebx) obj10, (AtomicInteger) this.e, (syu) this.c, uhbVar, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl(cav cavVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = cavVar;
        this.d = scrollCaptureSession;
        this.b = rect;
        this.e = consumer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl(dno dnoVar, uif uifVar, AmbientDelegate ambientDelegate, uiq uiqVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.b = dnoVar;
        this.c = uifVar;
        this.d = ambientDelegate;
        this.e = uiqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl(dtw dtwVar, Activity activity, Executor executor, dtz dtzVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.d = dtwVar;
        this.b = activity;
        this.e = executor;
        this.c = dtzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl(dtw dtwVar, Activity activity, Executor executor, dub dubVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.d = dtwVar;
        this.b = activity;
        this.e = executor;
        this.c = dubVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnl(ejs ejsVar, ebx ebxVar, AtomicInteger atomicInteger, syu syuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.b = ejsVar;
        this.d = ebxVar;
        this.e = atomicInteger;
        this.c = syuVar;
    }
}
