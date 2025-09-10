package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyq implements syf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public oyq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((qhd) this.a).j(qgg.a(th));
                return;
            } else {
                ((sgt) ((sgt) kcq.a.b().i(th)).M((char) 3220)).s("Encoder writing failed.");
                ((kcq) this.a).x = 2;
                return;
            }
        }
        Log.e("AudioEncoder", "Stopping recording due to: ", th);
        sbp sbpVar = ((oys) this.a).k;
        int size = sbpVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((oyx) sbpVar.get(i2)).a(oyu.OTHER);
        }
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((kcq) this.a).x = 2;
                return;
            }
            Object obj2 = this.a;
            if (obj != null) {
                ((qhd) obj2).i(obj);
            } else {
                ((qhd) obj2).j(qgg.a(new NullPointerException("Function output is null")));
            }
        }
    }
}
