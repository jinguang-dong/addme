package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fnb implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fnb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, utj] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, utj] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object, utj] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        switch (this.b) {
            case 0:
                nkw nkwVar = (nkw) obj;
                if (nkwVar.equals(nkw.COTTAGE)) {
                    fnc fncVar = (fnc) this.a;
                    fncVar.b.a(fncVar.a(fncVar.a, nkwVar));
                    break;
                }
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r2 = this.a;
                if (!zBooleanValue) {
                    ((fng) r2.a()).a();
                    break;
                } else {
                    ((fng) r2.a()).b();
                    break;
                }
            case 2:
                if (obj != null) {
                    this.a.a(obj);
                    break;
                }
                break;
            case 3:
                ((mbj) this.a).a = false;
                break;
            case 4:
                Float f = (Float) obj;
                khb khbVar = (khb) this.a;
                if (khbVar.b) {
                    ((AutoTimerIndicatorView) khbVar.e).a(f.floatValue());
                    break;
                }
                break;
            case 5:
                ((krj) this.a).m(false, krs.j);
                break;
            case 6:
                krj krjVar = (krj) this.a;
                nkw nkwVarD = krjVar.d();
                if (nkwVarD != null && nkwVarD.equals(nkw.VIDEO)) {
                    krjVar.m(false, krs.MICROPHONE);
                    break;
                }
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue2) {
                    ((gsz) ((pmg) obj2).a).f();
                    break;
                } else {
                    ((gsz) ((pmg) obj2).a).h();
                    break;
                }
            case 8:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (!zBooleanValue3) {
                    ((gsz) ((pmg) obj3).b).c();
                    break;
                } else {
                    ((gsz) ((pmg) obj3).b).e();
                    break;
                }
            case 9:
                boolean zEquals = ((mhg) obj).equals(mhg.INACTIVE);
                Object obj4 = this.a;
                if (!zEquals) {
                    ((gtn) obj4).b();
                    break;
                } else {
                    ((gtn) obj4).c();
                    break;
                }
            case 10:
                gwv gwvVar = (gwv) this.a;
                if (!((lkk) gwvVar.e.dL()).equals(lkk.AUTO)) {
                    gwvVar.x(((Number) gwvVar.g.dL()).floatValue());
                    break;
                }
                break;
            case 11:
                gwv.E((gwv) this.a, gwq.c, 2);
                break;
            case 12:
                rwc rwcVar = (rwc) obj;
                boolean zH = rwcVar.h();
                Object obj5 = this.a;
                if (zH) {
                    ((gwv) obj5).E = ((gnr) rwcVar.c()).c.a();
                }
                gwv gwvVar2 = (gwv) obj5;
                gyd gydVar = (gyd) gwvVar2.X.d.c();
                if (gydVar != null) {
                    gwvVar2.b.f(gydVar);
                    break;
                }
                break;
            case 13:
                ((gwv) this.a).b.e();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gwv gwvVar3 = (gwv) this.a;
                gvk gvkVar = (gvk) gwvVar3.S.h.c();
                if (gvkVar != null) {
                    gwvVar3.b.d(gvkVar.d);
                    break;
                }
                break;
            case 15:
                ((gwv) this.a).x.b((Rect) obj);
                break;
            case 16:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((gwv) this.a).y.b(bool);
                break;
            case 17:
                if (((nkw) obj) == nkw.SERENGETI) {
                    gzi gziVar = gzp.a;
                }
                gwv gwvVar4 = (gwv) this.a;
                gwvVar4.D = false;
                gwvVar4.X.C();
                break;
            case 18:
                gwv gwvVar5 = (gwv) this.a;
                gyd gydVar2 = (gyd) gwvVar5.X.d.c();
                if (gydVar2 != null) {
                    gwvVar5.b.f(gydVar2);
                    break;
                }
                break;
            case 19:
                gwv gwvVar6 = (gwv) this.a;
                gwvVar6.s.b(gwvVar6.e());
                gwvVar6.r.b((mxm) obj);
                break;
            default:
                ((qwz) this.a).b = !((Boolean) obj).booleanValue();
                break;
        }
    }
}
