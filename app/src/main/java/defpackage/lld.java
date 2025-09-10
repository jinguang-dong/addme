package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.View;
import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lld implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lld(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.pau
    public final void a(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                ((lle) this.a).d();
                return;
            case 1:
                Object obj2 = this.a;
                lkn lknVar = (lkn) obj2;
                lkw lkwVarA = lks.a(((Long) ((Range) ((ovx) lknVar.d.a()).d).getLower()).longValue());
                lknVar.i.f(lknVar.l(lkwVarA.a));
                lknVar.q = lkwVarA.b;
                ((jjp) lknVar.e.dL()).a().g.ifPresent(new lji(obj2, 6));
                return;
            case 2:
                ((lle) this.a).b();
                return;
            case 3:
                ((lle) this.a).b();
                return;
            case 4:
                lle lleVar = (lle) this.a;
                lleVar.c(((jjq) lleVar.c.dL()).a, ((Boolean) obj).booleanValue());
                return;
            case 5:
                boolean z2 = !((Boolean) obj).booleanValue();
                lle lleVar2 = (lle) this.a;
                lleVar2.j.setClickable(z2);
                lleVar2.m.setClickable(z2);
                lleVar2.n.setClickable(z2);
                return;
            case 6:
                ((lle) this.a).e();
                return;
            case 7:
                mxj mxjVar = (mxj) obj;
                lle lleVar3 = (lle) this.a;
                if (lleVar3.o == null) {
                    return;
                }
                if (mxjVar.equals(mxj.PHONE_LAYOUT)) {
                    lleVar3.o.setBackgroundResource(R.drawable.values_bar_background);
                    return;
                } else {
                    lleVar3.o.setBackgroundResource(R.drawable.values_minibar_background);
                    return;
                }
            case 8:
                ((lle) this.a).d();
                return;
            case 9:
                ((lvk) this.a).b();
                return;
            case 10:
                ((lvk) this.a).b();
                return;
            case 11:
                ((lvk) this.a).b();
                return;
            case 12:
                if (((fyx) obj).a()) {
                    ((mcl) this.a).d();
                    return;
                }
                return;
            case 13:
                Object obj3 = this.a;
                mco mcoVar = (mco) obj3;
                if (mcoVar.d()) {
                    kqy kqyVar = mcoVar.e;
                    Context context = mcoVar.a;
                    View viewA = kqyVar.a();
                    nfh nfhVar = new nfh(context.getString(R.string.try_speech_enhancement_tooltip));
                    nfhVar.p(viewA);
                    nfhVar.h();
                    nfhVar.j();
                    nfhVar.d(new jko(obj3, 4));
                    nfhVar.f(new man(obj3, 10), mcoVar.b);
                    nfhVar.c = 300;
                    nfhVar.k();
                    nfhVar.d = 5000;
                    nfhVar.e = false;
                    nfhVar.g = true;
                    nfhVar.l = mcoVar.f;
                    nfhVar.k = 4;
                    mcoVar.d = nfhVar.a();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((krj) this.a).m(false, null);
                return;
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue) {
                    mhe mheVar = (mhe) obj4;
                    owq owqVar = mheVar.a;
                    mheVar.A = (mhh) owqVar.dL();
                    owqVar.a(mhh.OFF);
                    mheVar.f();
                    return;
                }
                mhe mheVar2 = (mhe) obj4;
                if (mheVar2.A != null) {
                    owq owqVar2 = mheVar2.a;
                    Object objDL = owqVar2.dL();
                    mhh mhhVar = mheVar2.A;
                    if (objDL != mhhVar) {
                        owqVar2.a(mhhVar);
                        mheVar2.m(rvk.a);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                float fFloatValue2 = gzy.a.floatValue();
                float fFloatValue3 = f.floatValue();
                mhe mheVar3 = (mhe) this.a;
                float fFloatValue4 = ((Float) mheVar3.c.dL()).floatValue();
                boolean z3 = fFloatValue < fFloatValue2;
                if (z3 != mheVar3.r) {
                    mheVar3.r = z3;
                    z = true;
                } else {
                    z = false;
                }
                boolean z4 = fFloatValue3 > fFloatValue4;
                if (z4 != mheVar3.q) {
                    if (z4) {
                        owq owqVar3 = mheVar3.a;
                        mheVar3.z = (mhh) owqVar3.dL();
                        owqVar3.a(mhh.OFF);
                    } else {
                        owq owqVar4 = mheVar3.a;
                        Object objDL2 = owqVar4.dL();
                        mhh mhhVar2 = mheVar3.z;
                        if (objDL2 != mhhVar2) {
                            owqVar4.a(mhhVar2);
                        }
                        mheVar3.u(rvk.a, (mhg) mheVar3.b.dL(), ((Boolean) mheVar3.d.dL()).booleanValue());
                    }
                    mheVar3.q = z4;
                } else if (!z) {
                    return;
                }
                if (((Boolean) mheVar3.e.dL()).booleanValue()) {
                    boolean z5 = z3 || z4;
                    if (z5) {
                        mheVar3.i();
                        mheVar3.h();
                        mheVar3.e();
                    }
                    if (mheVar3.H.p(gzy.l)) {
                        return;
                    }
                    mheVar3.h.a = !z5;
                    return;
                }
                return;
            case 17:
                ((pfu) this.a).l(new pej(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) obj));
                return;
            case 18:
                lax laxVar = (lax) obj;
                ((pfu) this.a).n(scn.H(new pej(nvm.a, Integer.valueOf(laxVar.a)), new pej(nvm.b, ske.am(laxVar.b))));
                return;
            case 19:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                if (zBooleanValue2) {
                    ((mis) obj5).a.a(obj5);
                    return;
                } else {
                    ((mis) obj5).a.h(obj5);
                    return;
                }
            default:
                Object obj6 = this.a;
                mkx mkxVar = (mkx) obj;
                synchronized (((miv) obj6).j) {
                    if (((miv) obj6).c.get() && mkxVar != ((miv) obj6).n) {
                        mlc mlcVar = ((miv) obj6).m;
                        mlcVar.getClass();
                        mlcVar.c(mkxVar);
                    }
                    ((miv) obj6).n = mkxVar;
                }
                return;
        }
    }
}
