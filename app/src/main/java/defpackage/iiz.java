package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiz implements syf {
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public iiz(iws iwsVar, ivq ivqVar, int i) {
        this.c = i;
        this.a = iwsVar;
        this.b = ivqVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r2v10, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r2v16, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r2v21, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, pbp] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                this.a.a();
                break;
            case 2:
                ((itb) this.a).f(((ita) this.b).b, th.getMessage());
                break;
            case 3:
                ((iws) this.a).close();
                iwb.k((ivq) this.b, "Error compressing primary jpg file", th);
                break;
            case 4:
                this.a.a();
                break;
            case 5:
                this.a.a();
                ((sgt) ((sgt) jby.a.b().i(th)).M((char) 2628)).s("Error starting camera");
                break;
            case 6:
                ((sgt) ((sgt) jcd.a.b().i(th)).M(2649)).v("Failure while saving JPEG image to %s", this.b);
                ((jcd) this.a).f.g();
                break;
            case 7:
                this.a.a();
                ((sgt) ((sgt) jcv.a.b().i(th)).M((char) 2657)).s("Error starting camera");
                break;
            case 8:
                ((ejt) this.a).a.d("Unable to log capture metadata: ".concat(String.valueOf(String.valueOf(th))));
                break;
            case 9:
                ((sgt) ((sgt) lmh.e.b().i(th)).M((char) 4229)).s("Lucky Shot Filter failed to return valid result.");
                break;
            default:
                ((sgt) lsw.a.c().M(4412)).v("Failed to set progress for %s", this.b);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, owf] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        boolean z;
        int i = 4;
        int i2 = 1;
        switch (this.c) {
            case 0:
                ija ijaVar = (ija) this.b;
                ijaVar.b.f("Received SurfaceTexture");
                ijaVar.e.execute(new gdq((Object) this, obj, this.a, 6, (char[]) null));
                break;
            case 1:
                jth jthVar = (jth) obj;
                jthVar.getClass();
                fiv fivVar = (fiv) this.b;
                fivVar.s = jthVar;
                fivVar.q.K.g();
                ?? r2 = jthVar.i().c;
                fqz fqzVar = new fqz(this, i2);
                out outVar = fivVar.g;
                ojl.ck(r2, fqzVar, outVar);
                paq paqVarDK = owl.a(jthVar.b(), fivVar.j).dK(new fbt(this, 10), outVar);
                our ourVar = jthVar.a;
                ourVar.d(paqVarDK);
                moy moyVar = fivVar.d;
                kgw kgwVar = jthVar.c;
                moyVar.d(kgwVar, ourVar);
                ourVar.d(fivVar.e.a(jthVar, kgwVar, jthVar.i().i, jthVar.i().a, true, fivVar.f.h(), 2));
                this.a.a();
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    Object obj2 = this.b;
                    shl shlVar = shx.a;
                    ita itaVar = (ita) obj2;
                    itg itgVar = itaVar.f;
                    itgVar.a.b();
                    itgVar.b.g();
                    ((mdo) itgVar.c).A.e(Long.valueOf(SystemClock.elapsedRealtime()));
                    Object obj3 = this.a;
                    iby ibyVar = itaVar.b;
                    itb.h(ibyVar);
                    ((itb) obj3).a.remove(ibyVar);
                    break;
                } else {
                    ((itb) this.a).f(((ita) this.b).b, "Kepler Controller processing failed.");
                    break;
                }
                break;
            case 3:
                kjd kjdVar = (kjd) obj;
                ((iws) this.a).close();
                if (kjdVar == null) {
                    ((sgt) iwb.a.b().M(2445)).t("Error encoding the primary image %d", ((ivq) this.b).h);
                } else {
                    ivq ivqVar = (ivq) this.b;
                    ivqVar.a = true;
                    byte[] bArr = kjdVar.b;
                    ?? r22 = ivqVar.b.x.b;
                    r22.o().d(bArr.length);
                    ((mdo) r22.o()).l = kjdVar.c;
                }
                ((ivq) this.b).e();
                break;
            case 4:
                jth jthVar2 = (jth) obj;
                jthVar2.getClass();
                Object obj4 = this.b;
                jbm jbmVar = (jbm) obj4;
                jbmVar.M = jthVar2;
                iyu iyuVar = jbmVar.I;
                iyuVar.K.g();
                ?? r3 = jthVar2.i().c;
                fqz fqzVar2 = new fqz(this, 8);
                out outVar2 = jbmVar.c;
                ojl.ck(r3, fqzVar2, outVar2);
                jbmVar.E.d(jthVar2.b().dK(new jbp(this, i2), outVar2));
                fbp fbpVarA = jbmVar.l.a(jthVar2, jthVar2.c, jthVar2.i().i, jthVar2.i().a, true, jbmVar.y.h(), 2);
                our ourVar2 = jthVar2.a;
                ourVar2.d(fbpVarA);
                rwc rwcVar = jbmVar.e;
                if (rwcVar.h()) {
                    ourVar2.d(((mhe) rwcVar.c()).a(jbmVar.x));
                }
                rwc rwcVar2 = jbmVar.z;
                if (rwcVar2.h()) {
                    ourVar2.d(((fgx) rwcVar2.c()).a());
                }
                jth jthVar3 = jbmVar.M;
                jthVar3.getClass();
                AccessibilityManager accessibilityManager = jbmVar.s;
                hjb hjbVar = jbmVar.v;
                ktx ktxVar = jbmVar.L;
                hgc hgcVar = iyuVar.K.B;
                hbj hbjVar = jbmVar.N;
                gzi gziVar = gzo.a;
                HotshotController hotshotController = jbmVar.w;
                rwc rwcVar3 = jbmVar.B;
                kgw kgwVar2 = jthVar3.c;
                jtd jtdVar = jthVar3.b;
                jbmVar.H = new jtq(accessibilityManager, hjbVar, kgwVar2, ktxVar, jtdVar, hgcVar, hbjVar, hotshotController, rwcVar3);
                jbmVar.E.d(jbmVar.H.a(jthVar3.i().e, outVar2));
                jbmVar.H.c(jtdVar.d.b);
                outVar2.execute(new jbh(obj4, i));
                this.a.a();
                break;
            case 5:
                jth jthVar4 = (jth) obj;
                jthVar4.getClass();
                ?? r0 = jthVar4.i().c;
                fqz fqzVar3 = new fqz(this, 9);
                Object obj5 = this.b;
                jby jbyVar = (jby) obj5;
                out outVar3 = jbyVar.c;
                ojl.ck(r0, fqzVar3, outVar3);
                jbyVar.aa = jthVar4;
                iyu iyuVar2 = jbyVar.U;
                iyuVar2.K.g();
                jbyVar.k(((Boolean) jthVar4.b().dL()).booleanValue());
                paq paqVarDK2 = jthVar4.b().dK(new jbp(this, i), outVar3);
                our ourVar3 = jthVar4.a;
                ourVar3.d(paqVarDK2);
                if (!jbyVar.i.h()) {
                    z = false;
                } else if (jthVar4.c.l() != pka.BACK) {
                    gzg gzgVar = gze.a;
                    z = false;
                } else {
                    z = true;
                }
                jth jthVar5 = jbyVar.aa;
                jthVar5.getClass();
                AccessibilityManager accessibilityManager2 = jbyVar.o;
                hjb hjbVar2 = jbyVar.p;
                ktx ktxVar2 = jbyVar.X;
                hgc hgcVar2 = iyuVar2.K.B;
                hbj hbjVar2 = jbyVar.ab;
                gzi gziVar2 = gzo.a;
                HotshotController hotshotController2 = jbyVar.y;
                rwc rwcVar4 = jbyVar.D;
                jtd jtdVar2 = jthVar5.b;
                jbyVar.M = new jtq(accessibilityManager2, hjbVar2, jthVar5.c, ktxVar2, jtdVar2, hgcVar2, hbjVar2, hotshotController2, rwcVar4);
                jthVar5.a.d(jbyVar.M.a(jthVar5.i().e, outVar3));
                jbyVar.M.c(jtdVar2.d.b);
                jbyVar.N = iyuVar2.K.i;
                jbyVar.N.b();
                ourVar3.d(jbyVar.h.a(jthVar4, jthVar4.c, jthVar4.i().i, jthVar4.i().a, z, jbyVar.B.h(), 2));
                rwc rwcVar5 = jbyVar.A;
                if (rwcVar5.h()) {
                    ourVar3.d(((mhe) rwcVar5.c()).a(nkw.NIGHT_SIGHT));
                }
                rwc rwcVar6 = jbyVar.R;
                if (rwcVar6.h()) {
                    ourVar3.d(((fgx) rwcVar6.c()).a());
                }
                outVar3.execute(new jbh(obj5, 10));
                rwc rwcVar7 = jbyVar.z;
                if (rwcVar7.h()) {
                    ourVar3.d(((ftv) rwcVar7.c()).b(nkw.NIGHT_SIGHT, (kow) jthVar4.i().f, jthVar4.i().b));
                }
                hyh hyhVar = jbyVar.q;
                hyhVar.getClass();
                outVar3.execute(new jbh(hyhVar, 18));
                this.a.a();
                break;
            case 6:
                ((jcd) this.a).f.h(new Intent());
                break;
            case 7:
                jth jthVar6 = (jth) obj;
                jthVar6.getClass();
                Object obj6 = this.b;
                jcv jcvVar = (jcv) obj6;
                jcvVar.U = jthVar6;
                iyu iyuVar3 = jcvVar.Q;
                iyuVar3.K.g();
                ?? r8 = jthVar6.i().c;
                fqz fqzVar4 = new fqz(this, 11);
                out outVar4 = jcvVar.d;
                ojl.ck(r8, fqzVar4, outVar4);
                if (!jcvVar.q.i()) {
                    jcvVar.s.m(true);
                }
                jcvVar.E.d(jthVar6.b().dK(new jbp(this, 12), outVar4));
                rwc rwcVar8 = jcvVar.y;
                if (rwcVar8.h()) {
                    ((fty) rwcVar8.c()).f(jthVar6, jcvVar.E);
                }
                jth jthVar7 = jcvVar.U;
                jthVar7.getClass();
                jcvVar.E.d(jthVar7.i().e.dK(jcvVar.O, ojl.bZ("PortFcDet")));
                jcvVar.I = jthVar7.i().h;
                AccessibilityManager accessibilityManager3 = jcvVar.k;
                hjb hjbVar3 = jcvVar.l;
                ktx ktxVar3 = jcvVar.S;
                hgc hgcVar3 = iyuVar3.K.B;
                hbj hbjVar3 = jcvVar.X;
                gzi gziVar3 = gzo.a;
                HotshotController hotshotController3 = jcvVar.z;
                rwc rwcVar9 = jcvVar.C;
                jtd jtdVar3 = jthVar7.b;
                jcvVar.G = new jtq(accessibilityManager3, hjbVar3, jthVar7.c, ktxVar3, jtdVar3, hgcVar3, hbjVar3, hotshotController3, rwcVar9);
                jcvVar.E.d(jcvVar.G.a(jthVar7.i().e, outVar4));
                jcvVar.G.c(jtdVar3.d.b);
                jcvVar.H = iyuVar3.K.i;
                jcvVar.H.b();
                if (hbjVar3.p(gzt.a)) {
                    jth jthVar8 = jcvVar.U;
                    jthVar8.getClass();
                    pas pasVar = jthVar8.b.d.b;
                    hotshotController3.l(pasVar);
                    if (rwcVar9.h()) {
                        ((hko) rwcVar9.c()).b(pasVar);
                    }
                }
                fbq fbqVar = jcvVar.h;
                kgw kgwVar3 = jthVar6.c;
                jthVar6.a.d(fbqVar.a(jthVar6, kgwVar3, jthVar6.i().i, new owi(false), hbjVar3.p(gze.g), jcvVar.A.h(), 2));
                jcvVar.E.d(jthVar6.i().i.dK(new jbp(this, 13), ojl.bZ("PortAfCb")));
                qqq qqqVar = jcvVar.aa;
                kgwVar3.l();
                nkw nkwVar = nkw.UNINITIALIZED;
                qqqVar.h();
                outVar4.execute(new jcq(obj6, 2));
                this.a.a();
                break;
            case 8:
                List list = (List) obj;
                list.getClass();
                String str = (String) list.get(0);
                String str2 = (String) list.get(1);
                rwb rwbVar = new rwb("Capture Metadata");
                rwbVar.b("Input", str);
                rwbVar.b("Reprocessing", str2);
                rwbVar.b("NPF", ((klc) this.b).e);
                ((ejt) this.a).a.g("Capture Metadata: ".concat(rwbVar.toString()));
                break;
            case 9:
                Set set = (Set) obj;
                if (set != null) {
                    ((lmh) this.b).c(set, this.a);
                    break;
                }
                break;
            default:
                Uri uri = (Uri) obj;
                if (uri != null && !Uri.EMPTY.equals(uri)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("progress_status", (Integer) 0);
                    contentValues.put("progress_percentage", Integer.valueOf(((par) this.a).e));
                    ((lsw) this.b).d.getContentResolver().update(uri, contentValues, null);
                    break;
                } else {
                    ((sgt) lsw.a.c().M(4413)).v("Skipping progress update for empty or null uri: %s", uri);
                    break;
                }
                break;
        }
    }

    public iiz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public iiz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
