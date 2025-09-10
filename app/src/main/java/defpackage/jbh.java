package defpackage;

import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jbh implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jbh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((fqf) this.a).eB();
                break;
            case 1:
                ((jbm) this.a).b();
                break;
            case 2:
                Object obj = this.a;
                ((jbm) obj).b.h(new jbh(obj, i));
                break;
            case 3:
                jbm jbmVar = (jbm) this.a;
                jbmVar.f.c();
                jbmVar.p.c();
                jth jthVar = jbmVar.M;
                if (jthVar != null) {
                    jbmVar.c(((Boolean) jthVar.b().dL()).booleanValue());
                    jth jthVar2 = jbmVar.M;
                    jthVar2.getClass();
                    jthVar2.b().dL();
                }
                jbmVar.r.c();
                jbmVar.O.j();
                rwc rwcVar = jbmVar.B;
                if (rwcVar.h() && ((hko) rwcVar.c()).i()) {
                    ((hko) rwcVar.c()).e();
                    break;
                }
                break;
            case 4:
                jbm jbmVar2 = (jbm) this.a;
                jth jthVar3 = jbmVar2.M;
                if (jthVar3 != null) {
                    jbmVar2.d.d(jthVar3.c, jthVar3.a);
                    break;
                }
                break;
            case 5:
                ((jbi) this.a).a.b();
                break;
            case 6:
                jbk jbkVar = (jbk) this.a;
                jbm jbmVar3 = jbkVar.a;
                jbmVar3.f.a();
                jbkVar.a(1.0f);
                ndj ndjVar = jbmVar3.g;
                ndjVar.x();
                ndjVar.s();
                break;
            case 7:
                jbm jbmVar4 = ((jbk) this.a).a;
                jbmVar4.I.K.o();
                jbmVar4.J.c(R.raw.camera_shutter);
                jbmVar4.g.s();
                break;
            case 8:
                ((jby) this.a).c();
                break;
            case 9:
                Object obj2 = this.a;
                ((jby) obj2).b.h(new jbh(obj2, 8));
                break;
            case 10:
                jby jbyVar = (jby) this.a;
                jth jthVar4 = jbyVar.aa;
                if (jthVar4 != null) {
                    jbyVar.g.d(jthVar4.c, jthVar4.a);
                    break;
                }
                break;
            case 11:
                jby jbyVar2 = (jby) this.a;
                jbyVar2.H = false;
                jbyVar2.d();
                jbyVar2.j.c();
                jbyVar2.J(false);
                jbyVar2.l.c();
                jth jthVar5 = jbyVar2.aa;
                if (jthVar5 != null) {
                    jbyVar2.k(((Boolean) jthVar5.b().dL()).booleanValue());
                }
                jbyVar2.ac.j();
                rwc rwcVar2 = jbyVar2.s;
                if (rwcVar2.h()) {
                    mgq mgqVar = (mgq) rwcVar2.c();
                    nkw nkwVar = jbyVar2.U.p;
                    jbyVar2.v.k();
                    mgqVar.a();
                }
                rwc rwcVar3 = jbyVar2.D;
                if (rwcVar3.h() && ((hko) rwcVar3.c()).i()) {
                    ((hko) rwcVar3.c()).e();
                    break;
                }
                break;
            case 12:
                ((fqf) this.a).eB();
                break;
            case 13:
                ((jbq) this.a).a.c();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jbs) this.a).a.W.c();
                break;
            case 15:
                kdb kdbVar = ((jbs) this.a).a.Q;
                kdbVar.i(kdbVar.e);
                break;
            case 16:
                jby jbyVar3 = ((jbs) this.a).a;
                jbyVar3.Q.f();
                jbyVar3.l.h();
                break;
            case 17:
                jby jbyVar4 = ((jbs) this.a).a;
                if (!jbyVar4.t) {
                    ((sgt) jby.a.c().M(2626)).s("Module has stopped. Do not perform any Astro actions.");
                    break;
                } else if (!jbyVar4.H) {
                    jbyVar4.Q.f();
                    owq owqVar = jbyVar4.k;
                    Object objDL = owqVar.dL();
                    ltw ltwVar = ltw.OFF;
                    if (objDL == ltwVar && ((((Boolean) jbyVar4.F.dL()).booleanValue() || ((Boolean) jbyVar4.G.dL()).booleanValue()) && !jbyVar4.J)) {
                        z = true;
                    }
                    if (jbyVar4.ab.p(gzo.bw)) {
                        if (z) {
                            jbyVar4.f();
                        }
                        jbyVar4.n.i();
                        jbyVar4.C.h();
                    } else if (owqVar.dL() == ltwVar) {
                        jbyVar4.n.i();
                        if (z) {
                            jbyVar4.f();
                        }
                    } else {
                        jbyVar4.C.h();
                    }
                    kqy kqyVar = jbyVar4.Y;
                    kqyVar.getClass();
                    jbyVar4.N(kqyVar, jbyVar4.J);
                    jbyVar4.J(true);
                    rwc rwcVar4 = jbyVar4.z;
                    if (rwcVar4.h() && !((Boolean) jbyVar4.F.dL()).booleanValue()) {
                        ((ftv) rwcVar4.c()).e();
                    }
                    rwc rwcVar5 = jbyVar4.A;
                    if (rwcVar5.h()) {
                        ((mhe) rwcVar5.c()).l();
                        ((mhe) rwcVar5.c()).f();
                    }
                    jbyVar4.H = true;
                    jbyVar4.I = ((Boolean) jbyVar4.F.dL()).booleanValue();
                    break;
                }
                break;
            case 18:
                ((hyh) this.a).c();
                break;
            case 19:
                ((kfa) this.a).f();
                break;
            default:
                jcm jcmVar = (jcm) this.a;
                jth jthVar6 = jcmVar.p;
                if (jthVar6 != null) {
                    jcmVar.h.d(jthVar6.c, jthVar6.a);
                    break;
                }
                break;
        }
    }
}
