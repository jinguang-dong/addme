package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class igu implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ owq e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ igu(our ourVar, hpa hpaVar, hwf hwfVar, Executor executor, owq owqVar, owq owqVar2, hbj hbjVar, int i) {
        this.h = i;
        this.b = ourVar;
        this.g = hpaVar;
        this.d = hwfVar;
        this.a = executor;
        this.c = owqVar;
        this.e = owqVar2;
        this.f = hbjVar;
    }

    public /* synthetic */ igu(rwc rwcVar, hbj hbjVar, fqg fqgVar, mhq mhqVar, out outVar, mhp mhpVar, ovx ovxVar, int i) {
        this.h = i;
        this.a = rwcVar;
        this.g = hbjVar;
        this.f = fqgVar;
        this.b = mhqVar;
        this.c = outVar;
        this.d = mhpVar;
        this.e = ovxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v7, types: [hpb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, mhq] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.h != 0) {
            Object obj = this.b;
            Object obj2 = this.g;
            ?? r3 = this.d;
            ?? r4 = this.a;
            our ourVar = (our) obj;
            ourVar.d(((hpa) obj2).c(r3, r4));
            r3.getClass();
            ourVar.d(this.c.dK(new hib(r3, 14), r4));
            ourVar.d(new ffy(this.e, 16));
            gzi gziVar = gzq.a;
            return;
        }
        ((idy) ((rwc) this.a).c()).a();
        String str = gzc.a;
        our ourVar2 = ((fqg) this.f).b;
        mhs mhsVar = new mhs();
        mhsVar.d(HHdu.QWMnUuZkQpONlQ);
        mhsVar.c(this.c);
        mhsVar.g((mhp) this.d);
        owq owqVar = this.e;
        mhsVar.f(new hvm(owqVar, 14, null));
        mhsVar.e(new hvm(owqVar, 15, null));
        ourVar2.d(this.b.d(mhsVar.a()));
    }
}
