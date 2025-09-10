package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class noy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ noy(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public final /* synthetic */ npq a(npr nprVar) {
        return b(nprVar, new mae(5));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, tzx] */
    public final npq b(npr nprVar, Supplier supplier) {
        uh uhVar = (uh) ((ocq) this.b).a;
        return new nph((Executor) uhVar.i.a(), mvi.b(), (owf) uhVar.g.a(), (owf) uhVar.d.a(), (pbn) uhVar.c.a(), hmp.b(), (ktx) uhVar.h.a(), ((ium) uhVar.a).a(), (iuo) uhVar.e.a(), (hdm) uhVar.b.a(), (CameraActivityTiming) uhVar.f.a(), nprVar, (npp) this.a, supplier);
    }

    public noy(nkk nkkVar, nql nqlVar) {
        this.a = nqlVar;
        this.b = nkkVar;
    }
}
