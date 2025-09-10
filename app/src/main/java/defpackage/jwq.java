package defpackage;

import android.os.SystemClock;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwq implements jfk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jwq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sgt, shi] */
    @Override // defpackage.jfk
    public final /* synthetic */ void a(Object obj) throws InterruptedException {
        boolean z;
        int i = this.b;
        if (i == 0) {
            ((jwr) this.a).b.j = true;
            return;
        }
        if (i == 1) {
            float fFloatValue = ((Float) obj).floatValue();
            jeg jegVar = (jeg) this.a;
            jel jelVar = jegVar.F;
            jelVar.a = fFloatValue;
            jelVar.a();
            hvn hvnVar = jegVar.t;
            if (hvnVar != null) {
                synchronized (hvnVar.j) {
                    if (!hvnVar.h) {
                        hvnVar.i.post(hvnVar.k);
                        hvnVar.h = true;
                    }
                }
                return;
            }
            return;
        }
        if (i == 2) {
            ((jxa) this.a).A.sendEmptyMessage(105);
            return;
        }
        if (i == 3) {
            try {
                ((jxa) this.a).v.join();
            } catch (InterruptedException e) {
                ((sgt) ((sgt) jxa.a.b().i(e)).M((char) 3096)).s("photoSpherePreviewWriter interrupted.");
            }
            ((jxa) this.a).A.sendEmptyMessage(104);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                ((jxa) this.a).A.post(new juc(this, 12, null));
                return;
            } else {
                ((jxa) this.a).A.post(new juc(this, 11, null));
                return;
            }
        }
        jxa jxaVar = (jxa) this.a;
        if (jxaVar.q == 0) {
            jxaVar.M = SystemClock.elapsedRealtime();
            jxaVar.k();
        }
        jxaVar.T.h();
        jxaVar.q++;
        jxaVar.A.sendEmptyMessage(101);
        jxaVar.Q.c(R.raw.panorama_single_photo_shutter_sound);
        if (jxaVar.p) {
            return;
        }
        jxaVar.p = true;
        llm llmVar = jxaVar.b;
        Object obj2 = llmVar.a;
        synchronized (obj2) {
            synchronized (obj2) {
                z = llmVar.f == 1 || !llmVar.b.isEmpty();
            }
        }
        if (z) {
            return;
        }
        llmVar.d = true;
    }
}
