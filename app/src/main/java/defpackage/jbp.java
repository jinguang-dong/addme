package defpackage;

import android.hardware.camera2.params.Face;
import android.view.animation.LinearInterpolator;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jbp implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jbp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, ndj] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        float f = 0.0f;
        boolean z = false;
        switch (this.b) {
            case 0:
                ltw ltwVar = (ltw) obj;
                jby jbyVar = (jby) this.a;
                if (jbyVar.ab.p(gzo.bw)) {
                    return;
                }
                if (!ltw.OFF.equals(ltwVar)) {
                    if (jbyVar.H) {
                        jbyVar.n.o();
                    }
                    jbyVar.n.az(ltwVar);
                    return;
                } else {
                    ndj ndjVar = jbyVar.n;
                    ndjVar.az(ltwVar);
                    if (jbyVar.H) {
                        ndjVar.i();
                        return;
                    }
                    return;
                }
            case 1:
                ((jbm) ((iiz) this.a).b).c(((Boolean) obj).booleanValue());
                return;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    jby jbyVar2 = (jby) this.a;
                    if (((Boolean) jbyVar2.F.dL()).booleanValue()) {
                        kdb kdbVar = jbyVar2.Q;
                        kdbVar.i(kdbVar.g);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((fqf) this.a).eB();
                return;
            case 4:
                ((jby) ((iiz) this.a).b).k(((Boolean) obj).booleanValue());
                return;
            case 5:
                this.a.az((ltw) obj);
                return;
            case 6:
                ((fqf) this.a).eB();
                return;
            case 7:
                ((jcc) this.a).a(((Boolean) obj).booleanValue());
                return;
            case 8:
                ((fqf) this.a).eB();
                return;
            case 9:
                Object obj2 = ((qrx) obj).d;
                if (obj2 != null) {
                    Object obj3 = this.a;
                    int length = ((Face[]) obj2).length;
                    jcv jcvVar = (jcv) obj3;
                    jcvVar.B.a(Boolean.valueOf(length > 0));
                    nmu nmuVar = (nmu) jcvVar.ac.a;
                    nmuVar.a(length);
                    if (jcvVar.I != null && jcvVar.c.i()) {
                        int i = jcvVar.J;
                        if (i < 5) {
                            jcvVar.J = i + 1;
                        } else {
                            nmu nmuVar2 = jcvVar.m;
                            owf owfVar = jcvVar.I;
                            owfVar.getClass();
                            Float f2 = ((kmd) owfVar.dL()).a;
                            f2.getClass();
                            nmuVar2.a(f2.floatValue());
                            f = nmuVar2.a;
                        }
                        if (((int) (nmuVar.a + 0.5f)) == 0 && f > 3.0f) {
                            z = true;
                        }
                        lgh lghVar = jcvVar.F;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        boolValueOf.getClass();
                        if (z) {
                            synchronized (lghVar.c) {
                                if (lghVar.e) {
                                    if (lghVar.f != 2) {
                                        lghVar.f = 2;
                                        lghVar.g.a(lghVar.a);
                                        lghVar.c(800L);
                                    }
                                }
                            }
                        }
                        lghVar.d = boolValueOf;
                        return;
                    }
                    return;
                }
                return;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    Object obj4 = this.a;
                    jcv jcvVar2 = (jcv) obj4;
                    jth jthVar = jcvVar2.U;
                    if (jthVar != null) {
                        kgw kgwVar = jthVar.c;
                        if (kgwVar.M() && kgwVar.D()) {
                            jcvVar2.c(false);
                            List list = jcvVar2.M;
                            synchronized (list) {
                                ske.E(list).c(new jcq(obj4, 3), ((jcv) obj4).d);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                this.a.az((ltw) obj);
                return;
            case 12:
                ((jcv) ((iiz) this.a).b).c(((Boolean) obj).booleanValue());
                return;
            case 13:
                if (((kfv) ((mwq) obj).b).b == lnn.ACTIVE_SCAN) {
                    ((jcv) ((iiz) this.a).b).F.b();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jjn) this.a).n(((Boolean) obj).booleanValue());
                return;
            case 15:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Object obj5 = this.a;
                jkg jkgVar = (jkg) obj5;
                jkgVar.k.h(bool);
                if (zBooleanValue) {
                    return;
                }
                owq owqVar = jkgVar.e;
                if (((jjp) owqVar.dL()).a().d.isPresent()) {
                    jkgVar.d.g();
                    nhz nhzVar = ((jjx) obj5).a;
                    if (nhzVar != null) {
                        nhzVar.g(0.5f, false, niz.a);
                    }
                }
                jjp jjpVar = (jjp) owqVar.dL();
                jjpVar.d = Optional.empty();
                owqVar.a(jjpVar);
                return;
            case 16:
                if (((juk) obj).c) {
                    lae laeVar = ((jkh) this.a).a;
                    laeVar.f();
                    laeVar.g();
                    return;
                }
                return;
            case 17:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                Object obj6 = this.a;
                jki jkiVar = (jki) obj6;
                jkiVar.h.h(bool2);
                if (zBooleanValue2) {
                    return;
                }
                nhz nhzVar2 = ((jjx) obj6).a;
                if (nhzVar2 != null) {
                    nhzVar2.g(0.5f, false, niz.a);
                }
                owq owqVar2 = jkiVar.d;
                jjp jjpVar2 = (jjp) owqVar2.dL();
                jjpVar2.c = Optional.empty();
                owqVar2.a(jjpVar2);
                return;
            case 18:
                ((jkm) this.a).i.g(ske.aj((((Float) obj).floatValue() + 1.0f) * 0.5f, 0.0f, 1.0f), false, niz.a);
                return;
            case 19:
                Float f3 = (Float) obj;
                jkm jkmVar = (jkm) this.a;
                jkmVar.m = f3;
                Runnable runnable = jkmVar.g;
                jkmVar.l.removeCallbacks(runnable);
                if (Boolean.FALSE.equals(jkmVar.f.a())) {
                    jkmVar.i.e(jkmVar.h.getResources().getString(R.string.whitebalance_auto_status));
                    return;
                }
                jkmVar.i.e(jkmVar.h.getResources().getString(R.string.whitebalance_label_announcement, Integer.valueOf(Math.round(f3.floatValue()))));
                if (jkmVar.k) {
                    jkmVar.l.postDelayed(runnable, 100L);
                    return;
                }
                return;
            default:
                Object obj7 = this.a;
                ((jkx) obj7).j.animate().alpha(0.0f).setDuration(80L).setInterpolator(new LinearInterpolator()).withEndAction(new img(obj7, (mxm) obj, 12));
                return;
        }
    }
}
