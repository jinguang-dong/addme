package defpackage;

import android.os.Handler;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lqn implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lqn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object, ndj] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((lqo) this.a).a();
                return;
            case 1:
                Object obj2 = this.a;
                synchronized (((lqg) obj2).d) {
                    ((lqg) obj2).a = true;
                    Handler handler = ((lqg) obj2).b;
                    if (handler.hasCallbacks(((lqg) obj2).i)) {
                        handler.removeCallbacks(((lqg) obj2).i);
                    }
                    ((lqg) obj2).a();
                }
                return;
            case 2:
                ((lqo) this.a).a();
                return;
            case 3:
                ((lqo) this.a).a();
                return;
            case 4:
                ((lqo) this.a).a();
                return;
            case 5:
                ((lqo) this.a).a();
                return;
            case 6:
                pka pkaVarL = ((goi) obj).a.l();
                lqo lqoVar = (lqo) this.a;
                lqoVar.j = pkaVarL == pka.FRONT;
                lqoVar.a();
                return;
            case 7:
                ((lqo) this.a).a();
                return;
            case 8:
                ((lqp) this.a).j();
                return;
            case 9:
                ((lqp) this.a).j();
                return;
            case 10:
                ((lqp) this.a).j();
                return;
            case 11:
                ((lvk) this.a).b();
                return;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue) {
                    ((lvk) obj3).d(2, pka.BACK, "full");
                    return;
                } else {
                    ((lvk) obj3).b();
                    return;
                }
            case 13:
                ((lvk) this.a).b();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((lqp) this.a).j();
                return;
            case 15:
                ((lyy) this.a).b(lyx.e, !((Boolean) obj).booleanValue());
                return;
            case 16:
                Object obj4 = this.a;
                ((mgr) obj4).b.getDecorView().post(new lac(obj4, 12));
                return;
            case 17:
                gzg gzgVar = ((Boolean) obj).booleanValue() ? gzy.n : gzy.m;
                mhe mheVar = (mhe) this.a;
                mheVar.c.a((Float) mheVar.H.e(gzgVar).get());
                return;
            case 18:
                Boolean bool = (Boolean) obj;
                FocusIndicatorView focusIndicatorView = ((mhe) this.a).m;
                if (focusIndicatorView == null) {
                    return;
                }
                focusIndicatorView.t(true != bool.booleanValue() ? 1.0f : 0.5f);
                return;
            case 19:
                if (Collection.EL.stream((List) obj).allMatch(new hsj(14))) {
                    Object obj5 = this.a;
                    mmk mmkVar = (mmk) obj5;
                    hie hieVar = mmkVar.g;
                    ArrayList arrayListAD = ujp.aD(hieVar.d, hieVar.c);
                    rwc rwcVar = mmkVar.e;
                    if (rwcVar.h()) {
                        ntr ntrVar = (ntr) rwcVar.c();
                        jsv.J(ntrVar.n != null, ntrVar.s);
                        arrayListAD.add(ntrVar.n.i);
                        arrayListAD.add(((ntr) rwcVar.c()).f);
                    }
                    mmkVar.f.j().d(new owe(arrayListAD).dK(new mix(obj5, 7), sxo.a));
                    return;
                }
                return;
            default:
                this.a.az((ltw) obj);
                return;
        }
    }
}
